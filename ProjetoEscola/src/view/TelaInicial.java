package view;

import bll.AlunosBll;
import bll.ContatoBll;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Alunos;
import model.Contato;

/**
 *
 * @author edivan
 */
public class TelaInicial extends javax.swing.JFrame {

    // Na tela precisar importa as duas classe de Alunos*[Dao, Bll];
    Alunos alunoModel = new Alunos();
    AlunosBll alunoBll = new AlunosBll();

    //AlunosDao alunodao = new AlunosDao();
    Contato contato = new Contato();
    ContatoBll contatoBll = new ContatoBll();

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAlunos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bem vindo");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Alunos"));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setFocusable(false);

        jLabel1.setText("Escreve seu nome: ");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        tableAlunos.setAutoCreateRowSorter(true);
        tableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAlunos);
        if (tableAlunos.getColumnModel().getColumnCount() > 0) {
            tableAlunos.getColumnModel().getColumn(0).setMinWidth(50);
            tableAlunos.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableAlunos.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel2.setText("ID");

        txtId.setEditable(false);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnConsultar)
                    .addComponent(btnExcluir)
                    .addComponent(btnNovo))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(453, 427));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // metodo que limpar os campos →→→↓↓↓↓
    private void limparCampos() {
        txtId.setText("");
        txtNome.setText("");

    }

    // 2° etapa 2.0
    // consultar Alunos
    private void consultarAlunos(List<Alunos> lista) throws Exception {
        // pega os dados da tableAlunos e colocar em modelo;
        DefaultTableModel modelo = (DefaultTableModel) tableAlunos.getModel();
        modelo.setNumRows(0);

        for (int pos = 0; pos < lista.size(); pos++) {
            String[] linha = new String[2];
            Alunos aux = lista.get(pos);
            linha[0] = aux.getId() + "";
            linha[1] = aux.getNome() + "";
            modelo.addRow(linha);

        }
    }

    // 2° Etapa 2.1 receber da AlunosBll;
    private void preencheCampos(int id) throws Exception {

        try {
            if (id > 0) {
                alunoModel = alunoBll.consultarAlunosPorId(id);
                txtId.setText(id + "");

                txtNome.setText(alunoModel.getNome());
                btnSalvar.setLabel("Editar");
            } else {
                btnSalvar.setLabel("Salvar");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        try {
            contato.setAluno(alunoModel);
            alunoModel.setNome(txtNome.getText());
            // contato nao esta funcionando;

//            contato.setTelefone(txtTelefone.getText());
//            Alunos aluno = alunodao.getAlunosById(Integer.parseInt(txtId.getText()));
//            contato.setAluno(aluno);
            if (btnSalvar.getLabel().equals("Salvar")) {
                alunoBll.adicionarAlunos(alunoModel);
                contatoBll.adicionaContato(contato);
                JOptionPane.showMessageDialog(null, "Nome e contato inserido com sucesso.");

                System.out.println("contato salvo");

            } else {
                // alterarAluno
                alunoBll.alterarAlunos(alunoModel);
                JOptionPane.showMessageDialog(null, "Dados do Aluno alterados com sucesso #####.");
            }
//            JOptionPane.showMessageDialog(null, "Aluno NÃO inserido!!");
            consultarAlunos(alunoBll.consultarAlunos());

            limparCampos();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    // 2 etapa 2.3
    private void tableAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAlunosMouseClicked
        int linha = tableAlunos.getSelectedRow();
        Integer codigo = Integer.parseInt(tableAlunos.getValueAt(linha, 0).toString());

        try {
            preencheCampos((int) codigo);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher campo");
        }
    }//GEN-LAST:event_tableAlunosMouseClicked

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            consultarAlunos(alunoBll.consultarAlunos());
        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Etapa btnExcluir ex. -4 → AlunosBll
        try {
            alunoBll.removerAlunos(alunoBll.consultarAlunosPorId(alunoModel.getId()));
            limparCampos();
            JOptionPane.showMessageDialog(null, "Aluno(a) excluido com Sucesso.");
            // faz novamente a busca no banco de dados;
            consultarAlunos(alunoBll.consultarAlunos());
        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limparCampos();
        txtNome.requestFocus();
        btnSalvar.setLabel("Salvar");
    }//GEN-LAST:event_btnNovoActionPerformed

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
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAlunos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
