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
    }
    
    public void iniciarPartida() throws NaoConectadoException {
        rede.iniciarPartida();
    }
    
    public void desconectar() throws NaoConectadoException {
        rede.desconectar();
    }

    
    public void realizaJogada(int numeroEscolhido) throws Exception {
        //tratamento de jogador da vez
        if (tabuleiro.getJogador1().isJogadorDaVez()) {
            tabuleiro.realizaJogada(numeroEscolhido);
            if (tabuleiro.getJogador1().isVencedor()) {
                this.notificar("Venceu a partida!");
                if (tabuleiro.getJogador1().getNumeroDeVitorias() < 2) {
                    this.notificar("Uma nova partida será iniciada, o outro jogador inicia. Aguarde.");
                } else {
                    this.notificar("Venceu o jogo");
                }
            }
            //enviar a jogada
            this.enviarJogada();

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
    
    public void enviarJogada() throws NaoJogandoException {
        this.rede.enviarJogada(this.tabuleiro);
    }

    
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
    /*
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
    public void iniciarNovaPartida(Integer posicao) {
        tabuleiro = new Tabuleiro();
        String idAdversario = rede.getNomeAdversario(posicao);
     //   tabuleiro.criarJogadores(jogador1, idAdversario);
        //tela.limpar();
        this.atorJogador.notificar("Partida encontrada, o nome de seu adversário é: " + idAdversario);
        if (tabuleiro.getJogador1().isJogadorDaVez()) {
           // tela.setaImagemJogador();
        } else {
            this.atorJogador.notificar("Agora é a vez do jogador " + idAdversario + ".Aguarde sua jogada");
        }
    }
    
    
    
    public Tabuleiro getTabuleiro() {
        return this.tabuleiro;
    }
    
}