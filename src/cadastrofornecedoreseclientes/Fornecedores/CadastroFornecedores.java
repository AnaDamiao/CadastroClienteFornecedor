package cadastrofornecedoreseclientes.Fornecedores;

import cadastrofornecedoreseclientes.entidades.Fornecedor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ana Clara Damião
 */
public class CadastroFornecedores extends javax.swing.JFrame {
    private ArrayList<Fornecedor> listaFornecedores;
    private DefaultTableModel tableModel;

    public CadastroFornecedores() {
        listaFornecedores = new ArrayList<>();
        initComponents();
        tableModel = new DefaultTableModel();
        tabelaFornecedores.setModel(tableModel);
        tableModel.setColumnIdentifiers(new String[]{"Nome", "CNPJ", "Email", "Telefone", "Inscrição Estadual", "Inscrição Municpal"});
    }
    
    public void atualizarTabelaFornecedores() {
        tableModel.setRowCount(0);
        for (Fornecedor fornecedor : listaFornecedores) {
            tableModel.addRow(new Object[]{fornecedor.getNome(), fornecedor.getCnpj(), fornecedor.getEmail(), fornecedor.getTelefone(), fornecedor.getInscricaoEstadual(), fornecedor.getInscricaoMunicipal()});
        }
    }
    
    public void atualizarFornecedor(int indice, String nome, String cnpj, String email, String telefone, String inscricaoEstadual, String inscricaoMunicipal) {
        if (indice >= 0 && indice < listaFornecedores.size()) {
            Fornecedor fornecedor = listaFornecedores.get(indice);
            fornecedor.setNome(nome);
            fornecedor.setCnpj(cnpj);
            fornecedor.setEmail(email);
            fornecedor.setTelefone(telefone);
            fornecedor.setInscricaoEstadual(inscricaoEstadual);
            fornecedor.setInscricaoMunicipal(inscricaoMunicipal);
            atualizarTabelaFornecedores(); 
        }
    }
    
    public ArrayList<Fornecedor> getListaFornecedores() {
    return listaFornecedores;
}
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFornecedores = new javax.swing.JTable();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSair.setText("Voltar");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        tabelaFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelaFornecedores);

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIncluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair)))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed
    
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int fornecedorSelecionado = tabelaFornecedores.getSelectedRow();
        if (fornecedorSelecionado != -1) {
            tableModel.removeRow(fornecedorSelecionado);
            listaFornecedores.remove(fornecedorSelecionado);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um fornecedor para excluir.");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        int fornecedorSelecionado = tabelaFornecedores.getSelectedRow();
        if (fornecedorSelecionado != -1) {
            String nome = (String) tableModel.getValueAt(fornecedorSelecionado, 0);
            String cnpj = (String) tableModel.getValueAt(fornecedorSelecionado, 1);
            String email = (String) tableModel.getValueAt(fornecedorSelecionado, 2);
            String telefone = (String) tableModel.getValueAt(fornecedorSelecionado, 3);
            String InscricaoEstadual = (String) tableModel.getValueAt(fornecedorSelecionado, 4);
            String InscricaoMunicipal = (String) tableModel.getValueAt(fornecedorSelecionado, 5);

            DadosFornecedor dadosFornecedores = new DadosFornecedor(nome, cnpj, email, telefone, InscricaoEstadual, InscricaoMunicipal);
            dadosFornecedores.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um fornecedor para consultar.");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        IncluirFornecedor incluirFornecedor = new IncluirFornecedor();
        incluirFornecedor.setListaFornecedores(listaFornecedores, this); 
        incluirFornecedor.setVisible(true);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int fornecedorSelecionado = tabelaFornecedores.getSelectedRow();
        if (fornecedorSelecionado != -1) {
            String nome = (String) tableModel.getValueAt(fornecedorSelecionado, 0);
            String cnpj = (String) tableModel.getValueAt(fornecedorSelecionado, 1);
            String email = (String) tableModel.getValueAt(fornecedorSelecionado, 2);
            String telefone = (String) tableModel.getValueAt(fornecedorSelecionado, 3);
            String inscricaoEstadual = (String) tableModel.getValueAt(fornecedorSelecionado, 4);
            String inscricaoMunicipal = (String) tableModel.getValueAt(fornecedorSelecionado, 5);

            AlterarFornecedor alterarFornecedor = new AlterarFornecedor(fornecedorSelecionado, nome, cnpj, email, telefone, inscricaoEstadual, inscricaoMunicipal, this);
            alterarFornecedor.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um fornecedor para alterar.");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed


    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CadastroFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFornecedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelaFornecedores;
    // End of variables declaration//GEN-END:variables
}
