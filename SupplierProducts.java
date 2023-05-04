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
public class SupplierProducts extends javax.swing.JFrame {

    /**
     * Creates new form SupplierProducts
     */
    public SupplierProducts() {
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
           ResultSet rs=st.executeQuery("Select * from supplierproducts");
           DefaultTableModel tb =(DefaultTableModel) jTable1.getModel();
           tb.setRowCount(0);
           while(rs.next()){
           
            tb.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
                rs.getString(5)
            });
            
        }          
        }
        catch(Exception e){
            
        }
    }
     
     public void clear(){
         SupplierId.setText("");
         ProductName.setText("");
         Brand.setText("");
         Price.setText("");
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel2 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Price = new javax.swing.JTextField();
        SupplierId = new javax.swing.JTextField();
        ProductName = new javax.swing.JTextField();
        Brand = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(375, 275));
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
                "ProductId", "ProductName", "Brand", "Price Per Item", "SupplierId"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 560, 400));

        panel2.setBackground(new java.awt.Color(51, 51, 51));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Supplier id");
        panel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 120, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Product Name");
        panel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 120, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Brand");
        panel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 120, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Price");
        panel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 120, 30));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 310, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 110, -1));

        jButton3.setBackground(new java.awt.Color(255, 51, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 110, -1));

        Price.setBackground(new java.awt.Color(0, 0, 0));
        Price.setForeground(new java.awt.Color(255, 255, 255));
        panel2.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 120, -1));

        SupplierId.setBackground(new java.awt.Color(0, 0, 0));
        SupplierId.setForeground(new java.awt.Color(255, 255, 255));
        panel2.add(SupplierId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 120, -1));

        ProductName.setBackground(new java.awt.Color(0, 0, 0));
        ProductName.setForeground(new java.awt.Color(255, 255, 255));
        panel2.add(ProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 120, -1));

        Brand.setBackground(new java.awt.Color(0, 0, 0));
        Brand.setForeground(new java.awt.Color(255, 255, 255));
        panel2.add(Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Supplier Products Details");
        panel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 30));

        panel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 310, 400));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Supplier Products Details");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 220, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                 st.executeUpdate("Delete from supplierproducts where Pid='"+eve+"'");
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                    try {
               
                
                 if(SupplierId.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Please Enter Supplier ID"); 
                   clear();
                   return;
                }
                 if(ProductName.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Please Enter ProductName"); 
                   clear();
                   return;
                }
                 if(Brand.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Please Enter BrandName"); 
                   clear();
                   return;
                }
                 if(Price.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Please Enter Price");
                   clear();
                   return;
                }
                 
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Procrument","root","Asad2526?");
                Statement st1=con.createStatement();
                Statement st2=con.createStatement();
                //String Pcode=ProductCode.getText();
                String Scode=SupplierId.getText();
               // String Pcode=ProductName.getText();
                ResultSet rs=st1.executeQuery("Select * from Supplier where suprid='"+Scode+"'");
                //ResultSet rs2=st2.executeQuery("Select * from userproducts where Pid='"+Pcode+"'");
                
                
                int i=0,j=0;
                if(rs.next()){
                    i+=1;
                   ;
                }
                      
               
              
                if(i<=0){
                    JOptionPane.showMessageDialog(null, "Supplier is not avalible");
                }
                else {

           
            String query="Insert into supplierproducts (ProductName,Brand,Price,Sid) values (?,?,?,?)";
            //String query=INSERT INTO registration  VALUES(?,?,?,?,?,?,?,?,?,?);
            st=con.prepareStatement(query);
              //System.out.println("hheoo");

            st.setString(1, ProductName.getText());
            st.setString(2,Brand.getText());
            st.setString(3,Price.getText());
            st.setString(4,SupplierId.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "product added sucessfully ");
            clear();
            table();
            }
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SupplierProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplierProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplierProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplierProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupplierProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Brand;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField ProductName;
    private javax.swing.JTextField SupplierId;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
