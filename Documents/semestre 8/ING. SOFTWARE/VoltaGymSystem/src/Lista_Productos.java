
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Lista_Productos extends javax.swing.JInternalFrame {
Conexion con=new Conexion();
Connection cn=con.Conexion();
ResultSet Resultado;
Statement Sentencia;

    public Lista_Productos() {
        initComponents();
        mostrar_productos();
    }


 public void mostrar_productos(){
       DefaultComboBoxModel combo=new DefaultComboBoxModel();
      String Consultass= cmbConsultas.getSelectedItem().toString();
    
    
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
      
     
     TablaProductos.setModel(model);
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
              TablaProductos.setModel(model);

      }//termina la busqueda general 
          if (Consultass.equals("Precio")){//----------------inicia por precio
            
            DefaultTableModel modelPrecio =new DefaultTableModel();
              
              
            modelPrecio.addColumn("ID");
            modelPrecio.addColumn("Precio");
            modelPrecio.addColumn("Nombre");
            modelPrecio.addColumn("Marca");
            modelPrecio.addColumn("Presentacion");
            modelPrecio.addColumn("Codigo");


           TablaProductos.setModel(modelPrecio);
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
            TablaProductos.setModel(modelPrecio);
      
          }//termina la busqueda por precio -----------------------------------------------------
          
         
          
             if (Consultass.equals("Marca")){
                         DefaultTableModel modelMarca =new DefaultTableModel();
                            modelMarca.addColumn("ID");
                            modelMarca.addColumn("Marca");
                            modelMarca.addColumn("Nombre");
                             modelMarca.addColumn("Precio");
                             modelMarca.addColumn("Presentacion");
                             modelMarca.addColumn("Codigo");
      
     
     TablaProductos.setModel(modelMarca);
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
               TablaProductos.setModel(modelMarca);

          }//termina la busqueda por marca ---------------------
         if (Consultass.equals("Presentacion")){
                        DefaultTableModel modelPresentacion =new DefaultTableModel();
             modelPresentacion.addColumn("ID");
                modelPresentacion.addColumn("Presentacion");
                modelPresentacion.addColumn("Precio");
                modelPresentacion.addColumn("Marca");
                modelPresentacion.addColumn("Nombre");
                modelPresentacion.addColumn("Codigo");


               TablaProductos.setModel(modelPresentacion);
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
           TablaProductos.setModel(modelPresentacion);
      
          }//termina la busqueda por presentacion ---------------------
      }
      catch(Exception e){
          System.err.println("no se pudo visualizar"); 
      }
       
   }//mostrar productos en general
   
   
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cmbConsultas = new javax.swing.JComboBox();
        btnConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();

        setClosable(true);
        setForeground(new java.awt.Color(51, 51, 51));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista De Los Productos");
        setPreferredSize(new java.awt.Dimension(887, 575));

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), null, null), "Buscar Nombre del Producto"));

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnBuscar)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 400, 120));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), null, null), "Consultas"));

        cmbConsultas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "General", "Precio", "Marca", "Presentacion" }));
        cmbConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbConsultasActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbConsultas, 0, 346, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnConsultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultar)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 380, 120));

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaProductos);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 770, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbConsultasActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       String busqueda=txtBuscar.getText().toString();
        String SQL="SELECT * FROM productos WHERE Nombre_Productos LIKE '%"+busqueda+"%'";
           DefaultComboBoxModel combo=new DefaultComboBoxModel();
      String Consultass= cmbConsultas.getSelectedItem().toString();
        DefaultTableModel model =new DefaultTableModel();
      model.addColumn("ID");
      model.addColumn("Nombre");
      model.addColumn("Presentacion");
      model.addColumn("Marca");
      model.addColumn("Precio");
      model.addColumn("Codigo");
      
     
     TablaProductos.setModel(model);
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
      TablaProductos.setModel(model);
          
      } catch (SQLException ex) {
           Logger.getLogger(Lista_Productos.class.getName()).log(Level.SEVERE, null, ex);
          showMessageDialog(null, "no se pudo visualizar lo que querias ");
      }
                 
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
      mostrar_productos();
    }//GEN-LAST:event_btnConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JComboBox cmbConsultas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    public javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
