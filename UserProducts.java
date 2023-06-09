/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package procurement_management.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shahab
 */
public class UserProducts extends javax.swing.JFrame {

    /**
     * Creates new form UserProducts
     */
    public UserProducts() {
        initComponents();
        table();
    }
    
     Connection con=null;
     PreparedStatement st=null;

     public void table(){
       // DefaultTableModel dtm(DefaultTableModel) jTable1.getModel();
        //dtm.setRowCount(0)
        try {
           String url="jdbc:mysql://localhost:3306/Procrument";
           String usname="root";
           String pass="Asad2526?";
           Connection con=DriverManager.getConnection(url,usname,pass);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from userproducts");
        DefaultTableModel tb =(DefaultTableModel) jTable1.getModel();
        tb.setRowCount(0);
        while(rs.next()){
           
            tb.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
            rs.getString(5)});
            
        }          
        }
        catch(Exception e){
            
        }
    }
     
     public void clear(){
         
         ProductName.setText("");
         Brand.setText("");
         Quantity.setText("");
         Date.setCalendar(null);
        
         //Date.setText("");
         //Search.setText("");
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel2 = new java.awt.Panel();
        panel3 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Quantity = new javax.swing.JTextField();
        ProductName = new javax.swing.JTextField();
        Brand = new javax.swing.JTextField();
        Date = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 250));
        setUndecorated(true);

        panel1.setBackground(new java.awt.Color(0, 0, 0));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product-Id", "ProductNam", "Brand", "Quantity", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 580, 340));

        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 300, -1));

        panel3.setBackground(new java.awt.Color(51, 51, 51));
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Date");
        panel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 100, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product Name");
        panel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 130, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantity");
        panel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 130, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Brand");
        panel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 130, 20));

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 310, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 110, -1));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 260, 100, -1));

        Quantity.setBackground(new java.awt.Color(0, 0, 0));
        Quantity.setForeground(new java.awt.Color(255, 255, 255));
        panel3.add(Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 140, -1));

        ProductName.setBackground(new java.awt.Color(0, 0, 0));
        ProductName.setForeground(new java.awt.Color(255, 255, 255));
        panel3.add(ProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 140, -1));

        Brand.setBackground(new java.awt.Color(0, 0, 0));
        Brand.setForeground(new java.awt.Color(255, 255, 255));
        panel3.add(Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 140, -1));

        Date.setDateFormatString("yyyy-MM-dd");
        panel3.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 150, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Product Details");
        panel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 150, 20));

        panel1.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 310, 350));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Needed Product Details");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 270, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            try {

            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Procrument","root","Asad2526?");
            String query="Insert into userproducts (ProductName,Brand,Quantity,RequestDate) values (?,?,?,?)";
            //String query=INSERT INTO registration  VALUES(?,?,?,?,?,?,?,?,?,?);
            st=con.prepareStatement(query);

            st.setString(1, ProductName.getText());
            st.setString(2,Brand.getText());
            st.setString(3, Quantity.getText());
            st.setString(4, ((JTextField)Date.getDateEditor().getUiComponent()).getText());
            
            st.executeUpdate();

            JOptionPane.showMessageDialog(null, "product requested sucessfully ");
            clear();
            table();

        }

        catch(Exception e){

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                  if(jTable1.getSelectedRow()!=-1){
            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
            try {
           String url="jdbc:mysql://localhost:3306/Procrument";
           String usname="root";
           String pass="Asad2526?";
           Connection con=DriverManager.getConnection(url,usname,pass);
            Statement st=con.createStatement();
                 int row = jTable1.getSelectedRow();
                 String eve = jTable1.getValueAt(row, 0).toString();
                 st.executeUpdate("Delete from userproducts where Pid='"+eve+"'");
                 JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
                 table();
         }
         
         catch(Exception e ){
             
         }
           } 
           else{
               JOptionPane.showMessageDialog(null, "Please Select any row");
           }
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(UserProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Brand;
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JTextField ProductName;
    private javax.swing.JTextField Quantity;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    // End of variables declaration//GEN-END:variables
}
