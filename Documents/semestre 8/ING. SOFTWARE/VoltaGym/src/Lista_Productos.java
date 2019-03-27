
import Conexiones.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;


public class Lista_Productos extends javax.swing.JFrame {
   Conexiones.Conexion con=new Conexion();
   Connection cn=con.Conexion();
   Statement Sentencia;
   ResultSet Resultado;
    public Lista_Productos() {
        
        initComponents();
   mostrar_productos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cbxConsulta = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 520, 130));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 80));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)), "Busqueda por tipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N

        cbxConsulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "General", "Precio", "Marca", "Presentacion" }));

        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 320, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      mostrar_productos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
     tomarfecha();
        String busqueda=txtBuscar.getText().toString();
        String SQL="SELECT * FROM productos WHERE Nombre_Productos LIKE '%"+busqueda+"%'";
           DefaultComboBoxModel combo=new DefaultComboBoxModel();
      String Consultass= cbxConsulta.getSelectedItem().toString();
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
          Sentencia=cn.createStatement();
         
  
    Resultado=Sentencia.executeQuery(SQL);
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
          
      } catch (SQLException ex) {
           Logger.getLogger(Lista_Productos.class.getName()).log(Level.SEVERE, null, ex);
          showMessageDialog(null, "no se pudo visualizar lo que querias ");
      }
    }//GEN-LAST:event_btnBuscarActionPerformed
public void tomarfecha(){
   
    
    String fecha;
    Date d=new Date(System.nanoTime());
    showMessageDialog(null, d);
}



   public void mostrar_productos(){
       DefaultComboBoxModel combo=new DefaultComboBoxModel();
      String Consultass= cbxConsulta.getSelectedItem().toString();
    
    
      try{
          Sentencia=cn.createStatement();
         
          if (Consultass.equals("General")){
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
              Tabla.setModel(model);

      }//termina la busqueda general 
          if (Consultass.equals("Precio")){//----------------inicia por precio
            
            DefaultTableModel modelPrecio =new DefaultTableModel();
              
              
            modelPrecio.addColumn("ID");
            modelPrecio.addColumn("Precio");
            modelPrecio.addColumn("Nombre");
            modelPrecio.addColumn("Marca");
            modelPrecio.addColumn("Presentacion");
            modelPrecio.addColumn("Codigo");


           Tabla.setModel(modelPrecio);
            String datos_Precio[]=new String[6];
                     Resultado=Sentencia.executeQuery("SELECT idProductos,Precio_Productos,Nombre_Productos," +
                     "Marca_Productos,Productos_Presentacion,Codigo_Productos  FROM productos ORDER BY Precio_Productos DESC");
            while(Resultado.next()){

                 datos_Precio[0]=Resultado.getString(1);
                 datos_Precio[1]=Resultado.getString(2);
                 datos_Precio[2]=Resultado.getString(3);
                 datos_Precio[3]=Resultado.getString(4);
                  datos_Precio[4]=Resultado.getString(5);
                 datos_Precio[5]=Resultado.getString(6);
                 modelPrecio.addRow(datos_Precio);
            }
            Tabla.setModel(modelPrecio);
      
          }//termina la busqueda por precio -----------------------------------------------------
          
         
          
             if (Consultass.equals("Marca")){
                         DefaultTableModel modelMarca =new DefaultTableModel();
                            modelMarca.addColumn("ID");
                            modelMarca.addColumn("Marca");
                            modelMarca.addColumn("Nombre");
                             modelMarca.addColumn("Precio");
                             modelMarca.addColumn("Presentacion");
                             modelMarca.addColumn("Codigo");
      
     
     Tabla.setModel(modelMarca);
      String datosMarca[]=new String[6];
    Resultado = null;

                Resultado=Sentencia.executeQuery("SELECT * FROM productos order by   Precio_Productos DESC");
               while(Resultado.next()){

                    datosMarca[0]=Resultado.getString(1);
                    datosMarca[1]=Resultado.getString(2);
                    datosMarca[2]=Resultado.getString(3);
                    datosMarca[3]=Resultado.getString(4);
                     datosMarca[4]=Resultado.getString(5);
                    datosMarca[5]=Resultado.getString(6);
                    modelMarca.addRow(datosMarca);
               }
               Tabla.setModel(modelMarca);

          }//termina la busqueda por marca ---------------------
         if (Consultass.equals("Presentacion")){
                        DefaultTableModel modelPresentacion =new DefaultTableModel();
             modelPresentacion.addColumn("ID");
                modelPresentacion.addColumn("Presentacion");
                modelPresentacion.addColumn("Precio");
                modelPresentacion.addColumn("Marca");
                modelPresentacion.addColumn("Nombre");
                modelPresentacion.addColumn("Codigo");


               Tabla.setModel(modelPresentacion);
                String datosPresentacion[]=new String[6];
              Resultado = null;
     
             Resultado=Sentencia.executeQuery("SELECT idProductos,Productos_Presentacion,Precio_Productos, Marca_Productos,"
                     + "Nombre_Productos," +
"                    Codigo_Productos  FROM productos ORDER BY Precio_Productos DESC");
              while(Resultado.next()){

                datosPresentacion[0]=Resultado.getString(1);
                datosPresentacion[1]=Resultado.getString(2);
                datosPresentacion[2]=Resultado.getString(3);
                datosPresentacion[3]=Resultado.getString(4);
                 datosPresentacion[4]=Resultado.getString(5);
                datosPresentacion[5]=Resultado.getString(6);
                modelPresentacion.addRow(datosPresentacion);
           }
           Tabla.setModel(modelPresentacion);
      
          }//termina la busqueda por presentacion ---------------------
      }
      catch(Exception e){
          System.err.println("no se pudo visualizar"); 
      }
       
   }//mostrar productos en general
   
   
   public void combo_nombre(){
        DefaultComboBoxModel combo;
        combo =new DefaultComboBoxModel();
        try {
            Sentencia =cn.createStatement();
            Resultado=Sentencia.executeQuery("SELECT DISTINCT Nombre_Productos FROM productos");
            while(Resultado.next()){
                combo.addElement(Resultado.getString("Nombre_Productos"));
            }//
         // Nombre.setModel(combo);
            
        } catch (SQLException S) {
            showMessageDialog(null, "ocurrio un error");
        }
    }
    public static void main(String args[]) {
       

    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Membresia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox cbxConsulta;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
