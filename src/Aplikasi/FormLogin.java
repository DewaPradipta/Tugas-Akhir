/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplikasi;
        import javax.swing.*;
        import java.sql.*;
        import javax.swing.table.*;
        import java.awt.Dimension;
        import java.awt.Toolkit;
/**
 *
 * @author Dewa Pradipta Putra
 */
public class FormLogin extends javax.swing.JFrame {
    /**
     * Creates new form FormLogin
     */
    Connection koneksi;
    public FormLogin() {
    
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(
        (screenSize.width - frameSize.width) / 2,
        (screenSize.height - frameSize.height) / 2);
    }
    
public void konekdatabase(){
try{

koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/datalogin","root","");
}
catch (Exception e)
{
System.err.println("Exception: "+e.getMessage());
}
}
public void Login(){
    try
{
    String hasil ="0";
    String sql = "Select count(*) as jml from login where username = '"+username.getText().trim()+"'"+"and password = '"+password.getText().trim()+"'";
    Statement stat = koneksi.createStatement();
    ResultSet set = stat.executeQuery(sql);
    set.next();
    hasil = set.getString("jml");
    if (Integer.valueOf(hasil)>0){
        JOptionPane.showMessageDialog(null,"Anda Berhasil Login","Peringatan",JOptionPane.WARNING_MESSAGE);
    new selamatDatang().setVisible(true);
    dispose();
    }
    else{
        JOptionPane.showMessageDialog(null,"Anda Gagal Login","Peringatan",JOptionPane.WARNING_MESSAGE);
               username.requestFocusInWindow();
               username.setText("");
               password.setText("");
    }
}
   catch (Exception e){
        System.out.println("kesalahan :"+e.toString());
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        stat = new javax.swing.JButton();
        set = new javax.swing.JButton();
        try {
            jLabel5 =(javax.swing.JLabel)java.beans.Beans.instantiate(getClass().getClassLoader(), "Aplikasi.FormLogin_jLabel5");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(313, 69, 0, 0);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SIGN IN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 20, 130, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 140, 70, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Username");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(140, 90, 70, 17);
        getContentPane().add(password);
        password.setBounds(270, 140, 160, 30);
        getContentPane().add(username);
        username.setBounds(240, 90, 160, 30);

        stat.setText("Exit");
        stat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statActionPerformed(evt);
            }
        });
        getContentPane().add(stat);
        stat.setBounds(260, 230, 90, 23);

        set.setText("Login");
        set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setActionPerformed(evt);
            }
        });
        getContentPane().add(set);
        set.setBounds(257, 190, 90, 23);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 500, 300);

        setBounds(0, 0, 516, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void statActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statActionPerformed
    
    System.exit(0);
    
// TODO add your handling code here:
    }//GEN-LAST:event_statActionPerformed

    private void setActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setActionPerformed
        konekdatabase();Login();   

// TODO add your handling code here:
    }//GEN-LAST:event_setActionPerformed

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField password;
    private javax.swing.JButton set;
    private javax.swing.JButton stat;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
 



