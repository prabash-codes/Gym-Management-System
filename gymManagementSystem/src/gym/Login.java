/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gym;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtn_Login = new javax.swing.JButton();
        jbtn_Singup = new javax.swing.JButton();
        jBtn_exit = new javax.swing.JButton();
        jbtn_Reset = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtxtusername = new javax.swing.JTextField();
        jpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setName("jframe"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 51, 153));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Log In");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 470, 140));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, 48));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 90, 40));

        jbtn_Login.setText("LogIn");
        jbtn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_LoginActionPerformed(evt);
            }
        });
        jbtn_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtn_LoginKeyPressed(evt);
            }
        });
        getContentPane().add(jbtn_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 100, 30));

        jbtn_Singup.setText("SingUp");
        jbtn_Singup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_SingupActionPerformed(evt);
            }
        });
        jbtn_Singup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtn_SingupKeyPressed(evt);
            }
        });
        getContentPane().add(jbtn_Singup, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 100, 30));

        jBtn_exit.setText("Exit");
        jBtn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_exitActionPerformed(evt);
            }
        });
        jBtn_exit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBtn_exitKeyPressed(evt);
            }
        });
        getContentPane().add(jBtn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 90, 30));

        jbtn_Reset.setText("Reset");
        jbtn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_ResetActionPerformed(evt);
            }
        });
        jbtn_Reset.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtn_ResetKeyPressed(evt);
            }
        });
        getContentPane().add(jbtn_Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym wall.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 140));

        jtxtusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtusernameFocusGained(evt);
            }
        });
        jtxtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtusernameActionPerformed(evt);
            }
        });
        jtxtusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtusernameKeyPressed(evt);
            }
        });
        getContentPane().add(jtxtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 190, 30));

        jpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpasswordKeyPressed(evt);
            }
        });
        getContentPane().add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 190, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_LoginActionPerformed
        // TODO add your handling code here:
       if(jtxtusername.getText().equals(" ")){
            JOptionPane.showMessageDialog(null, " you must enter the user name!");
        } else if( jpassword.getText().equals(" ")){
            JOptionPane.showMessageDialog(null, " you must enter the password!");
            
        } else if (jtxtusername.getText().equals("admin") && jpassword.getText().equals("123")){
            Lobby  m = new Lobby();
            this.hide();
            m.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(null, " User name and Password doesn't match!");
                    jtxtusername.setText("");
                    jpassword.setText("");
        }
    }//GEN-LAST:event_jbtn_LoginActionPerformed

    private void jBtn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_exitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,  "Are you sure you want to exit the program?","Exit Program Confirmation",JOptionPane.YES_NO_OPTION);
            if(a == JOptionPane.YES_OPTION){
                dispose();
            }
            else {
                setVisible(true);
            }
            //setVisible(true);
    }//GEN-LAST:event_jBtn_exitActionPerformed

    private void jbtn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ResetActionPerformed
        // TODO add your handling code here:
        jtxtusername.setText(" ");
        jpassword.setText(" ");
        
    }//GEN-LAST:event_jbtn_ResetActionPerformed

    private void jtxtusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtusernameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    jpassword.requestFocusInWindow(); // Set focus to textField2
                }
        
    }//GEN-LAST:event_jtxtusernameKeyPressed

    private void jtxtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtusernameActionPerformed

    private void jtxtusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtusernameFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtxtusernameFocusGained

    private void jpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpasswordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
            if(jtxtusername.getText().equals(" ")){
            JOptionPane.showMessageDialog(null, " you must enter the user name!");
        } else if( jpassword.getText().equals(" ")){
            JOptionPane.showMessageDialog(null, " you must enter the password!");
            
        } else if (jtxtusername.getText().equals("admin") && jpassword.getText().equals("123")){
            Lobby  m = new Lobby();
            this.hide();
            m.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(null, " User name and Password doesn't match!");
                    jtxtusername.setText("");
                    jpassword.setText("");
        }
            
        } else if(evt.getKeyCode()== KeyEvent.VK_UP){
            jtxtusername.requestFocus();
            
        }else if(evt.getKeyCode()== KeyEvent.VK_DOWN){
            jbtn_Login.requestFocus();
        }
    }//GEN-LAST:event_jpasswordKeyPressed

    private void jbtn_LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtn_LoginKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                  if(jtxtusername.getText().equals(" ")){
            JOptionPane.showMessageDialog(null, " you must enter the user name!");
        } else if( jpassword.getText().equals(" ")){
            JOptionPane.showMessageDialog(null, " you must enter the password!");
            
        } else if (jtxtusername.getText().equals("admin") && jpassword.getText().equals("123")){
            trainer_details m = new trainer_details();
            this.hide();
            m.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(null, " User name and Password doesn't match!");
                    jtxtusername.setText("");
                    jpassword.setText("");
        }
        } else if(evt.getKeyCode()==KeyEvent.VK_RIGHT){
            jbtn_Singup.requestFocus();
        }
    }//GEN-LAST:event_jbtn_LoginKeyPressed

    private void jbtn_SingupKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtn_SingupKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT){
            jbtn_Reset.requestFocus();
            
        }else if(evt.getKeyCode()==KeyEvent.VK_LEFT){
            jbtn_Login.requestFocus();
        } else if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
        }
    }//GEN-LAST:event_jbtn_SingupKeyPressed

    private void jbtn_SingupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_SingupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_SingupActionPerformed

    private void jbtn_ResetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtn_ResetKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
              jtxtusername.setText(" ");
              jpassword.setText(" ");
            
        } else if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
            jBtn_exit.requestFocus();
        } else if(evt.getKeyCode() == KeyEvent.VK_LEFT){
            jbtn_Singup.requestFocus();
        }
    }//GEN-LAST:event_jbtn_ResetKeyPressed

    private void jBtn_exitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBtn_exitKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
           int c = JOptionPane.showConfirmDialog(null, "are you sure you want to exit from this program", "exit confirmation", JOptionPane.YES_NO_OPTION);
            if(c == JOptionPane.YES_OPTION){
                dispose();
        }
        }else if(evt.getKeyCode()== KeyEvent.VK_LEFT){
            jbtn_Reset.requestFocus();
        }
    }//GEN-LAST:event_jBtn_exitKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbtn_Login;
    private javax.swing.JButton jbtn_Reset;
    private javax.swing.JButton jbtn_Singup;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField jtxtusername;
    // End of variables declaration//GEN-END:variables
}
