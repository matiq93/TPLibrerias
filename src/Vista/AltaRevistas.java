/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Main;
import Modelo.*;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class AltaRevistas extends javax.swing.JFrame {
    private static Revistas aux=null;
    
            
    public AltaRevistas() {
        initComponents();
        setLocationRelativeTo(null);
        lblPrecioventa.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JROcio = new javax.swing.JRadioButton();
        JREspecializada = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbFrecuencia = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtTema_Personaje = new javax.swing.JTextField();
        txtStock = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecioBase = new javax.swing.JFormattedTextField();
        btnConfirmar = new javax.swing.JButton();
        btnCalcular1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbl$$ = new javax.swing.JLabel();
        lblPrecioventa = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 350));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JROcio.setText("De Ocio");
        JROcio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JROcioActionPerformed(evt);
            }
        });
        getContentPane().add(JROcio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        JREspecializada.setText("Especializada");
        JREspecializada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JREspecializadaActionPerformed(evt);
            }
        });
        getContentPane().add(JREspecializada, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("NUEVO REVISTA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 120, 30));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel4.setText("Stock");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        cmbFrecuencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semanal", "Mensual ", "Semestral", " " }));
        cmbFrecuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFrecuenciaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbFrecuencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        txtTema_Personaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTema_PersonajeActionPerformed(evt);
            }
        });
        getContentPane().add(txtTema_Personaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 100, -1));

        txtStock.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 100, -1));

        jLabel5.setText("Precio Base");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        txtPrecioBase.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        getContentPane().add(txtPrecioBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 100, -1));

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        btnCalcular1.setText("Calcular");
        btnCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jLabel6.setText("Origen");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 100, -1));

        lbl$$.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(lbl$$, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 120, 30));

        lblPrecioventa.setText("Precio de Venta: ");
        getContentPane().add(lblPrecioventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        jLabel7.setText("Frecuencia");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JREspecializadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JREspecializadaActionPerformed
        JROcio.setSelected(false);
        jLabel6.setText("tema");
    }//GEN-LAST:event_JREspecializadaActionPerformed

    private void txtTema_PersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTema_PersonajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTema_PersonajeActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        Main.lista.Agregar(aux);
        this.setVisible(false);
        aux=null;
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular1ActionPerformed
        if (JROcio.isSelected()==true) {
            aux=new RevistaDeOcio(txtTema_Personaje.getText(), Integer.parseInt(txtStock.getText()), cmbFrecuencia.getSelectedIndex(),  Double.parseDouble(txtPrecioBase.getText()), txtNombre.getText(), 'A');
            
        }else if (JREspecializada.isSelected()==true) {
            aux =new RevistaEspecializada(txtTema_Personaje.getText(), Integer.parseInt(txtStock.getText()), cmbFrecuencia.getSelectedIndex(),  Double.parseDouble(txtPrecioBase.getText()),txtNombre.getText(), 'A');
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione tipo de Revista");
        }
        lblPrecioventa.setVisible(true);
        lbl$$.setText("$"+String.format("%.2f", aux.precioDeVenta()));
            
        
        
        
        
    }//GEN-LAST:event_btnCalcular1ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void JROcioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JROcioActionPerformed
        JREspecializada.setSelected(false);
        jLabel6.setText("Personaje");
    }//GEN-LAST:event_JROcioActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        aux = null;
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cmbFrecuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFrecuenciaActionPerformed

    }//GEN-LAST:event_cmbFrecuenciaActionPerformed

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
            java.util.logging.Logger.getLogger(AltaRevistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaRevistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaRevistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaRevistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaRevistas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton JREspecializada;
    private javax.swing.JRadioButton JROcio;
    private javax.swing.JButton btnCalcular1;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbFrecuencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbl$$;
    private javax.swing.JLabel lblPrecioventa;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtPrecioBase;
    private javax.swing.JFormattedTextField txtStock;
    private javax.swing.JTextField txtTema_Personaje;
    // End of variables declaration//GEN-END:variables
}