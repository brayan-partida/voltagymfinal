
import Conexiones.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.print.attribute.Size2DSyntax.MM;
import javax.swing.DefaultComboBoxModel;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;


public class Ventas_productos extends javax.swing.JFrame {
       Conexion con=new Conexion();
    Connection cn= con.Conexion();
        ResultSet Resultado;
     Statement Sentencia;
    public Ventas_productos() {
        
        initComponents();
        visualizar_datos();
        this.setBackground(Color.DARK_GRAY);
        combo_nombre();
 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        txtEliminar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ID_VENTAS = new javax.swing.JComboBox();
        txtPago = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Venta_Productos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Venta Productos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setText("jTextField2");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 140, -1));

        jTextField4.setText("jTextField4");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jTextField5.setText("jTextField5");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jTextField3.setText("jTextField3");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        getContentPane().add(txtEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 110, -1));

        jLabel2.setText("Costo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        ID_VENTAS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ID_VENTAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 120, 180, -1));
        getContentPane().add(txtPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 140, 20));

        Venta_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Venta_Productos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 860, 140));

        jButton1.setText("Vender");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Productos.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 720, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       eliminar_Datos();
    }//GEN-LAST:event_jButton1ActionPerformed

     public void visualizar_datos(){
         DefaultTableModel model =new DefaultTableModel();
      model.addColumn("ID");
      model.addColumn("Nombre");
      model.addColumn("Presentacion");
      model.addColumn("Marca");
      model.addColumn("Precio");
      model.addColumn("Codigo");
      
     
     Venta_Productos.setModel(model);
      String datos[]=new String[6];
    Resultado = null;
      try{
          Sentencia=cn.createStatement();
    Resultado=Sentencia.executeQuery("SELECT * FROM Productos");
      while(Resultado.next()){
         
           datos[0]=Resultado.getString(1);
           datos[1]=Resultado.getString(2);
           datos[2]=Resultado.getString(3);
           datos[3]=Resultado.getString(4);
            datos[4]=Resultado.getString(5);
           datos[5]=Resultado.getString(6);
           model.addRow(datos);
      }
       Venta_Productos.setModel(model);
      
      }
      
      catch(Exception e){
          System.err.println("no se pudo visualizar"); 
      }
  
    }//termina visualizar datos---
     
     public void eliminar_Datos() {
           int cb=ID_VENTAS.getSelectedIndex();
           String SQL="DELETE FROM producto WHERE id_Productos=' "+cb+"'";
           int Actualizar=0;
           try {
               Sentencia=cn.createStatement();
               Resultado=Sentencia.executeQuery(SQL);
        
               visualizar_datos();
             
               
           } catch (SQLException ex) {
               Logger.getLogger(Ventas_productos.class.getName()).log(Level.SEVERE, null, ex);
           }
         
         
         
     }
     
     
     public void combo_nombre(){
        DefaultComboBoxModel combo;
        combo =new DefaultComboBoxModel();
        try {
            Sentencia =cn.createStatement();
            Resultado=Sentencia.executeQuery("SELECT  idProductos FROM productos");
            while(Resultado.next()){
                combo.addElement(Resultado.getString("idProductos"));
            }//
         ID_VENTAS.setModel(combo);
            
        } catch (SQLException S) {
            showMessageDialog(null, "ocurrio un error");
        }
    }
  
     
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
    private javax.swing.JComboBox ID_VENTAS;
    private javax.swing.JTable Venta_Productos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txtEliminar;
    private javax.swing.JTextField txtPago;
    // End of variables declaration//GEN-END:variables
}
