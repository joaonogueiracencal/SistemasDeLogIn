public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ctxLogin = new javax.swing.JTextField();
        botaoIniciarSessao = new javax.swing.JButton();
        ctxPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        botaoRegistar = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Login");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("PASSWORD");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("LOGIN");

        ctxLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ctxLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxLoginActionPerformed(evt);
            }
        });

        botaoIniciarSessao.setBackground(new java.awt.Color(59, 169, 232));
        botaoIniciarSessao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoIniciarSessao.setForeground(new java.awt.Color(255, 255, 255));
        botaoIniciarSessao.setText("Iniciar Sessão");
        botaoIniciarSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIniciarSessaoActionPerformed(evt);
            }
        });

        ctxPassword.setText("jPasswordField2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginLogo.png"))); // NOI18N

        botaoRegistar.setBackground(new java.awt.Color(255, 204, 102));
        botaoRegistar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoRegistar.setText("Registar");
        botaoRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRegistarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(226, 226, 226))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoRegistar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoIniciarSessao))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ctxLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ctxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ctxLogin)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ctxPassword)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoIniciarSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctxLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctxLoginActionPerformed

    private void botaoRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistarActionPerformed
       
        
        FormRegisto fr = new FormRegisto();
        this.setVisible(false);
        fr.setVisible(true);
    }//GEN-LAST:event_botaoRegistarActionPerformed

    private void botaoIniciarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIniciarSessaoActionPerformed
        // Validação atraves da recolha e comparação de password e login
        // 1º - verificar se existe ficheiro "login.txt"
        // 2º - verificar se a passwrod corresponde à pass que está no ficheiro, se sim, segue para a JFrame Form MenuOpcoes
        
        // se login e password correstos fazer isto que se segue
        MenuOpcoes mo = new MenuOpcoes();
        this.setVisible(false);
        mo.setVisible(true);
        
        // senão, lança um alert de dados de login incorretos
    }//GEN-LAST:event_botaoIniciarSessaoActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoIniciarSessao;
    private javax.swing.JButton botaoRegistar;
    private javax.swing.JTextField ctxLogin;
    private javax.swing.JPasswordField ctxPassword;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
