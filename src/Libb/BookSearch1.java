
package Libb;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
public class BookSearch1 extends javax.swing.JFrame {
    public BookSearch1() {
        initComponents();
        showData("");
 
    }
public static Connection getConnection()
{
    Connection con =null;
     try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pallavi","root","Dreams");   
     }        
     catch(Exception ex)
     {
         System.out.print(ex.getMessage());
     }
     return con;
     }
public void showData(String d1){
    Connection con = getConnection();
    PreparedStatement st ;
    ResultSet rs;
    try{
         if(d1.equals("") )
         {
        st = con.prepareStatement("select * from bookList");
         }
         else {
         st = con.prepareStatement("select * from BookList where BSNo = ?");
         st.setString(1,d1);         
         }
         rs = st.executeQuery();
         DefaultTableModel model = (DefaultTableModel)booktable.getModel();
         Object[] row;
         while(rs.next())
         {
               row = new Object[6];
               row[0]= rs.getString(1);
               row[1]= rs.getString(2);
               row[2]= rs.getString(3);
               row[3]= rs.getString(4);
               row[4]= rs.getString(5);
               row[5]= rs.getInt(6);
               
         model.addRow(row);
         }
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
}
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        booktable = new javax.swing.JTable();
        Search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusColor"));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setMaximumSize(new java.awt.Dimension(1518, 732));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1518, 732));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1518, 732));

        booktable.setAutoCreateRowSorter(true);
        booktable.setBackground(javax.swing.UIManager.getDefaults().getColor("Desktop.background"));
        booktable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String []
            {
                "BName", "Author", "Book Course", "Book Serial No", "Department", "Pages"
            }
        ));
        booktable.setOpaque(false);
        jScrollPane1.setViewportView(booktable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 1080, 280));

        Search.setBackground(new java.awt.Color(0, 51, 102));
        Search.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Search");
        Search.setOpaque(true);
        Search.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 51, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book Sno.");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 150, 40));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 250, 40));

        jLabel2.setBackground(new java.awt.Color(0, 51, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  Book Search");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 250, 50));

        back.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        back.setForeground(new java.awt.Color(0, 51, 102));
        back.setText("Back");
        back.setOpaque(true);
        back.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 100, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Libb/background.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1518, 732));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
try {
       booktable.setModel(new DefaultTableModel(null,new Object[]{"bName","Aname","bcourse","bserno","depart","Nop"}));
               
       
       String bookid =id.getText();
       
       showData(bookid);
   }
   catch(Exception e)
   {
       e.printStackTrace();
   }        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookSearch1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Search;
    private javax.swing.JButton back;
    private javax.swing.JTable booktable;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
