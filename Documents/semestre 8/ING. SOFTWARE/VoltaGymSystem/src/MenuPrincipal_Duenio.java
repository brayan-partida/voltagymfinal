
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class MenuPrincipal_Duenio extends javax.swing.JFrame {
    Conexion con=new Conexion();
Connection cn =con.Conexion();
Statement Sentencia;
ResultSet Resultado;
    public MenuPrincipal_Duenio() {
        initComponents();
     
    }
 //metodo para visualizar clientes
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelEscitorio_Duenio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        Alta_Productos = new javax.swing.JMenu();
        MenuAltaProductos = new javax.swing.JMenuItem();
        AltaProductos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout PanelEscitorio_DuenioLayout = new javax.swing.GroupLayout(PanelEscitorio_Duenio);
        PanelEscitorio_Duenio.setLayout(PanelEscitorio_DuenioLayout);
        PanelEscitorio_DuenioLayout.setHorizontalGroup(
            PanelEscitorio_DuenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 898, Short.MAX_VALUE)
        );
        PanelEscitorio_DuenioLayout.setVerticalGroup(
            PanelEscitorio_DuenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );

        jMenu1.setText("Clientes");

        jMenuItem1.setText("Registro Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        Alta_Productos.setText("Productos");

        MenuAltaProductos.setText("Lista Productos");
        MenuAltaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAltaProductosActionPerformed(evt);
            }
        });
        Alta_Productos.add(MenuAltaProductos);

        AltaProductos.setText("Alta Productos");
        AltaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaProductosActionPerformed(evt);
            }
        });
        Alta_Productos.add(AltaProductos);

        jMenuBar1.add(Alta_Productos);

        jMenu2.setText("Trabajadores");

        jMenuItem2.setText("Alta Trabajadores");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Membresias");

        jMenuItem3.setText("Registro de Membresia");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelEscitorio_Duenio))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelEscitorio_Duenio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ClientesAlta alta=new ClientesAlta();
        PanelEscitorio_Duenio.add(alta);
        alta.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MenuAltaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAltaProductosActionPerformed
       Lista_Productos altaP=new Lista_Productos();
       PanelEscitorio_Duenio.add(altaP);
       altaP.show();
    }//GEN-LAST:event_MenuAltaProductosActionPerformed

    private void AltaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaProductosActionPerformed
      Alta_Productos A=new Alta_Productos();
      PanelEscitorio_Duenio.add(A);
      A.show();
      
    }//GEN-LAST:event_AltaProductosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Alta_Trabajadores alta_Trabajadores=new Alta_Trabajadores();
        PanelEscitorio_Duenio.add(alta_Trabajadores);
        alta_Trabajadores.show();
              
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
     Membresias M=new Membresias();
    PanelEscitorio_Duenio.add(M);
    M.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal_Duenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal_Duenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal_Duenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal_Duenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal_Duenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AltaProductos;
    private javax.swing.JMenu Alta_Productos;
    private javax.swing.JMenuItem MenuAltaProductos;
    private javax.swing.JDesktopPane PanelEscitorio_Duenio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
