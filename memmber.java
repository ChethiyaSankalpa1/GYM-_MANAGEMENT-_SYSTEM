package GYM;

import conn.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;

public final class memmber extends javax.swing.JFrame {

    private int selectedMemberId;

    public memmber() {
        initComponents();
        load_trainner();
        refreshTable();

    }

    public void load_trainner() {
        try (Connection con = DBconnect.getCon(); PreparedStatement pst = con.prepareStatement("SELECT DISTINCT name FROM trainers"); ResultSet rs = pst.executeQuery()) {

            Tbox.removeAllItems();
            while (rs.next()) {
                Tbox.addItem(rs.getString("name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error loading trainers: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void refreshTable() {
        try (Connection con = DBconnect.getCon(); PreparedStatement pst = con.prepareStatement("SELECT * FROM members")) {

            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0); // Clear existing rows from the table

            // Iterate through result set and add data to the table
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getString("birth_date"),
                    rs.getString("mobile"),
                    rs.getString("address"),
                    rs.getString("gender"),
                    rs.getString("join_date")
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        txtMobile = new javax.swing.JTextField();
        Gbox = new javax.swing.JComboBox<>();
        txtAddress = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        Tbox = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("First Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 49, 90, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Last Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 98, 100, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Date Of Birth");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 135, 100, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Mobile");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 175, 100, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 215, 100, -1));

        Address.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Address.setText("Address");
        jPanel1.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 255, 100, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Start Date");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 100, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Trainner");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 335, 90, -1));

        txtFname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 46, 201, -1));

