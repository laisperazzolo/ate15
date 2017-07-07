package Tela;

import Controle.Controlador;
import Modelo.Tabuleiro;
import br.ufsc.inf.leobr.cliente.exception.NaoConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoJogandoException;

public class AtorJogador {

    protected TelaInicial tela;
    protected Controlador controlador;

    public AtorJogador(Controlador ctrl) {
        this.tela = new TelaInicial(this);
        this.controlador = ctrl;
        this.tela.setVisible(true);
    }

    public void conectar(String servidor, String idUsuario) throws Exception {
        controlador.conectar(servidor, idUsuario);
    }
    
    public void iniciarPartida() throws NaoConectadoException {
        controlador.iniciarPartida();
    }
    
    public void desconectar() throws NaoConectadoException {
        controlador.desconectar();
    }
    
    public void clickPosicao(int numeroEscolhido) throws Exception {
        controlador.clickPosicao(numeroEscolhido);
    }

    public void notificar(String mensagem) {
        tela.notificar(mensagem);
    }

    public void notificarErro(String erro) {
        tela.notificar(erro);
    }
    
    public void atualizarNomeAdversario(String nome) {
        this.tela.atualizarNomeAdversario(nome);
    }
    
    public void ativaBotoesDisponiveis (boolean[][] botoes)
    {
        this.tela.ativaBotoesDisponiveis(botoes);
    }

    public void limparTela() {
        this.tela.limparTela();
    }

    public void atualizaListaNumEscolhidos(int numeroEscolhido) {
        this.tela.atualizaListaNumEscolhidos(numeroEscolhido);
    }

    public TelaInicial getTela() {
        return this.tela ;
    }

    public void atualizaVitoriasJogador(int numVitorias) {
        this.tela.atualizaVitoriasJogador(numVitorias);
    }

    public void atualizaVitoriasAdversario(int numVitorias) {
        this.tela.atualizaVitoriasAdversario(numVitorias);
    }

    public void atualizaNumeroPartidas(int numeroPartidas) {
        this.tela.atualizaNumeroPartidas(numeroPartidas);
    }
}
