/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livinnx;

import java.sql.Connection;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aland
 */

public class Registro extends javax.swing.JPanel {
    /**
     * Creates new form register
     */
    BaseDeDatos db = new BaseDeDatos();
    Connection conectar;
    public Registro() {
        initComponents();
        String directory = "LivinnxBD.accdb"; 
        conectar= db.connection(directory);
        
    }
    public JButton getBackButton(){
        return backButton;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        innerPanel = new javax.swing.JPanel();
        panelTop = new javax.swing.JPanel();
        labelSubTitle = new javax.swing.JLabel();
        labelIcon = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        textFieldName = new javax.swing.JTextField();
        labelLN = new javax.swing.JLabel();
        textFieldLN = new javax.swing.JTextField();
        labelBlock = new javax.swing.JLabel();
        textFieldBlock = new javax.swing.JTextField();
        labelApt = new javax.swing.JLabel();
        textFieldApt = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        labelUser = new javax.swing.JLabel();
        textFieldUser = new javax.swing.JTextField();
        labelPassw = new javax.swing.JLabel();
        textFieldPassw = new javax.swing.JTextField();
        labelID = new javax.swing.JLabel();
        textFieldID = new javax.swing.JTextField();
        buttonLogIn = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        scrollPane.setAutoscrolls(true);
        scrollPane.setMaximumSize(new java.awt.Dimension(590, 490));

        innerPanel.setBackground(new java.awt.Color(255, 255, 255));
        innerPanel.setPreferredSize(new java.awt.Dimension(550, 750));
        innerPanel.setLayout(null);

        panelTop.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout panelTopLayout = new javax.swing.GroupLayout(panelTop);
        panelTop.setLayout(panelTopLayout);
        panelTopLayout.setHorizontalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelTopLayout.setVerticalGroup(
            panelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        innerPanel.add(panelTop);
        panelTop.setBounds(0, 0, 580, 50);

        labelSubTitle.setBackground(new java.awt.Color(255, 255, 255));
        labelSubTitle.setFont(new java.awt.Font("PT Serif Caption", 1, 60)); // NOI18N
        labelSubTitle.setText("Registro");
        innerPanel.add(labelSubTitle);
        labelSubTitle.setBounds(20, 70, 260, 71);

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livinnx/logolivinnx.png"))); // NOI18N
        innerPanel.add(labelIcon);
        labelIcon.setBounds(320, 180, 213, 312);

        labelName.setBackground(new java.awt.Color(255, 255, 255));
        labelName.setFont(new java.awt.Font("PT Serif Caption", 1, 24)); // NOI18N
        labelName.setForeground(new java.awt.Color(0, 0, 153));
        labelName.setText("Nombre");
        innerPanel.add(labelName);
        labelName.setBounds(40, 160, 100, 20);

        textFieldName.setForeground(new java.awt.Color(204, 204, 204));
        textFieldName.setText("Ingrese su nombre");
        textFieldName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textFieldNameMousePressed(evt);
            }
        });
        textFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNameActionPerformed(evt);
            }
        });
        innerPanel.add(textFieldName);
        textFieldName.setBounds(40, 190, 230, 30);

        labelLN.setBackground(new java.awt.Color(255, 255, 255));
        labelLN.setFont(new java.awt.Font("PT Serif Caption", 1, 24)); // NOI18N
        labelLN.setForeground(new java.awt.Color(0, 0, 153));
        labelLN.setText("Apellido");
        innerPanel.add(labelLN);
        labelLN.setBounds(40, 230, 110, 32);

        textFieldLN.setForeground(new java.awt.Color(204, 204, 204));
        textFieldLN.setText("Ingrese su apellido");
        textFieldLN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textFieldLNMousePressed(evt);
            }
        });
        textFieldLN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldLNActionPerformed(evt);
            }
        });
        innerPanel.add(textFieldLN);
        textFieldLN.setBounds(40, 270, 230, 30);

        labelBlock.setBackground(new java.awt.Color(255, 255, 255));
        labelBlock.setFont(new java.awt.Font("PT Serif Caption", 1, 24)); // NOI18N
        labelBlock.setForeground(new java.awt.Color(0, 0, 153));
        labelBlock.setText("Bloque");
        innerPanel.add(labelBlock);
        labelBlock.setBounds(40, 310, 160, 32);

        textFieldBlock.setForeground(new java.awt.Color(204, 204, 204));
        textFieldBlock.setText("Ingrese el número del bloque");
        textFieldBlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldBlockMouseClicked(evt);
            }
        });
        textFieldBlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldBlockActionPerformed(evt);
            }
        });
        innerPanel.add(textFieldBlock);
        textFieldBlock.setBounds(40, 350, 230, 30);

        labelApt.setBackground(new java.awt.Color(255, 255, 255));
        labelApt.setFont(new java.awt.Font("PT Serif Caption", 1, 24)); // NOI18N
        labelApt.setForeground(new java.awt.Color(0, 0, 153));
        labelApt.setText("Apartamento");
        innerPanel.add(labelApt);
        labelApt.setBounds(40, 390, 160, 32);

        textFieldApt.setForeground(new java.awt.Color(204, 204, 204));
        textFieldApt.setText("Ingrese el número del apartamento");
        textFieldApt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldAptMouseClicked(evt);
            }
        });
        textFieldApt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldAptActionPerformed(evt);
            }
        });
        innerPanel.add(textFieldApt);
        textFieldApt.setBounds(40, 430, 230, 30);

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livinnx/button_regresar (2).png"))); // NOI18N
        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        innerPanel.add(backButton);
        backButton.setBounds(370, 700, 110, 40);

        labelUser.setBackground(new java.awt.Color(255, 255, 255));
        labelUser.setFont(new java.awt.Font("PT Serif Caption", 1, 24)); // NOI18N
        labelUser.setForeground(new java.awt.Color(0, 0, 153));
        labelUser.setText("Usuario");
        innerPanel.add(labelUser);
        labelUser.setBounds(40, 466, 160, 32);

        textFieldUser.setForeground(new java.awt.Color(204, 204, 204));
        textFieldUser.setText("Ingrese nombre de usuario");
        textFieldUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldUserMouseClicked(evt);
            }
        });
        textFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldUserActionPerformed(evt);
            }
        });
        innerPanel.add(textFieldUser);
        textFieldUser.setBounds(40, 504, 230, 30);

        labelPassw.setBackground(new java.awt.Color(255, 255, 255));
        labelPassw.setFont(new java.awt.Font("PT Serif Caption", 1, 24)); // NOI18N
        labelPassw.setForeground(new java.awt.Color(0, 0, 102));
        labelPassw.setText("Contraseña");
        innerPanel.add(labelPassw);
        labelPassw.setBounds(40, 540, 160, 32);

        textFieldPassw.setForeground(new java.awt.Color(204, 204, 204));
        textFieldPassw.setText("Ingrese contraseña");
        textFieldPassw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldPasswMouseClicked(evt);
            }
        });
        textFieldPassw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPasswActionPerformed(evt);
            }
        });
        innerPanel.add(textFieldPassw);
        textFieldPassw.setBounds(40, 580, 230, 30);

        labelID.setBackground(new java.awt.Color(255, 255, 255));
        labelID.setFont(new java.awt.Font("PT Serif Caption", 1, 24)); // NOI18N
        labelID.setForeground(new java.awt.Color(0, 0, 102));
        labelID.setText("Numero ID.");
        innerPanel.add(labelID);
        labelID.setBounds(40, 622, 160, 32);

        textFieldID.setForeground(new java.awt.Color(204, 204, 204));
        textFieldID.setText("Ingrese numero de identificación");
        textFieldID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldIDMouseClicked(evt);
            }
        });
        textFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldIDActionPerformed(evt);
            }
        });
        innerPanel.add(textFieldID);
        textFieldID.setBounds(40, 660, 230, 30);

        buttonLogIn.setBackground(new java.awt.Color(255, 255, 255));
        buttonLogIn.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livinnx/button_registrar.png"))); // NOI18N
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
        innerPanel.add(buttonLogIn);
        buttonLogIn.setBounds(90, 700, 110, 40);

        scrollPane.setViewportView(innerPanel);

        add(scrollPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldLNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldLNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldLNActionPerformed

    private void textFieldBlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldBlockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldBlockActionPerformed

    private void textFieldAptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldAptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldAptActionPerformed

    private void textFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldUserActionPerformed

    private void textFieldPasswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPasswActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPasswActionPerformed

    private void textFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldIDActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed

    private void buttonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogInActionPerformed
        String nombrep= textFieldName.getText();
        String apellido = textFieldLN.getText();
        String bloque = textFieldBlock.getText();
        String apto = textFieldApt.getText();
        String usuario = textFieldUser.getText();
        String contrasena = textFieldPassw.getText();
        String id = textFieldID.getText();
        int c=0;
        if(textFieldName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Porfavor ingrese un nombre valido");
        }else{
            c=c+1;
        }
        
        if(textFieldLN.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Porfavor ingrese un apeliido valido");
        }else{
            c=c+1;
        }
        
        if(textFieldBlock.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Porfavor ingrese un bloque valido");
        }else{
            c=c+1;
        }
        
        if(textFieldApt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Porfavor ingrese un apartamento valido");
        }else{
            c=c+1;
        }
        
        if(textFieldUser.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Porfavor ingrese un usuario valido");
        }else{
            c=c+1;
        }
        
        if(textFieldPassw.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Porfavor ingrese una contraseña valida");
        }else{
            c=c+1;
        }
        
        if(textFieldID.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Porfavor ingrese una identificacion valido");
        }else{
            c=c+1;
        }
        
        if(c==7){
            
            String cedula [] ={"ID"};
            DefaultTableModel S1= new DefaultTableModel (null,cedula);
            String id_persona [] = new String[1];
            String usuariop[] ={"Usuario"};
            DefaultTableModel US= new DefaultTableModel (null,usuariop);
            String us_persona [] = new String[1];
            String query_buscar_id="SELECT COUNT (CEDULA) FROM PERSONAS "
            + "WHERE CEDULA='"+id+"'";
            String query_buscarusuario="SELECT COUNT (USUARIO) FROM PERSONAS "
            + "WHERE USUARIO='"+usuario+"'";
            System.out.println(query_buscarusuario);
            S1= db.SEARCH (conectar, query_buscar_id, id_persona, S1);
            US= db.SEARCH(conectar, query_buscarusuario, us_persona, US);
            int cantid=Integer.parseInt(""+S1.getValueAt(0,0));
            int cantus=Integer.parseInt(""+US.getValueAt(0,0));
            
            if(cantid ==0 && cantus==0){
            String query_add_persona = "INSERT INTO PERSONAS (USUARIO,NOMBRE,APELLIDO,CEDULA,CLAVE,BLOQUE,APTO)"
            + "VALUES ('"+usuario+"','"+nombrep+"','"+apellido+"','"+id+"','"+contrasena+"','"+bloque+"','"+apto+"')";
            System.out.println(query_add_persona);
            db.add_edit_delete(conectar, query_add_persona);
            }
            else{
                JOptionPane.showMessageDialog(null,"Ya existe una persona registrada con esa cedula o usuario");
            }
        }
    }//GEN-LAST:event_buttonLogInActionPerformed

    private void textFieldNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldNameMousePressed
       if(textFieldName.getText().equalsIgnoreCase("Ingrese su nombre")){
            textFieldName.setText("");
        }
    }//GEN-LAST:event_textFieldNameMousePressed

    private void textFieldLNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldLNMousePressed
       if(textFieldLN.getText().equalsIgnoreCase("Ingrese su apellido")){
            textFieldLN.setText("");
        }
    }//GEN-LAST:event_textFieldLNMousePressed

    private void textFieldBlockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldBlockMouseClicked
        if(textFieldBlock.getText().equalsIgnoreCase("Ingrese el número del bloque")){
            textFieldBlock.setText("");
        }
    }//GEN-LAST:event_textFieldBlockMouseClicked

    private void textFieldAptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldAptMouseClicked
       if(textFieldApt.getText().equalsIgnoreCase("Ingrese el número del apartamento")){
            textFieldApt.setText("");
        }
    }//GEN-LAST:event_textFieldAptMouseClicked

    private void textFieldUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldUserMouseClicked
        if(textFieldUser.getText().equalsIgnoreCase("Ingrese nombre de usuario")){
            textFieldUser.setText("");
        }
    }//GEN-LAST:event_textFieldUserMouseClicked

    private void textFieldPasswMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldPasswMouseClicked
        if(textFieldPassw.getText().equalsIgnoreCase("Ingrese contraseña")){
            textFieldPassw.setText("");
        }
    }//GEN-LAST:event_textFieldPasswMouseClicked

    private void textFieldIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldIDMouseClicked
       if(textFieldID.getText().equalsIgnoreCase("Ingrese numero de identificación")){
            textFieldID.setText("");
        }
    }//GEN-LAST:event_textFieldIDMouseClicked

    private void textFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton buttonLogIn;
    private javax.swing.JPanel innerPanel;
    private javax.swing.JLabel labelApt;
    private javax.swing.JLabel labelBlock;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelLN;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPassw;
    private javax.swing.JLabel labelSubTitle;
    private javax.swing.JLabel labelUser;
    private javax.swing.JPanel panelTop;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextField textFieldApt;
    private javax.swing.JTextField textFieldBlock;
    private javax.swing.JTextField textFieldID;
    private javax.swing.JTextField textFieldLN;
    private javax.swing.JTextField textFieldName;
    private javax.swing.JTextField textFieldPassw;
    private javax.swing.JTextField textFieldUser;
    // End of variables declaration//GEN-END:variables
}