        txtLname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(txtLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 95, 201, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 135, 201, -1));

        txtMobile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 175, 201, -1));

        Gbox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Gbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(Gbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 215, 120, -1));

        txtAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 255, 200, -1));
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 295, 201, -1));

        Tbox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Tbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        Tbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TboxActionPerformed(evt);
            }
        });
        jPanel1.add(Tbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 335, 119, -1));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 400, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 400, -1, -1));

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(204, 51, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 400, -1, -1));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(204, 51, 0));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 400, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("member Details");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 390, 440));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "Date Of B", "Mobile", "Gender", "Address", "Start Date", "Trainner"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 850, 380));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search hear", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        txtSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 510, 60));

        jPanel3.setBackground(new java.awt.Color(51, 0, 204));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("GYM MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(497, 497, 497)
                .addComponent(jLabel6)
                .addContainerGap(429, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtFname.setText("");
        txtLname.setText("");
        jDateChooser1.setDate(null);
        txtMobile.setText("");
        Gbox.setSelectedItem("Select");
        txtAddress.setText("");
        jDateChooser2.setDate(null);
        Tbox.setSelectedItem("Select");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String Fname = txtFname.getText();
        String Lname = txtLname.getText();
        String mobile = txtMobile.getText();
        String Gendertxt = Gbox.getSelectedItem().toString();
        String Address = txtAddress.getText();
        String trainnertxt = Tbox.getSelectedItem().toString();

        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        String BirthDateText = dFormat.format(jDateChooser1.getDate());
        String joinDateText = dFormat.format(jDateChooser2.getDate());

        if (Fname.isEmpty() || Lname.isEmpty() || mobile.isEmpty() || Gendertxt.equals("Select")
                || Address.isEmpty() || BirthDateText.isEmpty() || joinDateText.isEmpty() || trainnertxt.equals("Select")) {
            JOptionPane.showMessageDialog(this, "All fields are required.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            try (Connection con = DBconnect.getCon(); PreparedStatement pst = con.prepareStatement("INSERT INTO members (first_name, last_name, birth_date, mobile, gender, address, join_date, trainer) VALUES (?, ?, ?, ?, ?, ?, ?, ?)")) {

                pst.setString(1, Fname);
                pst.setString(2, Lname);
                pst.setString(3, BirthDateText);
                pst.setString(4, mobile);
                pst.setString(5, Gendertxt);
                pst.setString(6, Address);
                pst.setString(7, joinDateText);
                pst.setString(8, trainnertxt);

                int rows = pst.executeUpdate();
                if (rows > 0) {
                    JOptionPane.showMessageDialog(this, "Member details added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    refreshTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to add member details.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        String searchQuery = txtSearch.getText().toLowerCase();
        boolean found = false;

        for (int row = 0; row < jTable1.getRowCount(); row++) {
            Object nameValue = jTable1.getValueAt(row, 1);

            if (nameValue != null && nameValue.toString().toLowerCase().contains(searchQuery)) {
                jTable1.setRowSelectionInterval(row, row);
                found = true;

                Object firstName = jTable1.getValueAt(row, 2);
                Object lastName = jTable1.getValueAt(row, 3);

                txtFname.setText(firstName != null ? firstName.toString() : "");
                txtLname.setText(lastName != null ? lastName.toString() : "");

                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(this, "No member found matching the search criteria.", "Search Not Found", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (selectedMemberId == -1) {
            JOptionPane.showMessageDialog(this, "Please select a member to update.", "Update Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String Fname = txtFname.getText();
        String Lname = txtLname.getText();
        String mobile = txtMobile.getText();
        String Gendertxt = Gbox.getSelectedItem().toString();
        String Address = txtAddress.getText();
        String trainnertxt = Tbox.getSelectedItem().toString();

        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        String BirthDateText = dFormat.format(jDateChooser1.getDate());
        String joinDateText = dFormat.format(jDateChooser2.getDate());

        try {
            java.sql.Date birthDate = java.sql.Date.valueOf(BirthDateText);
            java.sql.Date joinDate = java.sql.Date.valueOf(joinDateText);

            try (Connection con = DBconnect.getCon(); PreparedStatement pst = con.prepareStatement("UPDATE members SET first_name = ?, last_name = ?, birth_date = ?, mobile = ?, gender = ?, address = ?, join_date = ?, trainer = ? WHERE id = ?")) {

                pst.setString(1, Fname);
                pst.setString(2, Lname);
                pst.setDate(3, birthDate);
                pst.setString(4, mobile);
                pst.setString(5, Gendertxt);
                pst.setString(6, Address);
                pst.setDate(7, joinDate);
                pst.setString(8, trainnertxt);
                pst.setInt(9, selectedMemberId);

                int rows = pst.executeUpdate();
                if (rows > 0) {
                    JOptionPane.showMessageDialog(this, "Member details updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    refreshTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to update member details.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Invalid date format. Use YYYY-MM-DD.", "Date Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (selectedMemberId == -1) {
            JOptionPane.showMessageDialog(this, "Please select a member to delete.", "Delete Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try (Connection con = DBconnect.getCon(); PreparedStatement pst = con.prepareStatement("DELETE FROM members WHERE id = ?")) {

            pst.setInt(1, selectedMemberId);

            int rows = pst.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(this, "Member deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                refreshTable();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete member.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            try {
                selectedMemberId = (int) jTable1.getValueAt(selectedRow, 0);
                txtFname.setText((String) jTable1.getValueAt(selectedRow, 1));
                txtLname.setText((String) jTable1.getValueAt(selectedRow, 2));
                txtMobile.setText((String) jTable1.getValueAt(selectedRow, 3));
                Gbox.setSelectedItem(jTable1.getValueAt(selectedRow, 4));
                txtAddress.setText((String) jTable1.getValueAt(selectedRow, 5));
                Tbox.setSelectedItem(jTable1.getValueAt(selectedRow, 6));
            } catch (ClassCastException e) {
                JOptionPane.showMessageDialog(this, "Error retrieving data from the table. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No valid row selected.", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void TboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TboxActionPerformed

    }//GEN-LAST:event_TboxActionPerformed

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
            java.util.logging.Logger.getLogger(memmber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(memmber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(memmber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(memmber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new memmber().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JComboBox<String> Gbox;
    private javax.swing.JComboBox<String> Tbox;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
