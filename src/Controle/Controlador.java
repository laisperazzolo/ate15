package Controle;

import Modelo.Jogador;
import Modelo.Tabuleiro;
import Tela.AtorJogador;
import br.ufsc.inf.leobr.cliente.exception.NaoConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoJogandoException;
import rede.AtorNetGames;

public class Controlador {
    
    protected Jogador jogador1;
    protected Jogador jogador2;
    protected Tabuleiro tabuleiro;
    protected boolean conectado;
    protected boolean jogoEmAndamento;
    protected AtorJogador atorJogador;
    protected AtorNetGames rede;
    
    public Controlador() {
        this.tabuleiro = new Tabuleiro();
        this.conectado = false;
        this.jogoEmAndamento = false;
        this.atorJogador = new AtorJogador(this);  
        this.rede = new AtorNetGames(this);
    }
    
    public void conectar(String server, String idUsuario) throws Exception {
        String servidor = server;
        String nomeJogador = idUsuario;
        this.jogador1 = new Jogador(nomeJogador);
        rede.conectar(servidor, idUsuario);   
        
//        boolean teste[] = new boolean[1] ;
//        teste[0] = true ;
//        
//        this.atorJogador.getTela().ativaBotao1(teste[0]);
        
        }
    
    public void iniciarPartida() throws NaoConectadoException {
        jogador1.setJogadorDaVez(); 
        rede.iniciarPartida();
    }
    
    public void desconectar() throws NaoConectadoException {
        rede.desconectar();
    }

    
    public void clickPosicao(int numeroEscolhido) throws Exception {
        
        if (this.jogador1.isJogadorDaVez()) {
            this.atorJogador.atualizaListaNumEscolhidos(numeroEscolhido);   
            // tem que ser a primeira ação do "receber jogada"
           // this.atorJogador.ativaBotoesDisponiveis(this.tabuleiro.getBotoesAtivados()); 
            this.tabuleiro.clickPosicao(numeroEscolhido);
            boolean venceu = false;
            venceu = this.jogador1.verificaVencedor(numeroEscolhido);//adiciona o nº no array e verifica vitoria
            if (venceu) {
                this.notificar("Venceu a partida!");
                
                /*
                if (tabuleiro.getJogador1().getNumeroDeVitorias() < 2) {
                    this.notificar("Uma nova partida será iniciada, o outro jogador inicia. Aguarde.");
                } else {
                    this.notificar("Venceu o jogo");
                }
                */
            }
            //enviar a jogada
            //this.enviarJogada();

           // this.tela.limpar();
           // this.tela.setaImagemJogador();
        } else {
            throw new Exception("Não é sua vez");
        }
    }


    public void notificar(String mensagem) {
        atorJogador.notificar(mensagem);
    }

    public void notificarErro(String erro) {
        atorJogador.notificar(erro);
    }
    
    /*
    public void enviarJogada() throws NaoJogandoException {
        this.rede.enviarJogada(this.tabuleiro);
    }

    /*
    public void receberJogada(Tabuleiro tab) throws NaoConectadoException, NaoJogandoException {
        this.tabuleiro.setJogador1(tab.getJogador2());
        this.tabuleiro.setJogador2(tab.getJogador1());

        this.tabuleiro.getJogador1().setJogadorDaVez(true);
        
        //this.tela.limpar();
	//this.tela.atualizaInterface(tab.getUltimaPosClicJogador1());

        if (this.tabuleiro.getJogador2().isVencedor()) {
            this.atorJogador.notificar("Perdeu a partida!");
            if (tabuleiro.getJogador2().getNumeroDeVitorias() < 2) {
                this.atorJogador.notificar("Uma nova partida será iniciada, você inicia.");
                //this.iniciarNovaCampanha(1);
            } else {
                this.atorJogador.notificar("Perdeu a melhor de 3 partidas.");
                return;
            }
        }
        this.atorJogador.notificar("É a sua vez " + this.tabuleiro.getJogador1().getNome());
    }
    
    public void iniciarNovaCampanha(Integer posicao) {
        tabuleiro.setPartidaEmAndamento(true);
        tela.limpar();
        tela.notificar("Nova campanha iniciada");
        tela.iniciarPartida.setEnabled(false);
        tela.conectar.setEnabled(false);
        tabuleiro.getJogador1().setCodigo(posicao);
        tabuleiro.getJogador1().criarPosicoes();
        tabuleiro.getJogador1().obterPosicaoInicial();
        tabuleiro.getJogador2().setCodigo(posicao == 1 ? 2 : 1);
        tabuleiro.getJogador2().criarPosicoes();
        tabuleiro.getJogador2().obterPosicaoInicial();
        tela.setaImagemJogador();
    }
    */
    
    
    //invocado pelo proxy
    //recebe a solicitação de início do proxy 
    public void receberIniciarPartida(Integer posicao) {
        this.atorJogador.limparTela();

        String nomeAdversario = rede.getNomeAdversario(posicao);
        
         this.jogador2 = new Jogador(nomeAdversario);
         this.atorJogador.atualizarNomeAdversario(nomeAdversario);
        
        if (jogador1.isJogadorDaVez()) {
            this.atorJogador.ativaBotoesDisponiveis(this.tabuleiro.getBotoesAtivados());

//            this.atorJogador.habilitarBotoes();
        } 
    }
    
    
    
    public Tabuleiro getTabuleiro() {
        return this.tabuleiro;
    }
    
}
