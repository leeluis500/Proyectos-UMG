/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoteleria.vista;

import Hoteleria.datos.HabitacionesDAO;
import Hoteleria.dominio.Habitaciones;
import Hoteleria.datos.AmaDeLlavesDAO;
import Hoteleria.datos.GuardarBitacoraDAO;
import Hoteleria.dominio.AmaDeLlaves;
import Hoteleria.datos.ObjetosPerdidosDAO;
import Hoteleria.dominio.ObjetoPerdido;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import seguridad.vista.GenerarPermisos;
import seguridad.vista.Login;

/**
 *
 * @author leelu
 */
public class ObjetosPerdidos extends javax.swing.JInternalFrame {
    DefaultTableModel modelo1;
    DefaultTableCellRenderer centro= new DefaultTableCellRenderer();
    //String codigoAplicacion="2004";

    /**
     * Creates new form ObjetoPerdido
     */
    public ObjetosPerdidos() {
        initComponents();
        cargar_habitaciones();
        fecha_actual();
        cargar_AmaDeLlaves();
        imprimir_Objetos();
        //habilitarAcciones();
    }
    
    /*void habilitarAcciones() {

        var codigoAplicacion = 2004;
        var usuario = Login.usuarioHoteleria;

        BtnIng.setEnabled(false);

        GenerarPermisos permisos = new GenerarPermisos();

        String[] permisosApp = new String[1];

        for (int i = 0; i < 1; i++) {
            permisosApp[i] = permisos.getAccionesAplicacion(codigoAplicacion, usuario)[i];
        }

        if (permisosApp[0].equals("1")) {
            System.out.println(permisosApp[0]);
            BtnIng.setEnabled(true);
        }
    }*/

    public void cargar_habitaciones() {
        txt_habitacion.addItem("Seleccionar...");
        HabitacionesDAO personaDAO = new HabitacionesDAO();
        List<Habitaciones> habitaciones = personaDAO.select();
        for (Habitaciones habitacion : habitaciones) {
            if (habitacion.getEstado_Habitacion()==1) {
            txt_habitacion.addItem(String.valueOf(habitacion.getId_Habitaciones()));   
            }
        }
    }
    
    public void cargar_AmaDeLlaves() {
        txt_ama.addItem("Seleccionar...");
        AmaDeLlavesDAO personaDAO = new AmaDeLlavesDAO();
        List<AmaDeLlaves> habitaciones = personaDAO.select();
        for (AmaDeLlaves habitacion : habitaciones) {
            if (habitacion.getEstado_Ama_De_Llaves()==1) {
            txt_ama.addItem(String.valueOf(habitacion.getId_Ama_De_Llaves()));   
            }
        }
    }
    
