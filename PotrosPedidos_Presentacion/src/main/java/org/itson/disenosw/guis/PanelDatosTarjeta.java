package org.itson.disenosw.guis;

import BOs.validarTarjetaBO;
import mocks.Banco;
import mocks.Usuario;
import SubsistemaBanco.validarTarjeta;
import java.util.List;
import javax.swing.JOptionPane;
import mocks.Banco;
import org.itson.disenosw.dtos.TarjetaDTO;
import SubsistemaBanco.IValidarTarjeta;
import excepciones.ExcepcionAT;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase representa la vista de inicio de sesión en la interfaz gráfica del
 * banco. Permite a los usuarios iniciar sesión proporcionando su nombre de
 * usuario y contraseña.
 */
public class PanelDatosTarjeta extends javax.swing.JPanel {

    private FramePrincipal ventana;
    private Banco b = new Banco();

    /**
     * Constructor de la clase VistaInicioSesion.
     *
     * @param ventana La ventana principal de la aplicación.
     */
    public PanelDatosTarjeta(FramePrincipal ventana) {
        this.ventana = ventana;
        initComponents();
        b.generarLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtcvv = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        btnPagar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 800));
        setMinimumSize(new java.awt.Dimension(400, 800));
        setPreferredSize(new java.awt.Dimension(400, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtcvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 60, 40));
        add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 100, 40));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 350, 40));
        add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 350, 40));

        btnPagar.setBorder(null);
        btnPagar.setContentAreaFilled(false);
        btnPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 120, 50));

        btnRegresar.setBorder(null);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 50, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelDatosTarjeta.png"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        List<Banco> banco = b.getListaBanco();
        String nombre = txtNombre.getText();
        String numero = txtNumero.getText();
        String fecha = txtfecha.getText();
        String cvv = txtcvv.getText();
        TarjetaDTO t = new TarjetaDTO(numero, nombre, fecha, Integer.parseInt(cvv));
        validarTarjetaBO vb = new validarTarjetaBO();
        try {
            if (vb.ValidarBanco(t)) {
//            ventana.mostrarConfirmacion("PEDIDO EXITOSO", "EXITO");
                ventana.cambiarPanelPagoExito();
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese datos correctos");
            }
        } catch (ExcepcionAT ex) {
            Logger.getLogger(PanelDatosTarjeta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        ventana.cambiarVistaMetodoPago();
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtcvv;
    private javax.swing.JTextField txtfecha;
    // End of variables declaration//GEN-END:variables
}