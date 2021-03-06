package Modelo;

import Tela.AtorJogador;
import br.ufsc.inf.leobr.cliente.Jogada;

public class Tabuleiro implements Jogada{
    
    protected AtorJogador ator;
    protected boolean[][] botoesAtivados = new boolean[3][3];
    protected boolean adversarioVenceu = false;
    protected int vitoriasAdversario = 0;
    protected int numeroPartidas = 0;
    
    public Tabuleiro() {
        String dados = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.botoesAtivados[i][j] = true;
                dados += " " + botoesAtivados[i][j];
            }
            dados += "\n";
        }
    }

    public void clickPosicao(int numeroEscolhido) throws Exception {
        switch (numeroEscolhido) {
            case 1: this.botoesAtivados[0][0] = false;
            break;
            case 2: this.botoesAtivados[0][1] = false;
            break;
            case 3: this.botoesAtivados[0][2] = false;
            break;
            case 4: this.botoesAtivados[1][0] = false;
            break;
            case 5: this.botoesAtivados[1][1] = false;
            break;
            case 6: this.botoesAtivados[1][2] = false;
            break;
            case 7: this.botoesAtivados[2][0] = false;
            break;
            case 8: this.botoesAtivados[2][1] = false;
            break;
            case 9: this.botoesAtivados[2][2] = false;
            break;
        }
        
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
    
     public boolean[][] getBotoesAtivados() {
        return botoesAtivados;
    }

    public void setBotoesAtivados(boolean[][] botoesAtivados) {
        this.botoesAtivados = botoesAtivados;
    }

    public void setAdversarioVenceu(boolean adversarioVenceu) {
        this.adversarioVenceu = adversarioVenceu;
        if(adversarioVenceu) {
            this.encerraPartida();
        }
    }

    public boolean getAdversarioVenceu() {
        return adversarioVenceu;
    }
    
    public void encerraPartida() {
        String dados = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.botoesAtivados[i][j] = false;
                dados += " " + botoesAtivados[i][j];
            }
            dados += "\n";
        }
    }

    public int getVitoriasAdversario() {
        return vitoriasAdversario;
    }

    public void setVitoriasAdversario(int vitoriasAdversario) {
        this.vitoriasAdversario = vitoriasAdversario;
    }

    public void atualizaNumeroPartidas() {
        this.numeroPartidas ++;
    }

    public int getNumeroPartidas() {
        return numeroPartidas;
    }

}
