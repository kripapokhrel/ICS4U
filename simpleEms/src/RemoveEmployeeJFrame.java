/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah and Kripa
 */
public class RemoveEmployeeJFrame extends javax.swing.JFrame {

    /**
     * Creates new form RemoveEmployeeJFrame
     */
    
    private MyHashTable mainHT;  // This contains the ref value for theHT of MainJFrame.
    
    public void setMainHT(MyHashTable refvalForHT) {
        mainHT = refvalForHT;
    } 

    
    public RemoveEmployeeJFrame() {
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

        REMOVEtitle = new javax.swing.JLabel();
        instructLabel = new javax.swing.JLabel();
        EmpNumLabel = new javax.swing.JLabel();
        EmployeeNumField = new javax.swing.JTextField();
        CANCELbutton = new javax.swing.JButton();
        REMOVEbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Remove Employee");
        setResizable(false);

        REMOVEtitle.setFont(new java.awt.Font("URW Gothic L", 1, 25)); // NOI18N
        REMOVEtitle.setForeground(new java.awt.Color(0, 0, 0));
        REMOVEtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        REMOVEtitle.setText("REMOVE AN EMPLOYEE");
        REMOVEtitle.setToolTipText("");
        REMOVEtitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        REMOVEtitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        instructLabel.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        instructLabel.setText("To remove an employee, please enter a valid employee number:");

        EmpNumLabel.setFont(new java.awt.Font("URW Gothic L", 1, 20)); // NOI18N
        EmpNumLabel.setText("Employee Number: ");

        EmployeeNumField.setFont(new java.awt.Font("URW Gothic L", 0, 20)); // NOI18N
        EmployeeNumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeNumFieldActionPerformed(evt);
            }
        });

        CANCELbutton.setBackground(new java.awt.Color(230, 62, 62));
        CANCELbutton.setFont(new java.awt.Font("URW Gothic L", 1, 20)); // NOI18N
        CANCELbutton.setText("CANCEL");
        CANCELbutton.setToolTipText("Click to CANCEL the removal");
        CANCELbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CANCELbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELbuttonActionPerformed(evt);
            }
        });

        REMOVEbutton.setBackground(new java.awt.Color(26, 184, 68));
        REMOVEbutton.setFont(new java.awt.Font("URW Gothic L", 1, 20)); // NOI18N
        REMOVEbutton.setText("REMOVE");
        REMOVEbutton.setToolTipText("Click to remove this employee from the hashtable");
        REMOVEbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        REMOVEbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REMOVEbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(REMOVEtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmpNumLabel)
                    .addComponent(EmployeeNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(REMOVEbutton)
                        .addGap(18, 18, 18)
                        .addComponent(CANCELbutton))
                    .addComponent(instructLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(REMOVEtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instructLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EmpNumLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmployeeNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REMOVEbutton)
                    .addComponent(CANCELbutton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmployeeNumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeNumFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeNumFieldActionPerformed

    private void CANCELbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELbuttonActionPerformed
        // TODO add your handling code here:
        
        super.dispose();
    }//GEN-LAST:event_CANCELbuttonActionPerformed

    private void REMOVEbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REMOVEbuttonActionPerformed
        // TODO add your handling code here:
        
        String empNum = EmployeeNumField.getText();
        int empVal = Integer.parseInt(empNum);
      
        int positionInArrayList = mainHT.searchByEmployeeNumber(empVal);

        if( positionInArrayList < 0 ){
        NonExistJFrame openNewWindow5 = new NonExistJFrame();
        openNewWindow5.setVisible(true);
        }        
        
        else{
        mainHT.removeEmployee(empVal);
        EmployeeRemoved EMP = new EmployeeRemoved();
        EMP.show();
        }
        
        this.dispose();
    }//GEN-LAST:event_REMOVEbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployeeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveEmployeeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CANCELbutton;
    private javax.swing.JLabel EmpNumLabel;
    private javax.swing.JTextField EmployeeNumField;
    private javax.swing.JButton REMOVEbutton;
    private javax.swing.JLabel REMOVEtitle;
    private javax.swing.JLabel instructLabel;
    // End of variables declaration//GEN-END:variables
}
