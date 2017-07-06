package Tela;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {
    
    protected JMenuItem conectar, iniciarPartida, desconectar;
    protected AtorJogador atorJogador;
    protected TelaInstrucoes tela_instrucoes;
    protected String nomeJogador;
    protected String nomeAdversario;

    public TelaInicial(AtorJogador ator) {
        initComponents();
        tela_instrucoes = new TelaInstrucoes();
        this.atorJogador = ator;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void notificar(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public String solicitar(String msg, String def) {
        return JOptionPane.showInputDialog(msg, def);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ate15 = new javax.swing.JLabel();
        botaoInstrucoes = new javax.swing.JButton();
        botao1 = new javax.swing.JToggleButton();
        botao2 = new javax.swing.JToggleButton();
        botao3 = new javax.swing.JToggleButton();
        botao4 = new javax.swing.JToggleButton();
        botao5 = new javax.swing.JToggleButton();
        botao6 = new javax.swing.JToggleButton();
        botao7 = new javax.swing.JToggleButton();
        botao8 = new javax.swing.JToggleButton();
        botao9 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        LabelNomeDoJogador2 = new javax.swing.JLabel();
        LabelJogador1 = new javax.swing.JLabel();
        LabelJogador2 = new javax.swing.JLabel();
        LabelNomeDoJogador1 = new javax.swing.JLabel();
        botaoSair = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ate15.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        ate15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ate15.setText("Até 15");

        botaoInstrucoes.setText("Instruções");
        botaoInstrucoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInstrucoesActionPerformed(evt);
            }
        });

        botao1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        botao1.setText("1");
        botao1.setPreferredSize(new java.awt.Dimension(40, 40));
        botao1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao1MouseClicked(evt);
            }
        });

        botao2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        botao2.setText("2");
        botao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao2MouseClicked(evt);
            }
        });

        botao3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        botao3.setText("3");
        botao3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao3MouseClicked(evt);
            }
        });

        botao4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        botao4.setText("4");
        botao4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao4MouseClicked(evt);
            }
        });

        botao5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        botao5.setText("5");
        botao5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao5MouseClicked(evt);
            }
        });

        botao6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        botao6.setText("6");
        botao6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao6MouseClicked(evt);
            }
        });

        botao7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        botao7.setText("7");
        botao7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao7MouseClicked(evt);
            }
        });

        botao8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        botao8.setText("8");
        botao8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao8MouseClicked(evt);
            }
        });

        botao9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        botao9.setText("9");
        botao9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao9MouseClicked(evt);
            }
        });

        LabelNomeDoJogador2.setText("<< Nome do Jogador1>>");

        LabelJogador1.setText("Jogador 1:");

        LabelJogador2.setText("Jogador 2:");

        LabelNomeDoJogador1.setText("<< Nome do Jogador1>>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelNomeDoJogador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LabelNomeDoJogador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelJogador1)
                .addGap(7, 7, 7)
                .addComponent(LabelNomeDoJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(LabelJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNomeDoJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        jMenu2.setText("Opções");

        jMenuItem1.setText("Conectar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem3.setText("Iniciar Partida");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem2.setText("Desconectar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botao4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botao7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botao8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botao5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSair, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(ate15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoInstrucoes)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(ate15))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoInstrucoes)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSair))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // opcao Iniciar Partida
        try {
            atorJogador.iniciarPartida();
        } catch (Exception e1) {
            notificar(e1.getMessage());
            e1.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // opcao Conectar
        try {
            nomeJogador = solicitar("Insira seu nome:", null);
            LabelNomeDoJogador1.setText(nomeJogador);
            String servidor = solicitar("Insira o servidor:", "localhost");
            atorJogador.conectar(servidor, nomeJogador);
            notificar("Conexão estabelecida com sucesso!");
        } catch (Exception ex) {
            notificar(ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // opcao Desconectar
        try {
            atorJogador.desconectar();
            notificar("Conexão encerrada com sucesso!");
        } catch (Exception ex) {
            notificar(ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    
    public void clickPosicao(int numeroEscolhido) {
        try {
            atorJogador.realizaJogada(numeroEscolhido);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }
    
    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair da partida?");
        if(resposta == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botao1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao1MouseClicked
        clickPosicao(1);
        botao1.setEnabled(false);        
    }//GEN-LAST:event_botao1MouseClicked

    private void botao2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao2MouseClicked
        clickPosicao(2);
        botao2.setEnabled(false);
    }//GEN-LAST:event_botao2MouseClicked

    private void botao3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao3MouseClicked
        clickPosicao(3);
        botao3.setEnabled(false);
    }//GEN-LAST:event_botao3MouseClicked

    private void botao4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao4MouseClicked
        clickPosicao(4);
        botao4.setEnabled(false);
    }//GEN-LAST:event_botao4MouseClicked

    private void botao5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao5MouseClicked
        clickPosicao(5);
        botao5.setEnabled(false);
    }//GEN-LAST:event_botao5MouseClicked

    private void botao6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao6MouseClicked
        clickPosicao(6);
        botao6.setEnabled(false);
    }//GEN-LAST:event_botao6MouseClicked

    private void botao7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao7MouseClicked
        clickPosicao(7);
        botao7.setEnabled(false);
    }//GEN-LAST:event_botao7MouseClicked

    private void botao8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao8MouseClicked
        clickPosicao(8);
        botao8.setEnabled(false);
    }//GEN-LAST:event_botao8MouseClicked

    private void botao9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao9MouseClicked
        clickPosicao(9);
        botao9.setEnabled(false);
    }//GEN-LAST:event_botao9MouseClicked

    private void botaoInstrucoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInstrucoesActionPerformed
        tela_instrucoes.setVisible(true);
    }//GEN-LAST:event_botaoInstrucoesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaInicial( AtorJogador ator).setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelJogador1;
    private javax.swing.JLabel LabelJogador2;
    private javax.swing.JLabel LabelNomeDoJogador1;
    private javax.swing.JLabel LabelNomeDoJogador2;
    private javax.swing.JLabel ate15;
    private javax.swing.JToggleButton botao1;
    private javax.swing.JToggleButton botao2;
    private javax.swing.JToggleButton botao3;
    private javax.swing.JToggleButton botao4;
    private javax.swing.JToggleButton botao5;
    private javax.swing.JToggleButton botao6;
    private javax.swing.JToggleButton botao7;
    private javax.swing.JToggleButton botao8;
    private javax.swing.JToggleButton botao9;
    private javax.swing.JButton botaoInstrucoes;
    private javax.swing.JToggleButton botaoSair;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
