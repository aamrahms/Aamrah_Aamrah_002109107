/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author aamrah
 */
public class ViewallcarsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewallcarsJPanel
     */
    public ViewallcarsJPanel() {
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

        lblViewallcars = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblCompany = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblSerial = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblCertificate = new javax.swing.JLabel();
        lblSeats = new javax.swing.JLabel();
        tCompany = new javax.swing.JTextField();
        tYear = new javax.swing.JTextField();
        tSerial = new javax.swing.JTextField();
        tCity = new javax.swing.JTextField();
        tCertificate = new javax.swing.JTextField();
        tSeats = new javax.swing.JTextField();

        lblViewallcars.setText("View All Cars");
        lblViewallcars.setSize(new java.awt.Dimension(45, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Company", "Year of Make", "Serial Number", "City", "Certificate Issue Date", "Seats"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        lblCompany.setText("Company");

        lblYear.setText("Year of Make");

        lblSerial.setText("Serial Number");

        lblCity.setText("City");

        lblCertificate.setText("Certificate Issue Date");

        lblSeats.setText("Seats");

        tCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCompanyActionPerformed(evt);
            }
        });

        tYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tYearActionPerformed(evt);
            }
        });

        tSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSerialActionPerformed(evt);
            }
        });

        tCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(lblViewallcars))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblYear)
                                                .addGap(152, 152, 152))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(lblCompany)
                                                .addGap(174, 174, 174)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tCompany)
                                            .addComponent(tYear, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCity)
                                        .addGap(208, 208, 208)
                                        .addComponent(tCity))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSerial)
                                        .addGap(145, 145, 145)
                                        .addComponent(tSerial))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCertificate)
                                            .addComponent(lblSeats))
                                        .addGap(98, 98, 98)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tCertificate)
                                            .addComponent(tSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(lblViewallcars)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCompany)
                    .addComponent(tCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYear)
                    .addComponent(tYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerial)
                    .addComponent(tSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(tCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCertificate)
                    .addComponent(tCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeats)
                    .addComponent(tSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSerialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tSerialActionPerformed

    private void tCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCompanyActionPerformed

    private void tYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tYearActionPerformed

    private void tCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCertificate;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblSerial;
    private javax.swing.JLabel lblViewallcars;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField tCertificate;
    private javax.swing.JTextField tCity;
    private javax.swing.JTextField tCompany;
    private javax.swing.JTextField tSeats;
    private javax.swing.JTextField tSerial;
    private javax.swing.JTextField tYear;
    // End of variables declaration//GEN-END:variables
}
