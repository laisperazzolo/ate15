package Modelo;

import Modelo.Jogador;
import Tela.AtorJogador;
import br.ufsc.inf.leobr.cliente.Jogada;

public class Tabuleiro implements Jogada{
    protected Jogador jogador1;
    protected Jogador jogador2;
    protected AtorJogador ator;
    
    public Tabuleiro() {
        
    }
    
    public void criarJogadores(String idJogador, String adversario) {
        jogador1 = new Jogador(idJogador);
        jogador2 = new Jogador(adversario);
        jogador1.setJogadorDaVez(true);
    }

    public void realizaJogada(int numeroEscolhido) throws Exception {
        if (jogador1.isJogadorDaVez()) {
            jogador1.gravarJogada(numeroEscolhido);
            jogador1.calcularPontuacaoAtual();
            jogador1.ehVencedor();
            if (jogador1.isVencedor()) {
                jogador1.setNumeroDeVitorias(jogador1.getNumeroDeVitorias() + 1);
            }
            jogador1.setJogadorDaVez(false);
            jogador2.setJogadorDaVez(true);
        } else {
            throw new Exception("Não é sua vez");
        }
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public void setJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public void setJogador2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }

}
