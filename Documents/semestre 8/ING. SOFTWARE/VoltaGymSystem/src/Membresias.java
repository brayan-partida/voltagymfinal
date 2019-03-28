
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;


public class Membresias extends javax.swing.JInternalFrame {

     Conexion con=new Conexion();
    Connection cn= con.Conexion();
     ResultSet Resultado;
     Statement Sentencia;
    
    public Membresias() {
        initComponents();
       consultar_membresias();
      //  combo_nombre();
    }
public void consultar_membresias(){
     DefaultTableModel modelo =new DefaultTableModel();
      modelo.addColumn("Id Membresias");
      modelo.addColumn("Nombre Membresias");
      modelo.addColumn("Tipo Membresias");
      modelo.addColumn("Costo Membresias");
     Tabla_Membresias.setModel(modelo);
      
      String datos[]=new String[5];
      Statement DATOS_CONEC = null;
      try{
          DATOS_CONEC=cn.createStatement();
      ResultSet ejecutar=DATOS_CONEC.executeQuery("SELECT * FROM membresias");
      while(ejecutar.next()){
         
           datos[0]=ejecutar.getString(1);
           datos[1]=ejecutar.getString(2);
           datos[2]=ejecutar.getString(3);
           datos[3]=ejecutar.getString(4);
           modelo.addRow(datos);
      }
      Tabla_Membresias.setModel(modelo);
      
      }
      catch(Exception e){
          System.err.println("no se pudo visualizar"); 
      }
        
        
    }//metodo para visualizar clientes
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Membresias = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        Tabla_Membresias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla_Membresias);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 255), null, new java.awt.Color(0, 0, 0)), "Agregar un nuevo tipo de membresias"));

        btnAgregar.setBackground(new java.awt.Color(0, 204, 0));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/tarjeta-de-credito.png"))); // NOI18N
        btnAgregar.setText("Agregar ");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre Membresia");

        jLabel2.setText("Tipo Membresia");

        jLabel3.setText("Costo Membresia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(txtTipo)
                        .addComponent(txtCosto)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnAgregar)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(2, 2, 2), null, null));

        btnEliminar.setBackground(new java.awt.Color(255, 0, 51));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/tarjeta-de-credito (1).png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(255, 153, 0));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/tarjeta-de-credito (3).png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(0, 0, 204));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/tarjeta-de-credito (2).png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnEliminar)
                .addGap(43, 43, 43)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                .addGap(185, 185, 185))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
         try {
             inserta_clientes();
             consultar_membresias();
         } catch (SQLException ex) {
             Logger.getLogger(Membresias.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        seleccionar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         try {
             EliminarMembresia();
         } catch (SQLException ex) {
             Logger.getLogger(Membresias.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
         try {
             actualizar();
         } catch (SQLException ex) {
             Logger.getLogger(Membresias.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btnActualizarActionPerformed

 /*public void combo_nombre(){
        DefaultComboBoxModel combo;
        combo =new DefaultComboBoxModel();
        try {
            Sentencia =cn.createStatement();
            Resultado=Sentencia.executeQuery
        ("SELECT Id_Clientes FROM clientes ");
            while(Resultado.next()){
               combo.addElement(Resultado.getString("Id_Clientes"));
            
            }//
        Nombre_Cliente.setModel(combo);
         
   
        } catch (SQLException S) {
            showMessageDialog(null, "ocurrio un error");
        }
    }*/
      public void inserta_clientes() throws SQLException {
        try{
            
      
           
                PreparedStatement preparar=cn.prepareStatement("insert into membresias (Nombre_Membresias,Tipo_Membresias,Costo_Membresias) VALUES (?,?,?)");
        preparar.setString(1, txtNombre.getText());
        preparar.setString(2, txtTipo.getText());
         preparar.setString(3, txtCosto.getText());
  
         
         preparar.executeUpdate();
         showMessageDialog(null,"Tipo Membresias Registrada");
         consultar_membresias();
       }catch(SQLException EX){
           
       }
      
                
    }// insercion de los datso del cliente
      
      
       public void seleccionar(){
        int fila=Tabla_Membresias.getSelectedRow();
        if(fila>0){
            txtNombre.setText(Tabla_Membresias.getValueAt(fila,1 ).toString());
            txtTipo.setText(Tabla_Membresias.getValueAt(fila,2 ).toString());
            txtCosto.setText(Tabla_Membresias.getValueAt(fila,3).toString());
            txtId.setText(Tabla_Membresias.getValueAt(fila, 0).toString());
             bloquearBtn();
        }
        else{
            showMessageDialog(null, "no se ha seleccionado ningun campo");
        }
        
    }//selecciona la un campo en la tabla-------
   public void bloquearBtn(){
       btnAgregar.setEnabled(false);
       btnEliminar.setEnabled(false);
       btnModificar.setEnabled(false);
   }
   
    public void desbloquear(){
       btnAgregar.setEnabled(true);
       btnEliminar.setEnabled(true);
       btnModificar.setEnabled(true);
   }
    
    public void EliminarMembresia() throws SQLException{
         String[] options = {"Si", "No"};
   //Character[] options = {'a', 'b', 'c', 'd'};
        int x = JOptionPane.showOptionDialog(null, "ESTAS SEGURO DE BORRAR EL REGISTRO",
                "Click a button", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if (x<1){
               
        int fila=Tabla_Membresias.getSelectedRow();
        String valor=Tabla_Membresias.getValueAt(fila, 0).toString();
        if(fila>0){
            PreparedStatement consulta=cn.prepareStatement("Delete from membresias where IdMembresias='"+valor+"'");
            consulta.executeUpdate();
            showMessageDialog(null,"se ha eliminado la Membresia");
             consultar_membresias();
        }
                }
                 else{
            showMessageDialog(null, "no has seleccionado nada");
        }
  } //metodo que elimina
    
     public void actualizar() throws SQLException{
      PreparedStatement ps=cn.prepareStatement("Update membresias set Nombre_Membresias='"+
      txtNombre.getText()+"',Tipo_Membresias='"+
      txtTipo.getText()+"'"+",Costo_Membresias='"+ txtCosto.getText()+"' where IdMembresias='"+txtId.getText()+"'");
      ps.executeUpdate();
        showMessageDialog(null,"datos actualizados");
        consultar_membresias();
      
      desbloquear();
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_Membresias;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
