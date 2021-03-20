/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.vista;
import seguridad.datos.AplicacionDAO;
import seguridad.dominio.Aplicacion;
import seguridad.datos.AsignacionDAO;
import seguridad.dominio.Asignacion;
import seguridad.datos.ModulosDAO;
import seguridad.dominio.Modulos;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
/**
/**
 *
 * @author Rita Sipaque
 */
public class Asignacion_modulos extends javax.swing.JInternalFrame {
    ModulosDAO cargarCombobox = new ModulosDAO();
   
 DefaultTableModel modelo1;
    DefaultTableModel modelo2; 
   int estadovalidacion;
    int uno; 
    
   

    /**
     * Creates new form Asignacion_modulos
     */
    public Asignacion_modulos() {
        initComponents();
        cargarCombobox.query2(cbox_modulos);
          DefaultTableModel modelo1 = new DefaultTableModel();
          modelo1 = new DefaultTableModel();
          modelo1.addColumn("ID APLICACION");
          modelo1.addColumn("APLICACION");
        AplicacionDAO aplicacionDAO = new AplicacionDAO();
        List<Aplicacion> vendedores = aplicacionDAO.select();
        tablaAplicaciones.setModel(modelo1);
        String[] dato = new String[2];
        for (int i = 0; i < vendedores.size(); i++) {
            dato[0] = Integer.toString(vendedores.get(i).getId_Aplicacion());
            dato[1] = vendedores.get(i).getNombre_Aplicacion();
            modelo1.addRow(dato);
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

        TXT_NombreModulos = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbox_modulos = new javax.swing.JComboBox<>();
        jButtonAyuda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAplicaciones = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButtonPASARTODO = new javax.swing.JButton();
        jButtoPASARUNO = new javax.swing.JButton();
        jButtonQuitarTodo = new javax.swing.JButton();
        jButtonQuitarUno = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAplicaciones1 = new javax.swing.JTable();
        BT_Agregar = new javax.swing.JButton();
        Txt_Asignar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        REGISTAR = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Asignacion de Aplicacion a Modulos");
        setVisible(true);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Asignacion de Aplicaciones a Modulos");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Modulos  Disponibles:");

        jButtonAyuda.setText("Ayuda");
        jButtonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAyudaActionPerformed(evt);
            }
        });

        tablaAplicaciones.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaAplicaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Aplicacion", "Nombre Aplicacion "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaAplicaciones);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Aplicaciones Disponobles");

        jButtonPASARTODO.setText("►►");
        jButtonPASARTODO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPASARTODOActionPerformed(evt);
            }
        });

        jButtoPASARUNO.setText("►");
        jButtoPASARUNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoPASARUNOActionPerformed(evt);
            }
        });

        jButtonQuitarTodo.setText("◄◄");
        jButtonQuitarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitarTodoActionPerformed(evt);
            }
        });

        jButtonQuitarUno.setText("◄");
        jButtonQuitarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitarUnoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Asignar");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Quitar");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Aplicaciones Asignadas");

        tablaAplicaciones1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaAplicaciones1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Aplicacion"
            }
        ));
        jScrollPane2.setViewportView(tablaAplicaciones1);

        BT_Agregar.setText("Agregar");
        BT_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AgregarActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        REGISTAR.setText("Registrar");
        REGISTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addGap(131, 131, 131)
                        .addComponent(jButtonAyuda)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox_modulos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(TXT_NombreModulos, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(153, 153, 153))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtoPASARUNO, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonQuitarUno, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)))
                                    .addComponent(jButtonPASARTODO)
                                    .addComponent(jButtonQuitarTodo, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(48, 48, 48)))))))
                .addGap(205, 205, 205))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(REGISTAR)
                        .addGap(56, 56, 56)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BT_Agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Txt_Asignar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(327, 327, 327))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonAyuda))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbox_modulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_NombreModulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtoPASARUNO, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPASARTODO, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonQuitarUno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonQuitarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Agregar)
                    .addComponent(Txt_Asignar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REGISTAR)
                    .addComponent(jButton2))
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String valor=cbox_modulos.getSelectedItem().toString();
        int valorint=Integer.parseInt(valor);
        ModulosDAO perfilDAO = new ModulosDAO();
        Modulos perfilconsultar = new Modulos();
        perfilconsultar.setCodigo_modulo(valorint);
        perfilconsultar=perfilDAO.query(perfilconsultar);
        if (perfilconsultar.getCodigo_modulo()!=0) {
            estadovalidacion=1;
            TXT_NombreModulos.setText(perfilconsultar.getNombre_modulo());
        }else{

            estadovalidacion=0;
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAyudaActionPerformed
        // TODO add your handling code here:
        try {
            if ((new File("src\\main\\java\\ayudas\\Asignacion.Aplicacion.chm")).exists()) {
                Process p = Runtime
                .getRuntime()
                .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\ayudas\\Asignacion.Aplicacion.chm");
                p.waitFor();
            } else {
                System.out.println("La ayuda no Fue encontrada");
            }
            System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonAyudaActionPerformed

    private void jButtonPASARTODOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPASARTODOActionPerformed
        TableModel modelo1 = tablaAplicaciones.getModel();
        int [] filas = tablaAplicaciones.getSelectedRows();
        Object[] row = new Object[2];

        DefaultTableModel modelo2 = (DefaultTableModel)  tablaAplicaciones1.getModel();
        for(int i = 0; i< modelo1.getRowCount();i++){
            row [0] = modelo1.getValueAt(i,0).toString();

            modelo2.addRow(row);
        }

    }//GEN-LAST:event_jButtonPASARTODOActionPerformed

    private void jButtoPASARUNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoPASARUNOActionPerformed

        TableModel modelo1 = tablaAplicaciones.getModel();
        int uno = tablaAplicaciones.getSelectedRow();

        int [] filas = tablaAplicaciones.getSelectedRows();
        Object[] row = new Object[2];

        DefaultTableModel modelo2 = (DefaultTableModel)  tablaAplicaciones1.getModel();

        for (int i = 0; i< filas.length;i++){
            row [0]= modelo1.getValueAt(filas[i],0);
            row [0]= modelo1.getValueAt(filas[i],0);
            modelo2.addRow(row);

        }
        //            for(int i = 0; i< TABLA1.getRowCount();i++){
            //            String Datos [] = new String[2];
            //            Datos [0] = TABLA1.getValueAt(i,0).toString();
            //            Datos [1] = TABLA1.getValueAt(i,1).toString();
            //            modelo2.addRow(Datos);
            //
            //        }
        //        nuevatabla();

    }//GEN-LAST:event_jButtoPASARUNOActionPerformed

    private void jButtonQuitarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitarTodoActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo2 = (DefaultTableModel)  tablaAplicaciones1.getModel();
        int tres  = tablaAplicaciones1.getRowCount();
        for ( int i = tres-1; i>=0;i--){
            modelo2.removeRow(i);
        }
    }//GEN-LAST:event_jButtonQuitarTodoActionPerformed

    private void jButtonQuitarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitarUnoActionPerformed
        // TODO add your handling code here:

        DefaultTableModel modelo2 = (DefaultTableModel)  tablaAplicaciones1.getModel();

        int tres  = tablaAplicaciones1.getSelectedRow();
        if ( tres>=0){
            modelo2.removeRow(tres);
        }

    }//GEN-LAST:event_jButtonQuitarUnoActionPerformed

    private void BT_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AgregarActionPerformed
        // TODO add your handling code here:
        if(tablaAplicaciones1.getSelectedRow()>=0){
            try{
                DefaultTableModel tm = (DefaultTableModel)tablaAplicaciones1.getModel();
                String ID = String.valueOf(tm.getValueAt(tablaAplicaciones1.getSelectedRow(),0));

                Txt_Asignar.setText(ID);

            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"NO CONTIENE UN ID ");
            }

        }else{
            JOptionPane.showMessageDialog(this,"DEBE SELECCIONAR UN ID","SISTEMA",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BT_AgregarActionPerformed

    private void REGISTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTARActionPerformed
        // TODO add your handling code here:
        AsignacionDAO  vendedorDAO = new AsignacionDAO ();
        Asignacion vendedorAInsertar = new Asignacion();
        vendedorAInsertar.setPK_id_modulo(cbox_modulos.getSelectedItem().toString());
        vendedorAInsertar.setPK_id_aplicacion(Txt_Asignar.getText());
        vendedorDAO.insert(vendedorAInsertar);

    }//GEN-LAST:event_REGISTARActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo2 = (DefaultTableModel)  tablaAplicaciones1.getModel();
       int tres  = tablaAplicaciones1.getRowCount();
       for ( int i = tres-1; i>=0;i--){
           modelo2.removeRow(i);
       }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Agregar;
    private javax.swing.JButton REGISTAR;
    private javax.swing.JTextField TXT_NombreModulos;
    private javax.swing.JTextField Txt_Asignar;
    private javax.swing.JComboBox<String> cbox_modulos;
    private javax.swing.JButton jButtoPASARUNO;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAyuda;
    private javax.swing.JButton jButtonPASARTODO;
    private javax.swing.JButton jButtonQuitarTodo;
    private javax.swing.JButton jButtonQuitarUno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaAplicaciones;
    private javax.swing.JTable tablaAplicaciones1;
    // End of variables declaration//GEN-END:variables
}
