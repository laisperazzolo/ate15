package rede;

import Controle.Controlador;
import br.ufsc.inf.leobr.cliente.Jogada;
import br.ufsc.inf.leobr.cliente.OuvidorProxy;
import br.ufsc.inf.leobr.cliente.Proxy;
import br.ufsc.inf.leobr.cliente.exception.NaoConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoJogandoException;
import Modelo.Tabuleiro;

public class AtorNetGames implements OuvidorProxy {

    private static final long serialVersionUID = 0L;
    protected Controlador controlador;
    protected Proxy proxy;

    public AtorNetGames(Controlador ctrl) {
        super();
        this.controlador = ctrl;
        this.proxy = Proxy.getInstance();
        this.proxy.addOuvinte(this);
    }

    public void conectar(String servidor, String idJogador) throws Exception {
        proxy.conectar(servidor, idJogador);
    }

    public void desconectar() throws NaoConectadoException {
        proxy.desconectar();
    }

    public void iniciarPartida() throws NaoConectadoException {
        proxy.iniciarPartida(2);
    }

    public void reiniciarPartida() throws NaoConectadoException, NaoJogandoException {
        proxy.reiniciarPartida();
    }

    @Override
    public void iniciarNovaPartida(Integer posicao) {
        controlador.iniciarNovaPartida(posicao);
    }

    @Override
    public void finalizarPartidaComErro(String message) {
        this.controlador.notificarErro("O outro jogador desconectou da partida.");
    }

    @Override
    public void receberMensagem(String msg) {
        this.controlador.notificar(msg);
    }

    @Override
    public void receberJogada(Jogada jogada) {
        Tabuleiro tab = (Tabuleiro) jogada;
        
        try {
            this.controlador.receberJogada(tab);
        } catch (NaoConectadoException e) {
            e.printStackTrace();
        } catch (NaoJogandoException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void tratarConexaoPerdida() {
        this.controlador.notificar("Conexão perdida. Por favor, conecte-se novamente.");
    }

    @Override
    public void tratarPartidaNaoIniciada(String message) {
        this.controlador.notificarErro(
            "Não foi possível iniciar a partida.\nProvavelmente não existem outros jogadores conectados.");
    }

    public String getNomeAdversario(int posicao) {
        return proxy.obterNomeAdversarios().get(0);
    }

    public void enviarJogada(Tabuleiro tab) throws NaoJogandoException {
        Jogada jogada = (Jogada) tab;
        proxy.enviaJogada(jogada);
    }

}
