package View;

import Controle.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Vitor
 */
public final class JDUsuario extends javax.swing.JDialog {

    PreparedStatement ps;
    Connection con = Conexao.conectar();
    ResultSet rs;

    /**
     *
     * @param parent
     * @param modal
     */
    public JDUsuario(java.awt.Frame parent, boolean modal, int perfil) {
        super(parent, modal);
        initComponents();
        preencherTabela("select * from usuario");
        Metodos.carregaCB(jCBDepartamento, "SELECT * FROM departamento", "nome");
        if (perfil == 2) {
            jBRemover.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("lb?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        usuarioQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT u FROM Usuario u");
        usuarioList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : usuarioQuery.getResultList();
        jPPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTUsuario = new javax.swing.JTable();
        jLTitle = new javax.swing.JLabel();
        jBCadastrar = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBRemover = new javax.swing.JButton();
        jBPesquisar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jPDados = new javax.swing.JPanel();
        jLNome = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLId = new javax.swing.JLabel();
        jTFId = new javax.swing.JTextField();
        jLDepartamento = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        jLPerfil = new javax.swing.JLabel();
        jLLogin = new javax.swing.JLabel();
        jLSenha = new javax.swing.JLabel();
        jLDica = new javax.swing.JLabel();
        jCBPerfil = new javax.swing.JComboBox();
        jCBDepartamento = new javax.swing.JComboBox();
        jTFEmail = new javax.swing.JTextField();
        jTFLogin = new javax.swing.JTextField();
        jTFDica = new javax.swing.JTextField();
        jPFSenha = new javax.swing.JPasswordField();
        jBLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuários");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jTUsuario.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, usuarioList, jTUsuario);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${usuarioPK.idusuario}"));
        columnBinding.setColumnName("ID");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("NOME");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${perfil}"));
        columnBinding.setColumnName("PERFIL");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${login}"));
        columnBinding.setColumnName("LOGIN");
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dica}"));
        columnBinding.setColumnName("DICA");
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTUsuarioMouseReleased(evt);
            }
        });
        jTUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTUsuarioKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTUsuario);
        if (jTUsuario.getColumnModel().getColumnCount() > 0) {
            jTUsuario.getColumnModel().getColumn(0).setMinWidth(60);
            jTUsuario.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTUsuario.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        jLTitle.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLTitle.setForeground(new java.awt.Color(0, 153, 255));
        jLTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitle.setText("USUÁRIOS");

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

        jPDados.setBackground(new java.awt.Color(255, 255, 255));
        jPDados.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLNome.setText("NOME:");

        jLId.setText("ID:");

        jTFId.setEnabled(false);

        jLDepartamento.setText("DEPARTAMENTO:");

        jLEmail.setText("EMAIL:");

        jLPerfil.setText("PERFIL:");

        jLLogin.setText("LOGIN:");

        jLSenha.setText("SENHA:");

        jLDica.setText("DICA:");

        jCBPerfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "OPERADOR", "TÉC. ADMINISTRATIVO", "ADMINISTRADOR" }));
        jCBPerfil.setToolTipText("");

        jTFEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEmailActionPerformed(evt);
            }
        });

        jTFDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPDadosLayout = new javax.swing.GroupLayout(jPDados);
        jPDados.setLayout(jPDadosLayout);
        jPDadosLayout.setHorizontalGroup(
            jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLId)
                    .addComponent(jLDepartamento)
                    .addComponent(jLEmail)
                    .addComponent(jLNome)
                    .addComponent(jLPerfil)
                    .addComponent(jLLogin)
                    .addComponent(jLSenha)
                    .addComponent(jLDica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                    .addComponent(jTFNome)
                    .addComponent(jTFDica, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jPFSenha)
                    .addComponent(jTFLogin)
                    .addComponent(jCBPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPDadosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCBDepartamento, jCBPerfil, jPFSenha, jTFDica, jTFLogin});

        jPDadosLayout.setVerticalGroup(
            jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLId)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDepartamento)
                    .addComponent(jCBDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPerfil)
                    .addComponent(jCBPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmail)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLLogin)
                    .addComponent(jTFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLSenha)
                    .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDica)
                    .addComponent(jTFDica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPDadosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jCBDepartamento, jCBPerfil, jLDica, jLLogin, jLSenha, jPFSenha, jTFDica, jTFEmail, jTFId, jTFLogin, jTFNome});

        jBLimpar.setBackground(new java.awt.Color(204, 204, 204));
        jBLimpar.setText("LIMPAR");
        jBLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBLimparMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBLimparMouseExited(evt);
            }
        });
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBCancelar)
                        .addGap(10, 10, 10))
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addComponent(jPDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jBCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBRemover)
                        .addGap(2, 2, 2)
                        .addComponent(jBPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBLimpar)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPPrincipalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBAlterar, jBCadastrar, jBPesquisar, jBRemover});

        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
                .addComponent(jLTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAlterar)
                    .addComponent(jBRemover)
                    .addComponent(jBPesquisar)
                    .addComponent(jBLimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBAlterar, jBCadastrar, jBLimpar, jBPesquisar, jBRemover});

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

    private void jTUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTUsuarioMouseReleased
        setaCampos();
    }//GEN-LAST:event_jTUsuarioMouseReleased

    private void jTUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTUsuarioKeyReleased
        setaCampos();
    }//GEN-LAST:event_jTUsuarioKeyReleased

    private void jBCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCadastrarMouseEntered
        Metodos.MouseEntered(jBCadastrar);
    }//GEN-LAST:event_jBCadastrarMouseEntered

    private void jBCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCadastrarMouseExited
        Metodos.MouseExited(jBCadastrar);
    }//GEN-LAST:event_jBCadastrarMouseExited

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        try {

            if (jTFNome.getText().matches("[a-zA-Z]{2,}\\s[a-zA-Z\\W]{2,}") == false) {

                JOptionPane.showMessageDialog(this, "DIGITE UM NOME QUE TENHA PELO MENOS DUAS PALAVARAS \nDE PELO MENOS DOIS CARACTERES.",
                        "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jTFNome.getText().isEmpty() == true) {

                JOptionPane.showMessageDialog(this, "DIGITE UM NOME.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jCBDepartamento.getSelectedIndex() <= 0) {

                JOptionPane.showMessageDialog(this, "O CAMPO DEPARTAMENTO É OBRIGATÓRIO", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jCBPerfil.getSelectedIndex() <= 0) {

                JOptionPane.showMessageDialog(this, "O CAMPO PERFIL É OBRIGATÓRIO", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jTFEmail.getText().isEmpty() == true) {

                JOptionPane.showMessageDialog(this, "O CAMPO EMAIL É OBRIGATÓRIO", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jTFEmail.getText().matches("\\w+[-._]\\w+[-._]\\w+[-._]\\w+@lv.com|\\w+[-._]\\w+[-._]\\w+@lv.com") == false) {

                JOptionPane.showMessageDialog(this, "O CAMPO EMAIL NÃO ESTÁ NO PADRÃO.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jTFLogin.getText().isEmpty() == true) {

                JOptionPane.showMessageDialog(this, "O CAMPO LOGIN É OBRIGATORIO.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jTFLogin.getText().matches("[a-zA-Z]{2,}|[a-zA-Z]{2,} [a-zA-Z]{2,}") == false) {

                JOptionPane.showMessageDialog(this, "O CAMPO LOGIN NÃO ESTÁ NO PADRÃO.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (verificaLogin(jTFLogin.getText()) == true) {

                JOptionPane.showMessageDialog(this, "JÁ EXISTE UM LOGIN COMO ESSE NO BANCO DE DADOS.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jPFSenha.getText().isEmpty() == true) {

                JOptionPane.showMessageDialog(this, "O CAMPO SENHA É OBRIGATÓRIO.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jPFSenha.getText().matches("[\\w\\W]{6,}") == false) {

                JOptionPane.showMessageDialog(this, "A SENHA DEVE CONTER NO MINIMO 6 CARACTERES CONTENDO LETRAS E NUMEROS.", "CADASTRAR",
                        JOptionPane.WARNING_MESSAGE);

            } else if (pegaID(jCBDepartamento.getSelectedItem().toString()) == 0) {

                JOptionPane.showMessageDialog(this, "está faltando o id do departamento.".toUpperCase(), "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (perfil() == 0) {

                JOptionPane.showMessageDialog(this, "O PERFIL É OBRIGATÓRIO.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else {
                String sql = "INSERT INTO usuario (iddepartamento,nome,perfil,email,login,senha,dica) VALUES (?,?,?,?,?,?,?);";

                ps = con.prepareStatement(sql);
                ps.setInt(1, pegaID(jCBDepartamento.getSelectedItem().toString()));
                ps.setString(2, jTFNome.getText().toUpperCase());
                ps.setInt(3, perfil());
                ps.setString(4, jTFEmail.getText());
                ps.setString(5, jTFLogin.getText().toUpperCase());
                ps.setString(6, jPFSenha.getText());
                ps.setString(7, jTFDica.getText());

                ps.execute();
                Conexao.desconectar();
                preencherTabela("select * from usuario");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO CADASTRAR USUARIO.\n\nERRO: " + ex.getMessage(), "CADASTRAR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAlterarMouseEntered
        Metodos.MouseEntered(jBAlterar);
    }//GEN-LAST:event_jBAlterarMouseEntered

    private void jBAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAlterarMouseExited
        Metodos.MouseExited(jBAlterar);
    }//GEN-LAST:event_jBAlterarMouseExited

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        try {
            if (jTFId.getText().isEmpty() == true) {

                JOptionPane.showMessageDialog(this, "ESCOLHA UM USUÁRIO NA TABELA PARA SER ALTERADO.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jTFNome.getText().matches("[a-zA-Z]{2,}\\s[a-zA-Z\\W]{2,}") == false) {

                JOptionPane.showMessageDialog(this, "DIGITE UM NOME QUE TENHA PELO MENOS DUAS PALAVARAS \nDE PELO MENOS DOIS CARACTERES.",
                        "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jTFNome.getText().isEmpty() == true) {

                JOptionPane.showMessageDialog(this, "DIGITE UM NOME.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jCBDepartamento.getSelectedIndex() <= 0) {

                JOptionPane.showMessageDialog(this, "O CAMPO DEPARTAMENTO É OBRIGATÓRIO", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jCBPerfil.getSelectedIndex() <= 0) {

                JOptionPane.showMessageDialog(this, "O CAMPO PERFIL É OBRIGATÓRIO", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jTFEmail.getText().isEmpty() == true) {

                JOptionPane.showMessageDialog(this, "O CAMPO EMAIL É OBRIGATÓRIO", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jTFEmail.getText().matches("\\w+[-._]\\w+[-._]\\w+[-._]\\w+@lv.com|\\w+[-._]\\w+[-._]\\w+@lv.com") == false) {

                JOptionPane.showMessageDialog(this, "O CAMPO EMAIL NÃO ESTÁ NO PADRÃO.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jTFLogin.getText().isEmpty() == true) {

                JOptionPane.showMessageDialog(this, "O CAMPO LOGIN É OBRIGATORIO.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jTFLogin.getText().matches("[a-zA-Z]{2,}|[a-zA-Z]{2,} [a-zA-Z]{2,}") == false) {

                JOptionPane.showMessageDialog(this, "O CAMPO LOGIN NÃO ESTÁ NO PADRÃO.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jPFSenha.getText().isEmpty() == true) {

                JOptionPane.showMessageDialog(this, "O CAMPO SENHA É OBRIGATÓRIO.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jPFSenha.getText().matches("[\\w\\W]{6,}") == false) {

                JOptionPane.showMessageDialog(this, "A SENHA DEVE CONTER NO MINIMO 6 CARACTERES CONTENDO LETRAS E NUMEROS.", "CADASTRAR",
                        JOptionPane.WARNING_MESSAGE);

            } else if (pegaID(jCBDepartamento.getSelectedItem().toString()) == 0) {

                JOptionPane.showMessageDialog(this, "está faltando o id do departamento.".toUpperCase(), "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (perfil() == 0) {

                JOptionPane.showMessageDialog(this, "O PERFIL É OBRIGATÓRIO.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else {
                String sql = "UPDATE usuario SET iddepartamento = ?,nome = ?,perfil = ?,email = ?,login = ?,senha = ?,dica = ? WHERE idusuario = ?;";

                ps = con.prepareStatement(sql);

                ps.setInt(1, pegaID(jCBDepartamento.getSelectedItem().toString()));
                ps.setString(2, jTFNome.getText().toUpperCase());
                ps.setInt(3, perfil());
                ps.setString(4, jTFEmail.getText());
                ps.setString(5, jTFLogin.getText().toUpperCase());
                ps.setString(6, jPFSenha.getText());
                ps.setString(7, jTFDica.getText());
                ps.setInt(8, Integer.parseInt(jTFId.getText()));

                ps.execute();
                Conexao.desconectar();
                preencherTabela("select * from usuario");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO ALTERAR USUARIO.\n\nERRO: " + ex.getMessage(), "ALTERAR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBRemoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRemoverMouseEntered
        Metodos.MouseEntered(jBRemover);
    }//GEN-LAST:event_jBRemoverMouseEntered

    private void jBRemoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRemoverMouseExited
        Metodos.MouseExited(jBRemover);
    }//GEN-LAST:event_jBRemoverMouseExited

    private void jBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRemoverActionPerformed
        try {
            if (jTFId.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(this, "ESCOLHA UM USUARIO NA TABELA PARA REMOVER.", "REMOVER", JOptionPane.WARNING_MESSAGE);
            } else {
                con.setAutoCommit(false);
                String sql = "DELETE FROM usuario WHERE idusuario=?;";

                ps = con.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(jTFId.getText()));
                ps.execute();

                if (JOptionPane.showConfirmDialog(this, "DESEJA MESMO REMOVER ESTE USUARIO?",
                        "REMOVER", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                    con.commit();
                    Conexao.desconectar();
                    limparCampos();

                }
                con.setAutoCommit(true);
                preencherTabela("select * from usuario");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO REMOVER USUARIO.\n\nERRO: " + ex.getMessage(), "REMOVER", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBRemoverActionPerformed

    private void jBPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPesquisarMouseEntered
        Metodos.MouseEntered(jBPesquisar);
    }//GEN-LAST:event_jBPesquisarMouseEntered

    private void jBPesquisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPesquisarMouseExited
        Metodos.MouseExited(jBPesquisar);
    }//GEN-LAST:event_jBPesquisarMouseExited

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        try {
            ArrayList dados = new ArrayList();

            String[] Colunas = new String[]{"ID", "NOME", "PERFIL", "LOGIN", "DICA"};
            ps = con.prepareStatement("SELECT * FROM USUARIO where nome like '%" + jTFNome.getText() + "%'");
            rs = ps.executeQuery();
            while (rs.next()) {
                jTUsuario.removeAll();
                dados.add(new Object[]{
                    rs.getInt("IDUSUARIO"),
                    rs.getString("nome"),
                    setPerfil(rs.getInt("perfil")),
                    rs.getString("login"),
                    rs.getString("dica")
                });
            }
            ModeloTabela modelo = new ModeloTabela(dados, Colunas);
            jTUsuario.setModel(modelo);
            jTUsuario.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTUsuario.getColumnModel().getColumn(0).setMaxWidth(60);
            jTUsuario.getColumnModel().getColumn(0).setMinWidth(60);
            //}

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO PESQUISAR!!!\n\nERRO: " + ex.getMessage(),
                    "PESQUISAR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseEntered
        Metodos.MouseEntered(jBCancelar);
    }//GEN-LAST:event_jBCancelarMouseEntered

    private void jBCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseExited
        Metodos.MouseExited(jBCancelar);
    }//GEN-LAST:event_jBCancelarMouseExited

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        Conexao.desconectar();
        dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jTFDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDicaActionPerformed

    private void jTFEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEmailActionPerformed

    }//GEN-LAST:event_jTFEmailActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Conexao.desconectar();
    }//GEN-LAST:event_formWindowClosing

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBLimparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimparMouseEntered
        Metodos.MouseEntered(jBLimpar);
    }//GEN-LAST:event_jBLimparMouseEntered

    private void jBLimparMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimparMouseExited
        Metodos.MouseExited(jBLimpar);
    }//GEN-LAST:event_jBLimparMouseExited

    void setaCampos() {

        int linhaSelecionada = jTUsuario.getSelectedRow();
        jTFId.setText(jTUsuario.getValueAt(linhaSelecionada, 0).toString());
        try {

            ps = con.prepareStatement("select * from usuario where idusuario = " + jTFId.getText() + "");
            rs = ps.executeQuery();

            if (rs.next()) {
                int iddepartamento = rs.getInt("iddepartamento");
                jTFId.setText(jTUsuario.getValueAt(linhaSelecionada, 0).toString());
                jTFNome.setText((String) jTUsuario.getValueAt(linhaSelecionada, 1));
                jCBPerfil.setSelectedItem((String) jTUsuario.getValueAt(linhaSelecionada, 2));
                jTFLogin.setText((String) jTUsuario.getValueAt(linhaSelecionada, 3));
                jTFDica.setText((String) jTUsuario.getValueAt(linhaSelecionada, 4));
                jTFEmail.setText(rs.getString("email"));
                jPFSenha.setText(rs.getString("senha"));
                jCBDepartamento.setSelectedItem(setDepartamento(iddepartamento).isEmpty() ? " " : setDepartamento(iddepartamento));
            }
            Conexao.desconectar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO PEGAR O RESTANTE DOS CAMPOS.\n\nERRO: " + ex.getMessage(), "SETA CAMPOS", JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     *
     * @param sql
     */
    public void preencherTabela(String sql) {

        try {
            ArrayList dados = new ArrayList();

            String[] Colunas = new String[]{"ID", "NOME", "PERFIL", "LOGIN", "DICA"};
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String perfil = setPerfil(rs.getInt("perfil"));
                jTUsuario.removeAll();
                dados.add(new Object[]{
                    rs.getInt("IDUSUARIO"),
                    rs.getString("nome"),
                    perfil,
                    rs.getString("login"),
                    rs.getString("dica")
                });
            }

            ModeloTabela modelo = new ModeloTabela(dados, Colunas);
            jTUsuario.setModel(modelo);
            jTUsuario.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTUsuario.getColumnModel().getColumn(0).setMaxWidth(60);
            jTUsuario.getColumnModel().getColumn(0).setMinWidth(60);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO PREENCHER TABELA!!!\n\nERRO: " + ex.getMessage(),
                    "PREENCHER TABELA", JOptionPane.ERROR_MESSAGE);
        }
    }

    void limparCampos() {
        jTFId.setText("");
        jTFNome.setText("");
        jCBDepartamento.setSelectedIndex(0);
        jCBPerfil.setSelectedIndex(0);
        jTFEmail.setText("");
        jTFLogin.setText("");
        jTFDica.setText("");
        jPFSenha.setText("");
    }

    boolean verificaLogin(String login) {

        try {
            ps = con.prepareStatement("select * from usuario where login ='" + login + "'");
            rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println(rs.getString("login"));
                return true;
            }
            Conexao.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO VERIFICAR LOGIN.\n\nERRO: " + ex.getMessage(), "VIRIFICAR LOGIN", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    int pegaID(String nome) {
        try {
            ps = con.prepareStatement("select * from departamento where nome = '" + nome + "'");
            rs = ps.executeQuery();
            int id;
            if (rs.next()) {
                id = rs.getInt("iddepartamento");
                return id;
            }
            Conexao.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO PEGAR ID DO DEPARTAMENTO.\n\nERRO: " + ex.getMessage(), "PEGA ID", JOptionPane.ERROR_MESSAGE);
        }
        return 0;
    }

    int perfil() {
        int op = jCBPerfil.getSelectedIndex();

        switch (op) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                return 0;
        }
    }

    String setPerfil(int p) {
        switch (p) {
            case 1:
                return "OPERADOR";
            case 2:
                return "TÉC. ADMINISTRATIVO";
            case 3:
                return "ADMINISTRADOR";
            default:
                return "";
        }
    }

    String setDepartamento(int id) {
        try {
            ps = con.prepareStatement("select * from departamento where iddepartamento = " + id + "");
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString("nome");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO PEGAR NOME DO DEPARTAMENTO.\n\nERRO: " + ex.getMessage(),
                    "PEGAR NOME DO DEPARTAMENTO", JOptionPane.WARNING_MESSAGE);
        }
        return "";
    }

    /**
     *
     * @return
     */
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

    /**
     *
     * @param args
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
            java.util.logging.Logger.getLogger(JDUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDUsuario dialog = new JDUsuario(new javax.swing.JFrame(), true, 3);
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
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBRemover;
    private javax.swing.JComboBox jCBDepartamento;
    private javax.swing.JComboBox jCBPerfil;
    private javax.swing.JLabel jLDepartamento;
    private javax.swing.JLabel jLDica;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLLogin;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLPerfil;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLTitle;
    private javax.swing.JPanel jPDados;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFDica;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFId;
    private javax.swing.JTextField jTFLogin;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTable jTUsuario;
    private java.util.List<Classes.Usuario> usuarioList;
    private javax.persistence.Query usuarioQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
