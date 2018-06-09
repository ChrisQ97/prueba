/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author sys515
 */
public class Ventas extends javax.swing.JFrame {
    Conexion con = new Conexion();
    Connection Consulta = con.conexion();
    /**
     * Creates new form Ventas
     */
    
    public Ventas() {
        initComponents();
        DefaultTableModel modelo=(DefaultTableModel) Factura.getModel();
        Cantidad.setText("");
        AutoCompleteDecorator.decorate(Producto);
        try {

            Statement sx = Consulta.createStatement();
            ResultSet Ca = sx.executeQuery("SELECT Codigo FROM Producto");
            while (Ca.next()) {

                Producto.addItem(Ca.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
        }
       

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panelcliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Nit = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        NombreM = new javax.swing.JLabel();
        ApellidoM = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Factura = new javax.swing.JTable();
        panelfactura = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Serie = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Numero = new javax.swing.JTextField();
        panelproducto = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Producto = new javax.swing.JComboBox<>();
        NombrePM = new javax.swing.JLabel();
        NombreP = new javax.swing.JLabel();
        MarcaM = new javax.swing.JLabel();
        Marca = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Existencia = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        MostrarLote = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        addfila = new javax.swing.JButton();
        elimfila = new javax.swing.JButton();
        breturn = new javax.swing.JButton();
        panelventab = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(189, 189, 189));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 65, -1, -1));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 57, 66, -1));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 78, 64, -1));

        panelcliente.setBackground(new java.awt.Color(189, 189, 189));

        jLabel2.setText("Cliente");

        jLabel6.setText("Nit");

        NombreM.setText("Nombre");

        ApellidoM.setText("Apellido");

        javax.swing.GroupLayout panelclienteLayout = new javax.swing.GroupLayout(panelcliente);
        panelcliente.setLayout(panelclienteLayout);
        panelclienteLayout.setHorizontalGroup(
            panelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelclienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreM)
                    .addGroup(panelclienteLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(59, 59, 59)
                        .addGroup(panelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nit, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(ApellidoM))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        panelclienteLayout.setVerticalGroup(
            panelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelclienteLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NombreM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ApellidoM)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanel1.add(panelcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 350, 120));

        Factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cantidad", "Nombre", "Marca", "Precio Producto", "Precio Unitario"
            }
        ));
        jScrollPane1.setViewportView(Factura);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 560, 270));

        panelfactura.setBackground(new java.awt.Color(189, 189, 189));

        jLabel3.setText("Fecha");

        jLabel4.setText("Factura");

        jLabel5.setText("Serie");

        jLabel1.setText("Numero");

        javax.swing.GroupLayout panelfacturaLayout = new javax.swing.GroupLayout(panelfactura);
        panelfactura.setLayout(panelfacturaLayout);
        panelfacturaLayout.setHorizontalGroup(
            panelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfacturaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addContainerGap(204, Short.MAX_VALUE))
            .addGroup(panelfacturaLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelfacturaLayout.createSequentialGroup()
                .addGroup(panelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Numero)
                    .addComponent(Serie)))
        );
        panelfacturaLayout.setVerticalGroup(
            panelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfacturaLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGroup(panelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelfacturaLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelfacturaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jPanel1.add(panelfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        panelproducto.setBackground(new java.awt.Color(189, 189, 189));

        jLabel9.setText("Producto");

        jLabel10.setText("Codigo");

        Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoActionPerformed(evt);
            }
        });

        NombrePM.setText("Nombre");

        NombreP.setText("jLabel11");

        MarcaM.setText("Marca");

        Marca.setText("jLabel11");

        jLabel12.setText("Existencia");

        Existencia.setText("jLabel13");

        jLabel11.setText("Cantidad");

        MostrarLote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lotea17.png"))); // NOI18N
        MostrarLote.setToolTipText("");
        MostrarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarLoteActionPerformed(evt);
            }
        });

        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aniaa15.png"))); // NOI18N
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        jLabel13.setText("Lote");

        javax.swing.GroupLayout panelproductoLayout = new javax.swing.GroupLayout(panelproducto);
        panelproducto.setLayout(panelproductoLayout);
        panelproductoLayout.setHorizontalGroup(
            panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelproductoLayout.createSequentialGroup()
                .addGroup(panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelproductoLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel9))
                    .addGroup(panelproductoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelproductoLayout.createSequentialGroup()
                                .addGroup(panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(NombrePM)
                                    .addComponent(MarcaM, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addGap(37, 37, 37)
                                .addGroup(panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Existencia)
                                    .addComponent(Marca)
                                    .addComponent(NombreP)
                                    .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelproductoLayout.createSequentialGroup()
                                        .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelproductoLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MostrarLote, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        panelproductoLayout.setVerticalGroup(
            panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelproductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombrePM)
                    .addComponent(NombreP))
                .addGap(18, 18, 18)
                .addGroup(panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MarcaM)
                    .addComponent(Marca))
                .addGap(18, 18, 18)
                .addGroup(panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Existencia))
                .addGroup(panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelproductoLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MostrarLote, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelproductoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );

        jPanel1.add(panelproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 340, 280));

        addfila.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/masa10.png"))); // NOI18N
        addfila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addfilaActionPerformed(evt);
            }
        });
        jPanel1.add(addfila, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 30, 30));

        elimfila.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menosa8.png"))); // NOI18N
        jPanel1.add(elimfila, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 190, 30, 30));

        breturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresara7.png"))); // NOI18N
        jPanel1.add(breturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 360, 40, -1));

        panelventab.setBackground(new java.awt.Color(189, 189, 189));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cajara23.png"))); // NOI18N

        javax.swing.GroupLayout panelventabLayout = new javax.swing.GroupLayout(panelventab);
        panelventab.setLayout(panelventabLayout);
        panelventabLayout.setHorizontalGroup(
            panelventabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelventabLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE))
        );
        panelventabLayout.setVerticalGroup(
            panelventabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelventabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(panelventab, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void llenarPM(String Codigo)
    {   
        
        try {

            Statement sx = Consulta.createStatement();
            ResultSet Ca = sx.executeQuery("SELECT Nombre,Marca,Existencia FROM Producto Where Codigo='"+Codigo+"'");
            while (Ca.next()) {

                NombreP.setText(Ca.getString(1));
                Marca.setText(Ca.getString(2));
                Existencia.setText(Ca.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private String id(String Codigo)
    {
        try {

            Statement sx = Consulta.createStatement();
            ResultSet Ca = sx.executeQuery("SELECT id FROM Producto Where Codigo='"+Codigo+"'");
            while (Ca.next()) {

                return Ca.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    private void ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoActionPerformed
        String Completo = (String) Producto.getSelectedItem();
        llenarPM(Completo);
// TODO add your handling code here:
    }//GEN-LAST:event_ProductoActionPerformed

    private void MostrarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarLoteActionPerformed
     MostrarLotes ere=new MostrarLotes(Marca.getText(),NombreP.getText());
                    ere.setVisible(true);   // TODO add your handling code here:
                    
    }//GEN-LAST:event_MostrarLoteActionPerformed
    private int RetornoIdLoteNuevo()
    {    try {

            Statement sx = Consulta.createStatement();
            ResultSet Ca = sx.executeQuery("SELECT NoLote FROM Lote WHERE Producto_id ='"+id((String) Producto.getSelectedItem())+"'&& Disponible=true &&NoLote= (SELECT MAX(NoLote) FROM Lote WHERE Producto_id ='"+id((String) Producto.getSelectedItem())+"')");
            
            while (Ca.next()) {

                return Integer.parseInt(Ca.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        if(Cantidad.getText().equals(""))
        {
            
        }
        else
        {   if(Integer.parseInt(Cantidad.getText())<=Integer.parseInt(Existencia.getText()))
                {
                    JOptionPane.showMessageDialog(null, "Se puede vender todo");
                    //modelo.addRow(new Object[]{});
                    

                }
            else
            {
                            JOptionPane.showMessageDialog(null, "No se puede");

            }
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void addfilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addfilaActionPerformed

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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JLabel ApellidoM;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JLabel Existencia;
    private javax.swing.JTable Factura;
    private javax.swing.JLabel Marca;
    private javax.swing.JLabel MarcaM;
    private javax.swing.JButton MostrarLote;
    private javax.swing.JComboBox<String> Nit;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel NombreM;
    private javax.swing.JLabel NombreP;
    private javax.swing.JLabel NombrePM;
    private javax.swing.JTextField Numero;
    private javax.swing.JComboBox<String> Producto;
    private javax.swing.JTextField Serie;
    private javax.swing.JButton addfila;
    private javax.swing.JButton breturn;
    private javax.swing.JButton elimfila;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelcliente;
    private javax.swing.JPanel panelfactura;
    private javax.swing.JPanel panelproducto;
    private javax.swing.JPanel panelventab;
    // End of variables declaration//GEN-END:variables
}
