
package gui;
import Personajes.AbstractFactory;
import fabricas.*;
import javax.swing.*;
/**
 *
 * @author estudiantes
 */
public class gui extends javax.swing.JFrame {

    AbstractFactory exe = new AbstractFactory();
     String seleccion;
    
    public gui() {
        initComponents();
        seleccion = this.jComboBox1.getSelectedItem().toString();
        this.setLocationRelativeTo(null);
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personajes");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elfo", "Enano", "Humano", "Orco", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 180, -1));

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        jLabel1.setText("Habilidades:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        jLabel2.setText("Descripciones");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        jLabel3.setText("Arma:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        jLabel4.setText("Armadura:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel6.setText("Estado: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, -1, -1));

        jLabel7.setEnabled(false);
        jLabel7.setName("arma_label"); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 300, 40));
        jLabel7.getAccessibleContext().setAccessibleName("arma_label");

        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 330, 50));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 310, 60));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setFocusable(false);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 140, 130));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setFocusable(false);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 140, 130));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setFocusable(false);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 280, 250));

        jButton2.setText("Recrear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        seleccion = this.jComboBox1.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        
        if(seleccion.equals("Orco"))
        {
            exe.fabrica = new FabricaOrco();
            jLabel9.setText(productos.CuerpoOrco.Habilidad());
            jLabel7.setText(productos.ArmaOrco.Arma());
            jLabel8.setText(productos.ArmaduraOrco.Armadura());
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/partes_personajes/armadura_orco.png")));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/partes_personajes/arma_orco.png")));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/partes_personajes/orco.png")));
        }
        if(seleccion.equals("Enano"))
        {
            exe.fabrica = new FabricaEnano();
            jLabel9.setText(productos.CuerpoEnano.Habilidad());
            jLabel7.setText(productos.ArmaEnano.Arma());
            jLabel8.setText(productos.ArmaduraEnano.Armadura());
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/partes_personajes/armadura_enano.png")));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/partes_personajes/arma_enano.png")));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/partes_personajes/enano.png")));
        }
        if(seleccion.equals("Humano"))
        {
            exe.fabrica = new FabricaHumano();
            jLabel9.setText(productos.CuerpoHumano.Habilidad());
            jLabel7.setText(productos.ArmaHumano.Arma());
            jLabel8.setText(productos.ArmaduraHumano.Armadura());
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/partes_personajes/armadura_humano.png")));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/partes_personajes/arma_humano.png")));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/partes_personajes/humano.png")));
        }
        if(seleccion.equals("Elfo"))
        {
            exe.fabrica = new FabricaElfo();
            jLabel9.setText(productos.CuerpoElfo.Habilidad());
            jLabel7.setText(productos.ArmaElfo.Arma());
            jLabel8.setText(productos.ArmaduraElfo.Armadura());
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/partes_personajes/armadura_elfo.png")));
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/partes_personajes/arma_elfo.png")));
            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/partes_personajes/elfo.png")));
        }
        exe.cuerpo=exe.fabrica.CrearCuerpo();
        exe.arma = exe.fabrica.CrearArma();
        exe.armadura = exe.fabrica.CrearArmadura();
        jLabel6.setText(exe.arma.Estado()+", "+exe.armadura.Estado()+", "+exe.cuerpo.Estado());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println("ABRIR RECREACIÓN");
        recreacion.eleccion = this.seleccion;
        recreacion.inicia();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
