/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Libb;
import static Libb.searchStudent1.getConnection;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class IssueBook extends javax.swing.JFrame {

    Connection con;
    PreparedStatement par;
    ResultSet rs;
    public IssueBook() {
        initComponents();
        Connect();
    }

public void Connect()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pallavi","root","Dreams");   
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }


private void showData(JTextField SRollNo, JTextField BName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

public class BookItem
        {
          int SRNo;
          String Name;
          public BookItem(int SRNo, String Name){
              this.SRNo =SRNo;
              this.Name=Name;
              
          }
          public String toString()
          {
              return Name;
          }
        }

/// Insert data into table code here  

public void IssueBook(){
int c;
        try {
            par=con.prepareStatement("select * from BookList");
            rs=par.executeQuery();
            
            ResultSetMetaData rad =rs.getMetaData();
            c=rad.getColumnCount();
            
//            DefaultTableModel d= (DefaultTableModel)jTable1.getModel();
//          d.setRowCount(0);
          while(rs.next()){
            Vector v =new Vector();
            for(int i=1;i<=c;i++){
                v.add(rs.getString("Bid"));
                v.add(rs.getString("Bname"));
                v.add(rs.getString("Aname"));
                v.add(rs.getString("Bcourse"));
                v.add(rs.getString("BSNo"));
                v.add(rs.getString("Department"));
                v.add(rs.getString("NofPages"));
            }
           // d.addRow(v);
        }
            
          
        } catch (SQLException ex) {
           ex.printStackTrace();
           
        }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SName = new javax.swing.JTextField();
        BAuthor = new javax.swing.JTextField();
        RDate = new com.toedter.calendar.JDateChooser();
        txtRollNo = new javax.swing.JLabel();
        txtClass = new javax.swing.JLabel();
        txtMob = new javax.swing.JLabel();
        BDetailSub = new javax.swing.JButton();
        SRollNo = new javax.swing.JTextField();
        BName = new javax.swing.JTextField();
        iDate = new com.toedter.calendar.JDateChooser();
        SerialNo = new javax.swing.JTextField();
        txtName = new javax.swing.JLabel();
        txtCourse = new javax.swing.JLabel();
        txtBranch = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 51, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Issue Book");
        jLabel1.setOpaque(true);
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 232, 63));
        jPanel3.add(SName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 230, 200, 40));
        jPanel3.add(BAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 310, 200, 40));
        jPanel3.add(RDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 390, 200, 40));

        txtRollNo.setBackground(new java.awt.Color(0, 51, 102));
        txtRollNo.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        txtRollNo.setForeground(new java.awt.Color(255, 255, 255));
        txtRollNo.setText("Student Name");
        txtRollNo.setOpaque(true);
        jPanel3.add(txtRollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 230, 180, 40));

        txtClass.setBackground(new java.awt.Color(0, 51, 102));
        txtClass.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        txtClass.setForeground(new java.awt.Color(255, 255, 255));
        txtClass.setText("  Book  Author");
        txtClass.setOpaque(true);
        jPanel3.add(txtClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 310, 180, 40));

        txtMob.setBackground(new java.awt.Color(0, 51, 102));
        txtMob.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        txtMob.setForeground(new java.awt.Color(255, 255, 255));
        txtMob.setText("   Return Date");
        txtMob.setOpaque(true);
        jPanel3.add(txtMob, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, 180, 40));

        BDetailSub.setBackground(new java.awt.Color(0, 51, 102));
        BDetailSub.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        BDetailSub.setForeground(new java.awt.Color(255, 255, 255));
        BDetailSub.setText("Submit");
        BDetailSub.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BDetailSubActionPerformed(evt);
            }
        });
        jPanel3.add(BDetailSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 580, 130, 50));

        SRollNo.setOpaque(true);
        SRollNo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SRollNoActionPerformed(evt);
            }
        });
        SRollNo.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                SRollNoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                SRollNoKeyTyped(evt);
            }
        });
        jPanel3.add(SRollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 217, 38));

        BName.setOpaque(true);
        BName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BNameActionPerformed(evt);
            }
        });
        BName.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                BNameKeyPressed(evt);
            }
        });
        jPanel3.add(BName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 217, 40));
        jPanel3.add(iDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 210, 40));
        jPanel3.add(SerialNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, 210, 36));

        txtName.setBackground(new java.awt.Color(0, 51, 102));
        txtName.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setText(" Roll No");
        txtName.setOpaque(true);
        jPanel3.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 130, 40));

        txtCourse.setBackground(new java.awt.Color(0, 51, 102));
        txtCourse.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        txtCourse.setForeground(new java.awt.Color(255, 255, 255));
        txtCourse.setText("Book Name");
        txtCourse.setOpaque(true);
        jPanel3.add(txtCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, 40));

        txtBranch.setBackground(new java.awt.Color(0, 51, 102));
        txtBranch.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        txtBranch.setForeground(new java.awt.Color(255, 255, 255));
        txtBranch.setText("Issue Date ");
        txtBranch.setOpaque(true);
        jPanel3.add(txtBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 130, 50));

        jLabel3.setBackground(new java.awt.Color(0, 51, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  Serial No");
        jLabel3.setOpaque(true);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 130, 40));

        BBack.setBackground(new java.awt.Color(0, 51, 102));
        BBack.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        BBack.setForeground(new java.awt.Color(255, 255, 255));
        BBack.setText("Back");
        BBack.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BBackActionPerformed(evt);
            }
        });
        jPanel3.add(BBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 119, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Libb/background.jpg"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 732));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 295, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void showData(String d1,String d2){
    Connection con = getConnection();
    Statement st ;
    ResultSet rs;
    try{
        st = (PreparedStatement) con.createStatement();
      String sql ="select BName from issuebook where SRollNo = d1";
      ResultSet Rs;
        Rs = st.executeQuery(sql);
      String Bookname=Rs.getString("Bname");
             if(d2.equalsIgnoreCase(Bookname))
             {
              JOptionPane.showMessageDialog(null,"This Book is Already Issued To You");
             }
                 }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
    }
    
    private void BDetailSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDetailSubActionPerformed
        SimpleDateFormat sdf= new SimpleDateFormat("YYYY-MM-dd");
        String rno=SRollNo.getText();
        String name= SName.getText();
        String Bname =BName.getText();
        String BAut=BAuthor.getText();
        String date= sdf.format(iDate.getDate());
        
        String rdate= sdf.format(RDate.getDate());
        String sn = SerialNo.getText();
        
        
        try {
            par =con.prepareStatement("Insert into issuebooks(SRollNo , Sname,Bname ,Aname,IDate, RDate,SRno)values(?,?,?,?,?,?,?)");
            par.setString(1,rno);
            par.setString(2,name);
        par.setString(3,Bname);
        par.setString(4,BAut);
        par.setString(5,date);
        par.setString(6,rdate);
        par.setString(7,sn);
        int s1=par.executeUpdate();
        
        if(s1==1)
        {
            JOptionPane.showMessageDialog(this ," Book issue successfully");
            
            SName.setText("");
            BName.setText("");
            BAuthor.setText("");
            Date d =null;
            iDate.setDate(d);
            Date rd = null;
            RDate.setDate(rd);
            SerialNo.setText("");
            SName .requestFocus();
        }
        else
        {
              JOptionPane.showMessageDialog(this ,"Error");
        }
         
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this ,ex);
         
               }
        
    }//GEN-LAST:event_BDetailSubActionPerformed

    private void BBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBackActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_BBackActionPerformed

    private void SRollNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SRollNoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            String BN =SRollNo.getText();
            try {
                par=con.prepareStatement("select * from newStudent where SRollNo = ?");
                par.setString(1, BN);
                rs =par.executeQuery();
                if(rs.next()==false){
                    BAuthor.setText("");
                    SerialNo.setText("");
                    
                    JOptionPane.showMessageDialog(this,"This Roll is not found");
                }
                else
                {
                    String AuthorName=rs.getString("SName");
                    
                   SName.setText( AuthorName);
                // String Serial =rs.getString("BSerNo");
               //    SerialNo.setText(Serial);
                   BName.requestFocus();
                }
            } catch (SQLException ex) {
               ex.printStackTrace();
            }
            
            
        }
    }//GEN-LAST:event_SRollNoKeyPressed

    private void BNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BNameActionPerformed

    private void BNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BNameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            String BN =BName.getText();
            try {
                par=con.prepareStatement("select * from BookList where Bname = ?");
                par.setString(1, BN);
                rs =par.executeQuery();
                if(rs.next()==false){
                    BAuthor.setText("");
                    SerialNo.setText("");
                    
                    JOptionPane.showMessageDialog(this,"This Book not found");
                }
                else
                {
                    String AuthorName=rs.getString("AName");
                    
                   BAuthor.setText( AuthorName);
                   String Serial =rs.getString("BSno");
                   SerialNo.setText(Serial);
                   iDate.requestFocus();
                }
            } catch (SQLException ex) {
               ex.printStackTrace();
            }
            
            
        }
    }//GEN-LAST:event_BNameKeyPressed

    private void SRollNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SRollNoKeyTyped
        // TODO add your handling code here:
//        
    }//GEN-LAST:event_SRollNoKeyTyped

    private void SRollNoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SRollNoActionPerformed
    {//GEN-HEADEREND:event_SRollNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SRollNoActionPerformed

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BAuthor;
    private javax.swing.JButton BBack;
    private javax.swing.JButton BDetailSub;
    private javax.swing.JTextField BName;
    private com.toedter.calendar.JDateChooser RDate;
    private javax.swing.JTextField SName;
    private javax.swing.JTextField SRollNo;
    private javax.swing.JTextField SerialNo;
    private com.toedter.calendar.JDateChooser iDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtBranch;
    private javax.swing.JLabel txtClass;
    private javax.swing.JLabel txtCourse;
    private javax.swing.JLabel txtMob;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtRollNo;
    // End of variables declaration//GEN-END:variables
}
