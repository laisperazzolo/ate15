package Modelo;

import Tela.AtorJogador;
import br.ufsc.inf.leobr.cliente.Jogada;

public class Tabuleiro implements Jogada{
    
    protected AtorJogador ator;
    protected int[][] matriz = new int[3][3];
    
    public Tabuleiro() {
        String dados = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.matriz[i][j] = 0;
                dados += " " + matriz[i][j];
            }
            dados += "\n";
        }
        System.out.println(dados);
    }

    public void clickPosicao(int numeroEscolhido) throws Exception {
        switch (numeroEscolhido) {
            case 1: this.matriz[0][0] = 1;
            
            break;
            
                
        }
        
        String dados = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                dados += " " + matriz[i][j];
            }
            dados += "\n";
        }
        System.out.println(dados);
        /*
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
        */
    }

}
