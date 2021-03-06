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
 * @author XiaojieZha
 */
public class JourneyAddUI extends javax.swing.JFrame {
    DefaultListModel DriverListModel, TrainListModel, RouteListModel, StartTimeListModel;
    /**
     * Creates new form JourneyAddUI
     */
    public JourneyAddUI() {
        DriverListModel = new DefaultListModel();
        if (CentralControl.driverList.size()!=0)
        {
            for (int i=0;i<CentralControl.driverList.size();i++)
            {
                if(CentralControl.driverList.get(i).getAvailability()==true) // Show only the available ones
                    DriverListModel.addElement(CentralControl.driverList.get(i).getID());
            }
        }
        TrainListModel = new DefaultListModel();
        if (CentralControl.trainList.size()!=0)
        {
            for (int i=0;i<CentralControl.trainList.size();i++)
            {
                if (CentralControl.trainList.get(i).getAvailability()==true) // Show only the available ones
                    TrainListModel.addElement(CentralControl.trainList.get(i).getID());
            }
        }
        RouteListModel = new DefaultListModel();
        if (CentralControl.routeList.size()!=0)
        {
            for (int i=0;i<CentralControl.routeList.size();i++)
            {
                RouteListModel.addElement(CentralControl.routeList.get(i).getID()+" "+CentralControl.routeList.get(i).getRoutesInString());
            }
        }
        StartTimeListModel = new DefaultListModel();
        for (int i=0;i<20;i++)
        {
                int hour = 8+(int)Math.floor(i/2);
                if (i%2==0)StartTimeListModel.addElement(hour+":00");
                else StartTimeListModel.addElement(hour+":30");  
        }
        
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

        jScrollPane7 = new javax.swing.JScrollPane();
        RouteList = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        StartTimeList = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        DriverList = new javax.swing.JList<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        TrainsList4 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ConfirmButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        Warning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add new Journey");

        RouteList.setModel(RouteListModel);
        RouteList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                RouteListValueChanged(evt);
            }
        });
        jScrollPane7.setViewportView(RouteList);

        StartTimeList.setModel(StartTimeListModel);
        StartTimeList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                StartTimeListValueChanged(evt);
            }
        });
        jScrollPane8.setViewportView(StartTimeList);

        DriverList.setModel(DriverListModel);
        DriverList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                DriverListValueChanged(evt);
            }
        });
        jScrollPane9.setViewportView(DriverList);

        TrainsList4.setModel(TrainListModel);
        TrainsList4.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                TrainsList4ValueChanged(evt);
            }
        });
        jScrollPane10.setViewportView(TrainsList4);

        jLabel3.setText("Available Trains List");

        jLabel4.setText("Available Route List");

        jLabel1.setText("Available Drivers List");

        jLabel2.setText("Start time");

        ConfirmButton.setText("Confirm");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
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

        Warning.setText("   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(Warning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmButton)
                    .addComponent(Warning))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RouteListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_RouteListValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_RouteListValueChanged

    private void StartTimeListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_StartTimeListValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_StartTimeListValueChanged

    private void DriverListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_DriverListValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_DriverListValueChanged

    private void TrainsList4ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_TrainsList4ValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TrainsList4ValueChanged

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        int trainIndex = this.TrainsList4.getSelectedIndex();
        int driverIndex = this.DriverList.getSelectedIndex();
        int routeIndex = this.RouteList.getSelectedIndex();
        int timeIndex = this.StartTimeList.getSelectedIndex();
        if ((trainIndex!=-1) && (driverIndex!=-1)&&(routeIndex!=-1)&&(timeIndex!=-1))
        {
            ///Set new Journey ID
            String currentBiggestID = CentralControl.journeyList.get(CentralControl.journeyList.size()-1).getID().substring(1);
           // System.out.println(currentBiggestID);
            String newIDNo = String.format("%04d", Integer.parseInt(currentBiggestID)+1);
            String newID = "J"+newIDNo;
            ///Set train, driver, route
            Train t=null; Driver d=null; Route r=null; VirtualTime vt;
            for (int i=0;i<CentralControl.trainList.size();i++)
            {
                if (CentralControl.trainList.get(i).getID().equals(this.TrainsList4.getSelectedValue())) t = CentralControl.trainList.get(i);
            }
            for (int i=0;i<CentralControl.driverList.size();i++)
            {
                if (CentralControl.driverList.get(i).getID().equals(this.DriverList.getSelectedValue())) d =  CentralControl.driverList.get(i);
            }
            for (int i=0;i<CentralControl.routeList.size();i++)
            {
                System.out.println(this.RouteList.getSelectedValue().substring(0,4));
                if (CentralControl.routeList.get(i).getID().equals(this.RouteList.getSelectedValue().substring(0,5))) r  =  CentralControl.routeList.get(i);
            }
            vt = new VirtualTime(this.StartTimeList.getSelectedValue());
            Journey j = new Journey(newID, t, d, r, vt);
            CentralControl.journeyList.add(j);
            CentralControl.UI.updateJourneyList();
           // CentralControl.UI.JourneyListModel.addElement(newID);
            //CentralControl.UI.JourneyInfo.setText("Hi");
            //CentralControl.UI.revalidate();
            this.setVisible(false);
        }
        else JOptionPane.showMessageDialog(null, 
                "Please select one content in each list.", "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_CancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(JourneyAddUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JourneyAddUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JourneyAddUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JourneyAddUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JourneyAddUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton ConfirmButton;
    public javax.swing.JList<String> DriverList;
    public javax.swing.JList<String> RouteList;
    public javax.swing.JList<String> StartTimeList;
    public javax.swing.JList<String> TrainsList4;
    private javax.swing.JLabel Warning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables
}
