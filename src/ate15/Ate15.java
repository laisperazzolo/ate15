/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ate15;

import Tela.TelaInicial;
import javax.swing.JFrame;

/**
 *
 * @author projetoEsus
 */
public class Ate15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //  new AtorJogador();
        TelaInicial tela = TelaInicial.getInstance();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
    
}
