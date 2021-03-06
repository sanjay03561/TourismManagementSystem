/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package journeyms;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Group_94
 */
public class RouteAddUI extends javax.swing.JFrame {
    private String newID;
    /**
     * Creates new form JourneyAddUI
     */
    public RouteAddUI() {
        
        initComponents();
        String currentBiggestID = CentralControl.routeList.get(CentralControl.routeList.size()-1).getID().substring(1);
        String newIDNo = String.format("%04d", Integer.parseInt(currentBiggestID)+1);
        newID = "R"+newIDNo;
        this.NewIDLabel.setText(newID);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Warning = new javax.swing.JLabel();
        NewIDLabel = new javax.swing.JLabel();
        Station1 = new javax.swing.JComboBox<>();
        Station2 = new javax.swing.JComboBox<>();
        Station3 = new javax.swing.JComboBox<>();
        Station4 = new javax.swing.JComboBox<>();
        CancelButton = new javax.swing.JButton();
        ConfirmButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add new Route");

        jLabel3.setText("No.");

        jLabel1.setText("Stations");

        Warning.setText("   ");

        NewIDLabel.setText("New ID");

        Station1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A" }));
        Station1.setSelectedIndex(-1);
        Station1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Station1ActionPerformed(evt);
            }
        });

        Station2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B" }));
        Station2.setSelectedIndex(-1);
        Station2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Station2ActionPerformed(evt);
            }
        });

        Station3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C", "D" }));
        Station3.setSelectedIndex(-1);
        Station3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Station3ActionPerformed(evt);
            }
        });

        Station4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "E" }));
        Station4.setSelectedIndex(-1);
        Station4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Station4ActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.setMaximumSize(new java.awt.Dimension(77, 25));
        CancelButton.setMinimumSize(new java.awt.Dimension(77, 25));
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        ConfirmButton.setText("Confirm");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Station1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Station2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Station3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Station4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Warning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NewIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Station1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Station2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Station3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Station4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Warning)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Add new Route");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        String currentBiggestID = CentralControl.routeList.get(CentralControl.routeList.size()-1).getID().substring(1);
        String newIDNo = String.format("%04d", Integer.parseInt(currentBiggestID)+1);
        String newID = "R"+newIDNo;
        String[] s = new String[4];
        for (int i=0;i<s.length;i++) s[i]=null;
        if (this.Station1.getSelectedIndex()!=-1)
            s[0]= this.Station1.getSelectedItem().toString();
        if (this.Station2.getSelectedIndex()!=-1)
            s[1] = this.Station2.getSelectedItem().toString();
        if (this.Station3.getSelectedIndex()!=-1)
            s[2] = this.Station3.getSelectedItem().toString();
        if (this.Station4.getSelectedIndex()!=-1)
            s[3] = this.Station4.getSelectedItem().toString();
        String stations = "";
        if (s[0]!=null&&s[1]!=null&&!(s[2]==null&&s[3]!=null))
        {
            for (int i=0;i<s.length;i++)
                if (s[i]!=null) stations+=s[i]+" ";
            System.out.println(stations);
            Route r = new Route(newID, stations,true);
            CentralControl.routeList.add(r);
            CentralControl.UI.updateRouteList();
            this.setVisible(false);
        }
        else if (s[0]==null||s[1]==null)
            JOptionPane.showMessageDialog(null,"Please select at least the first 2 stations", "Warning", JOptionPane.WARNING_MESSAGE);
            else if (s[2]==null&&s[3]!=null)
                JOptionPane.showMessageDialog(null,"Please select 3rd station", "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void Station1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Station1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Station1ActionPerformed

    private void Station2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Station2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Station2ActionPerformed

    private void Station3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Station3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Station3ActionPerformed

    private void Station4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Station4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Station4ActionPerformed

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
            java.util.logging.Logger.getLogger(RouteAddUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RouteAddUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RouteAddUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RouteAddUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RouteAddUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel NewIDLabel;
    private javax.swing.JComboBox<String> Station1;
    private javax.swing.JComboBox<String> Station2;
    private javax.swing.JComboBox<String> Station3;
    private javax.swing.JComboBox<String> Station4;
    private javax.swing.JLabel Warning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
