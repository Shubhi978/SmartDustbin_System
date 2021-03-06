/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import static java.time.Clock.system;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author SHUBHI
 */
public class startMonitoring extends javax.swing.JFrame {

    static int i;
    int count =0 ;
    static startMonitoring base ;
    final String DB_URL = "jdbc:derby:database;create=true";
    String qu_dustbin ="SELECT * FROM DUSTBIN";
    String qu_c="SELECT COUNT(*) FROM DUSTBIN";
    ResultSet rs_c=landing.databaseHandler.execQuery(qu_c);
    Connection conn = DriverManager.getConnection(DB_URL);
//    conn.setAutoCommit(false);
    PreparedStatement statement = conn.prepareStatement(qu_dustbin);
    ResultSet rs_dustbin = statement.executeQuery();
    
    static ArrayList<JButton> gridButtons = new ArrayList<JButton>();
    /**
     * Creates new form startMonitoring
     */
    public startMonitoring() throws SQLException{
        initComponents();
        base = this;
        
        GridPanel pane = new GridPanel();
        pane.setBounds(320,300,370,234);
        pane.setBackground(Color.white);
        this.add(pane);
        
        this.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    //System.out.println("WindowClosingDemo.windowClosing");
                    landing.dashboard.setVisible(true);
                    //landing.sttm.setVisible(false);
                    dispose();
                    }
                });
    }
         

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JPanel1.setBackground(java.awt.Color.white);

        jPanel2.setBackground(new java.awt.Color(112, 224, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/start.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 59, 76));
        jLabel2.setText("Start Monitoring");

        backButton.setBackground(new java.awt.Color(26, 83, 92));
        backButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(249, 251, 242));
        backButton.setText("GO BACK");
        backButton.setBorder(null);
        backButton.setContentAreaFilled(false);
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.setFocusPainted(false);
        backButton.setOpaque(true);
        backButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                backButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                backButtonFocusLost(evt);
            }
        });
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanel1Layout = new javax.swing.GroupLayout(JPanel1);
        JPanel1.setLayout(JPanel1Layout);
        JPanel1Layout.setHorizontalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JPanel1Layout.createSequentialGroup()
                .addGap(412, 412, 412)
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(424, Short.MAX_VALUE))
        );
        JPanel1Layout.setVerticalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 437, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_backButtonFocusGained
        backButton.setForeground(new java.awt.Color(230, 57, 70));
    }//GEN-LAST:event_backButtonFocusGained

    private void backButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_backButtonFocusLost
        backButton.setForeground(new java.awt.Color(249, 251, 242));
    }//GEN-LAST:event_backButtonFocusLost

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        landing.dashboard.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed


    private class GridPanel extends javax.swing.JPanel{
        GridPanel() throws SQLException{
            
            if(rs_c.next())
            count = rs_c.getInt(1);
//            System.out.println(count);
            rs_c.close();
            String id = null;
            int m = count%2==0 ? count : count+1;
            setLayout(new java.awt.GridLayout(m/2,2));
//           
//            }
               for(i=0;i<count;i++){
                    JButton b = new JButton();
                    if(rs_dustbin.next())
                    id = rs_dustbin.getString("ID");
                    final String currentID = id;
                    //System.out.println(entry.getKey() + " = " + entry.getValue());
                    b.setFont(new Font("Arial", Font.BOLD, 14));
                    b.setPreferredSize(new Dimension(100, 100));
                    b.addActionListener(new java.awt.event.ActionListener(){
                    public void actionPerformed(java.awt.event.ActionEvent e){
                        results r = new results(currentID);
                        base.setVisible(false);
                        r.setVisible(true);
                    }
                });
                    b.setText("ID:"+currentID);
                    b.setForeground(Color.white);
                    /*
                    if(rs_dustbin.getDouble("sensedGarbageDepth") >= landing.ultrasonicThreshold){
                        b.setBackground(new java.awt.Color(214, 40, 40));
                    }else{
                        b.setBackground(new java.awt.Color(22, 219, 147));
                    }
                    */
                    add(b);
                    gridButtons.add(b);
                }
              rs_dustbin.close(); 
              setButtonColors();
            }
        private void setButtonColors(){
            Timer timer = new Timer(); 
            TimerTask task = new Helper(); 
            timer.schedule(task, 1, 1000); 
        }
        
        class Helper extends TimerTask 
    { 
            @Override
            public void run() 
            {
                for (int i=0; i<gridButtons.size(); i++){
                    String binID =  gridButtons.get(i).getText().trim();
                    binID = binID.substring(3);
                    binID = binID.trim();
                    
                    String qu = "SELECT * FROM DUSTBIN WHERE ID = '" + binID + "'";
                    ResultSet rs2 = landing.databaseHandler.execQuery(qu);
                    double depth = 0.0;
                    try {
                        if(rs2.next())
                            depth = rs2.getDouble("sensedGarbageDepth");
                    } catch (SQLException ex) {
                        Logger.getLogger(startMonitoring.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    if(depth >= landing.ultrasonicThreshold)
                        gridButtons.get(i).setBackground(new java.awt.Color(214, 40, 40));
                    else
                        gridButtons.get(i).setBackground(new java.awt.Color(22, 219, 147));
                }
            }
        }
    }
        
    
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
            java.util.logging.Logger.getLogger(startMonitoring.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(startMonitoring.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(startMonitoring.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(startMonitoring.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    new startMonitoring().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(startMonitoring.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel1;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
