package Controle;

import Modelo.Jogador;
import Tela.AtorJogador;
import br.ufsc.inf.leobr.cliente.Jogada;

public class Tabuleiro implements Jogada{
    protected Jogador jogador1;
    protected Jogador jogador2;
    protected int[] tabuleiro = new int[9];
    protected boolean partidaEmAndamento;
    protected AtorJogador jogador;
    protected boolean reiniciado;
    
    public Tabuleiro(){
    }
    
    // talvez esse jogador não seja necessario
    public Tabuleiro (Jogador jogador1, Jogador jogador2, int[] tabuleiro){
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.tabuleiro = tabuleiro;
    }
    
    public void criarJogadores(String idJogador, String adversario, int posicao) {
        jogador1 = new Jogador(idJogador);
        jogador2 = new Jogador(adversario);
    }
    
    public boolean informaSePartidaEmAndamento() {
		return this.partidaEmAndamento;
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
    
    public int[] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(int[] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
    
    public boolean isPartidaEmAndamento() {
        return partidaEmAndamento;
    }

    public void setPartidaEmAndamento(boolean partidaEmAndamento) {
        this.partidaEmAndamento = partidaEmAndamento;
    }

}
