/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the edit
*/
import javax.swing.JOptionPane.*;
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setSize(1200, 900);
       
        
    }

   public void mandarID(){
       
   }//madar el id alas ventas
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IDS = new javax.swing.JTextField();
        ID = new javax.swing.JLabel();
        Membresias = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        lblVentas = new javax.swing.JLabel();
        lblInventario = new javax.swing.JLabel();
        lblReportes = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        valor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(IDS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 80, -1));

        ID.setText("jLabel1");
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        Membresias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MembresiasMousePressed(evt);
            }
        });
        getContentPane().add(Membresias, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, 300, 200));

        Usuario.setText("jLabel1");
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        lblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblProductosMousePressed(evt);
            }
        });
        getContentPane().add(lblProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 300, 200));

        lblVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblVentasMousePressed(evt);
            }
        });
        getContentPane().add(lblVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 300, 200));

        lblInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblInventarioMousePressed(evt);
            }
        });
        getContentPane().add(lblInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 300, 200));

        lblReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblReportesMousePressed(evt);
            }
        });
        getContentPane().add(lblReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 300, 200));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dueño.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        valor.setText("jLabel1");
        getContentPane().add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblReportesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportesMousePressed
        Reportes r=new Reportes();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblReportesMousePressed

    private void lblInventarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInventarioMousePressed
        Lista_Productos i=new Lista_Productos();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblInventarioMousePressed

    private void lblVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVentasMousePressed
       
     
        int seleccion=Integer.parseInt( javax.swing.JOptionPane.showInputDialog("ingrese su Opcion\n"
                + "1 : Ventas Inventario\n "
                + "2: Ventas Productos"));
        if(seleccion==1){
               Ventas_membresias ventas_membresias=new  Ventas_membresias();
        ventas_membresias.setVisible(true);
    
       // this.dispose();
            
        }
          if(seleccion==2){
               Ventas_productos ventas_productos=new Ventas_productos();
        ventas_productos.setVisible(true);
       // this.dispose();
            
        }
          else {
              javax.swing.JOptionPane.showMessageDialog(null,"ësta opcion no esta disponible");
              
          }
        
     
    }//GEN-LAST:event_lblVentasMousePressed

    private void lblProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductosMousePressed
       Productos productos=new Productos();
       productos.setVisible(true);
       dispose();
    }//GEN-LAST:event_lblProductosMousePressed

    private void MembresiasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MembresiasMousePressed
        Membresia m  =new Membresia();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MembresiasMousePressed

   
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    public static javax.swing.JLabel ID;
    public static javax.swing.JTextField IDS;
    private javax.swing.JLabel Membresias;
    public static javax.swing.JLabel Usuario;
    private javax.swing.JLabel lblInventario;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JLabel lblVentas;
    private javax.swing.JLabel valor;
    // End of variables declaration//GEN-END:variables
}
