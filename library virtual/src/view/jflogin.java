package View;

import Controle.*;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Vitor
 */
public class JFLogin extends javax.swing.JFrame {

    Connection con = Conexao.conectar();
    PreparedStatement ps;
    ResultSet rs;
    String usuario = "VISITANTE";
    int perfil, CONT;

    public JFLogin() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPrincipal = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jLLogin = new javax.swing.JLabel();
        jLSenha = new javax.swing.JLabel();
        jLDica = new javax.swing.JLabel();
        jPFSenha = new javax.swing.JPasswordField();
        jTFLogin = new javax.swing.JTextField();
        jBEntrar = new javax.swing.JButton();
        jBVisitante = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jLImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Library Virtual");

        jPPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLTitulo.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("LIBRARY VIRTUAL");

        jLLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLLogin.setText("LOGIN:");

        jLSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLSenha.setText("SENHA:");

        jLDica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLDica.setForeground(new java.awt.Color(255, 51, 51));

        jPFSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPFSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPFSenhaKeyReleased(evt);
            }
        });

        jTFLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTFLogin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTFLogin.setToolTipText("");
        jTFLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFLoginKeyReleased(evt);
            }
        });

        jBEntrar.setBackground(new java.awt.Color(204, 204, 204));
        jBEntrar.setText("ENTRAR");
        jBEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBEntrarMouseExited(evt);
            }
        });
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });

        jBVisitante.setBackground(new java.awt.Color(204, 204, 204));
        jBVisitante.setText("SOU VISITANTE");
        jBVisitante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBVisitanteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBVisitanteMouseExited(evt);
            }
        });
        jBVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisitanteActionPerformed(evt);
            }
        });

        jBCancelar.setBackground(new java.awt.Color(204, 204, 204));
        jBCancelar.setText("CANCELAR");
        jBCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCancelarMouseExited(evt);
            }
        });
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jBEntrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBVisitante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCancelar))
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLLogin)
                            .addComponent(jLSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDica, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFLogin)
                                .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(68, 68, 68))
        );
        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLLogin)
                            .addComponent(jTFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLSenha)
                            .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLDica))
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBVisitante)
                    .addComponent(jBCancelar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLDica, jLLogin, jLSenha, jPFSenha, jTFLogin});

        jPPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBCancelar, jBEntrar, jBVisitante});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed
        entrar();
    }//GEN-LAST:event_jBEntrarActionPerformed

    private void jBVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisitanteActionPerformed
        new JFPrincipal(usuario, 0).setVisible(true);
        dispose();
    }//GEN-LAST:event_jBVisitanteActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        Conexao.desconectar();
        System.exit(0);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEntrarMouseEntered
        Metodos.MouseEntered(jBEntrar);
    }//GEN-LAST:event_jBEntrarMouseEntered

    private void jBEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEntrarMouseExited
        Metodos.MouseExited(jBEntrar);
    }//GEN-LAST:event_jBEntrarMouseExited

    private void jBVisitanteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVisitanteMouseExited
        Metodos.MouseExited(jBVisitante);
    }//GEN-LAST:event_jBVisitanteMouseExited

    private void jBVisitanteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVisitanteMouseEntered
        Metodos.MouseEntered(jBVisitante);
    }//GEN-LAST:event_jBVisitanteMouseEntered

    private void jBCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseEntered
        Metodos.MouseEntered(jBCancelar);
    }//GEN-LAST:event_jBCancelarMouseEntered

    private void jBCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseExited
        Metodos.MouseExited(jBCancelar);
    }//GEN-LAST:event_jBCancelarMouseExited

    private void jPFSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPFSenhaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && evt.getKeyCode() == 10) {
            entrar();
        } else {

        }
    }//GEN-LAST:event_jPFSenhaKeyReleased

    private void jTFLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFLoginKeyReleased
        jTFLogin.setText(jTFLogin.getText().toUpperCase());
    }//GEN-LAST:event_jTFLoginKeyReleased

    void entrar() {
        if (jTFLogin.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(this, "Digite o usuário.", "Login", JOptionPane.INFORMATION_MESSAGE);
        } else if (jPFSenha.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(this, "Digite a senha.", "Login", JOptionPane.INFORMATION_MESSAGE);
        } else {

            try {

                String sql = "select * from usuario where login = '" + jTFLogin.getText() + "' and senha = '" + jPFSenha.getText() + "'";

                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                if (rs.next()) {
                    usuario = rs.getString("nome");
                    perfil = rs.getInt("perfil");
                    new JFPrincipal(usuario, perfil).setVisible(true);
                    dispose();
                    Conexao.desconectar();

                } else {

                    String di = "select * from usuario where login = '" + jTFLogin.getText() + "'";

                    ps = con.prepareStatement(di);
                    rs = ps.executeQuery();

                    if (rs.next()) {

                        jLDica.setText(rs.getString("dica"));
                        JOptionPane.showMessageDialog(null, "SENHA INCORRETA.", "LOGIN", JOptionPane.INFORMATION_MESSAGE);
                        jPFSenha.requestFocus();
                        jPFSenha.setText("");

                    } else {
                        JOptionPane.showMessageDialog(null, "USUÁRIO NÃO EXISTE!!!", "LOGIN", JOptionPane.INFORMATION_MESSAGE);;
                    }
                    CONT = CONT + 1;
                    if (CONT == 3) {
                        System.exit(0);
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "ERRO AO ENTRAR NO SISTEMA\n\nERRO: " + ex.getMessage(), "LOGIN", JOptionPane.ERROR_MESSAGE);
            }

        }
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
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEntrar;
    private javax.swing.JButton jBVisitante;
    private javax.swing.JLabel jLDica;
    private javax.swing.JLabel jLImagem;
    private javax.swing.JLabel jLLogin;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JTextField jTFLogin;
    // End of variables declaration//GEN-END:variables
}
