package vista;
import controlador.Pelea;
import modelo.Personaje;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LinaCostanza
 */
public class batallajefe extends javax.swing.JFrame {

    /**
     * Creates new form batallajefe
     */
    public batallajefe() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        vidalobo = new javax.swing.JProgressBar();
        vidaescorpion = new javax.swing.JProgressBar();
        vidamedusa = new javax.swing.JProgressBar();
        vidaboss = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(810, 710));
        getContentPane().setLayout(null);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/jefefinal.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(390, 210, 410, 420);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gula");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(540, 190, 80, 22);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("escorpion");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(220, 90, 60, 14);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/escorpion.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 90, 290, 270);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("lobo");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(210, 370, 70, 14);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lobo.gif"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 360, 250, 180);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("medusa");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(200, 580, 50, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/medusa_1.gif"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 540, 220, 150);

        jButton1.setText("atacar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 220, 63, 23);

        jButton2.setText("atacar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 450, 63, 23);

        jButton3.setText("atacar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(260, 630, 63, 23);
        getContentPane().add(vidalobo);
        vidalobo.setBounds(210, 400, 146, 14);
        getContentPane().add(vidaescorpion);
        vidaescorpion.setBounds(250, 270, 146, 14);
        getContentPane().add(vidamedusa);
        vidamedusa.setBounds(200, 600, 146, 14);
        getContentPane().add(vidaboss);
        vidaboss.setBounds(540, 650, 146, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo batalla.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         this.escenario.atacar1(1);
      this.vidalobo.setValue(pjb1.getVida());
       this.vidaboss.setValue(pjb.getVida());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       escenario.atacar2(1);
       vidamedusa.setValue(pjb2.getVida());
       vidaboss.setValue(pjb.getVida());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        escenario.atacar3(1);
        vidaescorpion.setValue(pjb3.getVida());
        vidaboss.setValue(pjb.getVida());
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
            java.util.logging.Logger.getLogger(batallajefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(batallajefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(batallajefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(batallajefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new batallajefe().setVisible(true);
            }
        });
        
    }
    
    Personaje pjb1 = new Personaje(200, 100, 500, 150, "guerrero", "Lobo");
    
            
    Personaje pjb2 = new Personaje(150, 150, 550, 250, "curandera", "Medusa");
   
            
    Personaje pjb3 = new Personaje(172,170 , 480, 300, "asesino", "Escorpion");
            
           
    Personaje pjb = new Personaje(320, 149, 1000, 100, null, "Gula");
            
            
    Pelea escenario = new Pelea(pjb1, pjb2, pjb3, pjb);
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar vidaboss;
    private javax.swing.JProgressBar vidaescorpion;
    private javax.swing.JProgressBar vidalobo;
    private javax.swing.JProgressBar vidamedusa;
    // End of variables declaration//GEN-END:variables
}
