/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIs;

/**
 *
 * @author giova
 */
public class AdministrarVentasForm extends javax.swing.JFrame {

    /**
     * Creates new form AdministrarVentasForm
     */
    public AdministrarVentasForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tblVenta = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        lblGeneral = new javax.swing.JLabel();
        lblCargaDeArticulos = new javax.swing.JLabel();
        cboxCliente = new javax.swing.JComboBox<>();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblNumTicket = new javax.swing.JLabel();
        lblOperador = new javax.swing.JLabel();
        txtNumTicket = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtOperador = new javax.swing.JTextField();
        lblCliente1 = new javax.swing.JLabel();
        lblCliente2 = new javax.swing.JLabel();
        lblCliente3 = new javax.swing.JLabel();
        lblCliente4 = new javax.swing.JLabel();
        lblCliente5 = new javax.swing.JLabel();
        lblCliente6 = new javax.swing.JLabel();
        lblCliente8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtOperador1 = new javax.swing.JTextField();
        txtOperador2 = new javax.swing.JTextField();
        txtOperador3 = new javax.swing.JTextField();
        txtOperador4 = new javax.swing.JTextField();
        txtOperador6 = new javax.swing.JTextField();
        txtOperador7 = new javax.swing.JTextField();
        txtOperador8 = new javax.swing.JTextField();
        txtOperador9 = new javax.swing.JTextField();
        lblCliente9 = new javax.swing.JLabel();
        lblCliente11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblRectangulo1 = new javax.swing.JLabel();
        lblRectangulo4 = new javax.swing.JLabel();
        txtOperador10 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 750));

        tblVenta.setBackground(new java.awt.Color(255, 255, 255));
        tblVenta.setPreferredSize(new java.awt.Dimension(1000, 750));
        tblVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblCliente.setText("Cliente:");
        tblVenta.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        lblGeneral.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblGeneral.setForeground(new java.awt.Color(153, 153, 153));
        lblGeneral.setText("General");
        tblVenta.add(lblGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 60, -1));

        lblCargaDeArticulos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblCargaDeArticulos.setForeground(new java.awt.Color(153, 153, 153));
        lblCargaDeArticulos.setText("Carga de Artículos");
        tblVenta.add(lblCargaDeArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 160, -1));

        cboxCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tblVenta.add(cboxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 200, -1));

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 0, 0));
        lblFecha.setText("Fecha:");
        tblVenta.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        txtFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFecha.setText("21/02/2023  12:10 pm");
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        tblVenta.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 200, -1));

        lblNumTicket.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNumTicket.setForeground(new java.awt.Color(0, 0, 0));
        lblNumTicket.setText("No. Ticket:");
        tblVenta.add(lblNumTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        lblOperador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblOperador.setForeground(new java.awt.Color(0, 0, 0));
        lblOperador.setText("Operador:");
        tblVenta.add(lblOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        txtNumTicket.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumTicket.setText("00000");
        tblVenta.add(txtNumTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 150, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        tblVenta.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 204, 40, 28));

        txtOperador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtOperador.setText("Rosa");
        tblVenta.add(txtOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 150, -1));

        lblCliente1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCliente1.setForeground(new java.awt.Color(0, 0, 0));
        lblCliente1.setText("Descripción:");
        tblVenta.add(lblCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        lblCliente2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCliente2.setForeground(new java.awt.Color(0, 0, 0));
        lblCliente2.setText("Cantidad:");
        tblVenta.add(lblCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        lblCliente3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCliente3.setForeground(new java.awt.Color(0, 0, 0));
        lblCliente3.setText("Disponible:");
        tblVenta.add(lblCliente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        lblCliente4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCliente4.setForeground(new java.awt.Color(0, 0, 0));
        lblCliente4.setText("Categoria");
        tblVenta.add(lblCliente4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, -1, -1));

        lblCliente5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCliente5.setForeground(new java.awt.Color(0, 0, 0));
        lblCliente5.setText("Total: ");
        tblVenta.add(lblCliente5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

        lblCliente6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCliente6.setForeground(new java.awt.Color(0, 0, 0));
        lblCliente6.setText("importe:");
        tblVenta.add(lblCliente6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        lblCliente8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCliente8.setForeground(new java.awt.Color(0, 0, 0));
        lblCliente8.setText("Código Artículo: ");
        tblVenta.add(lblCliente8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cobrar");
        tblVenta.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 620, 160, 50));

        txtOperador1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblVenta.add(txtOperador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 205, 50, -1));

        txtOperador2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblVenta.add(txtOperador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 245, 410, -1));

        txtOperador3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblVenta.add(txtOperador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 205, 180, -1));

        txtOperador4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblVenta.add(txtOperador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 285, 40, -1));

        txtOperador6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblVenta.add(txtOperador6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 325, 710, -1));

        txtOperador7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblVenta.add(txtOperador7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 285, 100, -1));

        txtOperador8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblVenta.add(txtOperador8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 285, 100, -1));

        txtOperador9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblVenta.add(txtOperador9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 205, 180, -1));

        lblCliente9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCliente9.setForeground(new java.awt.Color(0, 0, 0));
        lblCliente9.setText("Observaciones:");
        tblVenta.add(lblCliente9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        lblCliente11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCliente11.setForeground(new java.awt.Color(0, 0, 0));
        lblCliente11.setText("Total a Cobrar");
        tblVenta.add(lblCliente11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 640, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 0, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Quitar");
        tblVenta.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 110, 30));

        jButton5.setBackground(new java.awt.Color(0, 0, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Agregar");
        tblVenta.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 110, 30));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setBorder(null);

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Artículo", "Descripción", "Cantidad", "Precio", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        tblVenta.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 900, 220));

        lblRectangulo1.setBackground(new java.awt.Color(204, 204, 255));
        lblRectangulo1.setOpaque(true);
        tblVenta.add(lblRectangulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 900, 110));

        lblRectangulo4.setBackground(new java.awt.Color(204, 204, 255));
        lblRectangulo4.setOpaque(true);
        tblVenta.add(lblRectangulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 900, 180));

        txtOperador10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblVenta.add(txtOperador10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 635, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tblVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tblVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdministrarVentasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministrarVentasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministrarVentasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministrarVentasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministrarVentasForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboxCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCargaDeArticulos;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCliente1;
    private javax.swing.JLabel lblCliente11;
    private javax.swing.JLabel lblCliente2;
    private javax.swing.JLabel lblCliente3;
    private javax.swing.JLabel lblCliente4;
    private javax.swing.JLabel lblCliente5;
    private javax.swing.JLabel lblCliente6;
    private javax.swing.JLabel lblCliente8;
    private javax.swing.JLabel lblCliente9;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblGeneral;
    private javax.swing.JLabel lblNumTicket;
    private javax.swing.JLabel lblOperador;
    private javax.swing.JLabel lblRectangulo1;
    private javax.swing.JLabel lblRectangulo4;
    private javax.swing.JPanel tblVenta;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNumTicket;
    private javax.swing.JTextField txtOperador;
    private javax.swing.JTextField txtOperador1;
    private javax.swing.JTextField txtOperador10;
    private javax.swing.JTextField txtOperador2;
    private javax.swing.JTextField txtOperador3;
    private javax.swing.JTextField txtOperador4;
    private javax.swing.JTextField txtOperador6;
    private javax.swing.JTextField txtOperador7;
    private javax.swing.JTextField txtOperador8;
    private javax.swing.JTextField txtOperador9;
    // End of variables declaration//GEN-END:variables
}
