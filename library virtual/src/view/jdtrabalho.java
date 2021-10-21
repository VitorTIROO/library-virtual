package View;

import Controle.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;

/**
 *
 * @author Vitor
 */
public class JDTrabalho extends javax.swing.JDialog {

    PreparedStatement ps;
    Connection con = Conexao.conectar();
    ResultSet rs;
    int totalreg;

    public JDTrabalho(java.awt.Frame parent, boolean modal, int perfil) {
        super(parent, modal);
        initComponents();
        totalreg = contReg();
        Metodos.carregaCB(jCBAutor, "select * from autor", "nome");
        Metodos.carregaCB(jCBOrientador, "select * from orientador", "nome");
        jLContReg.setText("(" + 0 + "/" + totalreg + ")");
        if (perfil == 2) {
            jBRemover.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPrincipal = new javax.swing.JPanel();
        jLTitle = new javax.swing.JLabel();
        jBCadastrar = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBRemover = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jBProximo = new javax.swing.JButton();
        jBAnterior = new javax.swing.JButton();
        jBUltimo = new javax.swing.JButton();
        jBPrimeiro = new javax.swing.JButton();
        jLContReg = new javax.swing.JLabel();
        jCBTipo = new javax.swing.JComboBox();
        jTFCurso = new javax.swing.JTextField();
        jTFPalavraChave = new javax.swing.JTextField();
        jLCurso = new javax.swing.JLabel();
        jLTitulo = new javax.swing.JLabel();
        jLDescricao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTADescricao = new javax.swing.JTextArea();
        jLIssn = new javax.swing.JLabel();
        jFTFAno = new javax.swing.JFormattedTextField();
        jLPalavraChave = new javax.swing.JLabel();
        jLTipo = new javax.swing.JLabel();
        jLAno = new javax.swing.JLabel();
        jLResumo = new javax.swing.JLabel();
        jFTFIssn = new javax.swing.JFormattedTextField();
        jCBAutor = new javax.swing.JComboBox();
        jCBOrientador = new javax.swing.JComboBox();
        jTFTitulo = new javax.swing.JTextField();
        jLAutor = new javax.swing.JLabel();
        jLId = new javax.swing.JLabel();
        jLOrientador = new javax.swing.JLabel();
        jTFId = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTAResumo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TRABALHO");
        setResizable(false);

        jPPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLTitle.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLTitle.setForeground(new java.awt.Color(0, 153, 255));
        jLTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitle.setText("TRABALHO");

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

        jCBTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "TRABALHO DE CONCLUSÃO DE CURSO", "TRABALHO DE ESTAGIO" }));

        jTFCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCursoActionPerformed(evt);
            }
        });

        jLCurso.setText("CURSO:");

        jLTitulo.setText("TITULO:");

        jLDescricao.setText("DESCRIÇÃO:");

        jTADescricao.setColumns(20);
        jTADescricao.setLineWrap(true);
        jTADescricao.setRows(5);
        jScrollPane2.setViewportView(jTADescricao);

        jLIssn.setText("ISSN:");

        try {
            jFTFAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLPalavraChave.setText("PALAVRA CHAVE:");

        jLTipo.setText("TIPO:");

        jLAno.setText("ANO:");

        jLResumo.setText("RESUMO:");

        try {
            jFTFIssn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLAutor.setText("AUTOR:");

        jLId.setText("ID:");

        jLOrientador.setText("ORIENTADOR:");

        jTFId.setEnabled(false);

        jTAResumo.setColumns(20);
        jTAResumo.setLineWrap(true);
        jTAResumo.setRows(5);
        jScrollPane3.setViewportView(jTAResumo);

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jBCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBCancelar))
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLPalavraChave, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(jLTipo)
                            .addComponent(jLAno)
                            .addComponent(jLCurso)
                            .addComponent(jLResumo)
                            .addComponent(jLTitulo)
                            .addComponent(jLOrientador)
                            .addComponent(jLAutor)
                            .addComponent(jLId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTFPalavraChave, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBOrientador, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBAutor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTFCurso, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 336, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPPrincipalLayout.createSequentialGroup()
                                .addComponent(jFTFAno, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLIssn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTFIssn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTFId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
                .addComponent(jLTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLId)
                    .addComponent(jTFId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPPrincipalLayout.createSequentialGroup()
                                .addComponent(jCBAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCBOrientador)
                                    .addComponent(jLOrientador)))
                            .addComponent(jLAutor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTitulo)
                            .addComponent(jTFTitulo))
                        .addGap(11, 11, 11)
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFPalavraChave)
                            .addComponent(jLPalavraChave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addComponent(jLDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLTipo))
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAno)
                    .addComponent(jLIssn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jFTFIssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCurso)
                    .addComponent(jTFCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLResumo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAlterar)
                    .addComponent(jBRemover)
                    .addComponent(jBLimpar)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
            if (jCBAutor.getSelectedIndex() <= 0) {

                JOptionPane.showMessageDialog(this, "O CAMPO AUTOR É OBRIGATÓRIO.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jCBOrientador.getSelectedIndex() <= 0) {

                JOptionPane.showMessageDialog(this, "O CAMPO ORIENTADOR É OBRIGATÓRIO.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jTFTitulo.getText().isEmpty() == true) {

                JOptionPane.showMessageDialog(this, "O CAMPO TITULO É OBRIGATÓRIO.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jFTFIssn.getText().matches("[0-9]{4}-[0-9]{4}") == false) {

                JOptionPane.showMessageDialog(this, "O CAMPO ISSN NÃO ESTÁ NO PADRÃO.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (verificaIssn() == true) {
                JOptionPane.showMessageDialog(this, "O ISSN PASSADO JÁ ESTA CADASTRADO EM NOSSO SISTEMA.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jTAResumo.getText().isEmpty() == true) {

                JOptionPane.showMessageDialog(this, "O CAMPO RESUMO É OBRIGATÓRIO", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jTFPalavraChave.getText().matches("[A-Za-z0-9\\s*\\W]{3,}") == false) {

                JOptionPane.showMessageDialog(this, "O CAMPO PALAVARA CHAVE DEVE TER NO MINIMO\nUMA PALAVRA SOBRE O TRABALHO.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jFTFAno.getText().matches("\\d{4}") == false) {

                JOptionPane.showMessageDialog(this, "O CAMPO ANO DEVE TER 4 DIGITOS.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jCBTipo.getSelectedIndex() <= 0) {

                JOptionPane.showMessageDialog(this, "O CAMPO TIPO É OBRIGATÓRIO.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (verificaAno() == false) {

                JOptionPane.showMessageDialog(this, "O CAMPO ANO DEVE ESTAR ENTRE O ANO DE 1910 E O ANO ATUAL.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else {

                String sql = "INSERT INTO trabalho (idautor,idorientador,titulo,issn,resumo,palavrasChaves,"
                        + "ano,curso,descricao,tipo) VALUES(?,?,?,?,?,?,?,?,?,?);";

                ps = con.prepareStatement(sql);

                ps.setInt(1, pegaID("AUTOR", "nome", "idautor"));
                ps.setInt(2, pegaID("ORIENTADOR", "nome", "idorientador"));
                ps.setString(3, jTFTitulo.getText().toUpperCase());
                ps.setString(4, jFTFIssn.getText());
                ps.setString(5, jTAResumo.getText());
                ps.setString(6, jTFPalavraChave.getText().toUpperCase());
                ps.setString(7, jFTFAno.getText());
                ps.setString(8, jTFCurso.getText().toUpperCase());
                ps.setString(9, jTADescricao.getText());
                ps.setInt(10, jCBTipo.getSelectedIndex());

                ps.execute();
                Conexao.desconectar();

                totalreg = contReg();
                jLContReg.setText("(" + 0 + "/" + totalreg + ")");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO CADASTRAR TRABALHO.\n\nERRO: " + ex.getMessage(), "CADASTRAR", JOptionPane.ERROR_MESSAGE);
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

            } else if (jCBAutor.getSelectedIndex() <= 0) {

                JOptionPane.showMessageDialog(this, "O CAMPO AUTOR É OBRIGATÓRIO.", "CADASTRAR", JOptionPane.WARNING_MESSAGE);

            } else if (jCBOrientador.getSelectedIndex() <= 0) {

                JOptionPane.showMessageDialog(this, "O CAMPO ORIENTADOR É OBRIGATÓRIO.", "ALTERAR", JOptionPane.WARNING_MESSAGE);
            } else if (jTFTitulo.getText().isEmpty() == true) {

                JOptionPane.showMessageDialog(this, "O CAMPO TITULO É OBRIGATÓRIO.",
                        "ALTERAR", JOptionPane.WARNING_MESSAGE);

            } else if (jFTFIssn.getText().matches("[0-9]{4}-[0-9]{4}") == false) {

                JOptionPane.showMessageDialog(this, "O CAMPO ISSN NÃO ESTÁ NO PADRÃO.", "ALTERAR", JOptionPane.WARNING_MESSAGE);

            } else if (jTAResumo.getText().isEmpty() == true) {

                JOptionPane.showMessageDialog(this, "O CAMPO RESUMO É OBRIGATÓRIO", "ALTERAR", JOptionPane.WARNING_MESSAGE);

            } else if (jTFPalavraChave.getText().matches("[A-Za-z0-9\\s*\\W]{3,}") == false) {

                JOptionPane.showMessageDialog(this, "O CAMPO PALAVARA CHAVE DEVE TER NO MINIMO"
                        + "\nUMA PALAVRA SOBRE O TRABALHO.", "ALTERAR", JOptionPane.WARNING_MESSAGE);

            } else if (jFTFAno.getText().matches("\\d{4}") == false) {

                JOptionPane.showMessageDialog(this, "O CAMPO ANO DEVE TER 4 DIGITOS.", "ALTERAR", JOptionPane.WARNING_MESSAGE);

            } else if (jCBTipo.getSelectedIndex() <= 0) {

                JOptionPane.showMessageDialog(this, "O CAMPO TIPO É OBRIGATÓRIO.", "ALTERAR", JOptionPane.WARNING_MESSAGE);
            } else if (verificaAno() == false) {

                JOptionPane.showMessageDialog(this, "O CAMPO ANO DEVE ESTAR ENTRE O ANO DE"
                        + " 1910 E O ANO ATUAL.", "ALTERAR", JOptionPane.WARNING_MESSAGE);
            } else {
                String sql = "UPDATE trabalho SET idautor = ?, idorientador = ?, titulo = ?,issn = ?, resumo = ?, "
                        + "palavrasChaves = ?, ano = ?, curso = ?,descricao = ?,tipo = ? WHERE idtrabalho = ?;";

                ps = con.prepareStatement(sql);

                ps.setInt(1, pegaID("AUTOR", "nome", "idautor"));
                ps.setInt(2, pegaID("ORIENTADOR", "nome", "idorientador"));
                ps.setString(3, jTFTitulo.getText().toUpperCase());
                ps.setString(4, jFTFIssn.getText());
                ps.setString(5, jTAResumo.getText());
                ps.setString(6, jTFPalavraChave.getText().toUpperCase());
                ps.setString(7, jFTFAno.getText());
                ps.setString(8, jTFCurso.getText().toUpperCase());
                ps.setString(9, jTADescricao.getText());
                ps.setInt(10, jCBTipo.getSelectedIndex());
                ps.setInt(11, Integer.parseInt(jTFId.getText()));

                ps.execute();
                Conexao.desconectar();

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO ALTERAR TRABALHO.\n\nERRO: " + ex.getMessage(), "ALTERAR", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(this, "ESCOLHA UM TRABALHO PARA REMOVER.", "REMOVER", JOptionPane.WARNING_MESSAGE);
            } else {
                con.setAutoCommit(false);
                String sql = "DELETE FROM trabalho WHERE idtrabalho = ?;";

                ps = con.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(jTFId.getText()));
                ps.execute();

                if (JOptionPane.showConfirmDialog(this, "DESEJA MESMO REMOVER ESTE TRABALHO?",
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
            JOptionPane.showMessageDialog(this, "ERRO AO REMOVER TRABALHO.\n\nERRO: " + ex.getMessage(), "REMOVER", JOptionPane.ERROR_MESSAGE);
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

    private void jBProximoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProximoMouseEntered
        Metodos.MouseEntered(jBProximo);
    }//GEN-LAST:event_jBProximoMouseEntered

    private void jBProximoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProximoMouseExited
        Metodos.MouseExited(jBProximo);
    }//GEN-LAST:event_jBProximoMouseExited

    private void jBProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProximoActionPerformed
        try {

            String sql = "select * from trabalho";

            if (rs.next()) {
                jTFId.setText(rs.getString(1));
                jTFTitulo.setText(rs.getString(4));
                jFTFIssn.setText(rs.getString(5));
                jTAResumo.setText(rs.getString(6));
                jTFPalavraChave.setText(rs.getString(7));
                jFTFAno.setText(String.valueOf(rs.getInt(8)));
                jTFCurso.setText(rs.getString(9));
                jTADescricao.setText(rs.getString(10));
                jCBTipo.setSelectedIndex(rs.getInt(11));
                jCBAutor.setSelectedItem(pegaNome("AUTOR", "idautor", rs.getInt(2)));
                jCBOrientador.setSelectedItem(pegaNome("ORIENTADOR", "idorientador", rs.getInt(3)));
            }
            jLContReg.setText("(" + rs.getRow() + "/" + totalreg + ")");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO PEGAR PROXIMO REGISTRO.\n\nERRO " + ex.getErrorCode() + ": " + ex.getMessage(),
                    "CONTADOR DE REGISTROS", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBProximoActionPerformed

    private void jBAnteriorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAnteriorMouseEntered
        Metodos.MouseEntered(jBAnterior);
    }//GEN-LAST:event_jBAnteriorMouseEntered

    private void jBAnteriorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAnteriorMouseExited
        Metodos.MouseExited(jBAnterior);
    }//GEN-LAST:event_jBAnteriorMouseExited

    private void jBAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnteriorActionPerformed
        try {

            String sql = "select * from trabalho";

            if (rs.previous()) {

                jTFId.setText(rs.getString(1));
                jTFTitulo.setText(rs.getString(4));
                jFTFIssn.setText(rs.getString(5));
                jTAResumo.setText(rs.getString(6));
                jTFPalavraChave.setText(rs.getString(7));
                jFTFAno.setText(String.valueOf(rs.getInt(8)));
                jTFCurso.setText(rs.getString(9));
                jTADescricao.setText(rs.getString(10));
                jCBTipo.setSelectedIndex(rs.getInt(11));
                jCBAutor.setSelectedItem(pegaNome("AUTOR", "idautor", rs.getInt(2)));
                jCBOrientador.setSelectedItem(pegaNome("ORIENTADOR", "idorientador", rs.getInt(3)));
            }
            jLContReg.setText("(" + rs.getRow() + "/" + totalreg + ")");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO PEGAR REGISTRO ANTERIOR.\n\nERRO " + ex.getErrorCode() + ": " + ex.getMessage(),
                    "CONTADOR DE REGISTROS", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBAnteriorActionPerformed

    private void jBUltimoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBUltimoMouseEntered
        Metodos.MouseEntered(jBUltimo);
    }//GEN-LAST:event_jBUltimoMouseEntered

    private void jBUltimoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBUltimoMouseExited
        Metodos.MouseExited(jBUltimo);
    }//GEN-LAST:event_jBUltimoMouseExited

    private void jBUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUltimoActionPerformed
        try {
            String sql = "select * from trabalho";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.last()) {
                jTFId.setText(rs.getString(1));
                jTFTitulo.setText(rs.getString(4));
                jFTFIssn.setText(rs.getString(5));
                jTAResumo.setText(rs.getString(6));
                jTFPalavraChave.setText(rs.getString(7));
                jFTFAno.setText(String.valueOf(rs.getInt(8)));
                jTFCurso.setText(rs.getString(9));
                jTADescricao.setText(rs.getString(10));
                jCBTipo.setSelectedIndex(rs.getInt(11));
                jCBAutor.setSelectedItem(pegaNome("AUTOR", "idautor", rs.getInt(2)));
                jCBOrientador.setSelectedItem(pegaNome("ORIENTADOR", "idorientador", rs.getInt(3)));
            }
            jLContReg.setText("(" + totalreg + "/" + totalreg + ")");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO PEGAR ULTIMO REGISTRO.\n\nERRO " + ex.getErrorCode() + ": " + ex.getMessage(),
                    "CONTADOR DE REGISTROS", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBUltimoActionPerformed

    private void jBPrimeiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPrimeiroMouseEntered
        Metodos.MouseEntered(jBPrimeiro);
    }//GEN-LAST:event_jBPrimeiroMouseEntered

    private void jBPrimeiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPrimeiroMouseExited
        Metodos.MouseExited(jBPrimeiro);
    }//GEN-LAST:event_jBPrimeiroMouseExited

    private void jBPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrimeiroActionPerformed
        try {
            String sql = "select * from trabalho";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.first()) {
                jTFId.setText(rs.getString(1));
                jTFTitulo.setText(rs.getString(4));
                jFTFIssn.setText(rs.getString(5));
                jTAResumo.setText(rs.getString(6));
                jTFPalavraChave.setText(rs.getString(7));
                jFTFAno.setText(String.valueOf(rs.getInt(8)));
                jTFCurso.setText(rs.getString(9));
                jTADescricao.setText(rs.getString(10));
                jCBTipo.setSelectedIndex(rs.getInt(11));
                jCBAutor.setSelectedItem(pegaNome("AUTOR", "idautor", rs.getInt(2)));
                jCBOrientador.setSelectedItem(pegaNome("ORIENTADOR", "idorientador", rs.getInt(3)));
            }
            jLContReg.setText("(" + 1 + "/" + totalreg + ")");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO PEGAR PRIMEIRO REGISTRO.\n\nERRO " + ex.getErrorCode() + ": " + ex.getMessage(),
                    "CONTADOR DE REGISTROS", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBPrimeiroActionPerformed

    private void jTFCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCursoActionPerformed

    void limparCampos() {
        jTFId.setText("");
        jCBAutor.setSelectedIndex(-1);
        jCBOrientador.setSelectedIndex(-1);
        jCBTipo.setSelectedIndex(-1);
        jTFTitulo.setText("");
        jTFCurso.setText("");
        jTFPalavraChave.setText("");
        jFTFAno.setText("");
        jFTFIssn.setText("");
        jTADescricao.setText("");
        jTAResumo.setText("");
        jLContReg.setText("(" + 0 + "/" + totalreg + ")");
    }

    int pegaID(String tabela, String campoNome, String campoId) {
        try {
            ps = con.prepareStatement("select * from " + tabela + " where nome = '" + campoNome + "'");
            rs = ps.executeQuery();
            int id;
            if (rs.next()) {
                id = rs.getInt(campoId);
                return id;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO PEGAR ID DO " + tabela + ".\n\nERRO: " + ex.getMessage(), "PEGA ID", JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar();
            System.out.println("pega id");
        }
        return 0;
    }

    boolean verificaIssn() {

        try {
            ps = con.prepareStatement("select * from orientador where ISSN ='" + jFTFIssn.getText() + "'");
            rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            }
            Conexao.desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO VERIFICAR ISSN.\n\nERRO: " + ex.getMessage(), "VIRIFICAR ISSN", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    boolean verificaAno() {

        int anoPassado = Integer.parseInt(jFTFAno.getText());
        java.util.Date data = new java.util.Date();
        SimpleDateFormat formata = new SimpleDateFormat("dd/MM/yyyy");
        String dtAtual = formata.format(data);

        String x[] = dtAtual.split("/");

        int anoAtual = Integer.parseInt(x[2]);
        if (anoPassado < 1910 || anoPassado > anoAtual) {
            return false;
        } else {
            return true;
        }
    }

    int contReg() {
        try {
            String sql = "select count(idtrabalho) as total from trabalho";

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
            System.out.println("conta reg");
        }
        return 0;
    }

    String pegaNome(String tabela, String id, int dadoID) {

        try {
            String sql = "select * from " + tabela + " where " + id + "= " + dadoID;

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getString("nome");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO AO PEGAR NOME DO " + tabela + ".\n\nERRO: " + ex.getMessage(),
                    "PEGA NOME", JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar();
            System.out.println("pega nome");
        }
        return null;
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
            java.util.logging.Logger.getLogger(JDTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDTrabalho dialog = new JDTrabalho(new javax.swing.JFrame(), true, 3);
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
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBAnterior;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBPrimeiro;
    private javax.swing.JButton jBProximo;
    private javax.swing.JButton jBRemover;
    private javax.swing.JButton jBUltimo;
    private javax.swing.JComboBox jCBAutor;
    private javax.swing.JComboBox jCBOrientador;
    private javax.swing.JComboBox jCBTipo;
    private javax.swing.JFormattedTextField jFTFAno;
    private javax.swing.JFormattedTextField jFTFIssn;
    private javax.swing.JLabel jLAno;
    private javax.swing.JLabel jLAutor;
    private javax.swing.JLabel jLContReg;
    private javax.swing.JLabel jLCurso;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLIssn;
    private javax.swing.JLabel jLOrientador;
    private javax.swing.JLabel jLPalavraChave;
    private javax.swing.JLabel jLResumo;
    private javax.swing.JLabel jLTipo;
    private javax.swing.JLabel jLTitle;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTADescricao;
    private javax.swing.JTextArea jTAResumo;
    private javax.swing.JTextField jTFCurso;
    private javax.swing.JTextField jTFId;
    private javax.swing.JTextField jTFPalavraChave;
    private javax.swing.JTextField jTFTitulo;
    // End of variables declaration//GEN-END:variables
}
