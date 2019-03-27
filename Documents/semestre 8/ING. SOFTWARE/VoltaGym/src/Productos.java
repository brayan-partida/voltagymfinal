
import Conexiones.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cbreaker95
 */
public class Productos extends javax.swing.JFrame {
        Conexion con=new Conexion();
    Connection cn= con.Conexion();
        ResultSet Resultado;
     Statement sentencia;
    public Productos() {
     
        initComponents();
       // bloquear();
        visualizar_datos();
        combo_nombre();
    }
    
    
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPresentacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        Marca = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JSpinner();
        btnGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtPrecio = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Productos");
        setSize(new java.awt.Dimension(300, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtPresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, -1));

        jLabel4.setText("Precio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, -1));

        Marca.setText("Marca");
        getContentPane().add(Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 114, -1, 20));

        jLabel5.setText("Cantidad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

        jButton3.setText("jButton3");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jLabel6.setText("Codigo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel3.setText("Presentacion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 20));

        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 60, 20));

        btnGuardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Documents\\semestre 8\\ING. SOFTWARE\\VoltaGym\\src\\Imagenes\\documento.png")); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 140, 40));

        jButton2.setText("jButton2");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 160, 240));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, -1));

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 130, -1));
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, 20));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 610, 170));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proteinas.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
      
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
            try {
                inserta_Productos();
            } catch (SQLException ex) {
                Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      cantidad();
      
    }//GEN-LAST:event_jButton1ActionPerformed

    public void visualizar_datos(){
         DefaultTableModel model =new DefaultTableModel();
      model.addColumn("ID");
      model.addColumn("Nombre");
      model.addColumn("Presentacion");
      model.addColumn("Marca");
      model.addColumn("Precio");
      model.addColumn("Codigo");
      
     
     Tabla.setModel(model);
      String datos[]=new String[6];
    Resultado = null;
      try{
          sentencia=cn.createStatement();
    Resultado=sentencia.executeQuery("SELECT * FROM Productos");
      while(Resultado.next()){
         
           datos[0]=Resultado.getString(1);
           datos[1]=Resultado.getString(2);
           datos[2]=Resultado.getString(3);
           datos[3]=Resultado.getString(4);
            datos[4]=Resultado.getString(5);
           datos[5]=Resultado.getString(6);
           model.addRow(datos);
      }
      Tabla.setModel(model);
      
      }
      catch(Exception e){
          System.err.println("no se pudo visualizar"); 
      }
  
    }//termina visaulizar datos-----------------------
    
    public void bloquear(){
        txtCodigo.setEnabled(false);
        
    }//BLOQUEAR TEXTO
    
       public void inserta_Productos() throws SQLException {
           int t =(int) txtCantidad.getValue();
        try{
            for (int i=0 ; i<t;i++ ){
        PreparedStatement preparar=cn.prepareStatement("insert into Productos "
                + "(Nombre_Productos,"
                + "Productos_Presentacion,"
                + " Marca_Productos ,"
                + "Precio_Productos,"
                + "Codigo_Productos)"
                + " VALUES (?,?,?,?,?)");
        preparar.setString(1,txtNombre.getText());
        preparar.setString(2, txtPresentacion.getText());
          preparar.setString(3, txtMarca.getText());
         preparar.setString(4, txtPrecio.getText());
         preparar.setString(5, txtCodigo.getText());
                    preparar.executeUpdate();
            }
         showMessageDialog(null,"Producto Registrado");
         visualizar_datos();
        }catch(SQLException e){
            showMessageDialog(null, "no Se pudo Registrar Productos");
        }
                
    }
    
    public void combo_nombre(){
        DefaultComboBoxModel combo;
        combo =new DefaultComboBoxModel();
        try {
            sentencia =cn.createStatement();
            Resultado=sentencia.executeQuery("SELECT DISTINCT Nombre_Productos FROM productos");
            while(Resultado.next()){
                combo.addElement(Resultado.getString("Nombre_Productos"));
            }//
         // Nombre.setModel(combo);
          
            
        } catch (SQLException S) {
            showMessageDialog(null, "ocurrio un error");
        }
    }
    public void cantidad(){
            try {
                sentencia =cn.createStatement();
            Resultado=sentencia.executeQuery("SELECT sum(Precio_Productos) FROM productos");
            while(Resultado.next()){
                showMessageDialog(null,"tu cantidad actual en productos es: $"+Resultado.getString("sum(Precio_Productos)"));
              
            }
                 String n;
                n = Resultado.toString();
             
               // showMessageDialog(null, n);
            } catch (SQLException ex) {
                Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
                showMessageDialog(null, "no se pudo completar la consulta");
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
            java.util.logging.Logger.getLogger(Membresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Membresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Membresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Membresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Membresia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Marca;
    public static javax.swing.JTable Tabla;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPresentacion;
    // End of variables declaration//GEN-END:variables
}
