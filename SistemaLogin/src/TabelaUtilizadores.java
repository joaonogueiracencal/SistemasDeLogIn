import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jnogueira
 */
public class TabelaUtilizadores extends javax.swing.JFrame {

    public TabelaUtilizadores() throws SQLException {
        initComponents();
        //int contador = 0;
        ajustaTamanho();
        preencheTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        botaoVoltar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        editarDados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID User", "Nome", "Email", "Morada", "Telefone", "NIF", "Login", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        botaoVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoVoltar.setText("Voltar atrás");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Utilizadores Registados");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Eliminar User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        editarDados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editarDados.setText("Editar Dados");
        editarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(editarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editarDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        MenuOpcoes menuOp = new MenuOpcoes();
        this.dispose(); // fecha a janela atual
        menuOp.setVisible(true);
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel)tabela.getModel();
        if (tabela.getSelectedRow() >= 0){
            int i =JOptionPane.showConfirmDialog(null,"Pretende Remover", "Tem a Certeza?", JOptionPane.YES_NO_OPTION);
            if(i==JOptionPane.YES_OPTION){
            	int p = (int)tabela.getValueAt(tabela.getSelectedRow(),0);
                try {
                    LigaBD.remove(p);
                    TabelaUtilizadores tb = new TabelaUtilizadores();
                    this.dispose();
                    tb.setVisible(true); 

                } catch (SQLException ex) {
                    Logger.getLogger(TabelaUtilizadores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }    
        }else{
            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarDadosActionPerformed
        DefaultTableModel dtm = (DefaultTableModel)tabela.getModel();
        if (tabela.getSelectedRow() >= 0){
            int i =JOptionPane.showConfirmDialog(null,"Atualizar dados", "Pretende atualizar?", JOptionPane.YES_NO_OPTION);
            if(i==JOptionPane.YES_OPTION){
            	int p = (int)tabela.getValueAt(tabela.getSelectedRow(),0);
                int index = tabela.getSelectedRow();
                try {
                    System.out.println(index);
                    System.out.println(p);
                    String nome1 = (String) tabela.getModel().getValueAt(index, 1);
                    String email2 = (String) tabela.getModel().getValueAt(index, 2);
                    String morada3 = (String) tabela.getModel().getValueAt(index, 3);
                    int telefone4 = (int) tabela.getModel().getValueAt(index, 4);
                    int nif5 = (int) tabela.getModel().getValueAt(index, 5);
                    String login6 = (String) tabela.getModel().getValueAt(index, 6);
                    String password7 = (String) tabela.getModel().getValueAt(index, 7);
                    LigaBD.editar(p,nome1,email2,morada3,telefone4,nif5,login6,password7);
                    System.out.println(password7);
                    TabelaUtilizadores tb = new TabelaUtilizadores();
                    this.dispose();
                    tb.setVisible(true); 

                } catch (SQLException ex) {
                    Logger.getLogger(TabelaUtilizadores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }    
        }else{
            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
        }
    }//GEN-LAST:event_editarDadosActionPerformed

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
            java.util.logging.Logger.getLogger(TabelaUtilizadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaUtilizadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaUtilizadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaUtilizadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TabelaUtilizadores().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TabelaUtilizadores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JButton editarDados;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    public void preencheTabela() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        Connection liga = LigaBD.ligacao();
        String sql = "SELECT * FROM utilizador";
        PreparedStatement ps;
        ps = liga.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        rs.first();
        int rowCount = modelo.getRowCount();
        
        for (int i = rowCount - 1;i >= 0; i--)
            modelo.removeRow(i);
        do
            modelo.addRow(new Object[]{
                rs.getInt("idUtilizador"),
                rs.getString("nome"),
                rs.getString("email"),
                rs.getString("morada"),
                rs.getInt("telefone"),
                rs.getInt("nif"),
                rs.getString("login"),
                rs.getString("password")});
        while(rs.next());
    }

    private void ajustaTamanho() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension tamTela = kit.getScreenSize();
        int larg = tamTela.width;
        int alt = tamTela.height;
        larg *= 0.7;
        alt *= 0.7;
        tamTela.setSize(larg, alt);
    }
}
