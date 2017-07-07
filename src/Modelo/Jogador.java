package Modelo;

import br.ufsc.inf.leobr.cliente.Jogada;

public class Jogador implements Jogada{
    
    protected boolean jogadorDaVez = false;
    protected String nome;
    protected int numeroDeVitorias;
    protected String temNum ;
    //protected boolean[] numerosEscolhidos = new boolean[10];
    
    public Jogador (String nome){
        this.nome = nome;
//        for (int i  = 0; i < 10; i++) {
//            numerosEscolhidos[i] = false;
//        }
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

//    public boolean[] getNumerosEscolhidos() {
//        return numerosEscolhidos;
//    }
//
//    public void setNumerosEscolhidos(boolean[] numerosEscolhidos) {
//        this.numerosEscolhidos = numerosEscolhidos;
//    } 

    public int getNumeroDeVitorias() {
        return numeroDeVitorias;
    }

    public void setNumeroDeVitorias(int numeroDeVitorias) {
        this.numeroDeVitorias = numeroDeVitorias;
    }
    
    public boolean verificaVencedor(int numEscolhido) 
    {
        char[] novoString = this.temNum.toCharArray();
        novoString[numEscolhido] = '1';
        this.temNum = String.valueOf(novoString);
        return this.calculcaVencedor();
    }
    
    public boolean calculcaVencedor() {
        switch (this.temNum) {
            case "0000001001": // 6,9
                return true;

            case "0000000110": // 7,8
                return true;

            case "0010100001": // 2,4,9
                return true;

            case "0001010100": // 3,5,7
                return true;

            case "0100001010": // 1,6,8
                return true;

            case "0001100010": // 3,4,8
                return true;

            case "0100010001": // 1,5,9
                return true;

            case "0010001100": // 2,6,7
                return true;

            case "0000111000": // 4,5,6
                return true;

            case "0010010010": // 2,5,8
                return true;

            case "0011101000": // 2,3,4,6
                return true;

            case "0101011000": // 1,3,5,6
                return true;

            case "0101100100": // 1,3,4,7
                return true;

            case "0110100010": // 1,2,4,8
                return true;

            case "0111000001": // 1,2,3,9
                return true;

            case "0111110000": // 1,2,3,4,5
                return true;

            default:
                return false;
        }     
    }
    
    

//    public boolean verificaVencedor(int numeroEscolhido) {
  //  String temNum = "0000000000" ;
//        numerosEscolhidos[numeroEscolhido] = true;
//        return calculaVitoria();
//    }
//    
//    public boolean calculaVitoria() {
//        switch ()
//            case numerosEscolhidos[0] + 
//        return false;
//    }
        
        
        
        
    
}
