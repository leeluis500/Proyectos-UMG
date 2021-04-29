/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoteleria.vista;

import com.formdev.flatlaf.FlatLightLaf;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import seguridad.vista.GenerarPermisos;
import seguridad.vista.Login;
import seguridad.vista.MDI_Components;

/**
 *
 * @author Herbert Leonel Dominguez Chavez      9959-19-5644
 */
public class MDIHoteleria extends javax.swing.JFrame {

    private Mantenimiento_AmaDeLlaves formMantenimiento_Ama_De_Llaves;
    private Mantenimiento_habitaciones formMantenimiento_habitaciones;
    private Mantenimiento_FormasDePago formMantenimiento_FormasDePago;
    private Mantenimiento_Servicios formMantenimiento_Servicios;
    private Mantenimiento_Huespedes formMantenimiento_Huespedes;
    private Mantenimiento_Pisos formMantenimiento_Pisos;
    
   
    /**
     * Creates new form MDIHoteleria
     */
    public MDIHoteleria() throws UnknownHostException {
        initComponents();
        logo(); 
        GenerarPermisos generarPermisos = new GenerarPermisos();
        
        

        var usuario = Login.usuarioSesion;
        var modulo = "Hoteleria";

        generarPermisos.getPermisos(modulo, usuario);
    }
    public void logo(){
        Icon icon = new ImageIcon("C:src/main/java/Hoteleria/reportes/Imagen1.png");                
        if(icon != null){
            //Agrega Icono
            logo.setIcon(icon);
        }else{
            //No existe imagen.
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        logo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_archivo = new javax.swing.JMenu();
        menu_catalogos = new javax.swing.JMenu();
        submenu_mantenimientos = new javax.swing.JMenu();
        mnt_amadellaves = new javax.swing.JMenuItem();
        mnt_habitaciones = new javax.swing.JMenuItem();
        mnt_servicios = new javax.swing.JMenuItem();
        mnt_huespedes = new javax.swing.JMenuItem();
        mnt_formasdepago = new javax.swing.JMenuItem();
        mnt_pisos = new javax.swing.JMenuItem();
        menu_procesos = new javax.swing.JMenu();
        submenu_procesos = new javax.swing.JMenu();
        menu_informes = new javax.swing.JMenu();
        menu_herramientas = new javax.swing.JMenu();
        menu_ayuda = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modulo de Hotelería [ip] [user]");

        jDesktopPane1.setBackground(new java.awt.Color(228, 68, 68));

        jDesktopPane1.setLayer(logo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 1050, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 401, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        menu_archivo.setText("Archivo");
        menu_archivo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jMenuBar1.add(menu_archivo);

        menu_catalogos.setText("Catálogos");
        menu_catalogos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        submenu_mantenimientos.setText("Mantenimientos");

        mnt_amadellaves.setText("Mantenimiento Ama de Llaves");
        mnt_amadellaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnt_amadellavesActionPerformed(evt);
            }
        });
        submenu_mantenimientos.add(mnt_amadellaves);

