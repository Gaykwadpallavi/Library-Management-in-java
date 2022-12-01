package Libb;

//import Library.homefinal;
import java.sql.*;
import javax .swing.JOptionPane;
import java.awt.event.KeyEvent;

public class ALogin extends javax.swing.JFrame {
   Connection con;
    PreparedStatement ps;
     public ALogin() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jDialog1 = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("user name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(670, 310, 160, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(660, 400, 160, 50);

        txtusername.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        txtusername.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtusertxtusernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtusername);
        txtusername.setBounds(880, 320, 250, 40);

        loginButton.setBackground(new java.awt.Color(153, 153, 153));
        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        loginButton.setContentAreaFilled(false);
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setName(""); // NOI18N
        loginButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton);
        loginButton.setBounds(840, 560, 125, 60);

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 60)); // NOI18N
        jLabel3.setForeground(java.awt.SystemColor.info);
        jLabel3.setText(" Books are just the Beginning ... ");
        jLabel3.addComponentListener(new java.awt.event.ComponentAdapter()
        {
            public void componentShown(java.awt.event.ComponentEvent evt)
            {
                jLabel3ComponentShown(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(490, 140, 910, 90);

        txtpass.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        txtpass.setOpaque(true);
        getContentPane().add(txtpass);
        txtpass.setBounds(880, 410, 250, 40);

        jLabel5.setForeground(java.awt.SystemColor.control);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Libb/3133177 (1).jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setMaximumSize(new java.awt.Dimension(1600, 900));
        jLabel5.setMinimumSize(new java.awt.Dimension(1600, 900));
        jLabel5.setPreferredSize(new java.awt.Dimension(1600, 900));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -100, 1600, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusertxtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusertxtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusertxtusernameActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
       String userName=txtusername.getText();
       String pass=txtpass.getText();
    if(userName.equals("InfoServer")&&pass.equals("Info@123"))
    {
        MainPage mp=new MainPage();
        this.hide();
        mp.setVisible(true);
    }
    else
    {
        JOptionPane.showMessageDialog(this,"Username or password not matched");
        txtusername.setText("");
        txtpass.setText("");
        txtusername.requestFocus();
    }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void jLabel3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel3ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3ComponentShown

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ALogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton loginButton;
    private java.awt.Panel panel1;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
