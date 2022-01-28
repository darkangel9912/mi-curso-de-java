/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author darka
 */
public class FrmVentas extends javax.swing.JFrame {

    /**
     * Creates new form FrmVentas
     */
    private Producto mProducto;
    private Venta mVenta;
    private ArrayList ListaVentas;
    private FrmPagar mFrmPagar;
    private FrmCorte mFrmCorte;
    DefaultTableModel Modelo;
    String[] Datos = new String[4];
    
    public FrmVentas() {
        
        initComponents();
        mFrmCorte = new FrmCorte();
        mProducto = new Producto();
        mVenta = new Venta();
        String[] Titulo = {"Nombre","Precio","Cantidad","Subtotal"};
        Modelo = new DefaultTableModel(null,Titulo);
        ListaVentas = new ArrayList();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtProducto = new javax.swing.JTextField();
        TxtCantidad = new javax.swing.JTextField();
        TxtPrecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblTabla = new javax.swing.JTable();
        BtnAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BtnEliminar = new javax.swing.JButton();
        LblTotal = new javax.swing.JLabel();
        BtnPagar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Producto:");

        jLabel2.setText("Cantidad:");

        jLabel3.setText("Precio:");

        TxtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtProductoActionPerformed(evt);
            }
        });

        TxtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrecioActionPerformed(evt);
            }
        });

        TblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TblTabla);

        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnPagar.setText("Pagar");
        BtnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPagarActionPerformed(evt);
            }
        });

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(TxtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtCantidad)
                                    .addComponent(TxtPrecio))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(BtnAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(BtnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(BtnPagar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(106, 106, 106))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAgregar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnPagar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        
        
            Producto mProducto = new Producto();
            try{
            mProducto.Nombre = TxtProducto.getText();
            mProducto.Precio = Float.parseFloat(TxtPrecio.getText());
            if(("".equals(TxtProducto.getText())) || (" ".equals(TxtProducto.getText())))
            {
                JOptionPane.showMessageDialog(this,"ingrese nombre valido");
            }
            else if(mProducto.Precio <= 0)
            {
                JOptionPane.showMessageDialog(this,"ingrese precio correcto");
                TxtPrecio.setText("");
                TxtPrecio.grabFocus();
            }
            else{
                mProducto.Cantidad = Integer.parseInt(TxtCantidad.getText());
                if(mProducto.Cantidad <= 0)
                {
                JOptionPane.showMessageDialog(this,"ingrese cantidad valida");
                TxtPrecio.setText("");
                TxtPrecio.grabFocus();
                }
                else
                {
            mProducto.CalcularSubtotal();
            mVenta.CalcularTotal(mProducto.GetSubtotal());
            
            
            

            Datos[0] = mProducto.GetNombre();
            Datos[1] = "" + mProducto.GetPrecio();
            Datos[2] = "" + mProducto.GetCantidad();
            Datos[3] = "" + mProducto.GetSubtotal();
            
            Modelo.addRow(Datos);
            TblTabla.setModel(Modelo);
            Limpiar();
            LblTotal.setText(""+mVenta.getTotal());
            
            ListaVentas.add(mProducto);
                }
            } 
   
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"ingrese datos correctos");
                Limpiar();
                TxtProducto.grabFocus();
            }
        
    }//GEN-LAST:event_BtnAgregarActionPerformed
    public ArrayList getLista()
    {
        return this.ListaVentas;
    }
    public boolean validar(){
        if(String.valueOf(TxtProducto.getText().charAt(0)).equals(" ")){
            JOptionPane.showMessageDialog(this, "Error en el nombre");
            return false;
        }else{
            try{
                String ca = TxtProducto.getText();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Formato de cantidad o precio incorrecto");
                TxtProducto.setText("");
                TxtProducto.grabFocus();
                return false;
            }
            return true;
        }
    }
    
    private void TxtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrecioActionPerformed

    public void Limpiar(){
        TxtProducto.setText("");
        TxtPrecio.setText("");
        TxtCantidad.setText("");
        
        TxtProducto.grabFocus();
    }
    
    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
        int Renglon = TblTabla.getSelectedRow();
        Modelo.removeRow(Renglon);
        
        float fila = 0;
        float suma = 0;
        
        for(int i=0; i <TblTabla.getRowCount();i++){
            fila = Float.parseFloat(TblTabla.getValueAt(i,3).toString());
            suma = suma + fila;
        }
        ListaVentas.remove(Renglon);
        LblTotal.setText(""+suma);
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPagarActionPerformed
        FrmPagar mFrmPagar = new FrmPagar();
        mFrmPagar.SetTotal(LblTotal.getText());
        //mFrmPagar.SetTotal("" + mVenta.getTotal());
        mFrmPagar.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BtnPagarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TxtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtProductoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnPagar;
    private javax.swing.JLabel LblTotal;
    private javax.swing.JTable TblTabla;
    private javax.swing.JTextField TxtCantidad;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JTextField TxtProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}