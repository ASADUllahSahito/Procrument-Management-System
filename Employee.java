/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package procurement_management.project;
import java.sql.*;
//import project5.ConnectionProvider;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author shahab
 */
public class Employee extends javax.swing.JFrame {

    /**
     * Creates new form Employee
     * 
     */
           String url="jdbc:mysql://localhost:3306/employee";
           String usname="root";
           String pass="Asad2526?";
           
           Connection con=null;
           PreparedStatement st=null;
    public Employee() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void table(){
       // DefaultTableModel dtm(DefaultTableModel) jTable1.getModel();
        //dtm.setRowCount(0)
        try {
           String url="jdbc:mysql://localhost:3306/Procrument";
           String usname="root";
           String pass="Asad2526?";
           Connection con=DriverManager.getConnection(url,usname,pass);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from employee");
        DefaultTableModel tb =(DefaultTableModel) jTable1.getModel();
        tb.setRowCount(0);
        while(rs.next()){
           
           // tb.addRow(new Object[]{rs.getString(1),rs.getString(2)});
            
        }          
        }
        catch(Exception e){
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Department = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        EmpCode = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        FullName = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        Email = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        Phone = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        Designation = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(150, 100));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee Id", "Employee code", "Name", "Mail", "Phone", "Designation", "Department"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(204, 0, 102));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 750, 410));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Deatils");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Departmaent");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        jScrollPane2.setViewportView(Department);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 130, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Employee Code");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Full Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phone");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Designation");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        jScrollPane3.setViewportView(EmpCode);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 130, -1));

        jScrollPane4.setViewportView(FullName);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 130, -1));

        jScrollPane5.setViewportView(Email);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 130, -1));

        jScrollPane6.setViewportView(Phone);

        jPanel2.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 130, -1));

        jScrollPane7.setViewportView(Designation);

        jPanel2.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 130, -1));

        jButton1.setText("Clear");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 300, -1));

        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel2.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 70, -1));

        jButton3.setText("Delete");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 300, 410));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employees");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        // TODO add your handling code here:
        
          try {
              
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Procrument","root","Asad2526?");
        String query="Insert into employee (EmpCode,FullName,Mail,Phone,Designation,Department) values (?,?,?,?,?,?)";
        //String query=INSERT INTO registration  VALUES(?,?,?,?,?,?,?,?,?,?);
        st=con.prepareStatement(query);

        st.setString(1, EmpCode.getText());
        //st.setString(2,EmpCode.getText());
        st.setString(2, FullName.getText());
        st.setString(3,Email.getText());
        st.setString(4,Phone.getText());
        st.setString(5, Designation.getText());
        st.setString(6,Department.getText());
        st.executeUpdate();
        
         JOptionPane.showMessageDialog(null, "Account Resgistred registerd sucessfully ");
         table();
      
        }
        
        catch(Exception e){
            
        }
    }//GEN-LAST:event_ADDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception{
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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* try{
            
         String url="jdbc:mysql://localhost:3306/Procrument";
           String usname="root";
           String pass="Asad2526?";
           
           String query="Select FullName from employee where EmpId=300";
          
          
        Connection con=DriverManager.getConnection(url,usname,pass);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        rs.next();
        
        String name=rs.getString("FullName");
           // System.out.println(""+name);
            
        
        
        
        
        }
        catch (Exception e){
            
        }*/
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JTextPane Department;
    private javax.swing.JTextPane Designation;
    private javax.swing.JTextPane Email;
    private javax.swing.JTextPane EmpCode;
    private javax.swing.JTextPane FullName;
    private javax.swing.JTextPane Phone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}