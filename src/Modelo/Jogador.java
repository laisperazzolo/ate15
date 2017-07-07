package Modelo;

import br.ufsc.inf.leobr.cliente.Jogada;

public class Jogador implements Jogada{
    
    protected boolean jogadorDaVez = false;
    protected String nome;
    protected int numeroDeVitorias = 0;
    protected String temNum;
    int caso = 0;
    
    public Jogador (String nome){
        this.nome = nome;
        this.temNum = "0000000000" ;
    }

    public boolean isJogadorDaVez() {
        return this.jogadorDaVez;
    }

    public void setJogadorDaVez() {
        this.jogadorDaVez = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeVitorias() {
        return numeroDeVitorias;
    }

    public void setNumeroDeVitorias(int numeroDeVitorias) {
        this.numeroDeVitorias = numeroDeVitorias;
    }
    
    public boolean verificaVencedor(int numEscolhido) {
        char[] novoString = this.temNum.toCharArray();
        novoString[numEscolhido] = '1';
        this.temNum = String.valueOf(novoString);
        this.defineCaso();
        return this.calculcaVencedor();
    }
    
    public boolean calculcaVencedor() {
        
        switch (caso) {
            case 1: // 6,9
                return true;

            case 2: // 7,8
                return true;

            case 3: // 2,4,9
                return true;

            case 4: // 3,5,7
                return true;

            case 5: // 1,6,8
                return true;

            case 6: // 3,4,8
                return true;

            case 7: // 1,5,9
                return true;

            case 8: // 2,6,7
                return true;

            case 9: // 4,5,6
                return true;

            case 10: // 2,5,8
                return true;

            case 11: // 2,3,4,6
                return true;

            case 12: // 1,3,5,6
                return true;

            case 13: // 1,3,4,7
                return true;

            case 14: // 1,2,4,8
                return true;

            case 15: // 1,2,3,9
                return true;

            case 16: // 1,2,3,4,5
                return true;

            default:
                return false;
        }     
    }
    
    public void defineCaso() {
        
        if (temNum.charAt(6)=='1' && temNum.charAt(9)=='1') {
            this.caso = 1;
        }
        
        if (temNum.charAt(7)=='1' && temNum.charAt(8)=='1') {
            this.caso = 2;
        }
        
        if (temNum.charAt(2)=='1' && temNum.charAt(4)=='1' && temNum.charAt(9)=='1') {
            this.caso = 3;
        }
        
        if (temNum.charAt(3)=='1' && temNum.charAt(5)=='1' && temNum.charAt(7)=='1') {
            this.caso = 4;
        }
        
        if (temNum.charAt(1)=='1' && temNum.charAt(6)=='1' && temNum.charAt(8)=='1') {
            this.caso = 5;
        }
        
        if (temNum.charAt(3)=='1' && temNum.charAt(4)=='1' && temNum.charAt(8)=='1') {
            this.caso = 6;
        }
        
        if (temNum.charAt(1)=='1' && temNum.charAt(5)=='1' && temNum.charAt(9)=='1') {
            this.caso = 7;
        }
        
        if (temNum.charAt(2)=='1' && temNum.charAt(6)=='1' && temNum.charAt(7)=='1') {
            this.caso = 8;
        }
        
        if (temNum.charAt(4)=='1' && temNum.charAt(5)=='1' && temNum.charAt(6)=='1') {
            this.caso = 9;
        }
        
        if (temNum.charAt(2)=='1' && temNum.charAt(5)=='1' && temNum.charAt(8)=='1') {
            this.caso = 10;
        }
        
        if (temNum.charAt(2)=='1' && temNum.charAt(3)=='1' && temNum.charAt(4)=='1' && temNum.charAt(6)=='1') {
            this.caso = 11;
        }
        
        if (temNum.charAt(1)=='1' && temNum.charAt(3)=='1' && temNum.charAt(5)=='1' && temNum.charAt(6)=='1') {
            this.caso = 12;
        }
        
        if (temNum.charAt(1)=='1' && temNum.charAt(3)=='1' && temNum.charAt(4)=='1' && temNum.charAt(7)=='1') {
            this.caso = 13;
        }
        
        if (temNum.charAt(1)=='1' && temNum.charAt(2)=='1' && temNum.charAt(4)=='1' && temNum.charAt(8)=='1') {
            this.caso = 14;
        }
        
        if (temNum.charAt(1)=='1' && temNum.charAt(2)=='1' && temNum.charAt(3)=='1' && temNum.charAt(9)=='1') {
            this.caso = 15;
        }
        
        if (temNum.charAt(1)=='1' && temNum.charAt(2)=='1' && temNum.charAt(3)=='1' && temNum.charAt(4)=='1'
                && temNum.charAt(5)=='1') {
            this.caso = 16;
        }
        
    }

    public void incrementaNumeroDeVitorias() {
        this.numeroDeVitorias ++;
    }
    
}
