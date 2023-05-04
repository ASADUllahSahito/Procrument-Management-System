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
public class IssueTo extends javax.swing.JFrame {

    /**
     * Creates new form IssueTo
     */
    public IssueTo() {
        initComponents();
        //table();
    }
    String UName;
    public IssueTo(String Name) {
        initComponents();
        this.UName=Name;
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
           ResultSet rs=st.executeQuery("Select * from products");
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
         EmployeeId.setText("");
         ProductCode.setText("");
         Quantity.setText("");
         
         Date.setCalendar(null);
         
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
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
        EmployeeId = new javax.swing.JTextField();
        ProductCode = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        Date = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 250));
        setUndecorated(true);

        panel1.setBackground(new java.awt.Color(0, 0, 0));
        panel1.setForeground(new java.awt.Color(255, 255, 255));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product Id", "Product Name", "Quantity", "Brand"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 580, 320));

        panel2.setBackground(new java.awt.Color(51, 51, 51));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Date");
        panel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 120, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Emplyee Id");
        panel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 120, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product Code");
        panel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 120, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity");
        panel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 120, 20));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 130, 30));

        jButton2.setBackground(new java.awt.Color(0, 255, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Issue Product");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 235, 310, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Avalible Employees");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 170, -1));

        EmployeeId.setBackground(new java.awt.Color(0, 0, 0));
        EmployeeId.setForeground(new java.awt.Color(255, 255, 255));
        panel2.add(EmployeeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 130, -1));

        ProductCode.setBackground(new java.awt.Color(0, 0, 0));
        ProductCode.setForeground(new java.awt.Color(255, 255, 255));
        panel2.add(ProductCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 130, -1));

        Quantity.setBackground(new java.awt.Color(0, 0, 0));
        Quantity.setForeground(new java.awt.Color(255, 255, 255));
        panel2.add(Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 130, -1));

        Date.setDateFormatString("yyyy-MM-dd");
        panel2.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 140, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Issue Product");
        panel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 20));

        panel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 310, 320));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Issued Products ");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 210, 20));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            try {
               if(EmployeeId.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Please Enter Employee ID"); 
                   return;
                }
                if(ProductCode.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Please Enter ProductCode"); 
                   return;
                }
               
                 
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Procrument","root","Asad2526?");
                Statement st1=con.createStatement();
                Statement st2=con.createStatement();
                //String Pcode=ProductCode.getText();
                String Ecode=EmployeeId.getText();
                String Pcode=ProductCode.getText();
                String nq=Quantity.getText();
                int newquantity=Integer.parseInt(nq);  
                ResultSet rs=st1.executeQuery("Select * from employee where EmpId='"+Ecode+"'");
                ResultSet rs2=st2.executeQuery("Select * from products where Pid='"+Pcode+"'");
                int oldquantity=0;
               
                
                int i=0,j=0;
                if(rs.next()){
                    i+=1;
                   ;
                   // System.out.println("hiasad");
                }
               if(rs2.next()){
                    j+=1;
                    oldquantity=rs2.getInt(3);
                    System.out.println("oldquantity"+oldquantity);
                }
                
                
                if (i<=0){
                    JOptionPane.showMessageDialog(null, "Enterd Employee is not availbe... ");
                    clear();
                    return;
                    
                }
                else if(j<=0){
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

           
            String query="Insert into issuedproducts (Pid,ProductName,ReciverId,ReciverName,ReceivedFrom,Quantity,IssuedDate) values (?,?,?,?,?,?,?)";
            //String query=INSERT INTO registration  VALUES(?,?,?,?,?,?,?,?,?,?);
            st=con.prepareStatement(query);

            st.setString(1, ProductCode.getText());
            //st.setString(2,EmpCode.getText());
            Statement st4=con.createStatement();
            ResultSet rs4=st4.executeQuery("Select * from products where Pid='"+Pcode+"'");
            String ProductName="";
            if(rs4.next()){
                ProductName=rs4.getString(2);
            }
            st.setString(2, ProductName);
            st.setString(3,EmployeeId.getText());
            Statement st5=con.createStatement();
            ResultSet rs5=st5.executeQuery("Select * from employee where EmpId='"+Ecode+"'");
            String ReciverName="";
            if(rs5.next()){
                ReciverName=rs5.getString(2);
            }
            st.setString(4,ReciverName);
            st.setString(5, UName);
            st.setString(6,Quantity.getText());
            st.setString(7, ((JTextField)Date.getDateEditor().getUiComponent()).getText());
            
            st.executeUpdate();

            JOptionPane.showMessageDialog(null, "product issued sucessfully ");
            
            int FinalQuantity=oldquantity-newquantity;
            if(FinalQuantity>0){
                Statement st6=con.createStatement();
                st.execute("update products set quantity='"+FinalQuantity+"' where Pid='"+ProductCode.getText()+"'");
            
                clear();
                table();
            }
            else if(FinalQuantity==0){
                st.executeUpdate("Delete from products where Pid='"+ProductCode.getText()+"'");
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        AvalibleEmployee ee=new AvalibleEmployee();
        ee.setVisible(true);
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
            java.util.logging.Logger.getLogger(IssueTo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueTo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueTo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueTo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueTo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JTextField EmployeeId;
    private javax.swing.JTextField ProductCode;
    private javax.swing.JTextField Quantity;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
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
    // End of variables declaration//GEN-END:variables
}
