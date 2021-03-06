/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_reservation;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elariou
 */
public class ManageRoomsForm extends javax.swing.JFrame {

    ROOMS room = new ROOMS();
    
    public ManageRoomsForm() {
        initComponents();
        
        jTableRooms.setModel(new DefaultTableModel(null, new Object[]{"Room Number","Type","Phone","isReserved"}));
        jTableRooms.setRowHeight(40);
        
        room.fillRooms_TYPE_JComboBox(jComboBoxType);
        room.fillRoomJTable(jTableRooms);
        
        ButtonGroup bg = new ButtonGroup();
        
        bg.add(jRadioButtonYES);
        bg.add(jRadioButtonNO);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldRoomNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldRoomPhone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRooms = new javax.swing.JTable();
        jButtonShowTypes = new javax.swing.JButton();
        jButtonEditRoom = new javax.swing.JButton();
        jButtonRemoveRoom = new javax.swing.JButton();
        jButtonClearRoom = new javax.swing.JButton();
        jButtonRefreshRooms = new javax.swing.JButton();
        jComboBoxType = new javax.swing.JComboBox<>();
        jButtonAddRoom1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButtonNO = new javax.swing.JRadioButton();
        jRadioButtonYES = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(923, 550));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Manage Rooms");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(291, 291, 291))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Number:");

        jTextFieldRoomNumber.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Type:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone Number:");

        jTextFieldRoomPhone.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldRoomPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRoomPhoneActionPerformed(evt);
            }
        });

        jTableRooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Phone", "Email"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jTableRooms.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTableRoomsMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTableRooms);

    jButtonShowTypes.setBackground(new java.awt.Color(204, 204, 204));
    jButtonShowTypes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jButtonShowTypes.setForeground(new java.awt.Color(0, 0, 0));
    jButtonShowTypes.setText("Show Types");
    jButtonShowTypes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonShowTypes.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonShowTypesActionPerformed(evt);
        }
    });

    jButtonEditRoom.setBackground(new java.awt.Color(204, 204, 204));
    jButtonEditRoom.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jButtonEditRoom.setForeground(new java.awt.Color(102, 102, 255));
    jButtonEditRoom.setText("Edit");
    jButtonEditRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonEditRoom.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonEditRoomActionPerformed(evt);
        }
    });

    jButtonRemoveRoom.setBackground(new java.awt.Color(204, 204, 204));
    jButtonRemoveRoom.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jButtonRemoveRoom.setForeground(new java.awt.Color(255, 153, 153));
    jButtonRemoveRoom.setText("Remove");
    jButtonRemoveRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonRemoveRoom.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonRemoveRoomActionPerformed(evt);
        }
    });

    jButtonClearRoom.setBackground(new java.awt.Color(204, 204, 204));
    jButtonClearRoom.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jButtonClearRoom.setText("Clear Fields");
    jButtonClearRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonClearRoom.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonClearRoomActionPerformed(evt);
        }
    });

    jButtonRefreshRooms.setText("Refresh");
    jButtonRefreshRooms.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonRefreshRoomsActionPerformed(evt);
        }
    });

    jComboBoxType.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

    jButtonAddRoom1.setBackground(new java.awt.Color(204, 204, 204));
    jButtonAddRoom1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jButtonAddRoom1.setForeground(new java.awt.Color(102, 255, 102));
    jButtonAddRoom1.setText("Add");
    jButtonAddRoom1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonAddRoom1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonAddRoom1ActionPerformed(evt);
        }
    });

    jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("Reserved:");

    jPanel3.setBackground(new java.awt.Color(255, 255, 255));
    jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
    jPanel3.setForeground(new java.awt.Color(102, 102, 102));

    jRadioButtonNO.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    jRadioButtonNO.setForeground(new java.awt.Color(255, 51, 51));
    jRadioButtonNO.setText("NO");

    jRadioButtonYES.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    jRadioButtonYES.setForeground(new java.awt.Color(51, 255, 51));
    jRadioButtonYES.setText("YES");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jRadioButtonYES)
            .addGap(57, 57, 57)
            .addComponent(jRadioButtonNO)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jRadioButtonYES)
                .addComponent(jRadioButtonNO))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonShowTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldRoomPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonClearRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jButtonAddRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonEditRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonRemoveRoom)))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButtonRefreshRooms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonShowTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextFieldRoomPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(86, 86, 86)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonEditRoom)
                        .addComponent(jButtonRemoveRoom)
                        .addComponent(jButtonAddRoom1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButtonClearRoom))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButtonRefreshRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 3, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableRoomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRoomsMouseClicked
      DefaultTableModel model = (DefaultTableModel) jTableRooms.getModel();
        
        int rIndex = jTableRooms.getSelectedRow();
        
        jTextFieldRoomNumber.setText(model.getValueAt(rIndex, 0).toString());
        jComboBoxType.setSelectedItem(model.getValueAt(rIndex, 1));
        jTextFieldRoomPhone.setText(model.getValueAt(rIndex, 2).toString());
        
        String isReserved = model.getValueAt(rIndex,3).toString();
        
        if(isReserved.equals("YES")){
            jRadioButtonYES.setSelected(true);
        }
        else{
            jRadioButtonNO.setSelected(true);
        }
        
    }//GEN-LAST:event_jTableRoomsMouseClicked

    private void jButtonShowTypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowTypesActionPerformed
        // TODO add your handling code here:
        ALL_ROOMS_TYPE_FORM roomTypeForm = new ALL_ROOMS_TYPE_FORM();
        
        roomTypeForm.setVisible(true);
        roomTypeForm.pack();
        roomTypeForm.setLocationRelativeTo(null);
        roomTypeForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jButtonShowTypesActionPerformed

    private void jButtonEditRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditRoomActionPerformed
        // TODO add your handling code here:
        int roomNumber = 0;
        int type = Integer.valueOf(jComboBoxType.getSelectedItem().toString());
        String phone = jTextFieldRoomPhone.getText();
        String isReserved = "NO";
        
        if(jRadioButtonYES.isSelected()){
            isReserved="YES";
        }
        
        if(phone.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Enter Room's The Phone Number","Empty Field",JOptionPane.WARNING_MESSAGE);
        }
        else{
            try{
               roomNumber = Integer.valueOf(jTextFieldRoomNumber.getText());
               
               if( room.editRoom(roomNumber, type, phone, isReserved)){
                JOptionPane.showMessageDialog(rootPane, "Room's Data Updated Succesfully","Edit Room",JOptionPane.INFORMATION_MESSAGE);
            }else{
                 JOptionPane.showMessageDialog(rootPane, "Room's Data NOT Upadated","Edit Room Error",JOptionPane.ERROR_MESSAGE);
            }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane,ex.getMessage() + "Enter Room's Number","Room Number Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        jTableRooms.setModel(new DefaultTableModel(null, new Object[]{"Room Number","Type","Phone","isReserved"}));
        room.fillRoomJTable(jTableRooms);
    
    }//GEN-LAST:event_jButtonEditRoomActionPerformed

    private void jButtonRemoveRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveRoomActionPerformed
        // TODO add your handling code here:
        try{
               int number = Integer.valueOf(jTextFieldRoomNumber.getText());
               
               if( room.removeRoom(number)){
                JOptionPane.showMessageDialog(rootPane, "Removed Room Succesfully","Remove Room",JOptionPane.INFORMATION_MESSAGE);
            }else{
                 JOptionPane.showMessageDialog(rootPane, "Room Data NOT Removed","Remove Room Error",JOptionPane.ERROR_MESSAGE);
            }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane,ex.getMessage() + "Enter Room's Number","Room Number Error",JOptionPane.ERROR_MESSAGE);
            }
        jTableRooms.setModel(new DefaultTableModel(null, new Object[]{"Room Number","Type","Phone","isReserved"}));
        room.fillRoomJTable(jTableRooms);

    }//GEN-LAST:event_jButtonRemoveRoomActionPerformed

    private void jButtonClearRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearRoomActionPerformed
        jTextFieldRoomNumber.setText("");
        jComboBoxType.setSelectedItem(0);
        jTextFieldRoomPhone.setText("");
        jRadioButtonYES.setSelected(false);
        jRadioButtonNO.setSelected(false);
    }//GEN-LAST:event_jButtonClearRoomActionPerformed

    private void jButtonRefreshRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshRoomsActionPerformed
        jTableRooms.setModel(new DefaultTableModel(null, new Object[]{"Room Number","Type","Phone","isReserved"}));
        room.fillRoomJTable(jTableRooms);
    }//GEN-LAST:event_jButtonRefreshRoomsActionPerformed

    private void jButtonAddRoom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddRoom1ActionPerformed
        // TODO add your handling code here:
        try{
            int roomNumber = Integer.valueOf(jTextFieldRoomNumber.getText());
            int roomType = Integer.valueOf(jComboBoxType.getSelectedItem().toString());
            String roomPhone = jTextFieldRoomPhone.getText();
            String isReserved = "NO";
            if(jRadioButtonYES.isSelected()){
                isReserved = "YES";
            }

            if(room.addRoom(roomNumber, roomType, roomPhone, isReserved)){
                JOptionPane.showMessageDialog(rootPane, "New Room Added Succesfully","Add Room",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Room NOT Added","Add Room Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane,ex.getMessage() + "Enter Room's Number)","Room Number Error",JOptionPane.ERROR_MESSAGE);
        }
        jTableRooms.setModel(new DefaultTableModel(null, new Object[]{"Room Number","Type","Phone","isReserved"}));
        room.fillRoomJTable(jTableRooms);
    }//GEN-LAST:event_jButtonAddRoom1ActionPerformed

    private void jTextFieldRoomPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRoomPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRoomPhoneActionPerformed

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
            java.util.logging.Logger.getLogger(ManageRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRoomsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoomsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddRoom1;
    private javax.swing.JButton jButtonClearRoom;
    private javax.swing.JButton jButtonEditRoom;
    private javax.swing.JButton jButtonRefreshRooms;
    private javax.swing.JButton jButtonRemoveRoom;
    private javax.swing.JButton jButtonShowTypes;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonNO;
    private javax.swing.JRadioButton jRadioButtonYES;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRooms;
    private javax.swing.JTextField jTextFieldRoomNumber;
    private javax.swing.JTextField jTextFieldRoomPhone;
    // End of variables declaration//GEN-END:variables
}
