/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf;


import codes.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class home extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pst;
    
    public home() {
        initComponents();
        
        conn = (Connection) DBconnect.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        searchbox = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        namebox = new javax.swing.JTextField();
        agebox = new javax.swing.JTextField();
        gradebox = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        ibtn = new javax.swing.JButton();
        ubox = new javax.swing.JButton();
        dbox = new javax.swing.JButton();
        cbox = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        ebox = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchboxActionPerformed(evt);
            }
        });
        jPanel3.add(searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, 20));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 50));

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Name");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Age");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Grade");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        namebox.setToolTipText("Enter your Name");
        jPanel4.add(namebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 120, -1));
        jPanel4.add(agebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 120, -1));

        gradebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select grade", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", " " }));
        jPanel4.add(gradebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 100, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 250, 220));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ibtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ibtn.setText("Insert");
        ibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibtnActionPerformed(evt);
            }
        });
        jPanel5.add(ibtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, -1));

        ubox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ubox.setText("Update");
        ubox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uboxActionPerformed(evt);
            }
        });
        jPanel5.add(ubox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 190, -1));

        dbox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dbox.setText("Delete");
        jPanel5.add(dbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, -1));

        cbox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbox.setText("Clear");
        jPanel5.add(cbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 190, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, 200));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 600));

        table1.setBackground(new java.awt.Color(153, 204, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 310, -1));

        ebox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ebox.setText("Exit");
        ebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eboxActionPerformed(evt);
            }
        });
        jPanel1.add(ebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchboxActionPerformed

    private void uboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uboxActionPerformed

    private void eboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eboxActionPerformed

    private void ibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibtnActionPerformed
               
           String name;
           int age;
           int grade;
           
           name = namebox.getText();
           age = Integer.parseInt(agebox.getText());
           grade = Integer.parseInt(gradebox.getSelectedItem().toString());
           
           try
           {
               String sql = "INSERT INTO student (sname,sage,sgrade) VALUES ('"+name+"','"+age+"','"+grade+"')";
               pst = conn.prepareStatement(sql);
               pst.execute();
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(null,e);
           }
           
    }//GEN-LAST:event_ibtnActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agebox;
    private javax.swing.JButton cbox;
    private javax.swing.JButton dbox;
    private javax.swing.JButton ebox;
    private javax.swing.JComboBox<String> gradebox;
    private javax.swing.JButton ibtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namebox;
    private javax.swing.JTextField searchbox;
    private javax.swing.JTable table1;
    private javax.swing.JButton ubox;
    // End of variables declaration//GEN-END:variables
}
