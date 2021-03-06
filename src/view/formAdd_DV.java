/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller_qlks.DichVu;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.dichvuControctor;

/**
 *
 * @author Phuc Map
 */
public class formAdd_DV extends javax.swing.JFrame 
{

    private DichVu dv = new DichVu();
    private ArrayList<dichvuControctor> DichvuControctors;
    private boolean checkInsert = false;
    private formQL_DichVu formQL_dv;
    private int type;
    private dichvuControctor dvControctor;
    
    /** Creates new form ADD_Dv */
    
    
    public formAdd_DV() 
    {
        initComponents();
    }
    
    
    public formAdd_DV(formQL_DichVu formQL_dv) 
    {
        initComponents();
        this.formQL_dv = formQL_dv;
        checkInsert = true;
        type = 2;
    }
    
    public formAdd_DV(formQL_DichVu formQL_dv, dichvuControctor dvControctor, int type) 
    {
        //type = 1 la xem chi tiet
        // type = 2 la chinh sua
        checkInsert = false;
        if (dvControctor != null) 
        {
            initComponents();
            this.formQL_dv = formQL_dv;
            this.type = type;
            this.dvControctor = dvControctor;
            TF_TenDv.setText(dvControctor.getTendv());
            TF_Dv.setText("" + dvControctor.getGiadv());
        }
        if (type == 1) 
        {
            TF_TenDv.setEditable(false);
            TF_Dv.setEditable(false);
        }
    }
    
    public boolean addDV() 
    {
        int number = dv.getNumberDV()+ 1;
        String id = String.format("DV%1$05d", number);
        String tendv = TF_TenDv.getText();
        try {
            long giadv = Long.parseLong(TF_Dv.getText());
            dichvuControctor dvControctor = new dichvuControctor(id, tendv, giadv);
            if (checkInsert) 
            {
                return dv.addDV(dvControctor);
            } 
            else 
            {
                dvControctor.setId(this.dvControctor.getId());
                return dv.updateDV(dvControctor);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gi?? kh??ng h???p l???", "L???i", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    


   
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TF_TenDv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TF_Dv = new javax.swing.JTextField();
        Bt_Luu = new javax.swing.JButton();
        Bt_Huy = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnMinimize = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        jLabel2.setBackground(new java.awt.Color(0, 153, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Th??ng tin d???ch v???");
        jLabel2.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("T??n d???ch v???");

        TF_TenDv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("????n gi??");

        TF_Dv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Bt_Luu.setBackground(new java.awt.Color(51, 153, 255));
        Bt_Luu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Bt_Luu.setForeground(new java.awt.Color(255, 255, 255));
        Bt_Luu.setText("Xong");
        Bt_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_LuuActionPerformed(evt);
            }
        });

        Bt_Huy.setBackground(new java.awt.Color(0, 153, 255));
        Bt_Huy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Bt_Huy.setForeground(new java.awt.Color(255, 255, 255));
        Bt_Huy.setText("H???y");
        Bt_Huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_HuyActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(0, 153, 255));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_white.png"))); // NOI18N
        btnClose.setBorder(null);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnMinimize.setBackground(new java.awt.Color(0, 153, 255));
        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimize.png"))); // NOI18N
        btnMinimize.setBorder(null);
        btnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizeActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("VND");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_TenDv)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Bt_Luu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bt_Huy, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TF_Dv, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMinimize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_TenDv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_Dv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt_Luu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_Huy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_LuuActionPerformed
        // TODO add your handling code here:
        if (type == 2) {
            boolean checkSuccess = false;
            if (TF_TenDv.getText().isEmpty() || TF_Dv.getText().isEmpty()) 
            {
                JOptionPane.showMessageDialog(this, "Vui l??ng nh???p ?????y ????? th??ng tin!", "L???i", JOptionPane.ERROR_MESSAGE);
            } 
            else 
            {
                checkSuccess = addDV();
                if (checkSuccess == true && checkInsert == true) 
                {
                    DichvuControctors = dv.getListDV();
                    JOptionPane.showMessageDialog(this, "???? th??m", "Th??nh c??ng", JOptionPane.INFORMATION_MESSAGE);
                    formQL_dv.loadTableDV(DichvuControctors);
                   
                    this.setVisible(false);
                } 
                else if (checkSuccess == true && checkInsert == false) 
                {
                    DichvuControctors = dv.getListDV();
                    JOptionPane.showMessageDialog(this, "???? ch???nh s???a", "Th??nh c??ng", JOptionPane.INFORMATION_MESSAGE);
                    formQL_dv.loadTableDV(DichvuControctors);
                    this.setVisible(false);
                } 
                else 
                {
                    JOptionPane.showMessageDialog(this, "???? c?? l???i x???y ra!", "L???i", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
        
    }//GEN-LAST:event_Bt_LuuActionPerformed

    private void Bt_HuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_HuyActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_Bt_HuyActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed

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
            java.util.logging.Logger.getLogger(formAdd_DV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formAdd_DV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formAdd_DV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formAdd_DV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formAdd_DV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Huy;
    private javax.swing.JButton Bt_Luu;
    private javax.swing.JTextField TF_Dv;
    private javax.swing.JTextField TF_TenDv;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
