package vehler;

import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ForgotPasswordForm extends javax.swing.JFrame {
String comb;
String username;
    /**
     * Creates new form ForgotPasswordForm
     */
    public ForgotPasswordForm() {
        initComponents();
        newLabel.setVisible(false);
        confirmLabel.setVisible(false);
        newPasswordText.setVisible(false);
        confirmPasswordText.setVisible(false);
        saveButton.setVisible(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        RegisteredAsCombo = new javax.swing.JComboBox();
        jSeparator4 = new javax.swing.JSeparator();
        confirmLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        verifyButton = new javax.swing.JLabel();
        gotit = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        SignInButton = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        newLabel = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        saveButton = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        SecurityText = new javax.swing.JTextField();
        newPasswordText = new javax.swing.JPasswordField();
        confirmPasswordText = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        xpanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ypanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 51, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 153, 255));
        kGradientPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("REGISTERED AS");
        kGradientPanel1.add(jLabel3);
        jLabel3.setBounds(490, 110, 110, 19);

        RegisteredAsCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Driver", "Passenger", " " }));
        RegisteredAsCombo.setOpaque(false);
        kGradientPanel1.add(RegisteredAsCombo);
        RegisteredAsCombo.setBounds(490, 140, 110, 20);

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jSeparator4);
        jSeparator4.setBounds(490, 320, 270, 10);

        confirmLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        confirmLabel.setForeground(new java.awt.Color(204, 204, 204));
        confirmLabel.setText("CONFIRM PASSWORD");
        kGradientPanel1.add(confirmLabel);
        confirmLabel.setBounds(490, 490, 170, 19);

        LoginButton.setBackground(new java.awt.Color(0, 0, 0));
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginButtonMouseExited(evt);
            }
        });
        LoginButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("EMAIL");
        LoginButton.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));

        verifyButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        verifyButton.setForeground(new java.awt.Color(204, 204, 204));
        verifyButton.setText("Verify");
        verifyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verifyButtonMouseClicked(evt);
            }
        });
        LoginButton.add(verifyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        kGradientPanel1.add(LoginButton);
        LoginButton.setBounds(540, 350, 150, 40);

        gotit.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        gotit.setForeground(new java.awt.Color(204, 204, 204));
        gotit.setText("Got it?");
        kGradientPanel1.add(gotit);
        gotit.setBounds(910, 510, 230, 16);

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jSeparator7);
        jSeparator7.setBounds(910, 530, 150, 10);

        SignInButton.setBackground(new java.awt.Color(0, 0, 0));
        SignInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignInButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignInButtonMouseExited(evt);
            }
        });
        SignInButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("SignIn");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        SignInButton.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        kGradientPanel1.add(SignInButton);
        SignInButton.setBounds(910, 560, 140, 40);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("WHAT IS THE NAME OF YOUR ELDEST COUSIN?");
        kGradientPanel1.add(jLabel13);
        jLabel13.setBounds(490, 260, 320, 19);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jSeparator5);
        jSeparator5.setBounds(490, 170, 270, 10);

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("USERNAME");
        kGradientPanel1.add(jLabel14);
        jLabel14.setBounds(490, 190, 90, 19);

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jSeparator6);
        jSeparator6.setBounds(490, 540, 270, 10);

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jSeparator8);
        jSeparator8.setBounds(490, 240, 270, 10);

        newLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        newLabel.setForeground(new java.awt.Color(204, 204, 204));
        newLabel.setText("NEW PASSWORD");
        kGradientPanel1.add(newLabel);
        newLabel.setBounds(490, 420, 130, 19);

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.add(jSeparator9);
        jSeparator9.setBounds(490, 470, 270, 10);

        saveButton.setBackground(new java.awt.Color(0, 0, 0));
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveButtonMouseExited(evt);
            }
        });
        saveButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Save Changes");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        saveButton.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        kGradientPanel1.add(saveButton);
        saveButton.setBounds(520, 580, 200, 40);

        usernameTxt.setBackground(new java.awt.Color(0, 51, 153));
        usernameTxt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        usernameTxt.setForeground(new java.awt.Color(255, 255, 255));
        usernameTxt.setBorder(null);
        usernameTxt.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        usernameTxt.setOpaque(false);
        usernameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTxtFocusGained(evt);
            }
        });
        usernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtActionPerformed(evt);
            }
        });
        kGradientPanel1.add(usernameTxt);
        usernameTxt.setBounds(490, 210, 270, 30);

        SecurityText.setBackground(new java.awt.Color(0, 51, 153));
        SecurityText.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        SecurityText.setForeground(new java.awt.Color(255, 255, 255));
        SecurityText.setBorder(null);
        SecurityText.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        SecurityText.setOpaque(false);
        SecurityText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SecurityTextFocusGained(evt);
            }
        });
        SecurityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecurityTextActionPerformed(evt);
            }
        });
        kGradientPanel1.add(SecurityText);
        SecurityText.setBounds(490, 290, 270, 30);

        newPasswordText.setBackground(new java.awt.Color(0, 51, 153));
        newPasswordText.setForeground(new java.awt.Color(255, 255, 255));
        newPasswordText.setBorder(null);
        newPasswordText.setOpaque(false);
        newPasswordText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newPasswordTextFocusGained(evt);
            }
        });
        kGradientPanel1.add(newPasswordText);
        newPasswordText.setBounds(490, 440, 270, 30);

        confirmPasswordText.setBackground(new java.awt.Color(0, 51, 153));
        confirmPasswordText.setForeground(new java.awt.Color(255, 255, 255));
        confirmPasswordText.setBorder(null);
        confirmPasswordText.setOpaque(false);
        confirmPasswordText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmPasswordTextFocusGained(evt);
            }
        });
        kGradientPanel1.add(confirmPasswordText);
        confirmPasswordText.setBounds(490, 510, 270, 30);

        jPanel1.setOpaque(false);

        xpanel.setBackground(new java.awt.Color(0, 51, 153));
        xpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xpanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xpanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xpanelMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");

        javax.swing.GroupLayout xpanelLayout = new javax.swing.GroupLayout(xpanel);
        xpanel.setLayout(xpanelLayout);
        xpanelLayout.setHorizontalGroup(
            xpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, xpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        xpanelLayout.setVerticalGroup(
            xpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ypanel.setBackground(new java.awt.Color(0, 51, 153));
        ypanel.setForeground(new java.awt.Color(255, 255, 255));
        ypanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ypanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ypanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ypanelMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("-");

        javax.swing.GroupLayout ypanelLayout = new javax.swing.GroupLayout(ypanel);
        ypanel.setLayout(ypanelLayout);
        ypanelLayout.setHorizontalGroup(
            ypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ypanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        ypanelLayout.setVerticalGroup(
            ypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ypanelLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addComponent(ypanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(xpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        kGradientPanel1.add(jPanel1);
        jPanel1.setBounds(1240, 10, 120, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1369, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1369, 671));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SecurityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecurityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SecurityTextActionPerformed

    private void SecurityTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SecurityTextFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_SecurityTextFocusGained

    private void usernameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtActionPerformed

    private void usernameTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtFocusGained

    private void saveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseExited
        // TODO add your handling code here:
        //saveButton.setBackground(new Color(153,51,255));
    }//GEN-LAST:event_saveButtonMouseExited

    private void saveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseEntered
        // TODO add your handling code here:
        //saveButton.setBackground(new Color(204,153,255));
    }//GEN-LAST:event_saveButtonMouseEntered

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        // TODO add your handling code here:
        if(comb.equals("Driver"))
        {
            DriverCar dc=new DriverCar();
            String newPassword=newPasswordText.getText();
            String confirmPassword=confirmPasswordText.getText();
            if(newPassword.equals(confirmPassword))
            {
                JOptionPane.showMessageDialog(null,"Your both passwords matched");
                dc.changePassword(username,newPassword);
                usernameTxt.setText("");
                SecurityText.setText("");
                newPasswordText.setText("");
                confirmPasswordText.setText("");

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Your passwords didn't matched");
                newPasswordText.setText("");
                confirmPasswordText.setText("");

            }
        }
        else if(comb.equals("Passenger"))
        {

            Passenger dc=new Passenger();
            String newPassword=newPasswordText.getText();
            String confirmPassword=confirmPasswordText.getText();
            if(newPassword.equals(confirmPassword))
            {
                JOptionPane.showMessageDialog(null,"Your both passwords matched");
                dc.changePassword(username,newPassword);
                usernameTxt.setText("");
                SecurityText.setText("");
                newPasswordText.setText("");
                confirmPasswordText.setText("");

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Your passwords didn't matched");
                newPasswordText.setText("");
                confirmPasswordText.setText("");

            }
        }
    }//GEN-LAST:event_saveButtonMouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseClicked

    private void SignInButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInButtonMouseExited
        // TODO add your handling code here:
        //SignInButton.setBackground(new Color(153,51,255));
    }//GEN-LAST:event_SignInButtonMouseExited

    private void SignInButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInButtonMouseEntered
        // TODO add your handling code here:
        //SignInButton.setBackground(new Color(204,153,255));
    }//GEN-LAST:event_SignInButtonMouseEntered

    private void SignInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInButtonMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        LoginMain reg=new LoginMain();
        reg.setVisible(true);
    }//GEN-LAST:event_SignInButtonMouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseClicked

    private void LoginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseExited
        // TODO add your handling code here:
        //LoginButton.setBackground(new Color(153,51,255));
    }//GEN-LAST:event_LoginButtonMouseExited

    private void LoginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseEntered
        // TODO add your handling code here:
        //LoginButton.setBackground(new Color(204,153,255));
    }//GEN-LAST:event_LoginButtonMouseEntered

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
        // TODO add your handling code here:

        comb=String.valueOf(RegisteredAsCombo.getSelectedItem());
        username=usernameTxt.getText();
        String sec=SecurityText.getText();

        
        if(comb=="Passenger")
        {
            Passenger d=new Passenger();
            if(d.verifySecurityQ(username, sec))
            {
                JOptionPane.showMessageDialog(null, "Your Security Answer Was Correct ");
                newLabel.setVisible(true);
                confirmLabel.setVisible(true);
                newPasswordText.setVisible(true);
                confirmPasswordText.setVisible(true);
                saveButton.setVisible(true);
                gotit.setVisible(true);
                SignInButton.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Your Security Answer Was Wrong ");
                usernameTxt.setText("");
                SecurityText.setText("");

            }
        }
        else if(comb=="Driver")
        {
            DriverCar d=new DriverCar();
            if(d.verifySecurityQ(username, sec))
            {
                JOptionPane.showMessageDialog(null, "Your Security Answer Was Correct ");
                newLabel.setVisible(true);
                confirmLabel.setVisible(true);
                newPasswordText.setVisible(true);
                confirmPasswordText.setVisible(true);
                saveButton.setVisible(true);
                gotit.setVisible(true);
                SignInButton.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Your Security Answer Was Wrong ");
                usernameTxt.setText("");
                SecurityText.setText("");

            }

        }

    }//GEN-LAST:event_LoginButtonMouseClicked

    private void verifyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifyButtonMouseClicked
        // TODO add your handling code here:
        LoginButton.action(null,null);
    }//GEN-LAST:event_verifyButtonMouseClicked

    private void newPasswordTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newPasswordTextFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_newPasswordTextFocusGained

    private void confirmPasswordTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasswordTextFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_confirmPasswordTextFocusGained

    private void xpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xpanelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_xpanelMouseClicked

    private void xpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xpanelMouseEntered
        // TODO add your handling code here:
        //xpanel.setBackground(new Color(153,51,255));
    }//GEN-LAST:event_xpanelMouseEntered

    private void xpanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xpanelMouseExited
        // TODO add your handling code here:
        //xpanel.setBackground(new Color(0,51,153));
    }//GEN-LAST:event_xpanelMouseExited

    private void ypanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ypanelMouseClicked
        // TODO add your handling code here:
        setState(ForgotPasswordForm.ICONIFIED);
    }//GEN-LAST:event_ypanelMouseClicked

    private void ypanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ypanelMouseEntered
        // TODO add your handling code here:
        //ypanel.setBackground(new Color(153,51,255));
    }//GEN-LAST:event_ypanelMouseEntered

    private void ypanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ypanelMouseExited
        // TODO add your handling code here:
        //ypanel.setBackground(new Color(0,51,153));
    }//GEN-LAST:event_ypanelMouseExited

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
            java.util.logging.Logger.getLogger(ForgotPasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPasswordForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginButton;
    private javax.swing.JComboBox RegisteredAsCombo;
    private javax.swing.JTextField SecurityText;
    private javax.swing.JPanel SignInButton;
    private javax.swing.JLabel confirmLabel;
    private javax.swing.JPasswordField confirmPasswordText;
    private javax.swing.JLabel gotit;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel newLabel;
    private javax.swing.JPasswordField newPasswordText;
    private javax.swing.JPanel saveButton;
    private javax.swing.JTextField usernameTxt;
    private javax.swing.JLabel verifyButton;
    private javax.swing.JPanel xpanel;
    private javax.swing.JPanel ypanel;
    // End of variables declaration//GEN-END:variables
}
