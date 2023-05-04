/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package procurement_management.project;

/**
 *
 * @author shahab
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        
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
        panel2 = new java.awt.Panel();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        Welcome = new javax.swing.JLabel();
        IBA = new javax.swing.JLabel();
        SignOut = new javax.swing.JButton();
        Merit = new javax.swing.JLabel();
        panel3 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackground(new java.awt.Color(204, 204, 204));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurement_management/project/Icons/menu_icon_48px.png"))); // NOI18N
        jButton4.setText("Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, 70));

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurement_management/project/Icons/SupplierPicture.png"))); // NOI18N
        jButton9.setText("Supplier");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        panel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 190, 50));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurement_management/project/Icons/ProductIcon.png"))); // NOI18N
        jButton10.setText("Supplier Products");
        jButton10.setActionCommand("GRN");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        panel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 190, 50));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurement_management/project/Icons/Add_Account.png"))); // NOI18N
        jButton5.setText("Add User");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 190, 50));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurement_management/project/Icons/homepages_home_house_icon_150665.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 190, 60));

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurement_management/project/Icons/Products.png"))); // NOI18N
        jButton11.setText("Add Product");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        panel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 190, 50));

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurement_management/project/Icons/CurrentStock.png"))); // NOI18N
        jButton12.setText("Current Stock");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        panel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 190, 50));

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurement_management/project/Icons/AdminIcon.png"))); // NOI18N
        jButton13.setText("Add Employee");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        panel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 190, 50));

        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurement_management/project/Icons/GRNpicture.png"))); // NOI18N
        jButton14.setText("GRN");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        panel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 190, 40));

        panel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 730));

        Welcome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Welcome.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(Welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 400, 50));

        IBA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IBA.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(IBA, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 300, 50));

        SignOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurement_management/project/Icons/Log_Out_Icon.png"))); // NOI18N
        SignOut.setText("SignOut");
        SignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutActionPerformed(evt);
            }
        });
        panel1.add(SignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 70, -1, -1));

        Merit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Merit.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(Merit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 280, 40));

        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Welcome to Sukkur IBA University");
        panel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 310, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurement_management/project/Icons/Close all jframe.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 30, 30));

        panel1.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurement_management/project/Icons/user_icon_150670.png"))); // NOI18N
        jLabel3.setText("User: Trial (Admin)");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 70, 200, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurement_management/project/Icons/AdminPage2.jpg"))); // NOI18N
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 770));

        jButton3.setText("jButton2");
        panel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Users u=new Users ();
        u.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
//        Welcome.setText("Welcome to Procurement Department of");
//        IBA.setText("SUKKUR IBA UNIVERSITY");
//        Merit.setText("MERIT QUALITY EXCELLENCE");

     ChoseLocation obj=new ChoseLocation();
     obj.setVisible(true);
     
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        Supplier s=new Supplier();
        s.setVisible(true);
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        DeadStock d=new DeadStock();
 //       d.setVisible(true);
        SupplierProducts p=new SupplierProducts();
        p.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
         Products p=new Products();
      
         p.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        CurrentStock c=new CurrentStock();
        c.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        EmployeePage p=new EmployeePage();
        p.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void SignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutActionPerformed
        // TODO add your handling code here:
        Login_Page p=new Login_Page();
        p.setVisible(true);
    }//GEN-LAST:event_SignOutActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        GRN g=new GRN();
        g.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IBA;
    private javax.swing.JLabel Merit;
    private javax.swing.JButton SignOut;
    private javax.swing.JLabel Welcome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    // End of variables declaration//GEN-END:variables
}