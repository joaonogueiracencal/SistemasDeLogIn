
import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jnogueira
 */
public class FormRegisto extends javax.swing.JFrame {

    /**
     * Creates new form FormRegisto
     */
    public FormRegisto() {
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

        botaoSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ctxPassword = new javax.swing.JPasswordField();
        ctxRePassword = new javax.swing.JPasswordField();
        ctxNif = new javax.swing.JTextField();
        ctxMorada = new javax.swing.JTextField();
        ctxEmail = new javax.swing.JTextField();
        ctxNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btxValidarDados = new javax.swing.JButton();
        ctxTelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulário de Registo de Utilizadores");

        botaoSair.setBackground(new java.awt.Color(255, 51, 51));
        botaoSair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoSair.setForeground(new java.awt.Color(255, 255, 255));
        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Morada");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("NIF");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Repita Password");

        ctxPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ctxPassword.setText("jPasswordField1");

        ctxRePassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ctxRePassword.setText("jPasswordField1");

        ctxNif.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ctxMorada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ctxEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ctxNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel7.setText("Registo de Utilizador");

        btxValidarDados.setBackground(new java.awt.Color(102, 255, 102));
        btxValidarDados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btxValidarDados.setText("Validar Dados");
        btxValidarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxValidarDadosActionPerformed(evt);
            }
        });

        ctxTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Telefone");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ctxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ctxNif, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(botaoSair))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ctxPassword)
                                    .addComponent(ctxRePassword)
                                    .addComponent(btxValidarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(100, 100, 100)
                                .addComponent(ctxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ctxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(87, 87, 87)
                                    .addComponent(ctxMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ctxNome, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ctxEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ctxMorada, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ctxTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ctxNif, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ctxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ctxRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btxValidarDados))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        Login log = new Login();
        this.dispose(); // fecha a janela atual
        log.setVisible(true);
    }//GEN-LAST:event_botaoSairActionPerformed

    private void mensagemErro(String erro){
        JOptionPane.showMessageDialog(null, erro, "Erro validação", JOptionPane.ERROR_MESSAGE);
    }
    
    
    private void btxValidarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxValidarDadosActionPerformed
        String nome = ctxNome.getText();
        String email = ctxEmail.getText();
        String morada = ctxMorada.getText();
        String telefone = ctxTelefone.getText();
        String nif = ctxNif.getText();
        String pass = ctxPassword.getText();
        String repass = ctxRePassword.getText();
        // DONE - nome >= 2 caracteres
        // DONE - email tem de ter 1 @ e 1 . após o @
        // DONE - morada tem de ter >5 caracteres
        // DONE - telefone 9 caracteres que sejam dígitos
        // DONE - NIF 9 caracteres que sejam dígitos
        // DONE - pass e rePass têm de ser iguais
        // DONE - pass 8 ou + caracteres, 1 ou + minúsculas, 1 ou + algarismos,
        // DONE - 1 ou + maiúsculas, 1 ou + caracteres especiais
        if (nome.equals("")||email.equals("")||morada.equals("")|| 
                telefone.equals("")||nif.equals("")||
                pass.equals("")||repass.equals("")){
            mensagemErro("Preencha todos os campos!");
        }else{
            if(!validaCampoNumerico(telefone)){
                mensagemErro("O telefone Deverá ter 9 digitos.");
            }else{
                if(!validaCampoNumerico(nif)){
                    mensagemErro("O NIF Deverá ter 9 digitos.");
                }else{
                    if(nome.length()<2)
                        mensagemErro("Campo Nome deverá ter mais de dois caracteres.");
                    else
                        if(!validaCaracteres(nome)){
                            mensagemErro("Campo Nome tem caracteres inválidos.");
                    }else{
                        if (morada.length()<6){
                            mensagemErro("Morada deverá ter mais de 5 caracteres.");
                        }else{
                            if (!verificaPass(pass)){
                                mensagemErro("Password não é segura o suficiente.");    
                            }else{
                                if (pass.compareTo(repass)!=0){
                                    mensagemErro("Password não é igual.");
                                }else{
                                    if(!validaEmail(email)){
                                        mensagemErro("Email não é valido.");                                    
                                    }else{
                                    }
                                }
                        }   
                    }
                }   
            }
        }
    }

        
        
        
        
        
    }//GEN-LAST:event_btxValidarDadosActionPerformed

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
            java.util.logging.Logger.getLogger(FormRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegisto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton btxValidarDados;
    private javax.swing.JTextField ctxEmail;
    private javax.swing.JTextField ctxMorada;
    private javax.swing.JTextField ctxNif;
    private javax.swing.JTextField ctxNome;
    private javax.swing.JPasswordField ctxPassword;
    private javax.swing.JPasswordField ctxRePassword;
    private javax.swing.JTextField ctxTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

    private boolean validaCampoNumerico(String valor) {
        int x, contador=0,t = valor.length();
        char c;
        if (t!=9)
            return false;
        else{
            for(x=0;x<t;x++){
                c = valor.charAt(x);
                if(isDigit(c))
                    contador++;
            }    
            if(t!=contador)
                return false;
            }
        return true;
    }

    private boolean validaCaracteres(String palavra) {
        int x, t = palavra.length();
        char c;
        for(x=0;x<t;x++){
            c = palavra.charAt(x);
            if(!isLetter(c)&&(c != ' ')){
                return false;  
            }
        }
        return true;
    }
        

    private boolean validaEmail(String email) {
        int i, ii;
        i = email.indexOf(' ');
        if (i != -1){
            return false;
        }
        i = email.indexOf('@');
        if (i == -1){
            return false;
        }else{
            ii = email.indexOf('@',(i+1));
            if (ii != -1){
                return false;
            }
        }
        i = email.indexOf('.',i);
        if(i == -1){
            return false;
        }
        return true;
    }

    @SuppressWarnings("empty-statement")
    private boolean verificaPass(String pass) {
        int i, x = 0, contMin = 0, contAlg = 0, contMaiusc = 0, contEsp = 0;
        char c;
        i = pass.indexOf(' ');
        if (i != -1){
            return false;
        }
        i = pass.length();
        if (i <8){
            return false;
        }
        for(x=0;x<i;x++){
            c = pass.charAt(x);
            if (isLowerCase(c)){
                contMin++;
            }else{
                if (isUpperCase(c)){
                    contMaiusc++;
                }else{
                    if (isDigit(c)){
                        contAlg++;
                    }else{
                        contEsp++;
                    }
                }        
            }
        }
        System.out.println("minusculas "+contMin);
        System.out.println("maiusculas "+contMaiusc);
        System.out.println("digitos "+contAlg);
        System.out.println("especial "+contEsp);
        if ((contMin<1)||(contMaiusc<1)||(contAlg<1)||(contEsp<1)){
            return false;
        }
        return true;
    }
    
}
