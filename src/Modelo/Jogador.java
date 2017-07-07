package Modelo;

import br.ufsc.inf.leobr.cliente.Jogada;

public class Jogador implements Jogada{
    
    protected boolean jogadorDaVez = false;
    protected boolean vencedor = false;
    protected String nome;
    protected int[] posicao = new int[5];
    protected int numeroDeVitorias;
    protected int posicaoLivre = 0;
    
    public Jogador (String nome){
        this.nome = nome;
    }
    public Jogador (String nome, String cor, int[] posicao){
      this.nome = nome;
      this.posicao = posicao;
    }
    
    //arrumar esse metodo
    public int calcularPontuacaoAtual (){
        int pontuacaoAtual = 0;
        for(int i=0; i<posicao.length; i++){
            pontuacaoAtual = pontuacaoAtual + posicao[i];
        }
        return pontuacaoAtual;
    }
    
    //arrumar esse metodo
    public void ehVencedor (){
        if(calcularPontuacaoAtual() == 15)
            vencedor = true;
        else
            vencedor = false;
    }

    public void gravarJogada(int novaJogada){
        posicao[posicaoLivre] = novaJogada;
        posicaoLivre++;
    }

    public boolean isJogadorDaVez() {
        return this.jogadorDaVez;
    }

    public void setJogadorDaVez() {
        this.jogadorDaVez = true;
    }

    public boolean isVencedor() {
        return this.vencedor;
    }

    public void setVencedor(boolean ehVencedor) {
        this.vencedor = ehVencedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public boolean verificaVitoria(int numeroEscolhido) {
        return false;
    }
    
}
