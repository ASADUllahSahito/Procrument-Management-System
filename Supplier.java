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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shahab
 */
public class Supplier extends javax.swing.JFrame {

    /**
     * Creates new form Supplier
     */
    Connection con=null;
    PreparedStatement st=null;
    public Supplier() {
        initComponents();
        table();
    }
    
         public void clear(){
         
         Name.setText("");
         Email.setText("");
         Phone.setText("");
         Address.setText("");
         Search.setText("");
         
     }
         
         
        public void table(){
       // DefaultTableModel dtm(DefaultTableModel) jTable1.getModel();
        //dtm.setRowCount(0)
        try {
           String url="jdbc:mysql://localhost:3306/Procrument";
           String usname="root";
           String pass="Asad2526?";
           Connection con=DriverManager.getConnection(url,usname,pass);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from supplier");
        DefaultTableModel tb =(DefaultTableModel) jTable1.getModel();
        tb.setRowCount(0);
        while(rs.next()){
           
            tb.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)
           ,rs.getString(5)});
            
        }          
        }
        catch(Exception e){
            
        }
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Address = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

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
                "s_id", "Name", "Email", "Phone", "Address"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 540, 440));

        panel2.setBackground(new java.awt.Color(51, 51, 51));
        panel2.setForeground(new java.awt.Color(51, 51, 51));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        panel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 90, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone");
        panel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 90, 30));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 320, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 90, -1));

        jButton3.setBackground(new java.awt.Color(0, 255, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 90, -1));

        Address.setBackground(new java.awt.Color(0, 0, 0));
        Address.setForeground(new java.awt.Color(255, 255, 255));
        panel2.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 150, 30));

        Email.setBackground(new java.awt.Color(0, 0, 0));
        Email.setForeground(new java.awt.Color(255, 255, 255));
        panel2.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 150, 30));

        Phone.setBackground(new java.awt.Color(0, 0, 0));
        Phone.setForeground(new java.awt.Color(255, 255, 255));
        panel2.add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 150, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Supplier Information");
        panel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 30));

        jButton5.setBackground(new java.awt.Color(255, 51, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 90, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address");
        panel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 100, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Name");
        panel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 80, 30));

        Name.setBackground(new java.awt.Color(0, 0, 0));
        Name.setForeground(new java.awt.Color(255, 255, 255));
        panel2.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 150, 30));

        panel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 320, 440));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Supplier Information");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 30));

        Search.setBackground(new java.awt.Color(0, 0, 0));
        Search.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 140, 30));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurement_management/project/Icons/search.png"))); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 160, 30));

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
                   if(Name.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Name cant be nulll"); 
                   clear();
                   return;
                }
                 

                 if(Email.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Please Enter correct Email"); 
                   clear();
                   return;
                }
                 if(Phone.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Phone number cant be null");
                   clear();
                   return;
                }
               
                 if(Address.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Address can not be null");
                   clear();
                   return;
                }
                  

            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Procrument","root","Asad2526?");
            String query="Insert into supplier(Name,Mail,Phone,Address) values (?,?,?,?)";
            //String query=INSERT INTO registration  VALUES(?,?,?,?,?,?,?,?,?,?);
            st=con.prepareStatement(query);
            st.setString(1,Name.getText());
            st.setString(2,Email.getText());
            st.setString(3,Phone.getText());
            st.setString(4, Address.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Supplier Added  sucessfully ");
            clear();
            table();
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
            try {
           String url="jdbc:mysql://localhost:3306/Procrument";
           String usname="root";
           String pass="Asad2526?";
           String search=Search.getText();
           Connection con=DriverManager.getConnection(url,usname,pass);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from supplier where suprid='"+search+"'");
        
       int i=0;
        while(rs.next()){
           i=1;
          
           Name.setText(rs.getString(2));
           Email.setText(rs.getString(3));
           Phone.setText(rs.getString(4));
           Address.setText(rs.getString(5));
           
           
            
           
            
        } 
        if(i==0){
               JOptionPane.showMessageDialog(null, "supplier does not Exit ");
               clear();
           }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          try {
           String url="jdbc:mysql://localhost:3306/Procrument";
           String usname="root";
           String pass="Asad2526?";
           String search=Search.getText();
           Connection con=DriverManager.getConnection(url,usname,pass);
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("Select * from supplier where suprid='"+search+"'");
        
       int i=0;
        while(rs.next()){
           i=1;
           break;
          
        } 
        if(i==0){
               JOptionPane.showMessageDialog(null, "supplier does not Exit ");
               clear();
               return;
           }
         
         st.execute("update supplier set Name='"+Name.getText()+"',Mail='"+Email.getText()+"',Phone='"+Phone.getText()+"',address='"+Address.getText()+"' where suprid='"+search+"'");
         JOptionPane.showMessageDialog(null,"Updated Successfully ");
         clear();
         table();
        }
        catch(Exception e){
            
        }
          table();
          clear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
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
                 st.executeUpdate("Delete from supplier where suprid='"+eve+"'");
                 JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
                 table();
         }
         
         catch(Exception e ){
             
         }
           } 
           else{
               JOptionPane.showMessageDialog(null, "Please Select any row");
           }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Phone;
    private javax.swing.JTextField Search;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
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