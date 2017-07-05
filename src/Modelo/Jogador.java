package Modelo;

import br.ufsc.inf.leobr.cliente.Jogada;

public class Jogador implements Jogada{
    
    protected boolean jogadorDaVez;
    protected boolean vencedor;
    protected String nome;
    protected String cor;
    protected int[] posicao = new int[5];
    protected int numeroDeVitorias;
    protected int posicaoLivre = 0;
    
    public Jogador (String nome){
        this.nome = nome;
    }
    public Jogador (String nome, String cor, int[] posicao){
      this.nome = nome;
       this.cor = cor;
       this.posicao = posicao;
    }
    
    public int calcularPontuacaoAtual (){
        int pontuacaoAtual = 0;
        for(int i=0; i<posicao.length; i++){
            pontuacaoAtual = pontuacaoAtual + posicao[i];
        }
        return pontuacaoAtual;
    }
    
    public void gravarJogada(int novaJogada){
        posicao[posicaoLivre] = novaJogada;
        posicaoLivre++;
    }
    
    public void ehVencedor (){
        if(calcularPontuacaoAtual() == 15)
            vencedor = true;
        else
            vencedor = false;
    }

    public boolean isJogadorDaVez() {
        return jogadorDaVez;
    }

    public void setJogadorDaVez(boolean jogadorDaVez) {
        this.jogadorDaVez = jogadorDaVez;
    }

    public boolean isVencedor() {
        return vencedor;
    }

    public void setVencedor(boolean vencedor) {
        this.vencedor = vencedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int[] getPosicao() {
        return posicao;
    }

    public void setPosicao(int[] posicao) {
        this.posicao = posicao;
    }    

    public int getNumeroDeVitorias() {
        return numeroDeVitorias;
    }

    public void setNumeroDeVitorias(int numeroDeVitorias) {
        this.numeroDeVitorias = numeroDeVitorias;
    }
    
}
