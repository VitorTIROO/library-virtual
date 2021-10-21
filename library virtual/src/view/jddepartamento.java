package View;

import Controle.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Vitor
 */
public class JDDepartamento extends javax.swing.JDialog {
    
    PreparedStatement ps;
    Connection con = Conexao.conectar();
    ResultSet rs;
    
    public JDDepartamento(java.awt.Frame parent, boolean modal, int perfil) {
        super(parent, modal);
        initComponents();
        if (perfil == 2) {
            jBRemover.setEnabled(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("lb?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        departamentoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM Departamento d");
        departamentoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : departamentoQuery.getResultList();
        jPPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDepartamento = new javax.swing.JTable();
        jLTitle = new javax.swing.JLabel();
        jBCadastrar = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBRemover = new javax.swing.JButton();
        jBPesquisar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLNome = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLId = new javax.swing.JLabel();
        jTFId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Departamentos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jTDepartamento.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, departamentoList, jTDepartamento);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${iddepartamento}"));
        columnBinding.setColumnName("ID");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("NOME");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTDepartamentoMouseReleased(evt);
            }
        });
        jTDepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTDepartamentoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTDepartamento);
        if (jTDepartamento.getColumnModel().getColumnCount() > 0) {
            jTDepartamento.getColumnModel().getColumn(0).setMinWidth(60);
            jTDepartamento.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTDepartamento.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        jLTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLTitle.setForeground(new java.awt.Color(51, 204, 255));
        jLTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitle.setText("DEPARTAMENTOS");

        jBCadastrar.setBackground(new java.awt.Color(204, 204, 204));
        jBCadastrar.setText("CADASTRAR");
        jBCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCadastrarMouseExited(evt);
            }
        });
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBAlterar.setBackground(new java.awt.Color(204, 204, 204));
        jBAlterar.setText("ALTERAR");
        jBAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBAlterarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBAlterarMouseExited(evt);
            }
        });
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBRemover.setBackground(new java.awt.Color(204, 204, 204));
        jBRemover.setText("REMOVER");
        jBRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBRemoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBRemoverMouseExited(evt);
            }
        });
        jBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRemoverActionPerformed(evt);
            }
        });

        jBPesquisar.setBackground(new java.awt.Color(204, 204, 204));
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLNome.setText("NOME:");

        jLId.setText("ID:");

        jTFId.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLNome)
                    .addComponent(jLId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLId)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBCancelar)
                        .addGap(10, 10, 10))
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPPrincipalLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jBCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBRemover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBPesquisar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
                .addComponent(jLTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAlterar)
                    .addComponent(jBRemover)
                    .addComponent(jBPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBAlterar, jBCadastrar, jBPesquisar, jBRemover});

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

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCadastrarMouseEntered
        Metodos.MouseEntered(jBCadastrar);
    }//GEN-LAST:event_jBCadastrarMouseEntered

    private void jBCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCadastrarMouseExited
        Metodos.MouseExited(jBCadastrar);
    }//GEN-LAST:event_jBCadastrarMouseExited

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        Conexao.desconectar();
        dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAlterarMouseEntered
        Metodos.MouseEntered(jBAlterar);
    }//GEN-LAST:event_jBAlterarMouseEntered

    private void jBAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAlterarMouseExited
        Metodos.MouseExited(jBAlterar);
    }//GEN-LAST:event_jBAlterarMouseExited

    private void jBRemoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRemoverMouseExited
        Metodos.MouseExited(jBRemover);
    }//GEN-LAST:event_jBRemoverMouseExited

    private void jBRemoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRemoverMouseEntered
        Metodos.MouseEntered(jBRemover);
    }//GEN-LAST:event_jBRemoverMouseEntered

    private void jBPesquisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPesquisarMouseExited
        Metodos.MouseExited(jBPesquisar);
    }//GEN-LAST:event_jBPesquisarMouseExited

    private void jBPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPesquisarMouseEntered
        Metodos.MouseEntered(jBPesquisar);
    }//GEN-LAST:event_jBPesquisarMouseEntered

    private void jBCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseEntered
        Metodos.MouseEntered(jBCancelar);
    }//GEN-LAST:event_jBCancelarMouseEntered

    private void jBCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseExited
        Metodos.MouseExited(jBCancelar);
    }//GEN-LAST:event_jBCancelarMouseExited

    private void jTDepartamentoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDepartamentoMouseReleased
        setaCampos();
    }//GEN-LAST:event_jTDepartamentoMouseReleased

    private void jTDepartamentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDepartamentoKeyReleased
        setaCampos();
    }//GEN-LAST:event_jTDepartamentoKeyReleased

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        try {
            if (jTFNome.getText().length() <= 1) {
                
                JOptionPane.showMessageDialog(this, "DIGITE UM NOME QUE TENHA PELO MENOS DOIS CARACTERES.",
                        "CADASTRAR", JOptionPane.WARNING_MESSAGE);
                
            } else if (jTFNome.getText().isEmpty() == true) {
                
                JOptionPane.showMessageDialog(this, "DIGITE UM NOME.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);
                
            } else {
                String sql = "INSERT INTO departamento (nome) VALUES (?);";
                
                ps = con.prepareStatement(sql);
                ps.setString(1, jTFNome.getText().toUpperCase());
                ps.execute();
                preencherTabela("select * from departamento");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO CADASTRAR DEPARTAMENTO.\n\nERRO: " + ex.getMessage(), "CADASTRAR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRemoverActionPerformed
        try {
            if (jTFId.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(this, "ESCOLHA UM DEPARTAMENTO NA TABELA PARA REMOVER..", "REMOVER", JOptionPane.WARNING_MESSAGE);
            } else {
                con.setAutoCommit(false);
                String sql = "DELETE FROM departamento WHERE iddepartamento = ?;";
                
                ps = con.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(jTFId.getText()));
                ps.execute();
                if (JOptionPane.showConfirmDialog(this, "DESEJA MESMO REMOVER ESTE DEPARTAMENTO?",
                        "REMOVER", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    con.commit();
                    limparCampos();
                    
                }
                con.setAutoCommit(true);
                preencherTabela("select * from departamento");
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO REMOVER DEPARTAMENTO.\n\nERRO: " + ex.getMessage(), "REMOVER", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBRemoverActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        try {
            if (jTFId.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(this, "ESCOLHA UM DEPARTAMENTO NA TABELA PARA EDITAR.", "ALTERAR", JOptionPane.WARNING_MESSAGE);
            } else if (jTFNome.getText().length() <= 1) {
                
                JOptionPane.showMessageDialog(this, "DIGITE UM NOME QUE TENHA PELO MENOS DOIS CARACTERES.",
                        "ALTERAR", JOptionPane.WARNING_MESSAGE);
                
            } else if (jTFNome.getText().isEmpty() == true) {
                
                JOptionPane.showMessageDialog(this, "DIGITE UM NOME.", "ALTERAR", JOptionPane.WARNING_MESSAGE);
                
            } else {
                String sql = "UPDATE departamento SET nome = ? WHERE iddepartamento = ?;";
                
                ps = con.prepareStatement(sql);
                ps.setString(1, jTFNome.getText().toUpperCase());
                ps.setInt(2, Integer.parseInt(jTFId.getText()));
                ps.execute();
                preencherTabela("select * from departamento");
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO ALTERAR DEPARTAMENTO.\n\nERRO: " + ex.getMessage(), "ALTERAR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Conexao.desconectar();
    }//GEN-LAST:event_formWindowClosing

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        try {
            ArrayList dados = new ArrayList();
            
            String[] Colunas = new String[]{"ID", "NOME"};
            ps = con.prepareStatement("SELECT * FROM departamento where nome like '%" + jTFNome.getText() + "%'");
            rs = ps.executeQuery();
            while (rs.next()) {
                jTDepartamento.removeAll();
                dados.add(new Object[]{rs.getInt("iddepartamento"), rs.getString("nome")});
            }
            ModeloTabela modelo = new ModeloTabela(dados, Colunas);
            jTDepartamento.setModel(modelo);
            jTDepartamento.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTDepartamento.getColumnModel().getColumn(0).setMaxWidth(60);
            jTDepartamento.getColumnModel().getColumn(0).setMinWidth(60);
            
            jTFId.setText("");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO PESQUISAR!!!\n\nERRO: " + ex.getMessage(),
                    "PESQUISAR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed
    
    void setaCampos() {
        int linhaSelecionada = jTDepartamento.getSelectedRow();
        
        jTFId.setText(jTDepartamento.getValueAt(linhaSelecionada, 0).toString());
        jTFNome.setText((String) jTDepartamento.getValueAt(linhaSelecionada, 1));
        
    }
    
    public void preencherTabela(String sql) {
        
        try {
            ArrayList dados = new ArrayList();
            
            String[] Colunas = new String[]{"ID", "NOME"};
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                jTDepartamento.removeAll();
                dados.add(new Object[]{rs.getInt("iddepartamento"), rs.getString("nome")});
            }
            ModeloTabela modelo = new ModeloTabela(dados, Colunas);
            jTDepartamento.setModel(modelo);
            jTDepartamento.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTDepartamento.getColumnModel().getColumn(0).setMaxWidth(60);
            jTDepartamento.getColumnModel().getColumn(0).setMinWidth(60);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO PREENCHER TABELA!!!\n\nERRO: " + ex.getMessage(),
                    "PREENCHER TABELA", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    void limparCampos() {
        jTFId.setText("");
        jTFNome.setText("");
    }
    
    @Override
    protected JRootPane createRootPane() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Conexao.desconectar();
                dispose();
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
            java.util.logging.Logger.getLogger(JDDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDDepartamento dialog = new JDDepartamento(new javax.swing.JFrame(), true, 3);
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
    private java.util.List<Classes.Departamento> departamentoList;
    private javax.persistence.Query departamentoQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBRemover;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLTitle;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTDepartamento;
    private javax.swing.JTextField jTFId;
    private javax.swing.JTextField jTFNome;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
