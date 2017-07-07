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
    
    public void enviarJogada() throws NaoJogandoException {
        controlador.enviarJogada();
    }

    public void receberJogada(Tabuleiro tab) throws NaoConectadoException, NaoJogandoException {
        controlador.receberJogada(tab);
    }
    
    public void atualizarNomeAdversario(String nome) {
        this.tela.atualizarNomeAdversario(nome);
    }

    public void habilitarBotoes() {
        this.tela.habilitarBotoes();
    }

    public void limparTela() {
        this.tela.limparTela();
    }

}
