/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author darka
 */
public class FrmPagar extends javax.swing.JFrame {

    private Producto mProducto;
    FrmVentas mFrmVentas = new FrmVentas();
    Date fecha = new Date();
    int Mes = fecha.getMonth() + 1;
    int Dia = fecha.getDate();
    public ArrayList ListaVentas;

    public FrmPagar() {
        initComponents();
        RbdHombre.setVisible(false);
        RbdMujer.setVisible(false);
        RbdIndefinido.setVisible(false);

    }

    public void SetTotal(String Total) {
        LblTotal.setText(Total);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RbdEfectivo = new javax.swing.JRadioButton();
        RbdTarjeta = new javax.swing.JRadioButton();
        RbdHombre = new javax.swing.JRadioButton();
        RbdMujer = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        LblTotal = new javax.swing.JLabel();
        BtnPagar = new javax.swing.JButton();
        TxtEfectivo = new javax.swing.JTextField();
        RbdIndefinido = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RbdEfectivo.setText("Efectivo");
        RbdEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbdEfectivoActionPerformed(evt);
            }
        });

        RbdTarjeta.setText("Tarjeta");
        RbdTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbdTarjetaActionPerformed(evt);
            }
        });

        RbdHombre.setText("Hombre");
        RbdHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbdHombreActionPerformed(evt);
            }
        });

        RbdMujer.setText("Mujer");
        RbdMujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbdMujerActionPerformed(evt);
            }
        });

        jLabel1.setText("Total:");

        LblTotal.setText("$");

        BtnPagar.setText("Pagar");
        BtnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPagarActionPerformed(evt);
            }
        });

        RbdIndefinido.setText("Indefinido");
        RbdIndefinido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbdIndefinidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(LblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RbdTarjeta)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RbdEfectivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnPagar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RbdMujer)
                    .addComponent(RbdHombre)
                    .addComponent(RbdIndefinido))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LblTotal))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbdEfectivo)
                    .addComponent(RbdHombre)
                    .addComponent(TxtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbdTarjeta)
                    .addComponent(RbdMujer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RbdIndefinido)
                    .addComponent(BtnPagar))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RbdHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbdHombreActionPerformed
        RbdMujer.setSelected(false);
        RbdIndefinido.setSelected(false);
    }//GEN-LAST:event_RbdHombreActionPerformed

    private void RbdMujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbdMujerActionPerformed
        RbdHombre.setSelected(false);
        RbdIndefinido.setSelected(false);
    }//GEN-LAST:event_RbdMujerActionPerformed

    private void RbdIndefinidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbdIndefinidoActionPerformed
        // TODO add your handling code here:
        RbdMujer.setSelected(false);
        RbdHombre.setSelected(false);
    }//GEN-LAST:event_RbdIndefinidoActionPerformed

    private void RbdEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbdEfectivoActionPerformed
        // TODO add your handling code here:
        RbdTarjeta.setSelected(false);
        TxtEfectivo.setVisible(true);

    }//GEN-LAST:event_RbdEfectivoActionPerformed

    private void RbdTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbdTarjetaActionPerformed
        // TODO add your handling code here:
        RbdEfectivo.setSelected(false);
        TxtEfectivo.setVisible(false);
    }//GEN-LAST:event_RbdTarjetaActionPerformed

    private void BtnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPagarActionPerformed
        // TODO add your handling code here:

        if (RbdTarjeta.isSelected()) {

            JOptionPane.showMessageDialog(this, "Pago realizado con exito");
            this.setVisible(false);
        } else {
            if (validar()) {
                if (validar2()) {
                    double Cambiesin = Float.parseFloat(TxtEfectivo.getText()) - Float.parseFloat(LblTotal.getText());

                    if (RbdMujer.isSelected()) {
                        float x = Float.parseFloat(LblTotal.getText());
                        Cambiesin = Float.parseFloat(TxtEfectivo.getText()) - (x * 0.10);
                    }

                    JOptionPane.showMessageDialog(this, Cambiesin);

                    this.setVisible(false);

                }

            }
        }


    }//GEN-LAST:event_BtnPagarActionPerformed

    public boolean validar() {
        if (TxtEfectivo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Dato incoorecto");
            return false;
        } else {
            try {
                float ca = Float.parseFloat(TxtEfectivo.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Formato de cantidad o precio incorrecto");
                TxtEfectivo.setText("");
                TxtEfectivo.grabFocus();
                return false;
            }
            return true;
        }
    }

    public boolean validar2() {
        if (Float.parseFloat(TxtEfectivo.getText()) < Float.parseFloat(LblTotal.getText())) {
            JOptionPane.showMessageDialog(this, "Dinero insuficiente");
            return false;
        } else {
            try {
                float ca = Float.parseFloat(TxtEfectivo.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Formato de cantidad o precio incorrecto");
                TxtEfectivo.setText("");
                TxtEfectivo.grabFocus();
                return false;
            }
            return true;
        }
    }

    private void formWindowOpend(java.awt.event.ActionEvent eve) {
        if ((Mes == 3) && (Dia == 8)) {
            RbdHombre.setSelected(true);
            RbdMujer.setSelected(true);
            RbdIndefinido.setSelected(true);
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
            java.util.logging.Logger.getLogger(FrmPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPagar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPagar;
    private javax.swing.JLabel LblTotal;
    private javax.swing.JRadioButton RbdEfectivo;
    private javax.swing.JRadioButton RbdHombre;
    private javax.swing.JRadioButton RbdIndefinido;
    private javax.swing.JRadioButton RbdMujer;
    private javax.swing.JRadioButton RbdTarjeta;
    private javax.swing.JTextField TxtEfectivo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
