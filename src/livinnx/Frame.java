
package livinnx;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;


/* @author natymartinez04*/
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Frame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon("src/livinnx/logolivinnx.png").getImage());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PInicio = new javax.swing.JPanel();
        labelcon = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelSubName = new javax.swing.JLabel();
        panelTop = new javax.swing.JPanel();
        buttonRegister = new javax.swing.JButton();
        buttonLogIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Livinnx");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1080, 720));
        setMinimumSize(new java.awt.Dimension(590, 550));
        setResizable(false);

        PInicio.setBackground(new java.awt.Color(255, 255, 255));
        PInicio.setLayout(null);

        labelcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livinnx/logolivinnx.png"))); // NOI18N
        PInicio.add(labelcon);
        labelcon.setBounds(10, 80, 213, 312);

        labelName.setBackground(new java.awt.Color(255, 255, 255));
        labelName.setFont(new java.awt.Font("PT Serif Caption", 1, 60)); // NOI18N
        labelName.setForeground(new java.awt.Color(0, 0, 153));
        labelName.setText("Livinnx");
        PInicio.add(labelName);
        labelName.setBounds(220, 130, 290, 83);

        labelSubName.setBackground(new java.awt.Color(255, 255, 255));
        labelSubName.setFont(new java.awt.Font("PT Serif Caption", 1, 60)); // NOI18N
        labelSubName.setText("RESERVAS");
        PInicio.add(labelSubName);
        labelSubName.setBounds(220, 220, 350, 71);

        panelTop.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout panelTopLayout = new javax.swing.GroupLayout(panelTop);
        panelTop.setLayout(panelTopLayout);
        panelTopLayout.setHorizontalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        panelTopLayout.setVerticalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        PInicio.add(panelTop);
        panelTop.setBounds(0, 0, 600, 50);

        buttonRegister.setBackground(new java.awt.Color(255, 255, 255));
        buttonRegister.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livinnx/button_registro.png"))); // NOI18N
        buttonRegister.setBorder(null);
        buttonRegister.setBorderPainted(false);
        buttonRegister.setContentAreaFilled(false);
        buttonRegister.setFocusPainted(false);
        buttonRegister.setMaximumSize(new java.awt.Dimension(270, 62));
        buttonRegister.setMinimumSize(new java.awt.Dimension(270, 62));
        buttonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterActionPerformed(evt);
            }
        });
        PInicio.add(buttonRegister);
        buttonRegister.setBounds(360, 310, 164, 60);

        buttonLogIn.setBackground(new java.awt.Color(255, 255, 255));
        buttonLogIn.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livinnx/button_iniciar-sesion-2.png"))); // NOI18N
        buttonLogIn.setBorder(null);
        buttonLogIn.setBorderPainted(false);
        buttonLogIn.setContentAreaFilled(false);
        buttonLogIn.setFocusPainted(false);
        buttonLogIn.setMaximumSize(new java.awt.Dimension(270, 62));
        buttonLogIn.setMinimumSize(new java.awt.Dimension(270, 62));
        buttonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogInActionPerformed(evt);
            }
        });
        PInicio.add(buttonLogIn);
        buttonLogIn.setBounds(330, 380, 220, 60);

        getContentPane().add(PInicio, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogInActionPerformed
        
    }//GEN-LAST:event_buttonLogInActionPerformed

    private void buttonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterActionPerformed
        Registro r = new Registro();
        this.remove(PInicio);
        this.add(r,BorderLayout.CENTER );
        revalidate();
        repaint();
        r.getBackButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                remove(r);
                add(PInicio,BorderLayout.CENTER );
                revalidate();
                repaint();
            }
            
        });
        
        
    }//GEN-LAST:event_buttonRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PInicio;
    private javax.swing.JButton buttonLogIn;
    private javax.swing.JButton buttonRegister;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelSubName;
    private javax.swing.JLabel labelcon;
    private javax.swing.JPanel panelTop;
    // End of variables declaration//GEN-END:variables
}
