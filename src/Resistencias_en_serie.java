
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 29
 */
public class Resistencias_en_serie extends javax.swing.JFrame {

    /**
     * Creates new form Modulo
     */
    public Resistencias_en_serie() {
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

        JTR1s = new javax.swing.JTextField();
        JLR3s = new javax.swing.JLabel();
        JTR2s = new javax.swing.JTextField();
        JLR1s = new javax.swing.JLabel();
        JTR3s = new javax.swing.JTextField();
        JLR2s = new javax.swing.JLabel();
        ResultadoS = new javax.swing.JTextField();
        JBmenu = new javax.swing.JButton();
        ResultadoSerie = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTR1s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTR1sActionPerformed(evt);
            }
        });

        JLR3s.setText("Resistencia 3");

        JLR1s.setText("Resistencia 1");

        JLR2s.setText("Resistencia 2");

        JBmenu.setText("Volver al Menú");
        JBmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBmenuActionPerformed(evt);
            }
        });

        ResultadoSerie.setText("Resultado");
        ResultadoSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoSerieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLR3s)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTR3s))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLR2s)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTR2s))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLR1s)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTR1s, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(ResultadoSerie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ResultadoS)))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(JBmenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLR1s)
                    .addComponent(JTR1s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLR2s)
                    .addComponent(JTR2s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLR3s)
                    .addComponent(JTR3s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResultadoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResultadoSerie))
                .addGap(34, 34, 34)
                .addComponent(JBmenu)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTR1sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTR1sActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTR1sActionPerformed

    private void JBmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBmenuActionPerformed
     
        Menu me=new Menu ();
       
       try {
       
       me = new Menu ();
       
       } 
       catch (Exception ex)
       {
        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE,null,ex);
       }
        me.setLocationRelativeTo(null);
        me.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JBmenuActionPerformed

    private void ResultadoSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoSerieActionPerformed
     
        int a,b,c,result;
        a=Integer.parseInt(JTR1s.getText());
        b=Integer.parseInt(JTR2s.getText());
        c=Integer.parseInt(JTR3s.getText());
        result=a+b+c;
        ResultadoS.setText(""+result);
                      
        
    }//GEN-LAST:event_ResultadoSerieActionPerformed

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
            java.util.logging.Logger.getLogger(Resistencias_en_serie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resistencias_en_serie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resistencias_en_serie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resistencias_en_serie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resistencias_en_serie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBmenu;
    private javax.swing.JLabel JLR1s;
    private javax.swing.JLabel JLR2s;
    private javax.swing.JLabel JLR3s;
    private javax.swing.JTextField JTR1s;
    private javax.swing.JTextField JTR2s;
    private javax.swing.JTextField JTR3s;
    private javax.swing.JTextField ResultadoS;
    private javax.swing.JButton ResultadoSerie;
    // End of variables declaration//GEN-END:variables
}
