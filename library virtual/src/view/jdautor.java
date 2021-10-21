package View;

import Controle.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vitor
 */
public class JDAutor extends javax.swing.JDialog {

    PreparedStatement ps;
    Connection con = Conexao.conectar();
    ResultSet rs;
    DefaultTableModel model = new DefaultTableModel();

    public JDAutor(java.awt.Frame parent, boolean modal,int perfil) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) jTAutor.getModel();
        preencherTabela("select * from autor");
        if(perfil == 2){
            jBRemover.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGSexo = new javax.swing.ButtonGroup();
        jPPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAutor = new javax.swing.JTable();
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
        jLDtNasc = new javax.swing.JLabel();
        jLSexo = new javax.swing.JLabel();
        jLCpf = new javax.swing.JLabel();
        jFTFDtNasc = new javax.swing.JFormattedTextField();
        jFTFCpf = new javax.swing.JFormattedTextField();
        jRBMasculino = new javax.swing.JRadioButton();
        jRBFeminino = new javax.swing.JRadioButton();
        jBLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AUTOR");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jTAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "DT.NASC", "SEXO", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTAutor.getTableHeader().setReorderingAllowed(false);
        jTAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTAutorMouseReleased(evt);
            }
        });
        jTAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTAutorKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTAutor);
        if (jTAutor.getColumnModel().getColumnCount() > 0) {
            jTAutor.getColumnModel().getColumn(0).setMinWidth(60);
            jTAutor.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTAutor.getColumnModel().getColumn(0).setMaxWidth(60);
            jTAutor.getColumnModel().getColumn(3).setMinWidth(50);
            jTAutor.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTAutor.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        jLTitle.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLTitle.setForeground(new java.awt.Color(0, 153, 255));
        jLTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitle.setText("AUTOR");

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

        jLDtNasc.setText("DT.NASC:");

        jLSexo.setText("SEXO:");

        jLCpf.setText("CPF:");

        try {
            jFTFDtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFTFCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jRBMasculino.setBackground(new java.awt.Color(255, 255, 255));
        bGSexo.add(jRBMasculino);
        jRBMasculino.setText("M");

        jRBFeminino.setBackground(new java.awt.Color(255, 255, 255));
        bGSexo.add(jRBFeminino);
        jRBFeminino.setText("F");

        javax.swing.GroupLayout jPDadosLayout = new javax.swing.GroupLayout(jPDados);
        jPDados.setLayout(jPDadosLayout);
        jPDadosLayout.setHorizontalGroup(
            jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLId)
                    .addComponent(jLNome)
                    .addComponent(jLDtNasc)
                    .addComponent(jLCpf)
                    .addComponent(jLSexo))
                .addGap(21, 21, 21)
                .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDadosLayout.createSequentialGroup()
                        .addComponent(jRBMasculino)
                        .addGap(18, 18, 18)
                        .addComponent(jRBFeminino))
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPDadosLayout.setVerticalGroup(
            jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLId)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDtNasc)
                    .addComponent(jFTFDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSexo)
                    .addComponent(jRBMasculino)
                    .addComponent(jRBFeminino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCpf)
                    .addComponent(jFTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

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
                        .addGap(10, 10, 10)
                        .addComponent(jBCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBRemover)
                        .addGap(2, 2, 2)
                        .addComponent(jBPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBLimpar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBCancelar)
                        .addGap(10, 10, 10))
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addComponent(jPDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
                .addComponent(jLTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAlterar)
                    .addComponent(jBRemover)
                    .addComponent(jBPesquisar)
                    .addComponent(jBLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTAutorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAutorMouseReleased
        setaCampos();
    }//GEN-LAST:event_jTAutorMouseReleased

    private void jTAutorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAutorKeyReleased
        setaCampos();
    }//GEN-LAST:event_jTAutorKeyReleased

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

            } else if (jFTFDtNasc.getText().matches("[0-9]{2}/[0-9]{2}/[0-9]{4}") == false) {

                JOptionPane.showMessageDialog(this, "O CAMPO DATA DE NASCIMENTO É OBRIGATÓRIO", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (verificaIdade(jFTFDtNasc.getText()) < 16) {

                JOptionPane.showMessageDialog(this, "A IDADE DO AUTOR É DE: " + verificaIdade(jFTFDtNasc.getText()) + " ANOS."
                        + "\nA IDADE MINIMA PERMITIDA É DE 16 ANOS.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (getSexo() == null) {

                JOptionPane.showMessageDialog(this, "O CAMPO SEXO É OBRIGATÓRIO", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jFTFCpf.getText().matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}") == false) {

                JOptionPane.showMessageDialog(this, "O CAMPO CPF É OBRIGATORIO.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (verificaCPF() == true) {

                JOptionPane.showMessageDialog(this, "ESTE CPF ESTÁ CADASTRADO EM NOSSO SISTEMA.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else {
                Conexao.conectar();
                String sql = "INSERT INTO autor (nome,dtnasc,sexo,cpf) VALUES (?,?,?,?);";

                ps = con.prepareStatement(sql);
                ps.setString(1, jTFNome.getText().toUpperCase());
                ps.setString(2, jFTFDtNasc.getText());
                ps.setString(3, getSexo());
                ps.setString(4, jFTFCpf.getText());

                ps.execute();
                Conexao.desconectar();
                preencherTabela("select * from autor");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO CADASTRAR AUTOR.\n\nERRO: " + ex.getMessage(), "CADASTRAR", JOptionPane.ERROR_MESSAGE);
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

                JOptionPane.showMessageDialog(this, "ESCOLHA UM AUTOR NA TABELA PARA SER ALTERADO.", "ALTERAR", JOptionPane.WARNING_MESSAGE);

            } else if (jTFNome.getText().matches("[a-zA-Z]{2,}\\s[a-zA-Z\\W]{2,}") == false) {

                JOptionPane.showMessageDialog(this, "DIGITE UM NOME QUE TENHA PELO MENOS DUAS PALAVARAS \nDE PELO MENOS DOIS CARACTERES.",
                        "ALTERAR", JOptionPane.WARNING_MESSAGE);

            } else if (jTFNome.getText().isEmpty() == true) {

                JOptionPane.showMessageDialog(this, "DIGITE UM NOME.", "ALTERAR", JOptionPane.WARNING_MESSAGE);

            } else if (jFTFDtNasc.getText().matches("[0-9]{2}/[0-9]{2}/[0-9]{4}") == false) {

                JOptionPane.showMessageDialog(this, "O CAMPO DATA DE NASCIMENTO É OBRIGATÓRIO", "ALTERAR", JOptionPane.WARNING_MESSAGE);

            } else if (verificaIdade(jFTFDtNasc.getText()) < 16) {

                JOptionPane.showMessageDialog(this, "A IDADE DO AUTOR É DE: " + verificaIdade(jFTFDtNasc.getText()) + " ANOS."
                        + "\nA IDADE MINIMA PERMITIDA É DE 16 ANOS.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (getSexo() == null) {

                JOptionPane.showMessageDialog(this, "O CAMPO SEXO É OBRIGATÓRIO", "ALTERAR", JOptionPane.WARNING_MESSAGE);

            } else if (jFTFCpf.getText().matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}") == false) {

                JOptionPane.showMessageDialog(this, "O CAMPO CPF É OBRIGATORIO.", "ALTERAR", JOptionPane.WARNING_MESSAGE);

            } else {
                Conexao.conectar();
                String sql = "UPDATE autor SET nome = ?,dtnasc = ?,sexo = ?,cpf = ? WHERE idautor = ?;";

                ps = con.prepareStatement(sql);

                ps.setString(1, jTFNome.getText().toUpperCase());
                ps.setString(2, jFTFDtNasc.getText());
                ps.setString(3, getSexo());
                ps.setString(4, jFTFCpf.getText());
                ps.setInt(5, Integer.parseInt(jTFId.getText()));

                ps.execute();
                Conexao.desconectar();
                preencherTabela("select * from autor");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO ALTERAR AUTOR.\n\nERRO: " + ex.getMessage(), "ALTERAR", JOptionPane.ERROR_MESSAGE);
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
                String sql = "DELETE FROM autor WHERE idautor=?;";

                ps = con.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(jTFId.getText()));
                ps.execute();

                if (JOptionPane.showConfirmDialog(this, "DESEJA MESMO REMOVER ESTE AUTOR?",
                        "REMOVER", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                    con.commit();
                    Conexao.desconectar();
                    limparCampos();

                }
                con.setAutoCommit(true);
                preencherTabela("select * from autor");

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

            ps = con.prepareStatement("SELECT * FROM autor where nome like '%" + jTFNome.getText() + "%'");
            rs = ps.executeQuery();

            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }

            while (rs.next()) {
                Object[] dados = (new Object[]{
                    rs.getInt("idautor"),
                    rs.getString("nome"),
                    rs.getString("dtnasc"),
                    rs.getString("sexo"),
                    rs.getString("cpf")
                });
                model.addRow(dados);
            }
            Conexao.desconectar();
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

    private void jBLimparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimparMouseEntered
        Metodos.MouseEntered(jBLimpar);
    }//GEN-LAST:event_jBLimparMouseEntered

    private void jBLimparMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimparMouseExited
        Metodos.MouseExited(jBLimpar);
    }//GEN-LAST:event_jBLimparMouseExited

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Conexao.desconectar();
    }//GEN-LAST:event_formWindowClosing

    void setaCampos() {

        int linhaSelecionada = jTAutor.getSelectedRow();

        jTFId.setText(jTAutor.getValueAt(linhaSelecionada, 0).toString());
        jTFNome.setText((String) jTAutor.getValueAt(linhaSelecionada, 1));
        jFTFDtNasc.setText((String) jTAutor.getValueAt(linhaSelecionada, 2));

        if (setSexo(jTAutor.getValueAt(linhaSelecionada, 3).toString()).equalsIgnoreCase("M")) {
            jRBMasculino.setSelected(true);
        } else if (setSexo(jTAutor.getValueAt(linhaSelecionada, 3).toString()).equalsIgnoreCase("F")) {
            jRBFeminino.setSelected(true);
        }
        jFTFCpf.setText((String) jTAutor.getValueAt(linhaSelecionada, 4));
    }

    public void preencherTabela(String sql) {

        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }

            while (rs.next()) {
                Object[] dados = (new Object[]{
                    rs.getInt("idautor"),
                    rs.getString("nome"),
                    rs.getString("dtnasc"),
                    rs.getString("sexo"),
                    rs.getString("cpf")
                });
                model.addRow(dados);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO PREENCHER TABELA!!!\n\nERRO: " + ex.getMessage(),
                    "PREENCHER TABELA", JOptionPane.ERROR_MESSAGE);
        }
    }

    void limparCampos() {
        jTFId.setText("");
        jTFNome.setText("");
        jFTFDtNasc.setText("");
        jFTFCpf.setText("");
        bGSexo.clearSelection();
    }

    String getSexo() {
        if (jRBFeminino.isSelected() == true) {
            return "F";
        } else if (jRBMasculino.isSelected() == true) {
            return "M";
        }
        return null;
    }

    String setSexo(String p) {
        if (p.equalsIgnoreCase("M")) {
            return "M";
        } else if (p.equalsIgnoreCase("F")) {
            return "F";
        }
        return null;
    }

    int verificaIdade(String dta) {

        String[] x = dta.split("/");
        int ano = Integer.parseInt(x[2]);

        Date data = new Date();
        SimpleDateFormat formata = new SimpleDateFormat("dd/MM/yyyy");
        String dtAtual = formata.format(data);

        x = dtAtual.split("/");

        int anoAtual = Integer.parseInt(x[2]);

        return anoAtual - ano;

    }

    boolean verificaCPF() {

        try {
            ps = con.prepareStatement("select * from autor where cpf ='" + jFTFCpf.getText() + "'");
            rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println(rs.getString("cpf"));
                return true;
            }
            Conexao.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO VERIFICAR CPF.\n\nERRO: " + ex.getMessage(), "VIRIFICAR CPF", JOptionPane.ERROR_MESSAGE);
        }
        return false;
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
            java.util.logging.Logger.getLogger(JDAutor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDAutor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDAutor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDAutor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDAutor dialog = new JDAutor(new javax.swing.JFrame(), true,3);
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
    private javax.swing.ButtonGroup bGSexo;
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBRemover;
    private javax.swing.JFormattedTextField jFTFCpf;
    private javax.swing.JFormattedTextField jFTFDtNasc;
    private javax.swing.JLabel jLCpf;
    private javax.swing.JLabel jLDtNasc;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLSexo;
    private javax.swing.JLabel jLTitle;
    private javax.swing.JPanel jPDados;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JRadioButton jRBFeminino;
    private javax.swing.JRadioButton jRBMasculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAutor;
    private javax.swing.JTextField jTFId;
    private javax.swing.JTextField jTFNome;
    // End of variables declaration//GEN-END:variables

}
