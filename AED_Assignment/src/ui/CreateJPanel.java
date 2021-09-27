/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;
import java.awt.Image;
import model.Product;
import java.util.Set;
import java.util.regex.*;
import java.util.regex.Matcher;
import javax.swing.ImageIcon;
import java.io.File;


/**
 *
 * @author Shahla
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    Product product;
    public CreateJPanel(Product product) {
        initComponents();
        this.product = product;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblLicenseNum = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblVehicleNum = new javax.swing.JLabel();
        txtLicenseNum = new javax.swing.JTextField();
        txtGeoData = new javax.swing.JTextField();
        lblDevSerialNum = new javax.swing.JLabel();
        txtIPAdd = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        lblBioId = new javax.swing.JLabel();
        txtDevSerialNum = new javax.swing.JTextField();
        txtTeleNum = new javax.swing.JTextField();
        lblImages = new javax.swing.JLabel();
        lblLinkedIn = new javax.swing.JLabel();
        txtLinkedIn = new javax.swing.JTextField();
        txtVehicleNum = new javax.swing.JTextField();
        lblIPAdd = new javax.swing.JLabel();
        txtBioId = new javax.swing.JTextField();
        lblUIN = new javax.swing.JLabel();
        txtImages = new javax.swing.JTextField();
        lblgeoData = new javax.swing.JLabel();
        txtUIN = new javax.swing.JTextField();
        lbldob = new javax.swing.JLabel();
        txtFaxNum = new javax.swing.JTextField();
        lbllTeleNum = new javax.swing.JLabel();
        txtEmailAdd = new javax.swing.JTextField();
        lbllFaxNum = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        lblEmailAdd = new javax.swing.JLabel();
        txtMRN = new javax.swing.JTextField();
        txtHealthPlanNum = new javax.swing.JTextField();
        lblSsn = new javax.swing.JLabel();
        lblMedicalRNum = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtBankAccNum = new javax.swing.JTextField();
        lblHealthPlanNum = new javax.swing.JLabel();
        lblBankAccNum = new javax.swing.JLabel();
        errTeleNum = new javax.swing.JLabel();
        errZipCode = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Profile");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblLicenseNum.setText("Certificate/License Number: ");

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        lblVehicleNum.setText("Vehicle Number:");

        txtGeoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeoDataActionPerformed(evt);
            }
        });

        lblDevSerialNum.setText("Device Serial Number:");

        lblBioId.setText("Biometeric Identifier:");

        txtTeleNum.setToolTipText("");
        txtTeleNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTeleNumKeyReleased(evt);
            }
        });

        lblImages.setText("Face Photos and Comparable Images:");

        lblLinkedIn.setText("LinkedIn:");

        lblIPAdd.setText("IP Address:");

        lblUIN.setText("Unique Identifying Number:");

        txtImages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImagesActionPerformed(evt);
            }
        });

        lblgeoData.setText("Geographic Data :");

        txtUIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUINActionPerformed(evt);
            }
        });

        lbldob.setText("Date of Birth:");

        txtFaxNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaxNumActionPerformed(evt);
            }
        });

        lbllTeleNum.setText("Telephone Number:");

        lbllFaxNum.setText("FAX Number:");

        lblEmailAdd.setText("Email Address:");

        txtHealthPlanNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHealthPlanNumActionPerformed(evt);
            }
        });

        lblSsn.setText("Social Security Number:");

        lblMedicalRNum.setText("Medical Record Number:");

        lblName.setText("Name:");

        txtBankAccNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBankAccNumActionPerformed(evt);
            }
        });

        lblHealthPlanNum.setText("Health Plan Beneficiary Number:");

        lblBankAccNum.setText("Bank Account Numbers:");

        errTeleNum.setForeground(new java.awt.Color(204, 51, 0));

        errZipCode.setForeground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLicenseNum)
                    .addComponent(lblBankAccNum)
                    .addComponent(lblHealthPlanNum)
                    .addComponent(lblMedicalRNum)
                    .addComponent(lblSsn)
                    .addComponent(lblEmailAdd)
                    .addComponent(lbllFaxNum)
                    .addComponent(lbllTeleNum)
                    .addComponent(lbldob)
                    .addComponent(lblgeoData)
                    .addComponent(lblName)
                    .addComponent(lblIPAdd)
                    .addComponent(lblDevSerialNum)
                    .addComponent(lblLinkedIn)
                    .addComponent(lblVehicleNum)
                    .addComponent(lblBioId)
                    .addComponent(lblImages)
                    .addComponent(lblUIN))
                .addGap(143, 143, 143)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFaxNum)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(txtGeoData, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(txtDOB, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(txtTeleNum, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(txtEmailAdd)
                    .addComponent(txtSSN)
                    .addComponent(txtMRN)
                    .addComponent(txtHealthPlanNum)
                    .addComponent(txtBankAccNum)
                    .addComponent(txtLicenseNum)
                    .addComponent(txtIPAdd)
                    .addComponent(txtDevSerialNum)
                    .addComponent(txtLinkedIn)
                    .addComponent(txtVehicleNum)
                    .addComponent(txtBioId)
                    .addComponent(txtImages)
                    .addComponent(txtUIN))
                .addGap(18, 18, 18)
                .addComponent(errZipCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errTeleNum)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblgeoData)
                    .addComponent(txtGeoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errZipCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldob)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbllTeleNum)
                    .addComponent(txtTeleNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errTeleNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbllFaxNum)
                    .addComponent(txtFaxNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmailAdd)
                    .addComponent(txtEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSsn)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMedicalRNum)
                    .addComponent(txtMRN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHealthPlanNum)
                    .addComponent(txtHealthPlanNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBankAccNum)
                    .addComponent(txtBankAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLicenseNum)
                    .addComponent(txtLicenseNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIPAdd)
                    .addComponent(txtIPAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDevSerialNum)
                    .addComponent(txtDevSerialNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLinkedIn)
                    .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVehicleNum)
                    .addComponent(txtVehicleNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBioId)
                    .addComponent(txtBioId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImages)
                    .addComponent(txtImages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUIN, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(625, 625, 625))
            .addGroup(layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 598, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(69, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
         product.setName(txtName.getText());
         product.setName(txtGeoData.getText());
         product.setName(txtDOB.getText());
         product.setName(txtTeleNum.getText());
         
         JOptionPane.showMessageDialog(this, "Product Information Saved.");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtGeoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeoDataActionPerformed

    private void txtImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImagesActionPerformed

    private void txtUINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUINActionPerformed

    private void txtFaxNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaxNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaxNumActionPerformed

    private void txtHealthPlanNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHealthPlanNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHealthPlanNumActionPerformed

    private void txtBankAccNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBankAccNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBankAccNumActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        
        
        
        
        
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtTeleNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeleNumKeyReleased
        // TODO add your handling code here:
        
        // TODO add your handling code here:
        String strTeleNum ="[1-9][0-9]{9}";
        Pattern p1 = Pattern.compile(strTeleNum);
        Matcher m = p1.matcher(txtTeleNum.getText());
        if(!m.matches()){
            errTeleNum.setText("Please enter 10 digit valid phone number.");
        }
        else{
            errTeleNum.setText(null);
        }
        
        
         // TODO add your handling code here:
        String strZipCode ="[0-9]{5}";
        Pattern p2 = Pattern.compile(strZipCode);
        Matcher m2 = p2.matcher(txtGeoData.getText());
        if(!m2.matches()){
            errZipCode.setText("Please enter 5 digit valid Zip Code.");
        }
        else{
            errZipCode.setText(null);
        }
    }//GEN-LAST:event_txtTeleNumKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel errTeleNum;
    private javax.swing.JLabel errZipCode;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBankAccNum;
    private javax.swing.JLabel lblBioId;
    private javax.swing.JLabel lblDevSerialNum;
    private javax.swing.JLabel lblEmailAdd;
    private javax.swing.JLabel lblHealthPlanNum;
    private javax.swing.JLabel lblIPAdd;
    private javax.swing.JLabel lblImages;
    private javax.swing.JLabel lblLicenseNum;
    private javax.swing.JLabel lblLinkedIn;
    private javax.swing.JLabel lblMedicalRNum;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUIN;
    private javax.swing.JLabel lblVehicleNum;
    private javax.swing.JLabel lbldob;
    private javax.swing.JLabel lblgeoData;
    private javax.swing.JLabel lbllFaxNum;
    private javax.swing.JLabel lbllTeleNum;
    private javax.swing.JTextField txtBankAccNum;
    private javax.swing.JTextField txtBioId;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtDevSerialNum;
    private javax.swing.JTextField txtEmailAdd;
    private javax.swing.JTextField txtFaxNum;
    private javax.swing.JTextField txtGeoData;
    private javax.swing.JTextField txtHealthPlanNum;
    private javax.swing.JTextField txtIPAdd;
    private javax.swing.JTextField txtImages;
    private javax.swing.JTextField txtLicenseNum;
    private javax.swing.JTextField txtLinkedIn;
    private javax.swing.JTextField txtMRN;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtTeleNum;
    private javax.swing.JTextField txtUIN;
    private javax.swing.JTextField txtVehicleNum;
    // End of variables declaration//GEN-END:variables
}