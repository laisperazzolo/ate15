/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import br.ufsc.inf.leobr.cliente.Jogada;

/**
 *
 * @author Mirian
 */
public class Jogador implements Jogada{
    protected boolean jogadorDaVez= false;
    protected boolean vencedor;
    protected String nome;
    protected String cor;
    protected int[] posicao = new int[5];
    
    public Jogador (String nome){
        this.nome = nome;
    }
    public Jogador (String nome, String cor, int[] posicao){
      this.nome = nome;
       this.cor = cor;
       this.posicao = posicao;
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
}