        mnt_habitaciones.setText("Mantenimiento Habitaciones");
        mnt_habitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnt_habitacionesActionPerformed(evt);
            }
        });
        submenu_mantenimientos.add(mnt_habitaciones);

        mnt_servicios.setText("Mantenimiento de Servicios");
        mnt_servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnt_serviciosActionPerformed(evt);
            }
        });
        submenu_mantenimientos.add(mnt_servicios);

        mnt_huespedes.setText("Mantenimiento de Huespedes");
        mnt_huespedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnt_huespedesActionPerformed(evt);
            }
        });
        submenu_mantenimientos.add(mnt_huespedes);

        mnt_formasdepago.setText("Mantenimiento de Formas de Pago");
        mnt_formasdepago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnt_formasdepagoActionPerformed(evt);
            }
        });
        submenu_mantenimientos.add(mnt_formasdepago);

        mnt_pisos.setText("Mantenimiento de Pisos");
        mnt_pisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnt_pisosActionPerformed(evt);
            }
        });
        submenu_mantenimientos.add(mnt_pisos);

        menu_catalogos.add(submenu_mantenimientos);

        jMenuBar1.add(menu_catalogos);

        menu_procesos.setText("Procesos");
        menu_procesos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        submenu_procesos.setText("Procesos");
        menu_procesos.add(submenu_procesos);

        jMenuBar1.add(menu_procesos);

        menu_informes.setText("Informes");
        menu_informes.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jMenuBar1.add(menu_informes);

        menu_herramientas.setText("Herramientas");
        menu_herramientas.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jMenuBar1.add(menu_herramientas);

        menu_ayuda.setText("Ayuda");
        menu_ayuda.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jMenuBar1.add(menu_ayuda);

        jMenu1.setText("Cerrar Sesión");
        jMenu1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnt_amadellavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnt_amadellavesActionPerformed
        formMantenimiento_Ama_De_Llaves = new Mantenimiento_AmaDeLlaves();
        formMantenimiento_Ama_De_Llaves.setVisible(true);
        jDesktopPane1.add(formMantenimiento_Ama_De_Llaves);
    }//GEN-LAST:event_mnt_amadellavesActionPerformed

    private void mnt_habitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnt_habitacionesActionPerformed
        formMantenimiento_habitaciones = new Mantenimiento_habitaciones();
        formMantenimiento_habitaciones.setVisible(true);
        jDesktopPane1.add(formMantenimiento_habitaciones);
    }//GEN-LAST:event_mnt_habitacionesActionPerformed

    private void mnt_serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnt_serviciosActionPerformed
        formMantenimiento_Servicios = new Mantenimiento_Servicios();
        formMantenimiento_Servicios.setVisible(true);
        jDesktopPane1.add(formMantenimiento_Servicios);
    }//GEN-LAST:event_mnt_serviciosActionPerformed

    private void mnt_huespedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnt_huespedesActionPerformed
        formMantenimiento_Huespedes = new Mantenimiento_Huespedes();
        formMantenimiento_Huespedes.setVisible(true);
        jDesktopPane1.add(formMantenimiento_Huespedes);
    }//GEN-LAST:event_mnt_huespedesActionPerformed

    private void mnt_formasdepagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnt_formasdepagoActionPerformed
        formMantenimiento_FormasDePago = new Mantenimiento_FormasDePago();
        formMantenimiento_FormasDePago.setVisible(true);
        jDesktopPane1.add(formMantenimiento_FormasDePago);
    }//GEN-LAST:event_mnt_formasdepagoActionPerformed

    private void mnt_pisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnt_pisosActionPerformed
        formMantenimiento_Pisos = new Mantenimiento_Pisos();
        formMantenimiento_Pisos.setVisible(true);
        jDesktopPane1.add(formMantenimiento_Pisos);
    }//GEN-LAST:event_mnt_pisosActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
    int respuesta_cs = JOptionPane.showConfirmDialog(this, "¿Desea Cerrar Sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);

        if (respuesta_cs == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //FLATLAF
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.out.println(ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MDIHoteleria().setVisible(true);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(MDIHoteleria.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JLabel logo;
    private javax.swing.JMenu menu_archivo;
    private javax.swing.JMenu menu_ayuda;
    private javax.swing.JMenu menu_catalogos;
    private javax.swing.JMenu menu_herramientas;
    private javax.swing.JMenu menu_informes;
    private javax.swing.JMenu menu_procesos;
    public static javax.swing.JMenuItem mnt_amadellaves;
    public static javax.swing.JMenuItem mnt_formasdepago;
    public static javax.swing.JMenuItem mnt_habitaciones;
    public static javax.swing.JMenuItem mnt_huespedes;
    public static javax.swing.JMenuItem mnt_pisos;
    public static javax.swing.JMenuItem mnt_servicios;
    public static javax.swing.JMenu submenu_mantenimientos;
    public static javax.swing.JMenu submenu_procesos;
    // End of variables declaration//GEN-END:variables
}
