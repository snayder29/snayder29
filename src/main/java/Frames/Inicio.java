/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import Hilos.hora;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author snayd
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        
    // evento para que cuando se presione la X de la ventana, salga un mensaje de
		// alerta
    addWindowListener(new WindowAdapter() {
        @Override
	public void windowClosing(WindowEvent e) {
	// llamo al metodo cerrar
	cerrar();
	}
    });    
        
    btnEliminar = new com.icm.components.metro.ButtonMenuMetroICM();
    btnAgregar = new com.icm.components.metro.ButtonMenuMetroICM();
    btnModificar = new com.icm.components.metro.ButtonMenuMetroICM();
    
        // hilo de la hora -- llamo ala clase hora
		hora hilo = new hora(lblhora);
		// inicio el hilo
		hilo.start();
		// fecha
		fecha();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_1 = new org.edisoncor.gui.panel.PanelCurves();
        btnM_Venta = new com.icm.components.metro.ButtonMenuMetroICM();
        btnN_Venta1 = new com.icm.components.metro.ButtonMenuMetroICM();
        lblUsuario = new org.edisoncor.gui.label.LabelTask();
        panel_2 = new org.edisoncor.gui.panel.PanelTranslucido();
        btnUsuarios = new org.edisoncor.gui.button.ButtonTask();
        btnSalir = new org.edisoncor.gui.button.ButtonTask();
        btnVentas = new org.edisoncor.gui.button.ButtonTask();
        btnReportes = new org.edisoncor.gui.button.ButtonTask();
        buttonTask5 = new org.edisoncor.gui.button.ButtonTask();
        lblhora = new org.edisoncor.gui.label.LabelTask();
        lbldia = new org.edisoncor.gui.label.LabelTask();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Libreria");
        setBackground(new java.awt.Color(51, 255, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_1.setFocusable(false);
        panel_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnM_Venta.setBackground(java.awt.Color.orange);
        btnM_Venta.setForeground(new java.awt.Color(0, 0, 0));
        btnM_Venta.setIcon(new javax.swing.ImageIcon("C:\\Users\\snayd\\Documents\\Proyectos Netbeans\\Libreria\\imagenes\\carro(1).png")); // NOI18N
        btnM_Venta.setText("Modificar Venta");
        btnM_Venta.setFocusable(false);
        btnM_Venta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        panel_1.add(btnM_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 180, 170));

        btnN_Venta1.setBackground(new java.awt.Color(51, 153, 255));
        btnN_Venta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\snayd\\Documents\\Proyectos Netbeans\\Libreria\\imagenes\\carro(1).png")); // NOI18N
        btnN_Venta1.setText("Nueva Venta");
        btnN_Venta1.setFocusable(false);
        btnN_Venta1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        panel_1.add(btnN_Venta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 180, 170));

        getContentPane().add(panel_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 1120, 740));

        lblUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\snayd\\Documents\\Proyectos Netbeans\\Libreria\\imagenes\\usuario.png")); // NOI18N
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 660, -1));

        panel_2.setBackground(new java.awt.Color(255, 255, 255));
        panel_2.setFocusable(false);
        panel_2.setOpaque(false);
        panel_2.setRequestFocusEnabled(false);
        panel_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_2MouseExited(evt);
            }
        });
        panel_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUsuarios.setIcon(new javax.swing.ImageIcon("C:\\Users\\snayd\\Documents\\Proyectos Netbeans\\Libreria\\imagenes\\usuario.png")); // NOI18N
        btnUsuarios.setText("Usuario");
        btnUsuarios.setCategoryFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnUsuarios.setCategorySmallFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        btnUsuarios.setDescription("Gestión de usuarios");
        btnUsuarios.setFocusable(false);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        panel_2.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 12, 240, 63));

        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\snayd\\Documents\\Proyectos Netbeans\\imagenes\\imagenes\\apagar.png")); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setCategoryFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnSalir.setCategorySmallFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnSalir.setDescription("Cerrar Sesión");
        btnSalir.setFocusable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panel_2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 679, 240, 61));

        btnVentas.setIcon(new javax.swing.ImageIcon("C:\\Users\\snayd\\Documents\\Proyectos Netbeans\\Libreria\\imagenes\\ventas.png")); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setCategoryFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnVentas.setDescription("Gestión de ventas");
        btnVentas.setFocusable(false);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        panel_2.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 240, 63));

        btnReportes.setIcon(new javax.swing.ImageIcon("C:\\Users\\snayd\\Documents\\Proyectos Netbeans\\Libreria\\imagenes\\Registro2.png")); // NOI18N
        btnReportes.setText("Reportes");
        btnReportes.setCategoryFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnReportes.setDescription("Gestión de reportes");
        btnReportes.setFocusable(false);
        panel_2.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 240, 63));

        buttonTask5.setIcon(new javax.swing.ImageIcon("C:\\Users\\snayd\\Documents\\Proyectos Netbeans\\Libreria\\imagenes\\LIBROS.png")); // NOI18N
        buttonTask5.setText("Libros");
        buttonTask5.setCategoryFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonTask5.setDescription("Gestión de Libros");
        buttonTask5.setFocusable(false);
        buttonTask5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask5ActionPerformed(evt);
            }
        });
        panel_2.add(buttonTask5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 240, 63));

        getContentPane().add(panel_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 740));

        lblhora.setIcon(new javax.swing.ImageIcon("C:\\Users\\snayd\\Documents\\Proyectos Netbeans\\Libreria\\imagenes\\hora.png")); // NOI18N
        lblhora.setDescription("Hora");
        getContentPane().add(lblhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(922, 740, 260, -1));

        lbldia.setIcon(new javax.swing.ImageIcon("C:\\Users\\snayd\\Documents\\Proyectos Netbeans\\Libreria\\imagenes\\fecha.png")); // NOI18N
        lbldia.setDescription("Fecha");
        getContentPane().add(lbldia, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 740, 260, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void fecha() {
		// llamo al metodo fecha
		String fecha = Fecha();
		lbldia.setText(fecha);
	}

	public String nombre(int mes) {
		switch (mes) {
		case 0:
			return "Enero";
		case 1:
			return "Febrero";
		case 2:
			return "Marzo";
		case 3:
			return "Abril";
		case 4:
			return "Mayo";
		case 5:
			return "Junio";
		case 6:
			return "Julio";
		case 7:
			return "Agosto";
		case 8:
			return "Septiembre";
		case 9:
			return "Octubre";
		case 10:
			return "Noviembre";
		case 11:
			return "Diciembre";
		}
		return "Error";
	}

	public String Fecha() {
		// importo la libreria GregorianCalendar para hacer la funcion de fecha
		GregorianCalendar fecha = new GregorianCalendar();
		// declaro como entero el dia
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
		// declaro como entero el mes
		int mes = fecha.get(Calendar.MONTH);
		// declaro como entero el año
		int año = fecha.get(Calendar.YEAR);
		// le asigno a mifecha el formtato dia/mes/año
		String mifecha = String.valueOf(dia) + "/" + nombre(mes) + "/" + String.valueOf(año);
		// retorna mifecha
		return mifecha;
	}

	void cerrar() {
		Object[] opciones = { "Aceptar", "Cancelar" };
		int eleccion = JOptionPane.showOptionDialog(this, "En realidad desea realizar cerrar la aplicacion",
				"Mensaje de Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones,
				"Aceptar");
		if (eleccion == JOptionPane.YES_OPTION) {
			// Cerrar_Aplicacion cerrar = new Cerrar_Aplicacion();
			// cerrar.setVisible(true);
			dispose();
		}
	}
    
    
    
    private void panel_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_2MouseExited
        // TODO add your handling code here:
        
        panel_2.setBounds(0, 0, 60, 740);
    }//GEN-LAST:event_panel_2MouseExited

    private void panel_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_2MouseEntered
        // TODO add your handling code here:
        panel_2.setBounds(0, 0, 210, 740);
    }//GEN-LAST:event_panel_2MouseEntered

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        
    panel_1.removeAll();
    panel_1.repaint();

        btnEliminar.setBackground(new java.awt.Color(255, 51, 0));
        btnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\snayd\\Documents\\Proyectos Netbeans\\Libreria\\imagenes\\sesion.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        panel_1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, 190, 190));

        btnAgregar.setBackground(new java.awt.Color(0, 153, 51));
        btnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.setIcon(new javax.swing.ImageIcon("C:\\Users\\snayd\\Documents\\Proyectos Netbeans\\Libreria\\imagenes\\sesion.png")); // NOI18N
        btnAgregar.setText("Agregar ");
        btnAgregar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        panel_1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 190, 190));

        btnModificar.setBackground(new java.awt.Color(204, 204, 0));
        btnModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModificar.setForeground(new java.awt.Color(51, 51, 51));
        btnModificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\snayd\\Documents\\Proyectos Netbeans\\Libreria\\imagenes\\sesion.png")); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        panel_1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 190, 190));
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void buttonTask5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTask5ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
        Login sesion = new Login();
        sesion.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
        
        panel_1.removeAll();
        panel_1.repaint();
    }//GEN-LAST:event_btnVentasActionPerformed

    
   
    
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    
    private com.icm.components.metro.ButtonMenuMetroICM btnAgregar;
    private com.icm.components.metro.ButtonMenuMetroICM btnEliminar;
    private com.icm.components.metro.ButtonMenuMetroICM btnModificar;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.icm.components.metro.ButtonMenuMetroICM btnM_Venta;
    private com.icm.components.metro.ButtonMenuMetroICM btnN_Venta1;
    private org.edisoncor.gui.button.ButtonTask btnReportes;
    private org.edisoncor.gui.button.ButtonTask btnSalir;
    private org.edisoncor.gui.button.ButtonTask btnUsuarios;
    private org.edisoncor.gui.button.ButtonTask btnVentas;
    private org.edisoncor.gui.button.ButtonTask buttonTask5;
    private org.edisoncor.gui.label.LabelTask lblUsuario;
    private org.edisoncor.gui.label.LabelTask lbldia;
    private org.edisoncor.gui.label.LabelTask lblhora;
    private org.edisoncor.gui.panel.PanelCurves panel_1;
    private org.edisoncor.gui.panel.PanelTranslucido panel_2;
    // End of variables declaration//GEN-END:variables
}
