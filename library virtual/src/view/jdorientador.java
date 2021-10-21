package View;

import Controle.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author Vitor
 */
public class JDOrientador extends javax.swing.JDialog {

    PreparedStatement ps;
    Connection con = Conexao.conectar();
    ResultSet rs;
    int totalreg;

    public JDOrientador(java.awt.Frame parent, boolean modal, int perfil) {
        super(parent, modal);
        initComponents();
        totalreg = contReg();
        jLContReg.setText("(" + 0 + "/" + totalreg + ")");

        if (perfil == 2) {
            jBRemover.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGSexo = new javax.swing.ButtonGroup();
        jPPrincipal = new javax.swing.JPanel();
        jLTitle = new javax.swing.JLabel();
        jBCadastrar = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBRemover = new javax.swing.JButton();
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
        jLIdade = new javax.swing.JLabel();
        jBLimpar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jBProximo = new javax.swing.JButton();
        jBAnterior = new javax.swing.JButton();
        jBUltimo = new javax.swing.JButton();
        jBPrimeiro = new javax.swing.JButton();
        jLContReg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ORIENTADOR");
        setResizable(false);

        jPPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLTitle.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLTitle.setForeground(new java.awt.Color(0, 153, 255));
        jLTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitle.setText("ORIENTADOR");

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
        jFTFDtNasc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFTFDtNascKeyReleased(evt);
            }
        });

        try {
            jFTFCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jRBMasculino.setBackground(new java.awt.Color(255, 255, 255));
        bGSexo.add(jRBMasculino);
        jRBMasculino.setText("MASCULINO");

        jRBFeminino.setBackground(new java.awt.Color(255, 255, 255));
        bGSexo.add(jRBFeminino);
        jRBFeminino.setText("FEMININO");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRBFeminino))
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPDadosLayout.createSequentialGroup()
                        .addComponent(jFTFDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jFTFDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLIdade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSexo)
                    .addComponent(jRBMasculino)
                    .addComponent(jRBFeminino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCpf)
                    .addComponent(jFTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPDadosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jFTFDtNasc, jLIdade});

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

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBProximo.setBackground(new java.awt.Color(204, 204, 204));
        jBProximo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBProximo.setText(">");
        jBProximo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBProximoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBProximoMouseExited(evt);
            }
        });
        jBProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProximoActionPerformed(evt);
            }
        });

        jBAnterior.setBackground(new java.awt.Color(204, 204, 204));
        jBAnterior.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBAnterior.setText("<");
        jBAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBAnteriorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBAnteriorMouseExited(evt);
            }
        });
        jBAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnteriorActionPerformed(evt);
            }
        });

        jBUltimo.setBackground(new java.awt.Color(204, 204, 204));
        jBUltimo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBUltimo.setText(">>");
        jBUltimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBUltimoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBUltimoMouseExited(evt);
            }
        });
        jBUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUltimoActionPerformed(evt);
            }
        });

        jBPrimeiro.setBackground(new java.awt.Color(204, 204, 204));
        jBPrimeiro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBPrimeiro.setText("<<");
        jBPrimeiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBPrimeiroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBPrimeiroMouseExited(evt);
            }
        });
        jBPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPrimeiroActionPerformed(evt);
            }
        });

        jLContReg.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLContReg.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBPrimeiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBProximo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBUltimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLContReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAnterior)
                    .addComponent(jBProximo)
                    .addComponent(jBUltimo)
                    .addComponent(jLContReg))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBAnterior, jBPrimeiro, jBProximo, jBUltimo, jLContReg});

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAlterar)
                    .addComponent(jBRemover)
                    .addComponent(jBLimpar)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBAlterar, jBCadastrar, jBLimpar, jBRemover});

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

            }/* else if (jFTFDtNasc.getText().matches("[0-9]{2}/[0-9]{2}/[0-9]{4}") == false) {
                
             JOptionPane.showMessageDialog(this, "O CAMPO DATA DE NASCIMENTO É OBRIGATÓRIO", "CADASTRAR", JOptionPane.WARNING_MESSAGE);
                
             } else if (verificaIdade(jFTFDtNasc.getText()) < 16) {
                
             JOptionPane.showMessageDialog(this, "A IDADE DO AUTOR É DE: " + verificaIdade(jFTFDtNasc.getText()) + " ANOS."
             + "\nA IDADE MINIMA PERMITIDA É DE 16 ANOS.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);
                
             }*/ else if (getSexo() == 0) {

                JOptionPane.showMessageDialog(this, "O CAMPO SEXO É OBRIGATÓRIO", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jFTFCpf.getText().matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}") == false) {

                JOptionPane.showMessageDialog(this, "O CAMPO CPF NÃO É VALIDO.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (verificaCPF() == true) {

                JOptionPane.showMessageDialog(this, "ESTE CPF ESTÁ CADASTRADO EM NOSSO SISTEMA.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else {
                String sql = "INSERT INTO orientador (nome,sexo,cpf) VALUES (?,?,?);";

                ps = con.prepareStatement(sql);
                ps.setString(1, jTFNome.getText().toUpperCase());
                ps.setInt(2, getSexo());
                ps.setString(3, removerCaracter(jFTFCpf.getText()));

                ps.execute();
                Conexao.desconectar();
                totalreg = contReg();
                jLContReg.setText("(" + 0 + "/" + totalreg + ")");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO CADASTRAR ORIENTADOR.\n\nERRO: " + ex.getMessage(), "CADASTRAR", JOptionPane.ERROR_MESSAGE);
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

                JOptionPane.showMessageDialog(this, "ESCOLHA UM ORIENTADOR NA TABELA PARA SER ALTERADO.", "ALTERAR", JOptionPane.WARNING_MESSAGE);

            } else if (jTFNome.getText().matches("[a-zA-Z]{2,}\\s[a-zA-Z\\W]{2,}") == false) {

                JOptionPane.showMessageDialog(this, "DIGITE UM NOME QUE TENHA PELO MENOS DUAS PALAVARAS \nDE PELO MENOS DOIS CARACTERES.",
                        "ALTERAR", JOptionPane.WARNING_MESSAGE);

            } else if (jTFNome.getText().isEmpty() == true) {

                JOptionPane.showMessageDialog(this, "DIGITE UM NOME.", "ALTERAR", JOptionPane.WARNING_MESSAGE);

            } /*else if (jFTFDtNasc.getText().matches("[0-9]{2}/[0-9]{2}/[0-9]{4}") == false) {
                
             JOptionPane.showMessageDialog(this, "O CAMPO DATA DE NASCIMENTO É OBRIGATÓRIO", "ALTERAR", JOptionPane.WARNING_MESSAGE);
                
             } else if (verificaIdade(jFTFDtNasc.getText()) < 16) {
                
             JOptionPane.showMessageDialog(this, "A IDADE DO AUTOR É DE: " + verificaIdade(jFTFDtNasc.getText()) + " ANOS."
             + "\nA IDADE MINIMA PERMITIDA É DE 16 ANOS.", "ALTERAR", JOptionPane.WARNING_MESSAGE);
                
             } */ else if (getSexo() == 0) {

                JOptionPane.showMessageDialog(this, "O CAMPO SEXO É OBRIGATÓRIO", "ALTERAR", JOptionPane.WARNING_MESSAGE);

            } else if (jFTFCpf.getText().matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}") == false) {

                JOptionPane.showMessageDialog(this, "O CAMPO CPF É OBRIGATORIO.", "ALTERAR", JOptionPane.WARNING_MESSAGE);

            } else {
                String sql = "UPDATE orientador SET nome = ?,sexo = ?,cpf = ? WHERE idorientador = ?;";

                ps = con.prepareStatement(sql);

                ps.setString(1, jTFNome.getText().toUpperCase());
                ps.setInt(2, getSexo());
                ps.setString(3, removerCaracter(jFTFCpf.getText()));
                ps.setInt(4, Integer.parseInt(jTFId.getText()));

                ps.execute();
                Conexao.desconectar();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO ALTERAR ORIENTADOR.\n\nERRO: " + ex.getMessage(), "ALTERAR", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(this, "ESCOLHA UM ORIENTADOR PARA REMOVER.", "REMOVER", JOptionPane.WARNING_MESSAGE);
            } else {
                con.setAutoCommit(false);
                String sql = "DELETE FROM orientador WHERE idorientador = ?;";

                ps = con.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(jTFId.getText()));
                ps.execute();

                if (JOptionPane.showConfirmDialog(this, "DESEJA MESMO REMOVER ESTE ORIENTADOR?",
                        "REMOVER", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                    con.commit();
                    Conexao.desconectar();
                    limparCampos();
                }
                con.setAutoCommit(true);
                totalreg = contReg();
                jLContReg.setText("(" + 0 + "/" + totalreg + ")");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO REMOVER ORIENTADOR.\n\nERRO: " + ex.getMessage(), "REMOVER", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBRemoverActionPerformed

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

    private void jFTFDtNascKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFTFDtNascKeyReleased
        String x[] = jFTFDtNasc.getText().split("/");
        if (x[2].matches("\\s{4}|\\d\\s\\s\\s|\\d\\d\\s\\s|\\d\\d\\d\\s") == true) {
            // System.out.println("DIGITE A DATA COMPLETA PARA DESCOBRIR A IDADE.");
        } else {
            jLIdade.setText(String.valueOf(verificaIdade(jFTFDtNasc.getText())) + " Anos");
        }
    }//GEN-LAST:event_jFTFDtNascKeyReleased

    private void jBUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUltimoActionPerformed
        try {
            String sql = "select * from orientador";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.last()) {
                jTFId.setText(rs.getString(1));
                jTFNome.setText(rs.getString(2));
                if (rs.getInt(3) == 1) {
                    jRBMasculino.setSelected(true);
                } else if (rs.getInt(3) == 2) {
                    jRBFeminino.setSelected(true);
                }
                jFTFCpf.setText(rs.getString(4));
            }
            jLContReg.setText("(" + totalreg + "/" + totalreg + ")");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO PEGAR PRIMEIRO DE REGISTROS.\n\nERRO " + ex.getErrorCode() + ": " + ex.getMessage(),
                    "CONTADOR DE REGISTROS", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBUltimoActionPerformed

    private void jBUltimoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBUltimoMouseExited
        Metodos.MouseExited(jBUltimo);
    }//GEN-LAST:event_jBUltimoMouseExited

    private void jBUltimoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBUltimoMouseEntered
        Metodos.MouseEntered(jBUltimo);
    }//GEN-LAST:event_jBUltimoMouseEntered

    private void jBProximoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProximoMouseExited
        Metodos.MouseExited(jBProximo);
    }//GEN-LAST:event_jBProximoMouseExited

    private void jBProximoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProximoMouseEntered
        Metodos.MouseEntered(jBProximo);
    }//GEN-LAST:event_jBProximoMouseEntered

    private void jBAnteriorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAnteriorMouseExited
        Metodos.MouseExited(jBAnterior);
    }//GEN-LAST:event_jBAnteriorMouseExited

    private void jBAnteriorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAnteriorMouseEntered
        Metodos.MouseEntered(jBAnterior);
    }//GEN-LAST:event_jBAnteriorMouseEntered

    private void jBPrimeiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPrimeiroMouseEntered
        Metodos.MouseEntered(jBPrimeiro);
    }//GEN-LAST:event_jBPrimeiroMouseEntered

    private void jBPrimeiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPrimeiroMouseExited
        Metodos.MouseExited(jBPrimeiro);
    }//GEN-LAST:event_jBPrimeiroMouseExited

    private void jBPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrimeiroActionPerformed
        try {
            String sql = "select * from orientador";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.first()) {
                jTFId.setText(rs.getString(1));
                jTFNome.setText(rs.getString(2));
                if (rs.getInt(3) == 1) {
                    jRBMasculino.setSelected(true);
                } else if (rs.getInt(3) == 2) {
                    jRBFeminino.setSelected(true);
                }
                jFTFCpf.setText(rs.getString(4));
            }
            jLContReg.setText("(" + 1 + "/" + totalreg + ")");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO PEGAR PRIMEIRO DE REGISTROS.\n\nERRO " + ex.getErrorCode() + ": " + ex.getMessage(),
                    "CONTADOR DE REGISTROS", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBPrimeiroActionPerformed

    private void jBAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnteriorActionPerformed
        try {
            String sql = "select * from orientador";

            if (rs.previous()) {
                jTFId.setText(rs.getString(1));
                jTFNome.setText(rs.getString(2));
                setSexo(rs.getInt(3));
                if (rs.getInt(3) == 1) {
                    jRBMasculino.setSelected(true);
                } else if (rs.getInt(3) == 2) {
                    jRBFeminino.setSelected(true);
                }
                jFTFCpf.setText(rs.getString(4));
            }
            if (rs.getRow() == 0) {

            } else {
                jLContReg.setText("(" + rs.getRow() + "/" + totalreg + ")");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO PEGAR PRIMEIRO DE REGISTROS.\n\nERRO " + ex.getErrorCode() + ": " + ex.getMessage(),
                    "CONTADOR DE REGISTROS", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBAnteriorActionPerformed

    private void jBProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProximoActionPerformed
        try {
            String sql = "select * from orientador";

            if (rs.next()) {
                jTFId.setText(rs.getString(1));
                jTFNome.setText(rs.getString(2));
                if (rs.getInt(3) == 1) {
                    jRBMasculino.setSelected(true);
                } else if (rs.getInt(3) == 2) {
                    jRBFeminino.setSelected(true);
                }
                jFTFCpf.setText(rs.getString(4));
            }
            if (rs.getRow() == 0) {

            } else {
                jLContReg.setText("(" + rs.getRow() + "/" + totalreg + ")");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO PEGAR PRIMEIRO DE REGISTROS.\n\nERRO " + ex.getErrorCode() + ": " + ex.getMessage(),
                    "CONTADOR DE REGISTROS", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBProximoActionPerformed

    void limparCampos() {
        jTFId.setText("");
        jTFNome.setText("");
        jFTFDtNasc.setText("");
        jFTFCpf.setText("");
        jLIdade.setText("");
        bGSexo.clearSelection();
        jLContReg.setText("(" + 0 + "/" + totalreg + ")");
    }

    int getSexo() {
        if (jRBFeminino.isSelected() == true) {
            return 2;
        } else if (jRBMasculino.isSelected() == true) {
            return 1;
        }
        return 0;
    }

    String setSexo(int p) {
        switch (p) {
            case 0:
                return null;
            case 1:
                return "MASCULINO";
            case 2:
                return "FEMININO";
            default:
                return null;
        }

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
            ps = con.prepareStatement("select * from orientador where cpf ='" + removerCaracter(jFTFCpf.getText()) + "'");
            rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println(rs.getInt("cpf"));
                return true;
            }
            Conexao.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO VERIFICAR CPF.\n\nERRO: " + ex.getMessage(), "VIRIFICAR CPF", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    String removerCaracter(String cpf) {
        return cpf.replaceAll("[-.]", "");
    }

    int contReg() {
        try {
            String sql = "select count(idorientador) as total from orientador";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("total");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO PEGAR TOTAL DE REGISTROS.\n\nERRO " + ex.getErrorCode() + ": " + ex.getMessage(),
                    "CONTADOR DE REGISTROS", JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar();
        }
        return 0;
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
            java.util.logging.Logger.getLogger(JDOrientador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDOrientador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDOrientador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDOrientador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDOrientador dialog = new JDOrientador(new javax.swing.JFrame(), true, 3);
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
    private javax.swing.JButton jBAnterior;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBPrimeiro;
    private javax.swing.JButton jBProximo;
    private javax.swing.JButton jBRemover;
    private javax.swing.JButton jBUltimo;
    private javax.swing.JFormattedTextField jFTFCpf;
    private javax.swing.JFormattedTextField jFTFDtNasc;
    private javax.swing.JLabel jLContReg;
    private javax.swing.JLabel jLCpf;
    private javax.swing.JLabel jLDtNasc;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLIdade;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLSexo;
    private javax.swing.JLabel jLTitle;
    private javax.swing.JPanel jPDados;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBFeminino;
    private javax.swing.JRadioButton jRBMasculino;
    private javax.swing.JTextField jTFId;
    private javax.swing.JTextField jTFNome;
    // End of variables declaration//GEN-END:variables
}
