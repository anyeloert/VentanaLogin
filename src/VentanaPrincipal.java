/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anyelo
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        miVentanaPrincipal = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        botonConsultar = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        miVentanaPrincipal.setBackground(new java.awt.Color(204, 255, 204));
        miVentanaPrincipal.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Constantia", 0, 48)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Bienvenido al Sistema");
        labelTitulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        miVentanaPrincipal.add(labelTitulo);
        labelTitulo.setBounds(60, 50, 470, 90);

        botonConsultar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botonConsultar.setText("CONSULTAR");
        botonConsultar.setToolTipText("");
        miVentanaPrincipal.add(botonConsultar);
        botonConsultar.setBounds(310, 180, 220, 60);

        botonRegistrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        botonRegistrar.setText("REGISTRAR");
        miVentanaPrincipal.add(botonRegistrar);
        botonRegistrar.setBounds(60, 180, 220, 60);

        getContentPane().add(miVentanaPrincipal);
        miVentanaPrincipal.setBounds(0, 0, 910, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel miVentanaPrincipal;
    // End of variables declaration//GEN-END:variables
}
