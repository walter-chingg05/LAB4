/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labp5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author walle
 */
public class HISTORIAL extends javax.swing.JFrame {

    
    LinkedList<USUARIO>USUARIOS = new LinkedList<>(); 
    /**
     * Creates new form HISTORIAL
     */
    public HISTORIAL() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NombreTextField = new javax.swing.JTextField();
        SemestreTextField = new javax.swing.JTextField();
        Crear = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Cargar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Semestre:");

        NombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTextFieldActionPerformed(evt);
            }
        });

        Crear.setText("Crear");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar ");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Cargar.setText("Cargar");
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("REGISTRO DE ESTUDIANTES ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(72, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SemestreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Crear)
                                        .addGap(50, 50, 50)
                                        .addComponent(Cargar)
                                        .addGap(58, 58, 58)
                                        .addComponent(Guardar)))
                                .addGap(47, 47, 47)))))
                .addContainerGap(334, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SemestreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cargar)
                    .addComponent(Crear)
                    .addComponent(Guardar))
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTextFieldActionPerformed

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
     USUARIO U = new USUARIO();
     U.setId(USUARIOS.size());
     U.setNombre(NombreTextField.getText());
     U.setSemestre(SemestreTextField.getText());
     
      USUARIOS.add(U); 
      
      NombreTextField.setText("");
      SemestreTextField.setText(""); 
      
      LlenarTabla();
    }//GEN-LAST:event_CrearActionPerformed

    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
     JFileChooser seleccionarArchivo = new JFileChooser ();
     FileNameExtensionFilter filtro = new  FileNameExtensionFilter("Archivos csv","csv");
     
     seleccionarArchivo.setFileFilter(filtro);
     
     int seleccionar = seleccionarArchivo.showOpenDialog(this);
     
        if (seleccionar == JFileChooser.APPROVE_OPTION) {
            
            File archivo = seleccionarArchivo.getSelectedFile();
            cargarArchivo(archivo);
        } 
     
    }//GEN-LAST:event_CargarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
     JFileChooser seleccionarArchivo = new JFileChooser ();
     FileNameExtensionFilter filtro = new  FileNameExtensionFilter("csv","csv");
     
     seleccionarArchivo.setFileFilter(filtro);
     
     int seleccionar = seleccionarArchivo.showOpenDialog(this);
     
        if (seleccionar == JFileChooser.APPROVE_OPTION) {
            
            File archivo = seleccionarArchivo.getSelectedFile();
            guardarArchivo(archivo);
        } 
    }//GEN-LAST:event_GuardarActionPerformed
    public void guardarArchivo(File archivo){
    
    
    FileWriter fichero = null;
    PrintWriter pw= null;
    
    
    try{
    
        fichero = new FileWriter(archivo);
        pw = new PrintWriter(fichero);
        
        for (USUARIO U: USUARIOS) {
            
            String linea = U.getId()+";"+U.getNombre()+";"+U.getSemestre();
            pw.println(linea);
        }
    }catch(Exception ex){
        
        ex.printStackTrace();
    }
    finally{
       try{
           if (fichero!=null) {
               fichero.close();
           }
       
           }catch(Exception e){
              e.printStackTrace();
           }
    }
    }
    
    public void cargarArchivo(File archivo){
    
    FileReader fr = null;
    BufferedReader br = null;
    
    try{
    fr = new FileReader(archivo);
    br = new BufferedReader(fr);
        
    String linea;
    
    while((linea = br.readLine())!=null){
        
      
      String arreglo [] = linea.split(",");
        if (arreglo.length>=3) {
            USUARIO U = new USUARIO();
            U.setId(Integer.parseInt(arreglo[0]));
            U.setNombre(arreglo[1]);
            U.setSemestre(arreglo[2]);
            USUARIOS.add(U);
            
        }
    }
    LlenarTabla();
    
      }catch(Exception ex){
          ex.printStackTrace();
    
    }
    finally{
    
        try{
            if (fr!=null) {
                fr.close();
            }
        }catch(Exception ex){
        ex.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(HISTORIAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HISTORIAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HISTORIAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HISTORIAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HISTORIAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cargar;
    private javax.swing.JButton Crear;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField NombreTextField;
    private javax.swing.JTextField SemestreTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void LlenarTabla() {
        DefaultTableModel mD = new  DefaultTableModel (new String[]{"ID","NOMBRE","SEMESTRE"},USUARIOS.size());
        
        jTable1.setModel(mD);
        
        TableModel  Tm = jTable1.getModel();
        
        for (int i = 0; i < USUARIOS.size(); i++) {
            
            USUARIO U = USUARIOS.get(i);
            
            Tm.setValueAt(U.getId(), i, 0);
            Tm.setValueAt(U.getNombre(), i, 1);
            Tm.setValueAt(U.getSemestre(), i, 2);
            
        }
    }
}
