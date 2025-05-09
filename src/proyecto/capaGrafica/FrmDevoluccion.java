/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.capaGrafica;

import java.awt.event.KeyEvent;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import proyecto.capaLogica.Agencia;
import proyecto.capaLogica.Alquiler;

/**
 *
 * @author Ricardo Hernández Salas, cedula 119430725 Jose Alejando Jiménez
 * Ugalde, cedula 119400931
 */
public class FrmDevoluccion extends javax.swing.JFrame {

    /**
     * Creates new form FrmDevoluccion
     */
    private Agencia agencia;

    public FrmDevoluccion(Agencia agencia) {
        initComponents();
        this.agencia = agencia;
        this.setTitle("Proyecto Auto Car, Ricardo Hernandez Salas, Alejandro Jimenez Ugalde");

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
        btnBuscar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        txtPlaca = new javax.swing.JTextField();
        txtKilometrajeFinal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAnnio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Devolucion de un Auto ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Ingresar la placa del Automovil ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Ingresa el kilometraje final del Vehiculo");

        btnBuscar.setBackground(new java.awt.Color(0, 123, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Completar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(108, 117, 125));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Volver");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtPlaca.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaKeyTyped(evt);
            }
        });

        txtKilometrajeFinal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtKilometrajeFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKilometrajeFinalActionPerformed(evt);
            }
        });
        txtKilometrajeFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKilometrajeFinalKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Fecha de Devolucion");

        txtDia.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaActionPerformed(evt);
            }
        });
        txtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaKeyTyped(evt);
            }
        });

        txtMes.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMesKeyTyped(evt);
            }
        });

        txtAnnio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtAnnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnnioKeyTyped(evt);
            }
        });

        jLabel5.setText("/");

        jLabel6.setText("/");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnBuscar)
                            .addGap(58, 58, 58)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtAnnio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(txtKilometrajeFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(txtKilometrajeFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txtPlacaActionPerformed

    private void txtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (!Character.isDigit(caracter) || txtPlaca.getText().length() >= 6) {
            evt.consume();
        }
        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtPlaca.getText().contains("."))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPlacaKeyTyped

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        FrmMenu frmMenu = new FrmMenu(agencia);
        frmMenu.setVisible(true);
        frmMenu.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:   
        try {

            if (txtDia.getText().isEmpty() || txtMes.getText().isEmpty() || txtAnnio.getText().isEmpty()
                    || txtPlaca.getText().isEmpty() || txtKilometrajeFinal.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe completar todos los campos.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int dia = Integer.parseInt(txtDia.getText());
            int mes = Integer.parseInt(txtMes.getText());
            int annio = Integer.parseInt(txtAnnio.getText());
            int placa = Integer.parseInt(txtPlaca.getText());
            double kilometrajeFinal = Double.parseDouble(txtKilometrajeFinal.getText());

            LocalDate fechaIngresada;
            try {
                fechaIngresada = LocalDate.of(annio, mes, dia);
            } catch (DateTimeException e) {
                JOptionPane.showMessageDialog(this, "Fecha invalida: " + e.getMessage(), "Error de fecha", JOptionPane.ERROR_MESSAGE);
                return;
            }

            LocalDate hoy = LocalDate.now();
            if (fechaIngresada.isBefore(hoy)) {
                JOptionPane.showMessageDialog(this, "No se puede seleccionar una fecha anterior a hoy", "Fecha invalida", JOptionPane.WARNING_MESSAGE);
                return;
            }

            var auto = agencia.buscarAutoPorPlaca(placa);
            if (auto == null) {
                JOptionPane.showMessageDialog(this, "No se encontro un vehículo con esa placa", "Placa no encontrada", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (kilometrajeFinal < auto.getKilometraje()) {
                JOptionPane.showMessageDialog(this, "El kilometraje final no puede ser menor al kilometraje actual del vehículo ( " + auto.getKilometraje() + " )", "Kilometraje inválido", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Alquiler alquiler = agencia.devolverAuto(auto);
            if (alquiler != null) {
                LocalDateTime fechaDevolucion = LocalDateTime.of(annio, mes, dia, 10, 0);
                alquiler.setFechaDevolucionReal(fechaDevolucion);
                alquiler.calcularMontoPorKilometros(auto, kilometrajeFinal);
                alquiler.calcularMontoPorDias(fechaDevolucion, auto);
                JOptionPane.showMessageDialog(this, alquiler.reporte(), "Devolución realizada con éxito", JOptionPane.INFORMATION_MESSAGE);
                auto.setKilometraje(kilometrajeFinal);
                auto.setEstado(true);
                auto.setCliente(null);
                alquiler.setEstadoAlquiler(false);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un alquiler activo para este vehículo.", "Sin Alquiler", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese valores numéricos válidos.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaActionPerformed

    private void txtKilometrajeFinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKilometrajeFinalKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (!Character.isDigit(caracter) || txtKilometrajeFinal.getText().length() >= 8) {
            evt.consume();
        }
        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtKilometrajeFinal.getText().contains("."))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtKilometrajeFinalKeyTyped

    private void txtDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (!Character.isDigit(caracter) || txtDia.getText().length() >= 2) {
            evt.consume();
        }
        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtDia.getText().contains("."))) {
            evt.consume();
        }

    }//GEN-LAST:event_txtDiaKeyTyped

    private void txtMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMesKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (!Character.isDigit(caracter) || txtMes.getText().length() >= 2) {
            evt.consume();
        }
        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtMes.getText().contains("."))) {
            evt.consume();
        }

    }//GEN-LAST:event_txtMesKeyTyped

    private void txtAnnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnnioKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (!Character.isDigit(caracter) || txtAnnio.getText().length() >= 4) {
            evt.consume();
        }
        if (((caracter < '0' || caracter > '9'))
                && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.' || txtAnnio.getText().contains("."))) {
            evt.consume();
        }

    }//GEN-LAST:event_txtAnnioKeyTyped

    private void txtKilometrajeFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKilometrajeFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKilometrajeFinalActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDevoluccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDevoluccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDevoluccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDevoluccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAnnio;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtKilometrajeFinal;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
