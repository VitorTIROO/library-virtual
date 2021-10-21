package View;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Vitor
 */
public class JFPrincipal extends javax.swing.JFrame {
    
    int perfil;
    
    public JFPrincipal(String usuario, int perfil) {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        jLUsuario.setText("Bem Vindo, " + usuario);
        
        this.perfil = perfil;
        
        if (perfil == 0) {
            jMIAutores.setEnabled(false);
            jMIDepartemento.setEnabled(false);
            jMIOrientador.setEnabled(false);
            jMITrabalho.setEnabled(false);
            jMIUsuario.setEnabled(false);
        } else if (perfil == 1) {
            jMIAutores.setEnabled(false);
            jMIDepartemento.setEnabled(false);
            jMIOrientador.setEnabled(false);
            jMITrabalho.setEnabled(false);
            jMIUsuario.setEnabled(false);
        } else if (perfil == 2) {
            jMIUsuario.setEnabled(false);
        } else if (perfil == 3) {
            
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPrincipal = new javax.swing.JPanel();
        jTBStatus = new javax.swing.JToolBar();
        jLUsuario = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMCadastro = new javax.swing.JMenu();
        jMIAutores = new javax.swing.JMenuItem();
        jMIDepartemento = new javax.swing.JMenuItem();
        jMIOrientador = new javax.swing.JMenuItem();
        jMITrabalho = new javax.swing.JMenuItem();
        jMIUsuario = new javax.swing.JMenuItem();
        jMPesquisa = new javax.swing.JMenu();
        jMSistema = new javax.swing.JMenu();
        jMILogoff = new javax.swing.JMenuItem();
        jMIEncerrar = new javax.swing.JMenuItem();
        jMAjuda = new javax.swing.JMenu();
        jMISobre = new javax.swing.JMenuItem();
        jMIManual = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Principal - Library Virtual");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jTBStatus.setBackground(new java.awt.Color(255, 255, 255));
        jTBStatus.setFloatable(false);
        jTBStatus.setRollover(true);

        jLUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLUsuario.setForeground(new java.awt.Color(255, 51, 51));
        jLUsuario.setText("jLabel1");
        jTBStatus.add(jLUsuario);

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTBStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
        );
        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
                .addContainerGap(562, Short.MAX_VALUE)
                .addComponent(jTBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMCadastro.setMnemonic('C');
        jMCadastro.setText("Cadastro");
        jMCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMIAutores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMIAutores.setText("Autores");
        jMIAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAutoresActionPerformed(evt);
            }
        });
        jMCadastro.add(jMIAutores);

        jMIDepartemento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMIDepartemento.setText("Departamento");
        jMIDepartemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIDepartementoActionPerformed(evt);
            }
        });
        jMCadastro.add(jMIDepartemento);

        jMIOrientador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMIOrientador.setText("Orientador");
        jMIOrientador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIOrientadorActionPerformed(evt);
            }
        });
        jMCadastro.add(jMIOrientador);

        jMITrabalho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMITrabalho.setText("Trabalho");
        jMITrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMITrabalhoActionPerformed(evt);
            }
        });
        jMCadastro.add(jMITrabalho);

        jMIUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMIUsuario.setText("Usuário");
        jMIUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIUsuarioActionPerformed(evt);
            }
        });
        jMCadastro.add(jMIUsuario);

        jMenuBar.add(jMCadastro);

        jMPesquisa.setMnemonic('P');
        jMPesquisa.setText("Pesquisa");
        jMPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMPesquisaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMPesquisaMouseReleased(evt);
            }
        });
        jMenuBar.add(jMPesquisa);

        jMSistema.setMnemonic('S');
        jMSistema.setText("Sistema");
        jMSistema.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMILogoff.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMILogoff.setText("Logoff");
        jMILogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMILogoffActionPerformed(evt);
            }
        });
        jMSistema.add(jMILogoff);

        jMIEncerrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMIEncerrar.setText("Encerrar");
        jMIEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEncerrarActionPerformed(evt);
            }
        });
        jMSistema.add(jMIEncerrar);

        jMenuBar.add(jMSistema);

        jMAjuda.setMnemonic('A');
        jMAjuda.setText("Ajuda");
        jMAjuda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMISobre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMISobre.setText("Sobre");
        jMISobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISobreActionPerformed(evt);
            }
        });
        jMAjuda.add(jMISobre);

        jMIManual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMIManual.setText("Manual");
        jMIManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIManualActionPerformed(evt);
            }
        });
        jMAjuda.add(jMIManual);

        jMenuBar.add(jMAjuda);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMILogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMILogoffActionPerformed
        dispose();
        new JFLogin().setVisible(true);
    }//GEN-LAST:event_jMILogoffActionPerformed

    private void jMIEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEncerrarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "DESEJA MESMO SAIR DO SISTEMA?", "SAIR DO SISTEMA",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMIEncerrarActionPerformed

    private void jMIDepartementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIDepartementoActionPerformed
        new JDDepartamento(null, true, perfil).setVisible(true);
    }//GEN-LAST:event_jMIDepartementoActionPerformed

    private void jMIOrientadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIOrientadorActionPerformed
        new JDOrientador(this, true, perfil).setVisible(true);
    }//GEN-LAST:event_jMIOrientadorActionPerformed

    private void jMIUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIUsuarioActionPerformed
        new JDUsuario(null, true, perfil).setVisible(true);
    }//GEN-LAST:event_jMIUsuarioActionPerformed

    private void jMIAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAutoresActionPerformed
        new JDAutor(this, true, perfil).setVisible(true);
    }//GEN-LAST:event_jMIAutoresActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(null, "DESEJA MESMO SAIR DO SISTEMA?", "SAIR DO SISTEMA",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            setDefaultCloseOperation(JFPrincipal.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jMITrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMITrabalhoActionPerformed
        new JDTrabalho(this, true, perfil).setVisible(true);
    }//GEN-LAST:event_jMITrabalhoActionPerformed

    private void jMPesquisaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMPesquisaMouseReleased
        new JDPesquisar(this, true).setVisible(true);
    }//GEN-LAST:event_jMPesquisaMouseReleased

    private void jMPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMPesquisaMouseClicked
        new JDPesquisar(this, true).setVisible(true);
    }//GEN-LAST:event_jMPesquisaMouseClicked

    private void jMISobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISobreActionPerformed
        new JDSobre(this, true).setVisible(true);
    }//GEN-LAST:event_jMISobreActionPerformed

    private void jMIManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIManualActionPerformed
        new JDManual(this, true).setVisible(true);
    }//GEN-LAST:event_jMIManualActionPerformed

    /**
     * Método responsavel por fechar a janela quando for precionado a tecla ESC.
     *
     * @return
     */
    @Override
    protected JRootPane createRootPane() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (JOptionPane.showConfirmDialog(null, "DESEJA MESMO SAIR DO SISTEMA?", "SAIR",
                        JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        };
        KeyStroke stroke = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0);
        JRootPane rootPane = new JRootPane();
        rootPane.registerKeyboardAction(actionListener, stroke, JComponent.WHEN_IN_FOCUSED_WINDOW);
        return rootPane;
    }
    
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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal("VISITANTE", 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JMenu jMAjuda;
    private javax.swing.JMenu jMCadastro;
    private javax.swing.JMenuItem jMIAutores;
    private javax.swing.JMenuItem jMIDepartemento;
    private javax.swing.JMenuItem jMIEncerrar;
    private javax.swing.JMenuItem jMILogoff;
    private javax.swing.JMenuItem jMIManual;
    private javax.swing.JMenuItem jMIOrientador;
    private javax.swing.JMenuItem jMISobre;
    private javax.swing.JMenuItem jMITrabalho;
    private javax.swing.JMenuItem jMIUsuario;
    private javax.swing.JMenu jMPesquisa;
    private javax.swing.JMenu jMSistema;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JToolBar jTBStatus;
    // End of variables declaration//GEN-END:variables
}