    public void fecha_actual() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        fecha_actual.setDate(date);
    }
    
    public void imprimir_Objetos() {
        modelo1 = new DefaultTableModel();   //ASIGNAMOS UN NUEVO DEFAULTABLEMODEL AL OBJETO MODELO1
        modelo1.addColumn("ID");
        modelo1.addColumn("Habitacion");      //LE AÑADIMOS COLUMNAS AL OBJETO MODELO
        modelo1.addColumn("Ama De Llaves");
        modelo1.addColumn("Fecha");      //LE AÑADIMOS COLUMNAS AL OBJETO MODELO
        modelo1.addColumn("Objeto");
        tabla1.setModel(modelo1);
        centro.setHorizontalAlignment(JLabel.CENTER);
        tabla1.getColumnModel().getColumn(0).setCellRenderer(centro);
        tabla1.getColumnModel().getColumn(1).setCellRenderer(centro);
        tabla1.getColumnModel().getColumn(2).setCellRenderer(centro);
        tabla1.getColumnModel().getColumn(3).setCellRenderer(centro);
        tabla1.getColumnModel().getColumn(4).setCellRenderer(centro);
        tabla1.getColumnModel().getColumn(0).setPreferredWidth(50);        
        tabla1.getColumnModel().getColumn(1).setPreferredWidth(50);
        tabla1.getColumnModel().getColumn(2).setPreferredWidth(50);
        tabla1.getColumnModel().getColumn(3).setPreferredWidth(50);
        tabla1.getColumnModel().getColumn(4).setPreferredWidth(100);
        ObjetosPerdidosDAO huespedes = new ObjetosPerdidosDAO();
        List<ObjetoPerdido> listarmetodos = huespedes.select();
        String datos[]= new String[5];
        for (ObjetoPerdido listar : listarmetodos) {
            datos[0]=listar.getIdObjeto();
                datos[1]=listar.getHabitacion();
               datos[2]=listar.getAma();
               datos[3]=listar.getFecha();
               datos[4]=listar.getObjeto();
               modelo1.addRow(datos);
               tabla1.setModel(modelo1);
        }
    }
    
    private void limpiar(){
        txt_objeto.setText("");
        txt_id.setText("");
    }
    
    private static boolean isNumeric(String cadena){
        try {
                Integer.parseInt(cadena);
                return true;
        } catch (NumberFormatException nfe){
                return false;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_ama = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txt_habitacion = new javax.swing.JComboBox<>();
        fecha_actual = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_objeto = new javax.swing.JTextField();
        BtnIng = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("INFORMACION"));

        jLabel1.setText("Ama De Llaves:");

        jLabel2.setText("Cod. Habitacion:");

        fecha_actual.setDateFormatString("yyyy-MM-dd");
        fecha_actual.setEnabled(false);
        fecha_actual.setOpaque(false);

        jLabel3.setText("Fecha:");

        jLabel4.setText("Objeto:");

        BtnIng.setText("Guardar");
        BtnIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("?");

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Editar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fecha_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_ama, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_objeto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnIng, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(fecha_actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_ama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_objeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnIng)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("OBJETOS"));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla1);

        jLabel5.setText("ID:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngActionPerformed
        // TODO add your handling code here:
        if (ObjetosPerdidos.isNumeric(txt_habitacion.getSelectedItem().toString())) {
            if (txt_habitacion.getSelectedItem().toString().length()!=0&&txt_ama.getSelectedItem().toString().length()!=0&&
                    txt_objeto.getText().length()!=0) {
            ObjetosPerdidosDAO huespedesdao = new ObjetosPerdidosDAO();
            ObjetoPerdido guardarmetodo = new ObjetoPerdido();
            guardarmetodo.setHabitacion(txt_habitacion.getSelectedItem().toString());
            guardarmetodo.setAma(txt_ama.getSelectedItem().toString());
            String fechaactual = new SimpleDateFormat("yyyy-MM-dd").format(fecha_actual.getDate());
            guardarmetodo.setFecha(fechaactual);
            guardarmetodo.setObjeto(txt_objeto.getText());
            huespedesdao.insert(guardarmetodo);
            imprimir_Objetos();
            JOptionPane.showMessageDialog(null, "Objeto guardado correctamente");
            /*GuardarBitacoraDAO guardarBitacora = new GuardarBitacoraDAO();
                    guardarBitacora.GuardarEnBitacora("Insertar", (codigoAplicacion), Login.usuarioHoteleria);*/
            }else{
            JOptionPane.showMessageDialog(null, "Existen campos vacios, por favor revise y llene los campos");
        }
            
        }else{
            JOptionPane.showMessageDialog(null, "Tiene Que Seleccionar una Habitacion");
        }
        limpiar();
    }//GEN-LAST:event_BtnIngActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (ObjetosPerdidos.isNumeric(txt_id.getText())) {

            ObjetosPerdidosDAO huespedesdao = new ObjetosPerdidosDAO();
            ObjetoPerdido buscarmetodo = new ObjetoPerdido();

            buscarmetodo.setIdObjeto(txt_id.getText());
            buscarmetodo = huespedesdao.query(buscarmetodo);

            txt_ama.setSelectedItem(buscarmetodo.getAma());
            txt_habitacion.setSelectedItem(buscarmetodo.getHabitacion());
            txt_objeto.setText(buscarmetodo.getObjeto());
            
        }else{
            JOptionPane.showMessageDialog(null,"El No. de indentificacion esta vacio y/o el codigo debe de ser solo números");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (txt_habitacion.getSelectedItem().toString().length()!=0&&txt_ama.getSelectedItem().toString().length()!=0&&
                    txt_objeto.getText().length()!=0) {
            ObjetosPerdidosDAO modulosDAO = new ObjetosPerdidosDAO();
            ObjetoPerdido moduloEliminar = new ObjetoPerdido();
            moduloEliminar.setIdObjeto(txt_id.getText());
            modulosDAO.delete(moduloEliminar);
            imprimir_Objetos();
            JOptionPane.showMessageDialog(null, "Huesped eliminado correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "El No. de indentificacion esta vacio y/o el codigo debe de ser solo números");
                //Si el campo esta vacio o no inserta números muestra un mensaje de error
        }
            limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (ObjetosPerdidos.isNumeric(txt_habitacion.getSelectedItem().toString())) {
            if (txt_habitacion.getSelectedItem().toString().length()!=0&&txt_ama.getSelectedItem().toString().length()!=0&&
                    txt_objeto.getText().length()!=0) {
            ObjetosPerdidosDAO huespedesdao = new ObjetosPerdidosDAO();
            ObjetoPerdido modificarmetodo = new ObjetoPerdido();
            modificarmetodo.setIdObjeto(txt_id.getText());
            modificarmetodo.setAma(txt_ama.getSelectedItem().toString());
            modificarmetodo.setHabitacion(txt_habitacion.getSelectedItem().toString());
            String fechaactual = new SimpleDateFormat("yyyy-MM-dd").format(fecha_actual.getDate());
            modificarmetodo.setFecha(fechaactual);
            modificarmetodo.setObjeto(txt_objeto.getText());
            huespedesdao.update(modificarmetodo);
            imprimir_Objetos();
            JOptionPane.showMessageDialog(null, "Objeto actualizado correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Existen campos vacios, por favor revise y llene los campos");
        }
        }else{
            JOptionPane.showMessageDialog(null, "NO. de habitacion no puede estar vacio");
        }
        limpiar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {                                         
    MDIHoteleria.logo.setVisible(true);
    }                                        

    private void formInternalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {                                              
    MDIHoteleria.logo.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIng;
    private com.toedter.calendar.JDateChooser fecha_actual;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    private javax.swing.JComboBox<String> txt_ama;
    private javax.swing.JComboBox<String> txt_habitacion;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_objeto;
    // End of variables declaration//GEN-END:variables
}