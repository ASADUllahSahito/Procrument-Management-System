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
public class DeadStock extends javax.swing.JFrame {

    /**
     * Creates new form DeadStock
     */
    public DeadStock() {
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
           ResultSet rs=st.executeQuery("Select * from Deadproducts");
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
         ProductId.setText("");
         ProductName.setText("");
         Description.setText("");
         Quantity.setText("");
         
         
         Date.setCalendar(null);
         
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel2 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Description = new javax.swing.JTextField();
        ProductId = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        Date = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ProductName = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
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
                "P_Id", "PName", "Quantity", "Dispose Date", "Description"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 610, 360));

        panel2.setBackground(new java.awt.Color(51, 51, 51));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Description");
        panel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 100, 28));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product ID");
        panel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 100, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantity");
        panel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 110, 28));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dispose Date");
        panel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 110, -1));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Clear");
        panel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 280, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 100, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurement_management/project/Icons/search.png"))); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 110, -1));

        Description.setBackground(new java.awt.Color(0, 0, 0));
        Description.setForeground(new java.awt.Color(255, 255, 255));
        Description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescriptionActionPerformed(evt);
            }
        });
        panel2.add(Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 130, -1));

        ProductId.setBackground(new java.awt.Color(0, 0, 0));
        ProductId.setForeground(new java.awt.Color(255, 255, 255));
        ProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductIdActionPerformed(evt);
            }
        });
        panel2.add(ProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 130, -1));

        Quantity.setBackground(new java.awt.Color(0, 0, 0));
        Quantity.setForeground(new java.awt.Color(255, 255, 255));
        Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityActionPerformed(evt);
            }
        });
        panel2.add(Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 130, -1));

        Date.setDateFormatString("yyyy-MM-dd\n");
        panel2.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 130, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Dead Stock Detail");
        panel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 141, 28));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Product Name");
        panel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 110, 28));

        ProductName.setBackground(new java.awt.Color(0, 0, 0));
        ProductName.setForeground(new java.awt.Color(255, 255, 255));
        ProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductNameActionPerformed(evt);
            }
        });
        panel2.add(ProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 130, -1));

        jButton4.setBackground(new java.awt.Color(255, 51, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Delete");
        panel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 110, 30));

        panel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 280, 360));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dead Stock Detail...");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 200, 28));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescriptionActionPerformed

    private void ProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductIdActionPerformed

    private void QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityActionPerformed

    private void ProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductNameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            try {
            String url="jdbc:mysql://localhost:3306/Procrument";
            String usname="root";
            String pass="Asad2526?";
            String search=ProductId.getText();
            Connection con=DriverManager.getConnection(url,usname,pass);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from issuedproducts where Pid='"+search+"'");

            int i=0;
            while(rs.next()){
                i=1;
                //ProductC.setText(rs.getString(1));
                ProductName.setText(rs.getString(2));
                //Brand.setText(rs.getString(3));
               // Quantity.setText(rs.getString(4));
                

            }
            if(i==0){
                JOptionPane.showMessageDialog(null, "Product does not Exit ");
               // clear();
            }
        }
        catch(Exception e){

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         try {
               if(ProductId.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Please Enter Product ID"); 
                   return;
                }
                if(ProductName.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Please Enter Name"); 
                   return;
                }
               
                 
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Procrument","root","Asad2526?");
                Statement st1=con.createStatement();
                Statement st2=con.createStatement();
                //String Pcode=ProductCode.getText();
                String Ecode=ProductId.getText();
               // String Pcode=ProductCode.getText();
                String nq=Quantity.getText();
                int newquantity=Integer.parseInt(nq);  
                //ResultSet rs=st1.executeQuery("Select * from employee where EmpId='"+Ecode+"'");
                ResultSet rs2=st2.executeQuery("Select * from issuedproducts where Pid='"+Ecode+"'");
                int oldquantity=0;
               
                
                int i=0,j=0;
                
               if(rs2.next()){
                    j+=1;
                    oldquantity=rs2.getInt(6);
                    System.out.println("oldquantity"+oldquantity);
                    System.out.println(""+newquantity);
                }
                
                
                
                if(j<=0){
                    JOptionPane.showMessageDialog(null, "Enterd product is not avlible ");
                    clear();
                    return;
                }
                else if(oldquantity-newquantity<0){
                    JOptionPane.showMessageDialog(null, "Product Quantity is not avalible");
                    clear();
                    return;
                }
             
                else {

           System.out.println("hello word");
            String query="Insert into Deadproducts (Pid,ProductName,Quantity,DisposeDate,Description) values (?,?,?,?,?)";
            //String query=INSERT INTO registration  VALUES(?,?,?,?,?,?,?,?,?,?);
            st=con.prepareStatement(query);
                   

            st.setString(1, ProductId.getText());
            //st.setString(2,EmpCode.getText());
            Statement st4=con.createStatement();
            ResultSet rs4=st4.executeQuery("Select * from issuedproducts where Pid='"+Ecode+"'");
            String ProductName="";
            if(rs4.next()){
                ProductName=rs4.getString(2);
            }
            st.setString(2, ProductName);
            
            st.setString(3,Quantity.getText());
            st.setString(4, ((JTextField)Date.getDateEditor().getUiComponent()).getText());
            st.setString(5,Description.getText());
            
            st.executeUpdate();

            JOptionPane.showMessageDialog(null, "product added sucessfully to dead stock");
            
            int FinalQuantity=oldquantity-newquantity;
            if(FinalQuantity>0){
                Statement st6=con.createStatement();
                st.execute("update issuedproducts set quantity='"+FinalQuantity+"' where Pid='"+ProductId.getText()+"'");
            
                clear();
                table();
            }
            else if(FinalQuantity==0){
                st.executeUpdate("Delete from issuedproducts where Pid='"+ProductId.getText()+"'");
                clear();
                table();
            }
            
           // String search=ProductCode.getText();
            
            //Statement st3=con.createStatement();
            //ResultSet rs3=st3.executeQuery("Select * from employee where EmpId='"+search+"'");


           // st.executeUpdate("Delete from userproducts where Pid='"+search+"'");
         
        
            clear();
            table();
            }
             
             

        }

        catch(Exception e){

        }

                
               
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DeadStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeadStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeadStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeadStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeadStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JTextField Description;
    private javax.swing.JTextField ProductId;
    private javax.swing.JTextField ProductName;
    private javax.swing.JTextField Quantity;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
