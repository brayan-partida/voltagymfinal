
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

     Conexion con=new Conexion();
    Connection cn= con.Conexion();
     ResultSet Resultado;
     Statement sentencia;
    
    public Login() {
        initComponents();
    }

    public void ingresar(){
      
                 String cap="";  
        String U=txtUsuario.getText();
        String P=txtPassword.getText();
  //      String I=Id_Usuario.getSelectedItem().toString();
        
        con.Conexion();
        String SQL="select  * from crear_usuarios"
                + " where Nombre_Usuarios='"+U+"'&& Password_Usuarios='"+P+"'";
        
         try {
             sentencia=cn.createStatement();
                Resultado=sentencia.executeQuery(SQL);
                
                while (Resultado.next()){
                    cap=Resultado.getString("Tipo");
                   
                    if(cap.equals("Administrador")){
                        String k=cap;
                        MenuPrincipal_Duenio menu= new MenuPrincipal_Duenio();
                        MenuPrincipal_Duenio nProductos=new MenuPrincipal_Duenio();
                        nProductos.setVisible(true);
                        JOptionPane.showMessageDialog(null,"bienvenido"+ cap);
                        dispose();
                   }//fin del; if  admnistrador
                    /*  if(cap.equals("Cajero")){
                             String k=cap;
                             
                       // MenuPrincipal_Cajero menuc= new MenuPrincipal_Cajero();
                       // menuc.Usuario.setText(k);
                      //  enviarid();
                      // Productos nProductos=new Productos();
                     //  nProductos.setVisible(true);
                
                        JOptionPane.showMessageDialog(null,"Bienvenido "+ cap);
                        dispose();
                   }//fin del; if */
                    
                  
                          
                    if((!cap.equals("Administrador")) && (!cap.equals("Cajero"))){
                        JOptionPane.showMessageDialog(null,"usuario no encontrado");
                    }
                }//fin del whilw
         } catch (SQLException ex) {
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
             
         
       }//-----------------------------------------------------------------------ingresar
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        Fonso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/candado (1).png"))); // NOI18N
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 160, 40));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 160, 30));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 160, 30));

        Fonso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login.jpg"))); // NOI18N
        getContentPane().add(Fonso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 620, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ingresar();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fonso;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
