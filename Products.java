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
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shahab
 */
public class Products extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public Products() {
        initComponents();
        table();
    }
     Connection con=null;
     PreparedStatement st=null;
     PreparedStatement stt=null;

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
            });
            
        }          
        }
        catch(Exception e){
            
        }
    }
     
     public void clear(){
         ProductCode.setText("");
         ProductName.setText("");
         Brand.setText("");
         Quantity.setText("");
         SupplierId.setText("");
         Date.setCalendar(null);
         
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        jLabel6 = new javax.swing.JLabel();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        ProductName = new javax.swing.JTextField();
        Brand = new javax.swing.JTextField();
        Date = new com.toedter.calendar.JDateChooser();
        ProductCode = new javax.swing.JTextField();
        button5 = new java.awt.Button();
        Quantity = new javax.swing.JTextField();
        SupplierId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panel2 = new java.awt.Panel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 250));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PRODUCTCODE", "PRODUCTNAME", "BRAND", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 520, -1));

        panel1.setBackground(new java.awt.Color(51, 51, 51));
        panel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Brand");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Product Deatils");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product Code");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 90, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product Name");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 100, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 80, -1));

        button1.setBackground(new java.awt.Color(255, 51, 51));
        button1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(0, 0, 0));
        button1.setLabel("Clear");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        panel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 370, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Supplier Id");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, -1));

        button2.setBackground(new java.awt.Color(0, 255, 0));
        button2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button2.setForeground(new java.awt.Color(0, 0, 0));
        button2.setLabel("Click to add New Supplier");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        panel1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 370, -1));

        button3.setBackground(new java.awt.Color(255, 255, 0));
        button3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button3.setForeground(new java.awt.Color(0, 0, 0));
        button3.setLabel("Add");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        panel1.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 110, -1));

        ProductName.setBackground(new java.awt.Color(0, 0, 0));
        ProductName.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(ProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 160, -1));

        Brand.setBackground(new java.awt.Color(0, 0, 0));
        Brand.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 160, -1));

        Date.setBackground(new java.awt.Color(0, 0, 0));
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setDateFormatString("yyyy-MM-dd");
        panel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 160, -1));

        ProductCode.setBackground(new java.awt.Color(0, 0, 0));
        ProductCode.setForeground(new java.awt.Color(255, 255, 255));
        ProductCode.setSelectionColor(new java.awt.Color(255, 102, 102));
        ProductCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductCodeActionPerformed(evt);
            }
        });
        panel1.add(ProductCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 160, -1));

        button5.setBackground(new java.awt.Color(255, 0, 0));
        button5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button5.setForeground(new java.awt.Color(0, 0, 0));
        button5.setLabel("Delete");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        panel1.add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 130, -1));

        Quantity.setBackground(new java.awt.Color(0, 0, 0));
        Quantity.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 160, -1));

        SupplierId.setBackground(new java.awt.Color(0, 0, 0));
        SupplierId.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(SupplierId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 160, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Quantity");
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 90, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurement_management/project/Icons/search.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 100, 30));

        jPanel1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 370, 430));

        panel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setText("Products Details");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                    .addContainerGap(360, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(312, Short.MAX_VALUE)))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 2, Short.MAX_VALUE)))
        );

        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        Supplier s=new Supplier();
        s.setVisible(true);
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
            try {
               
                if(ProductCode.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Please Enter ProductCode"); 
                   return;
                }
                 if(SupplierId.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Please Enter Supplier ID"); 
                   return;
                }
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Procrument","root","Asad2526?");
                Statement st1=con.createStatement();
                Statement st2=con.createStatement();
                //String Pcode=ProductCode.getText();
                String Scode=SupplierId.getText();
                String Pcode=ProductCode.getText();
                ResultSet rs=st1.executeQuery("Select * from Supplier where suprid='"+Scode+"'");
                ResultSet rs2=st2.executeQuery("Select * from userproducts where Pid='"+Pcode+"'");
                
                
                int i=0,j=0;
                if(rs.next()){
                    i+=1;
                   ;
                }
               if(rs2.next()){
                    j+=1;
                    
                }
                
                
                if (i<=0 && j<=0){
                    JOptionPane.showMessageDialog(null, "please Enter the correct detail... ");
                    
                }
                else if(i>0 && j<=0){
                    JOptionPane.showMessageDialog(null, "please Enter the correct product code ");
                }
                else if(i<=0 && j>0){
                    JOptionPane.showMessageDialog(null, "Supplier is not avalible");
                }
             
                else {
                Statement st4=con.createStatement();
                Statement st5=con.createStatement();
                
                ResultSet rs3=st4.executeQuery("select * from\n" +
" supplier join supplierproducts \n" +
" on supplier.suprid=supplierproducts.Sid\n" +
" where ProductName='"+ProductName.getText()+"'");
                
             ResultSet rs4=st5.executeQuery("select * from\n" +
" supplier join supplierproducts \n" +
" on supplier.suprid=supplierproducts.Sid\n" +
" where Brand='"+Brand.getText()+"'");
                
             int price=0;
                int a=0,b=0;
                if(rs3.next()){
                    a++;
                    
                    price=rs3.getInt(9);
                    System.out.println("hoelow");
                }
                if(rs4.next()){
                    b++;
                }
                if(a<=0){
                    JOptionPane.showMessageDialog(null, "The require product is not avalible at supplier...");
                    ProductName.setText("");
                    return;
                }
                else if(b<=0){
                    JOptionPane.showMessageDialog(null, "The  product of required brand is not avalible at supplier...");
                }
                else{
                    System.out.println("OK REPORT");
            String query="Insert into products (Pid,ProductName,Quantity,Brand,PurchaseDate,Sid) values (?,?,?,?,?,?)";
            //String query=INSERT INTO registration  VALUES(?,?,?,?,?,?,?,?,?,?);
            st=con.prepareStatement(query);

            st.setString(1, ProductCode.getText());
            //st.setString(2,EmpCode.getText());
            st.setString(2, ProductName.getText());
            st.setString(3,Quantity.getText());
            st.setString(4,Brand.getText());
            st.setString(5, ((JTextField)Date.getDateEditor().getUiComponent()).getText());
            st.setString(6,SupplierId.getText());
            st.executeUpdate();
                    System.out.println("OK");

            JOptionPane.showMessageDialog(null, "product purchased sucessfully ");
            
            String query2="Insert into GRN (Pid,ProductName,Brand,Quantity,Price,Sid,SupplierName,PurchasedDate) values (?,?,?,?,?,?,?,?)";
            stt=con.prepareStatement(query2);
            System.out.println("hiasad");
            stt.setString(1, ProductCode.getText());
            //st.setString(2,EmpCode.getText());
            stt.setString(2, ProductName.getText());
            stt.setString(3,Brand.getText());
            stt.setString(4,Quantity.getText());
            String p= Quantity.getText();
            int newprice=Integer.parseInt(p);
            int originalprice=newprice*price;
            String s=String.valueOf(originalprice);  
            
            stt.setString(5,s);
            Statement st6=con.createStatement();
            ResultSet rs6=st6.executeQuery("Select * from supplier where suprid='"+SupplierId.getText()+"'");
            String SupplierName="";
            if(rs6.next()){
                SupplierName=rs6.getString(2);
            }
            stt.setString(6,SupplierId.getText());
            stt.setString(7,SupplierName);
            
            stt.setString(8, ((JTextField)Date.getDateEditor().getUiComponent()).getText());
            stt.executeUpdate();
            
            
            
            String search=ProductCode.getText();
            
            Statement st3=con.createStatement();
            ResultSet rs5=st3.executeQuery("Select * from employee where EmpId='"+search+"'");


            st.executeUpdate("Delete from userproducts where Pid='"+search+"'");
         
        
            clear();
            table();
            }
                }
             
             

        }

        catch(Exception e){

        }
    }//GEN-LAST:event_button3ActionPerformed

    private void ProductCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductCodeActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
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
                 clear();
                 table();
         }
         
         catch(Exception e ){
             
         }
           } 
           else{
               JOptionPane.showMessageDialog(null, "Please Select any row");
           }
    }//GEN-LAST:event_button5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           try {
            String url="jdbc:mysql://localhost:3306/Procrument";
            String usname="root";
            String pass="Asad2526?";
            String search=ProductCode.getText();
            Connection con=DriverManager.getConnection(url,usname,pass);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from userproducts where Pid='"+search+"'");

            int i=0;
            while(rs.next()){
                i=1;
                ProductCode.setText(rs.getString(1));
                ProductName.setText(rs.getString(2));
                Brand.setText(rs.getString(3));
                Quantity.setText(rs.getString(4));
                

            }
            if(i==0){
                JOptionPane.showMessageDialog(null, "Product does not Exit ");
               // clear();
            }
        }
        catch(Exception e){

        }
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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Brand;
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JTextField ProductCode;
    private javax.swing.JTextField ProductName;
    private javax.swing.JTextField Quantity;
    private javax.swing.JTextField SupplierId;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
