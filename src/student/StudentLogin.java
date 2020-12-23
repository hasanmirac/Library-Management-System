package student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import main.DbHelper;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import main.Login;


/**
 *
 * @author hasan
 */
public class StudentLogin extends javax.swing.JFrame {

    Connection connection;
    ResultSet resultSet;
    PreparedStatement preparedStatement;
    
    public StudentLogin() {
        super("Login");
        initComponents();
        connection=DbHelper.ConnectDb();
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
        txtTrouble = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        btnSignup = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        btnForgot = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3), " Student Login ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(0, 102, 255))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(340, 250));

        txtTrouble.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTrouble.setForeground(new java.awt.Color(204, 0, 0));
        txtTrouble.setText("Trouble Login :");

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\hasan\\OneDrive\\Belgeler\\NetBeansProjects\\VirtualLibrarySystem\\src\\icons\\iconfinder_Enter_728934.png")); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPassword.setText("Password :");

        btnSignup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSignup.setIcon(new javax.swing.ImageIcon("C:\\Users\\hasan\\OneDrive\\Belgeler\\NetBeansProjects\\VirtualLibrarySystem\\src\\icons\\add-user.png")); // NOI18N
        btnSignup.setText("Signup");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        btnForgot.setIcon(new javax.swing.ImageIcon("C:\\Users\\hasan\\OneDrive\\Belgeler\\NetBeansProjects\\VirtualLibrarySystem\\src\\icons\\forgotpassword.png")); // NOI18N
        btnForgot.setText("Forgot Password");
        btnForgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUsername.setText("Username :");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hasan\\OneDrive\\Belgeler\\NetBeansProjects\\VirtualLibrarySystem\\src\\icons\\Security-Password-icon.png")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\hasan\\OneDrive\\Belgeler\\NetBeansProjects\\VirtualLibrarySystem\\src\\icons\\Users-Name-icon.png")); // NOI18N

        btnBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\hasan\\OneDrive\\Belgeler\\NetBeansProjects\\VirtualLibrarySystem\\src\\icons\\back.png")); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLogin)
                        .addGap(18, 18, 18)
                        .addComponent(btnSignup)
                        .addGap(87, 87, 87))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTrouble)
                        .addGap(42, 42, 42)
                        .addComponent(btnForgot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUsername)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPassword))
                    .addComponent(jLabel1))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTrouble)
                    .addComponent(btnForgot, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(461, 324));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        setVisible(false);
        Signup signup = new Signup();
        signup.setVisible(true);
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotActionPerformed
        setVisible(false);
        Forgot forgot = new Forgot();
        forgot.setVisible(true);
    }//GEN-LAST:event_btnForgotActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String sql = "select * from account where username=? and password=?";
        try{
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1, txtUsername.getText());
            preparedStatement.setString(2, txtPassword.getText());
            resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
                resultSet.close();
                preparedStatement.close();
                
                setVisible(false);
                Loading loading = new Loading();
                loading.setUpLoading();
                loading.setVisible(true);
            } else{
                JOptionPane.showMessageDialog(null, "Incorrect Username and Password");
            }   
        } catch(Exception exception){
            JOptionPane.showMessageDialog(null, exception);
        } finally {
            try{
            resultSet.close();
            preparedStatement.close();
        } catch (Exception exception){    
            
        }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        setVisible(false);
        Login login  = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;*/
                UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            
                
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnForgot;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JLabel txtTrouble;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
