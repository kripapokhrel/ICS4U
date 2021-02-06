/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah and Kripa
 */
public class GetInfo extends javax.swing.JFrame {

    /**
     * Creates new form GetInfo
     */
    
     private MyHashTable mainHT;  // This contains the ref value for theHT of MainJFrame.
    
    public void setMainHT(MyHashTable refvalForHT) {
        mainHT = refvalForHT;
    } 

    
    public GetInfo() {
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

        GETINFOtitle = new javax.swing.JLabel();
        instructLabel = new javax.swing.JLabel();
        EmpNumLabel = new javax.swing.JLabel();
        EmployeeNumField = new javax.swing.JTextField();
        GETbutton = new javax.swing.JButton();
        CLOSEbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Get Info/Search Employee");
        setResizable(false);

        GETINFOtitle.setFont(new java.awt.Font("URW Gothic L", 1, 25)); // NOI18N
        GETINFOtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GETINFOtitle.setText("SEARCH/GET INFO ON EMPLOYEE");
        GETINFOtitle.setToolTipText("");
        GETINFOtitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        GETINFOtitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        instructLabel.setFont(new java.awt.Font("URW Gothic L", 1, 22)); // NOI18N
        instructLabel.setForeground(new java.awt.Color(199, 0, 0));
        instructLabel.setText("To get info on an existing employee, please enter a valid employee number:");

        EmpNumLabel.setFont(new java.awt.Font("URW Gothic L", 1, 20)); // NOI18N
        EmpNumLabel.setText("Employee Number: ");

        EmployeeNumField.setFont(new java.awt.Font("URW Gothic L", 0, 20)); // NOI18N
        EmployeeNumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeNumFieldActionPerformed(evt);
            }
        });

        GETbutton.setBackground(new java.awt.Color(26, 184, 68));
        GETbutton.setFont(new java.awt.Font("URW Gothic L", 1, 22)); // NOI18N
        GETbutton.setText("GET INFO");
        GETbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GETbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GETbuttonActionPerformed(evt);
            }
        });

        CLOSEbutton.setBackground(new java.awt.Color(230, 62, 62));
        CLOSEbutton.setFont(new java.awt.Font("URW Gothic L", 1, 22)); // NOI18N
        CLOSEbutton.setText("CLOSE");
        CLOSEbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CLOSEbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEbuttonActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(219, 247, 247));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("URW Gothic L", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("URW Gothic L", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Here is the employee's info:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(instructLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmpNumLabel)
                            .addComponent(EmployeeNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(GETbutton)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GETINFOtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(CLOSEbutton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane1)))
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GETINFOtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instructLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EmpNumLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmployeeNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GETbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CLOSEbutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmployeeNumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeNumFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeNumFieldActionPerformed

    private void GETbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GETbuttonActionPerformed
        // TODO add your handling code here:

        String empNum = EmployeeNumField.getText();
        int empVal = Integer.parseInt(empNum);

        int positionInArrayList = mainHT.searchByEmployeeNumber(empVal);

        if( positionInArrayList < 0 ){
           
            jTextArea1.setText("THIS EMPLOYEE DOESN'T EXIST, please try again and enter a valid employee number");
            
        }
    
    
        else{
        int numInHT = mainHT.getNumInHashTable();
        int targetBucket = mainHT.calcBucket(empVal);
            for (int j = 0; j < mainHT.buckets[targetBucket].size(); j++){
                if (empVal == mainHT.buckets[targetBucket].get(j).getEmpNum()){
            
            EmployeeInfo theEmp = mainHT.buckets[targetBucket].get(j);
        String thePerson = "";
            if (theEmp instanceof FTE) {
                FTE theFTE = (FTE) theEmp;
                 thePerson = ("Employee Type: Full Time" +/* "\n" + Integer.toString(theEmp.getEmpNum()) +", "+ theEmp.getFirstName() + ", " +  theEmp.getLastName() + */"\n" + "  Employee number: " + Integer.toString(theEmp.getEmpNum()) + "\n" + "  Full Name (First, Last): " + theEmp.getFirstName() + " " + theEmp.getLastName() + "\n" + "    This employee has yearly salary: $" + Double.toString(theFTE.yearlySalary) + "\n" + "      This employee has Net Annual Income: $ " + ((1.0 - ((FTE) theEmp).deductRate) * ((FTE) theEmp).yearlySalary) + "\n" );
            }
            if (theEmp instanceof PTE) {
                PTE thePTE = (PTE) theEmp;
                 thePerson = ("Employee Type: Part Time" + /* "\n" + Integer.toString(theEmp.getEmpNum()) +", "+ theEmp.getFirstName() + ", " +  theEmp.getLastName() + */"\n" + "  Employee number: " + Integer.toString(theEmp.getEmpNum()) + "\n" + "  Full Name (First, Last): " + theEmp.getFirstName() + " " + theEmp.getLastName() + "\n" + "    This employee has hourly wage: $" + Double.toString(thePTE.hourlyWage) + "\n" + "    This employee has hours per week: " + Double.toString(thePTE.hoursPerWeek) + "\n" + "    This employee has weeks per year: " + Double.toString(thePTE.weeksPerYear) + "\n" + "      This employee has Net Annual Income: $ " + (1.0 - ((PTE) theEmp).deductRate) * ((PTE) theEmp).hourlyWage * ((PTE) theEmp).hoursPerWeek * ((PTE) theEmp).weeksPerYear + "\n");
            }
            
            jTextArea1.setText(thePerson);
            
            }
        }
    }
        
    
        

        
    }//GEN-LAST:event_GETbuttonActionPerformed

    private void CLOSEbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEbuttonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CLOSEbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(GetInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLOSEbutton;
    private javax.swing.JLabel EmpNumLabel;
    private javax.swing.JTextField EmployeeNumField;
    private javax.swing.JLabel GETINFOtitle;
    private javax.swing.JButton GETbutton;
    private javax.swing.JLabel instructLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
