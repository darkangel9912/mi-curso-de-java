
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author darka
 */
public class FrmValidar extends javax.swing.JFrame {

    private String Texto;
    private String Email;
    
    public FrmValidar() {
        initComponents();
        RbdEmail.setSelected(true);
        this.setTitle("Comprobante de Email, RFC & Curp");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        RbdEmail = new javax.swing.JRadioButton();
        RbdRfc = new javax.swing.JRadioButton();
        RbdCurp = new javax.swing.JRadioButton();
        TxtTexto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LblResultado = new javax.swing.JLabel();
        BtnValidar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();

        RbdEmail.setText("Email");
        RbdEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbdEmailActionPerformed(evt);
            }
        });

        RbdRfc.setText("RFC");
        RbdRfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbdRfcActionPerformed(evt);
            }
        });

        RbdCurp.setText("Curp");
        RbdCurp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbdCurpActionPerformed(evt);
            }
        });

        jLabel1.setText("Introduce aqui el texto:");

        jLabel2.setText("Resultado:");

        BtnValidar.setText("Provar");
        BtnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnValidarActionPerformed(evt);
            }
        });

        BtnSalir.setText("Cerrar");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnSalir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(RbdCurp)
                        .addComponent(RbdRfc)
                        .addComponent(RbdEmail)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(LblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(TxtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BtnValidar))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(RbdEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RbdRfc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RbdCurp)
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnValidar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RbdEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbdEmailActionPerformed
        RbdRfc.setSelected(false);
        RbdCurp.setSelected(false);
    }//GEN-LAST:event_RbdEmailActionPerformed

    private void RbdRfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbdRfcActionPerformed
        RbdEmail.setSelected(false);
        RbdCurp.setSelected(false);
    }//GEN-LAST:event_RbdRfcActionPerformed

    private void RbdCurpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbdCurpActionPerformed
        RbdEmail.setSelected(false);
        RbdRfc.setSelected(false);
    }//GEN-LAST:event_RbdCurpActionPerformed

    private void BtnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnValidarActionPerformed
        if(RbdEmail.isSelected()){
            Texto = TxtTexto.getText();
            LblResultado.setText(ValidarEmail(Texto));
        }
        if(RbdRfc.isSelected()){
            Texto = TxtTexto.getText();
            LblResultado.setText(ValidarRfc(Texto));
        }
        if(RbdCurp.isSelected()){
            Texto = TxtTexto.getText();
            LblResultado.setText(ValidarCurp(Texto));
        }
    }//GEN-LAST:event_BtnValidarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        this.hide();
    }//GEN-LAST:event_BtnSalirActionPerformed

    public String ValidarEmail(String Email){
        String Valor="";
        Pattern Correo = Pattern.compile("^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$");
        String CorreoE = Email;
        
        Matcher mether = Correo.matcher(CorreoE);
        if(mether.find() == true){
            Valor="Correo valido";
        }else{
            Valor="Correo no Valido";
        }
        
        return Valor;
    }
    
    public String ValidarRfc(String Rfc){
        String Valor="";
        Pattern Correo = Pattern.compile("[A-Z]{4}[0-9]{6}[A-Z0-9]{3}");
        String CorreoE = Rfc;
        
        Matcher mether = Correo.matcher(CorreoE);
        if(mether.find() == true){
            Valor="RFC valido";
        }else{
            Valor="RFC no Valido";
        }
        
        return Valor;
    }
    
    
    public String ValidarCurp(String Curp){
        String Valor="";
        Pattern Correo = Pattern.compile("[A-Z]{4}[0-9]{6}[H,M][A-Z]{5}[0-9]{2}");
        String CorreoE = Curp;
        
        Matcher mether = Correo.matcher(CorreoE);
        if(mether.find() == true){
            Valor="Curp valida";
        }else{
            Valor="Curp no Valida";
        }
        
        return Valor;
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
            java.util.logging.Logger.getLogger(FrmValidar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmValidar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmValidar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmValidar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmValidar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnValidar;
    private javax.swing.JLabel LblResultado;
    private javax.swing.JRadioButton RbdCurp;
    private javax.swing.JRadioButton RbdEmail;
    private javax.swing.JRadioButton RbdRfc;
    private javax.swing.JTextField TxtTexto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
