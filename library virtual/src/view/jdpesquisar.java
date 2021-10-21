package View;

import Controle.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vitor
 */
public class JDPesquisar extends javax.swing.JDialog {

    PreparedStatement ps;
    Connection con = Conexao.conectar();
    ResultSet rs;
    DefaultTableModel model;

    public JDPesquisar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) jTPesquisa.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPrincipal = new javax.swing.JPanel();
        jLTitle = new javax.swing.JLabel();
        jBPesquisar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPesquisa = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jCBTrabalho = new javax.swing.JCheckBox();
        jCBAutor = new javax.swing.JCheckBox();
        jTFTrabalho = new javax.swing.JTextField();
        jTFAutor = new javax.swing.JTextField();
        jTFOrientador = new javax.swing.JTextField();
        jTFAno = new javax.swing.JTextField();
        jCBAno = new javax.swing.JCheckBox();
        jCBOrientador = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PESQUISAR");
        setResizable(false);

        jPPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLTitle.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLTitle.setForeground(new java.awt.Color(51, 204, 255));
        jLTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitle.setText("PESQUISA");

        jBPesquisar.setBackground(new java.awt.Color(204, 204, 204));
        jBPesquisar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBPesquisar.setText("PESQUISAR");
        jBPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBPesquisarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBPesquisarMouseExited(evt);
            }
        });
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jBSair.setBackground(new java.awt.Color(204, 204, 204));
        jBSair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBSair.setText("SAIR");
        jBSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBSairMouseExited(evt);
            }
        });
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jTPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AUTOR", "ORIENTADOR", "ANO", "TRABALHO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTPesquisa);
        if (jTPesquisa.getColumnModel().getColumnCount() > 0) {
            jTPesquisa.getColumnModel().getColumn(2).setMinWidth(50);
            jTPesquisa.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTPesquisa.getColumnModel().getColumn(2).setMaxWidth(50);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCBTrabalho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCBTrabalho.setText("TRABALHO");
        jCBTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTrabalhoActionPerformed(evt);
            }
        });

        jCBAutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCBAutor.setText("AUTOR");
        jCBAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAutorActionPerformed(evt);
            }
        });

        jTFTrabalho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFTrabalho.setEnabled(false);

        jTFAutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFAutor.setEnabled(false);

        jTFOrientador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFOrientador.setEnabled(false);

        jTFAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFAno.setEnabled(false);

        jCBAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCBAno.setText("ANO");
        jCBAno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jCBAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAnoActionPerformed(evt);
            }
        });

        jCBOrientador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCBOrientador.setText("ORIENTADOR");
        jCBOrientador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBOrientadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBAno, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBOrientador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jTFAno, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFOrientador, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFTrabalho))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFAutor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBOrientador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFOrientador))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBAno, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jTFAno, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFTrabalho))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jBPesquisar)
                        .addGap(76, 76, 76)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(181, 181, 181))
        );
        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addComponent(jLTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBPesquisar, jBSair});

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

    private void jBPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPesquisarMouseEntered
        Metodos.MouseEntered(jBPesquisar);
    }//GEN-LAST:event_jBPesquisarMouseEntered

    private void jBPesquisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPesquisarMouseExited
        Metodos.MouseExited(jBPesquisar);
    }//GEN-LAST:event_jBPesquisarMouseExited

    private void jBSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSairMouseEntered
        Metodos.MouseEntered(jBSair);
    }//GEN-LAST:event_jBSairMouseEntered

    private void jBSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSairMouseExited
        Metodos.MouseExited(jBSair);
    }//GEN-LAST:event_jBSairMouseExited

    private void jCBAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAutorActionPerformed
        acao(jCBAutor, jTFAutor);
    }//GEN-LAST:event_jCBAutorActionPerformed

    private void jCBOrientadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBOrientadorActionPerformed
        acao(jCBOrientador, jTFOrientador);
    }//GEN-LAST:event_jCBOrientadorActionPerformed

    private void jCBAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAnoActionPerformed
        acao(jCBAno, jTFAno);
    }//GEN-LAST:event_jCBAnoActionPerformed

    private void jCBTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTrabalhoActionPerformed
        acao(jCBTrabalho, jTFTrabalho);
    }//GEN-LAST:event_jCBTrabalhoActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        try {
            String sql = "select t.titulo,t.ano,t.issn,a.nome autor, o.nome orientador from trabalho t,autor a, orientador o where t.idautor = a.idautor and \n"
                    + "t.idorientador = o.idorientador ";

            /*select t.titulo,t.ano,t.issn,a.nome autor, o.nome orientador from trabalho t,autor a, orientador o where t.idautor = a.idautor and
             t.idorientador = o.idorientador and t.ano like '%%' and t.titulo like  '%%' and a.nome like  '%%' and o.nome like  '%%'*/
            if (jCBAutor.isSelected() == true) {
                sql += " and a.nome like  '%" + jTFAutor.getText() + "%'";
            }
            if (jCBOrientador.isSelected() == true) {
                sql += " and o.nome like '%" + jTFOrientador.getText() + "%'";
            }
            if (jCBAno.isSelected() == true) {
                sql += " and t.ano like '%" + jTFAno.getText() + "%'";
            }
            if (jCBTrabalho.isSelected() == true) {
                sql += " and t.titulo like '%" + jTFTrabalho.getText() + "%'";
            }

            System.out.println(sql);

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }

            while (rs.next()) {
                Object dados[] = new Object[]{
                    rs.getString(4),
                    rs.getString(5),
                    rs.getInt(2),
                    rs.getString(1)};
                model.addRow(dados);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO PESQUISAR.\n\nERRO: " + ex.getMessage(), "PESQUISAR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        Conexao.desconectar();
        dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    void acao(JCheckBox cb, JTextField tf) {
        if (cb.isSelected() == true) {
            tf.setEnabled(true);
            tf.requestFocus();
        } else {
            tf.setEnabled(false);
            tf.setText("");
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
            java.util.logging.Logger.getLogger(JDPesquisar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDPesquisar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDPesquisar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDPesquisar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDPesquisar dialog = new JDPesquisar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBSair;
    private javax.swing.JCheckBox jCBAno;
    private javax.swing.JCheckBox jCBAutor;
    private javax.swing.JCheckBox jCBOrientador;
    private javax.swing.JCheckBox jCBTrabalho;
    private javax.swing.JLabel jLTitle;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFAno;
    private javax.swing.JTextField jTFAutor;
    private javax.swing.JTextField jTFOrientador;
    private javax.swing.JTextField jTFTrabalho;
    private javax.swing.JTable jTPesquisa;
    // End of variables declaration//GEN-END:variables

}
