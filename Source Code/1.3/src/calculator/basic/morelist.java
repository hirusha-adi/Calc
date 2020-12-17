package calculator.basic;

import javax.swing.JFrame;


public class morelist extends javax.swing.JFrame {


    public morelist() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CetoFh = new javax.swing.JButton();
        back = new javax.swing.JButton();
        CetoFh1 = new javax.swing.JButton();
        KMtoMiles = new javax.swing.JButton();
        KMtoMiles1 = new javax.swing.JButton();
        KMtoMiles2 = new javax.swing.JButton();
        btnAboutUs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MORE");

        CetoFh.setBackground(new java.awt.Color(255, 153, 0));
        CetoFh.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        CetoFh.setForeground(new java.awt.Color(255, 255, 255));
        CetoFh.setText("Celcius - Fahrenheit");
        CetoFh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CetoFhActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(255, 153, 0));
        back.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Main Menu");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        CetoFh1.setBackground(new java.awt.Color(255, 153, 0));
        CetoFh1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        CetoFh1.setForeground(new java.awt.Color(255, 255, 255));
        CetoFh1.setText("Fahrenheit to Celcius");
        CetoFh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CetoFh1ActionPerformed(evt);
            }
        });

        KMtoMiles.setBackground(new java.awt.Color(255, 153, 0));
        KMtoMiles.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        KMtoMiles.setForeground(new java.awt.Color(255, 255, 255));
        KMtoMiles.setText("KM to Miles");
        KMtoMiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KMtoMilesActionPerformed(evt);
            }
        });

        KMtoMiles1.setBackground(new java.awt.Color(255, 153, 0));
        KMtoMiles1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        KMtoMiles1.setForeground(new java.awt.Color(255, 255, 255));
        KMtoMiles1.setText("Miles to KM");
        KMtoMiles1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KMtoMiles1ActionPerformed(evt);
            }
        });

        KMtoMiles2.setBackground(new java.awt.Color(255, 153, 0));
        KMtoMiles2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        KMtoMiles2.setForeground(new java.awt.Color(255, 255, 255));
        KMtoMiles2.setText("Force - Lever");
        KMtoMiles2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KMtoMiles2ActionPerformed(evt);
            }
        });

        btnAboutUs.setBackground(new java.awt.Color(255, 153, 0));
        btnAboutUs.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnAboutUs.setForeground(new java.awt.Color(255, 255, 255));
        btnAboutUs.setText("About Us");
        btnAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel1)
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CetoFh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CetoFh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KMtoMiles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KMtoMiles1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KMtoMiles2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAboutUs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CetoFh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CetoFh1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KMtoMiles, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KMtoMiles1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KMtoMiles2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(btnAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        
        dispose();
        calcgui al = new calcgui();
        //obj.setBounds(0, 0, 326, 408);
        al.setTitle("Calculator 1.3");
        al.setVisible(true);
        al.setResizable(false);
        //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_backActionPerformed

    private void CetoFhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CetoFhActionPerformed
        
        dispose();
        celTOfh al = new celTOfh();
        //obj.setBounds(0, 0, 326, 408);
        al.setTitle("Celcius to Fahrenheit");
        al.setVisible(true);
        al.setResizable(false);
        //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_CetoFhActionPerformed

    private void CetoFh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CetoFh1ActionPerformed
        
        dispose();
        fhTOcel al = new fhTOcel();
        al.setTitle("Fahrenheit to Celcius");
        al.setVisible(true);
        al.setResizable(false);
        
    }//GEN-LAST:event_CetoFh1ActionPerformed

    private void KMtoMilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KMtoMilesActionPerformed
        
        dispose();
        kmTOm ul = new kmTOm();
        ul.setTitle("KM to Miles");
        ul.setVisible(true);
        ul.setResizable(false);
        
    }//GEN-LAST:event_KMtoMilesActionPerformed

    private void KMtoMiles1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KMtoMiles1ActionPerformed
        
        dispose();
        mTOkm boi = new mTOkm();
        boi.setTitle("Miles to KM");
        boi.setVisible(true);
        boi.setResizable(false);
        
    }//GEN-LAST:event_KMtoMiles1ActionPerformed

    private void KMtoMiles2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KMtoMiles2ActionPerformed
        
        dispose();
        science1 meow = new science1();
        meow.setTitle("Force - Lever");
        meow.setVisible(true);
        meow.setResizable(false);
        
    }//GEN-LAST:event_KMtoMiles2ActionPerformed

    private void btnAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUsActionPerformed
        
        dispose();
        abtus il = new abtus();
        il.setTitle("About Us");
        il.setVisible(true);
        il.setResizable(false);
        
    }//GEN-LAST:event_btnAboutUsActionPerformed

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
            java.util.logging.Logger.getLogger(morelist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(morelist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(morelist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(morelist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new morelist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CetoFh;
    private javax.swing.JButton CetoFh1;
    private javax.swing.JButton KMtoMiles;
    private javax.swing.JButton KMtoMiles1;
    private javax.swing.JButton KMtoMiles2;
    private javax.swing.JButton back;
    private javax.swing.JButton btnAboutUs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
