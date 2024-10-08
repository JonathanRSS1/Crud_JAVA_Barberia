/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ctrlBarberos;
import Modelo.Barberos;
import java.awt.Color;


/**
 *
 * @author Estudiante
 */
public class frmBarberos extends javax.swing.JFrame {

    /**
     * Creates new form frmBarberos
     */
    public frmBarberos() {
        initComponents();   
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel6, "src/imagenes/BARBER.png");       
    }
    
    
    public static void initFrmBarberos(){
    
        Barberos Modelo = new Barberos();
        frmBarberos Vista = new frmBarberos();
        ctrlBarberos Controlador = new ctrlBarberos(Modelo, Vista);
        
        Vista.setVisible(true);    
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bordesRendodeados2 = new Componentes.BordesRendodeados();
        txtNombre = new Componentes.TextField();
        txtEdad = new Componentes.TextField();
        txtPeso = new Componentes.TextField();
        txtCorreo = new Componentes.TextField();
        btnAgregar = new Componentes.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbBarbero = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnEliminar = new Componentes.Button();
        btnActualizar = new Componentes.Button();
        btnLimpiar = new Componentes.Button();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        bordesRendodeados2.setBackground(new java.awt.Color(0, 0, 0));
        bordesRendodeados2.setRoundBottomLeft(20);
        bordesRendodeados2.setRoundBottomRight(20);
        bordesRendodeados2.setRoundTopLeft(20);
        bordesRendodeados2.setRoundTopRight(20);

        txtNombre.setRound(15);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtEdad.setRound(15);
        txtEdad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEdadMousePressed(evt);
            }
        });
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        txtPeso.setRound(15);
        txtPeso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPesoMousePressed(evt);
            }
        });
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        txtCorreo.setRound(15);
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(0, 51, 51));
        btnAgregar.setText("Agregar");
        btnAgregar.setRound(20);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jtbBarbero.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtbBarbero);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Algerian", 0, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Barber Shop Ruffians");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Harlow Solid Italic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Agrega Tu Barbero");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BARBER.png"))); // NOI18N

        btnEliminar.setText("Eliminar");

        btnActualizar.setText("Actualizar");

        btnLimpiar.setText("Limpiar");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EDAD");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NOMBRE");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CORREO");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PESO");

        javax.swing.GroupLayout bordesRendodeados2Layout = new javax.swing.GroupLayout(bordesRendodeados2);
        bordesRendodeados2.setLayout(bordesRendodeados2Layout);
        bordesRendodeados2Layout.setHorizontalGroup(
            bordesRendodeados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bordesRendodeados2Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bordesRendodeados2Layout.createSequentialGroup()
                .addGroup(bordesRendodeados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bordesRendodeados2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(bordesRendodeados2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(bordesRendodeados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bordesRendodeados2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGroup(bordesRendodeados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bordesRendodeados2Layout.createSequentialGroup()
                                        .addGap(144, 144, 144)
                                        .addComponent(jLabel2))
                                    .addGroup(bordesRendodeados2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(bordesRendodeados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(bordesRendodeados2Layout.createSequentialGroup()
                                                .addGroup(bordesRendodeados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(bordesRendodeados2Layout.createSequentialGroup()
                                                        .addGap(31, 31, 31)
                                                        .addComponent(jLabel5))
                                                    .addGroup(bordesRendodeados2Layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jLabel7))
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(bordesRendodeados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(bordesRendodeados2Layout.createSequentialGroup()
                                                .addGroup(bordesRendodeados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(bordesRendodeados2Layout.createSequentialGroup()
                                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(66, 66, 66)
                                                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(57, 57, 57)
                                                .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))))
                .addGap(38, 38, 38))
        );
        bordesRendodeados2Layout.setVerticalGroup(
            bordesRendodeados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bordesRendodeados2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bordesRendodeados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bordesRendodeados2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43)
                        .addGroup(bordesRendodeados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(43, 43, 43)
                        .addGroup(bordesRendodeados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(44, 44, 44)
                        .addGroup(bordesRendodeados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(38, 38, 38)
                        .addGroup(bordesRendodeados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bordesRendodeados2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(14, 14, 14)))
                .addGap(20, 20, 20)
                .addGroup(bordesRendodeados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bordesRendodeados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(bordesRendodeados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jLabel1.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bordesRendodeados2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bordesRendodeados2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
      
    
  
        // TODO add your handling code here: 
    }//GEN-LAST:event_txtPesoActionPerformed

    
    
 
    
    
    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
          
// TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        if (txtNombre.getText().equals("")) {
        txtNombre.setText("");
        txtNombre.setForeground(Color.black);
    }
    
      if(txtEdad.getText().isEmpty()){
      txtEdad.setText("Ingrese su edad");
      txtEdad.setForeground(Color.gray);
      }
      
    
      if(txtPeso.getText().isEmpty()){
      txtPeso.setText("Ingrese su peso");
      txtPeso.setForeground(Color.gray);
      }
            
          
    if (txtCorreo.getText().isEmpty()) {
        txtCorreo.setText("Ingrese su correo");
        txtCorreo.setForeground(Color.gray);
    }// TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtEdadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEdadMousePressed
     if (txtEdad.getText().equals("")){
      txtEdad.setText("");
      txtEdad.setForeground(Color.black);
      }  
      
      
      if (txtNombre.getText().isEmpty()){
     txtNombre.setText("ingrese su Nombre");
     txtNombre.setForeground(Color.gray);
     }
      
       if(txtPeso.getText().isEmpty()){
      txtPeso.setText("Ingrese su peso");
      txtPeso.setForeground(Color.gray);
      }
            
          
    if (txtCorreo.getText().isEmpty()) {
        txtCorreo.setText("Ingrese su correo");
        txtCorreo.setForeground(Color.gray);
    }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadMousePressed

    private void txtPesoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPesoMousePressed
       if (txtPeso.getText().equals("")){
        txtPeso.setText("");
        txtPeso.setForeground(Color.black);
    }
      
    
      if(txtEdad.getText().isEmpty()){
      txtEdad.setText("Ingrese su edad");
      txtEdad.setForeground(Color.gray);
      }
      
    
     if (txtNombre.getText().isEmpty()){
     txtNombre.setText("ingrese su Nombre");
     txtNombre.setForeground(Color.gray);
     }
          
    if (txtCorreo.getText().isEmpty()) {
        txtCorreo.setText("Ingrese su correo");
        txtCorreo.setForeground(Color.gray);
    }
        
// TODO add your handling code here:
    }//GEN-LAST:event_txtPesoMousePressed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
     if(txtCorreo.getText().equals("")){
     txtCorreo.setText("");
     txtCorreo.setForeground(Color.black);
     }
        
     if (txtNombre.getText().isEmpty()){
     txtNombre.setText("ingrese su Nombre");
     txtNombre.setForeground(Color.gray);
     }
     
      if(txtEdad.getText().isEmpty()){
      txtEdad.setText("Ingrese su edad");
      txtEdad.setForeground(Color.gray);
      }
      
    
      if(txtPeso.getText().isEmpty()){
      txtPeso.setText("Ingrese su peso");
      txtPeso.setForeground(Color.gray);
      }

// TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMousePressed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(frmBarberos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBarberos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBarberos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBarberos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                initFrmBarberos();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes.BordesRendodeados bordesRendodeados2;
    public Componentes.Button btnActualizar;
    public Componentes.Button btnAgregar;
    public Componentes.Button btnEliminar;
    public Componentes.Button btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtbBarbero;
    public Componentes.TextField txtCorreo;
    public Componentes.TextField txtEdad;
    public Componentes.TextField txtNombre;
    public Componentes.TextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
