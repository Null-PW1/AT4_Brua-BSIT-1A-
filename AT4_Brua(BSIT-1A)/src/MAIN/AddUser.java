/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MAIN;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author AntonDaryl
 */
public class AddUser extends javax.swing.JFrame {

    private static String adname, adpass, type = "member", types;

    private static String filepath2 = "src\\MAIN\\DATA.json";
    private static JSONParser jsonParser2 = new JSONParser();
    private static JSONObject record = new JSONObject();
    private static JSONArray userlist = new JSONArray();
    private static JSONObject user = new JSONObject();
    
    /**
     * Creates new form AddUser
     */
    public AddUser() {
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

        jPanel1 = new javax.swing.JPanel();
        jTxtUserAdd = new javax.swing.JTextField();
        jTxtPassAdd = new javax.swing.JPasswordField();
        jUserAdd = new javax.swing.JLabel();
        jPassAdd = new javax.swing.JLabel();
        AddBtnAdd = new javax.swing.JButton();
        ClearBtnAdd = new javax.swing.JButton();
        CancelBtnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jUserAdd.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jUserAdd.setForeground(new java.awt.Color(255, 255, 255));
        jUserAdd.setText("Create Username:");

        jPassAdd.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jPassAdd.setForeground(new java.awt.Color(255, 255, 255));
        jPassAdd.setText("Create Password:");

        AddBtnAdd.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        AddBtnAdd.setText("Add");
        AddBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnAddActionPerformed(evt);
            }
        });

        ClearBtnAdd.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        ClearBtnAdd.setText("Clear");
        ClearBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnAddActionPerformed(evt);
            }
        });

        CancelBtnAdd.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        CancelBtnAdd.setText("Cancel");
        CancelBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnAddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPassAdd)
                    .addComponent(jUserAdd))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTxtPassAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jTxtUserAdd))
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(CancelBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ClearBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtUserAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUserAdd))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtPassAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPassAdd))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelBtnAdd)
                    .addComponent(ClearBtnAdd)
                    .addComponent(AddBtnAdd))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnAddActionPerformed
    Admin a = new Admin();
                a.setVisible(true);
                setVisible(false);
    }//GEN-LAST:event_CancelBtnAddActionPerformed

    private void ClearBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnAddActionPerformed
        // TODO add your handling code here:
    jTxtUserAdd.setText("");
    jTxtPassAdd.setText("");
    }//GEN-LAST:event_ClearBtnAddActionPerformed

    private void AddBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnAddActionPerformed
        // TODO add your handling code here:
        try {
            
            int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to add this user?", "Confirm Add User", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response != JOptionPane.YES_OPTION) {
        return; 
        }
            adname = jTxtUserAdd.getText();
            adpass = jTxtPassAdd.getText();
           
        if (adname.isEmpty() || adpass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username or password cannot be empty!", "Warning", JOptionPane.WARNING_MESSAGE);
            return; // Stop execution
            
        }
                filecheck();
                adname = jTxtUserAdd.getText();
                adpass = jTxtPassAdd.getText();
                types = type;
                user.put("username",adname);
                user.put("password",adpass);
                user.put("type",types);
                
                userlist.add(user);
                record.put("users", userlist);
                
                save();
               JOptionPane.showMessageDialog(null, "Successfully Added into json file...");
            } catch (IOException ex) {
                Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        
           
    }//GEN-LAST:event_AddBtnAddActionPerformed

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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }
    
public static void filecheck() throws FileNotFoundException, IOException, ParseException {
        FileReader reader = new FileReader(filepath2);

        if (reader.ready()) {
            Scanner scan = new Scanner(reader);
            String line = "";

            while (scan.hasNext()) {
                line = line + scan.nextLine();
            }
            reader.close();
            if (!line.equals("")) {

                try ( FileReader reader2 = new FileReader(filepath2)) {
                    record = (JSONObject) jsonParser2.parse(reader2);
                    userlist = (JSONArray) record.get("users");
                } catch (IOException a) {
                    System.out.println("error");
                }
            }
        }
    }
public static void save()throws IOException{
    FileWriter file = new FileWriter(filepath2);
    file.write(record.toJSONString());
    file.close();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtnAdd;
    private javax.swing.JButton CancelBtnAdd;
    private javax.swing.JButton ClearBtnAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPassAdd;
    private javax.swing.JPasswordField jTxtPassAdd;
    private javax.swing.JTextField jTxtUserAdd;
    private javax.swing.JLabel jUserAdd;
    // End of variables declaration//GEN-END:variables
}
