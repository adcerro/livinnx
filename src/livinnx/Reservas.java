/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package livinnx;


import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.text.DateFormat;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author natymartinez04
 */
public class Reservas extends javax.swing.JFrame {
    BaseDeDatos db = new BaseDeDatos();
    Connection conectar;
    Usuario usuario1;
    
    
    public Reservas(Usuario usuario) {
        initComponents(); 
        this.usuario1 = usuario;
        String directory = "LivinnxBD.accdb"; 
        conectar= db.connection(directory);
    }
    
    public JTabbedPane getBaseP(){
        return jTabbedPane2;
    }
    
    public JButton getBackButton() {
        return jButton1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooser2 = new com.toedter.calendar.JDayChooser();
        jProgressBar1 = new javax.swing.JProgressBar();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        gymPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        buttonLogIn5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        gamePanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        buttonLogIn4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        studyPanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        buttonLogIn1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jCalendar3 = new com.toedter.calendar.JCalendar();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        poolPanel = new javax.swing.JPanel();
        messlabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonLogIn6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jCalendar4 = new com.toedter.calendar.JCalendar();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelSubName1 = new javax.swing.JLabel();
        labelSubName2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        labelSubName3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jDayChooser2.setForeground(new java.awt.Color(0, 183, 189));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(760, 560));

        gymPanel.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 12, 84), 5));

        jLabel7.setFont(new java.awt.Font("PingFang TC", 1, 24)); // NOI18N
        jLabel7.setText("Disponibilidad");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 183, 189), 5));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        gymPanel.add(jPanel6);
        jPanel6.setBounds(480, 30, 190, 60);

        buttonLogIn5.setBackground(new java.awt.Color(255, 255, 255));
        buttonLogIn5.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogIn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livinnx/button_reservar.png"))); // NOI18N
        buttonLogIn5.setBorderPainted(false);
        buttonLogIn5.setContentAreaFilled(false);
        buttonLogIn5.setFocusPainted(false);
        buttonLogIn5.setMaximumSize(new java.awt.Dimension(270, 62));
        buttonLogIn5.setMinimumSize(new java.awt.Dimension(270, 62));
        buttonLogIn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogIn5ActionPerformed(evt);
            }
        });
        gymPanel.add(buttonLogIn5);
        buttonLogIn5.setBounds(520, 230, 120, 50);

        jLabel5.setFont(new java.awt.Font("PingFang TC", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 183, 189));
        jLabel5.setText("  Escoga el día que desea reservar el gimnasio");
        jLabel5.setOpaque(true);
        gymPanel.add(jLabel5);
        jLabel5.setBounds(30, 60, 370, 40);

        jCalendar1.setBackground(new java.awt.Color(255, 0, 51));
        gymPanel.add(jCalendar1);
        jCalendar1.setBounds(30, 100, 370, 270);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7 am", "8 am", "9 am", "10 am", "11 am", "12 pm", "1 pm", "2 pm", "3 pm", "4 pm", "5 pm", "6 pm", "7 pm", "8 pm", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        gymPanel.add(jComboBox1);
        jComboBox1.setBounds(510, 190, 140, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livinnx/IMG_1795.jpg"))); // NOI18N
        gymPanel.add(jLabel6);
        jLabel6.setBounds(0, 10, 750, 440);

        jTabbedPane2.addTab("Gimnasio", gymPanel);

        gamePanel.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 12, 84), 5));

        jLabel10.setFont(new java.awt.Font("PingFang TC", 1, 24)); // NOI18N
        jLabel10.setText("Disponibilidad");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 183, 189), 5));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        gamePanel.add(jPanel7);
        jPanel7.setBounds(480, 30, 190, 60);

        buttonLogIn4.setBackground(new java.awt.Color(255, 255, 255));
        buttonLogIn4.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogIn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livinnx/button_reservar.png"))); // NOI18N
        buttonLogIn4.setBorderPainted(false);
        buttonLogIn4.setContentAreaFilled(false);
        buttonLogIn4.setFocusPainted(false);
        buttonLogIn4.setMaximumSize(new java.awt.Dimension(270, 62));
        buttonLogIn4.setMinimumSize(new java.awt.Dimension(270, 62));
        buttonLogIn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogIn4ActionPerformed(evt);
            }
        });
        gamePanel.add(buttonLogIn4);
        buttonLogIn4.setBounds(520, 220, 120, 50);

        jLabel9.setFont(new java.awt.Font("PingFang TC", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 183, 189));
        jLabel9.setText("  Escoga el día que desea reservar la zona de juegos");
        jLabel9.setOpaque(true);
        gamePanel.add(jLabel9);
        jLabel9.setBounds(20, 60, 390, 40);
        gamePanel.add(jCalendar2);
        jCalendar2.setBounds(20, 100, 390, 290);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7 am", "8 am", "9 am", "10 am", "11 am", "12 pm", "1 pm", "2 pm", "3 pm", "4 pm", "5 pm", "6 pm", "7 pm", "8 pm" }));
        gamePanel.add(jComboBox4);
        jComboBox4.setBounds(510, 190, 140, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livinnx/IMG_1793.jpg"))); // NOI18N
        gamePanel.add(jLabel1);
        jLabel1.setBounds(0, 0, 740, 460);
        gamePanel.add(jLabel12);
        jLabel12.setBounds(460, 180, 0, 0);

        jLabel14.setFont(new java.awt.Font("PingFang TC", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 183, 189));
        jLabel14.setText("  Escoga el día que desea reservar el gimnasio");
        jLabel14.setOpaque(true);
        gamePanel.add(jLabel14);
        jLabel14.setBounds(40, 60, 360, 40);

        jTabbedPane2.addTab("Zona de Juegos", gamePanel);

        studyPanel.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 12, 84), 5));

        jLabel4.setFont(new java.awt.Font("PingFang TC", 1, 24)); // NOI18N
        jLabel4.setText("Disponibilidad");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 183, 189), 5));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        studyPanel.add(jPanel8);
        jPanel8.setBounds(480, 30, 190, 60);

        buttonLogIn1.setBackground(new java.awt.Color(255, 255, 255));
        buttonLogIn1.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogIn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livinnx/button_reservar.png"))); // NOI18N
        buttonLogIn1.setBorderPainted(false);
        buttonLogIn1.setContentAreaFilled(false);
        buttonLogIn1.setFocusPainted(false);
        buttonLogIn1.setMaximumSize(new java.awt.Dimension(270, 62));
        buttonLogIn1.setMinimumSize(new java.awt.Dimension(270, 62));
        buttonLogIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogIn1ActionPerformed(evt);
            }
        });
        studyPanel.add(buttonLogIn1);
        buttonLogIn1.setBounds(520, 230, 120, 50);

        jLabel13.setFont(new java.awt.Font("PingFang TC", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 183, 189));
        jLabel13.setText("  Escoga el día que desea reservar la zona de estudio");
        jLabel13.setOpaque(true);
        studyPanel.add(jLabel13);
        jLabel13.setBounds(20, 60, 390, 40);
        studyPanel.add(jCalendar3);
        jCalendar3.setBounds(20, 100, 390, 300);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7 am", "8 am", "9 am", "10 am", "11 am", "12 pm", "1 pm", "2 pm", "3 pm", "4 pm", "5 pm", "6 pm", "7 pm", "8 pm" }));
        studyPanel.add(jComboBox3);
        jComboBox3.setBounds(520, 200, 130, 27);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livinnx/IMG_1786.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        studyPanel.add(jLabel11);
        jLabel11.setBounds(0, 0, 740, 450);

        jTabbedPane2.addTab("Zona de Estudio", studyPanel);

        poolPanel.setBackground(new java.awt.Color(255, 255, 255));
        poolPanel.setLayout(null);

        messlabel.setBackground(new java.awt.Color(255, 255, 255));
        messlabel.setFont(new java.awt.Font("PT Serif Caption", 1, 24)); // NOI18N
        messlabel.setForeground(new java.awt.Color(51, 51, 255));
        poolPanel.add(messlabel);
        messlabel.setBounds(390, 180, 110, 50);

        jLabel2.setFont(new java.awt.Font("PingFang TC", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 183, 189));
        jLabel2.setText("   Escoga el día que desea reservar la piscina");
        jLabel2.setOpaque(true);
        poolPanel.add(jLabel2);
        jLabel2.setBounds(20, 60, 370, 40);

        buttonLogIn6.setBackground(new java.awt.Color(255, 255, 255));
        buttonLogIn6.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogIn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livinnx/button_reservar.png"))); // NOI18N
        buttonLogIn6.setBorderPainted(false);
        buttonLogIn6.setContentAreaFilled(false);
        buttonLogIn6.setFocusPainted(false);
        buttonLogIn6.setMaximumSize(new java.awt.Dimension(270, 62));
        buttonLogIn6.setMinimumSize(new java.awt.Dimension(270, 62));
        buttonLogIn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogIn6ActionPerformed(evt);
            }
        });
        poolPanel.add(buttonLogIn6);
        buttonLogIn6.setBounds(510, 240, 120, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 12, 84), 5));

        jLabel3.setFont(new java.awt.Font("PingFang TC", 1, 24)); // NOI18N
        jLabel3.setText("Disponibilidad");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 183, 189), 5));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        poolPanel.add(jPanel2);
        jPanel2.setBounds(480, 30, 190, 60);
        poolPanel.add(jCalendar4);
        jCalendar4.setBounds(20, 100, 370, 300);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7 am", "8 am", "9 am", "10 am", "11 am", "12 pm", "1 pm", "2 pm", "3 pm", "4 pm", "5 pm", "6 pm", "7 pm", "8 pm" }));
        poolPanel.add(jComboBox2);
        jComboBox2.setBounds(500, 210, 140, 27);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livinnx/IMG_1781.jpg"))); // NOI18N
        poolPanel.add(jLabel8);
        jLabel8.setBounds(0, -10, 750, 470);

        jTabbedPane2.addTab("Piscina", poolPanel);

        jPanel1.setLayout(null);

        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(610, 70, 130, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Usuario", "Zona", "Día", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jTable1);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(30, 120, 720, 270);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(620, 400, 130, 40);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 12, 84), 5));

        jLabel20.setFont(new java.awt.Font("PingFang TC", 1, 24)); // NOI18N
        jLabel20.setText("Busca tus reservas ya!");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 183, 189), 5));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9);
        jPanel9.setBounds(30, 50, 290, 60);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livinnx/reserva2.jpeg"))); // NOI18N
        jPanel1.add(jLabel19);
        jLabel19.setBounds(0, 10, 800, 490);

        jTabbedPane2.addTab("Mis Reservas", jPanel1);

        jPanel3.setLayout(null);
        jPanel3.add(jLabel15);
        jLabel15.setBounds(350, 100, 0, 0);
        jPanel3.add(jLabel16);
        jLabel16.setBounds(317, 29, 0, 0);
        jPanel3.add(jLabel17);
        jLabel17.setBounds(317, 51, 0, 0);

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setLayout(null);

        labelSubName1.setBackground(new java.awt.Color(255, 255, 255));
        labelSubName1.setFont(new java.awt.Font("PT Serif Caption", 1, 30)); // NOI18N
        labelSubName1.setForeground(new java.awt.Color(255, 255, 255));
        labelSubName1.setText("un correo a: livinnxreservas@gmail.com");
        jPanel4.add(labelSubName1);
        labelSubName1.setBounds(10, 60, 780, 71);

        labelSubName2.setBackground(new java.awt.Color(255, 255, 255));
        labelSubName2.setFont(new java.awt.Font("PT Serif Caption", 1, 30)); // NOI18N
        labelSubName2.setForeground(new java.awt.Color(255, 255, 255));
        labelSubName2.setText(" Si tiene algún inconveniente envienos");
        jPanel4.add(labelSubName2);
        labelSubName2.setBounds(0, 10, 710, 71);

        jPanel5.setBackground(new java.awt.Color(210, 12, 84));
        jPanel5.setLayout(null);

        labelSubName3.setBackground(new java.awt.Color(255, 255, 255));
        labelSubName3.setFont(new java.awt.Font("PT Serif Caption", 1, 30)); // NOI18N
        labelSubName3.setForeground(new java.awt.Color(255, 255, 255));
        labelSubName3.setText("O llamenos al número (+57) 3135434528");
        jPanel5.add(labelSubName3);
        labelSubName3.setBounds(10, 20, 780, 71);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(0, 150, 750, 110);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(20, 70, 650, 260);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/livinnx/Ayuda.jpeg"))); // NOI18N
        jPanel3.add(jLabel18);
        jLabel18.setBounds(0, -10, 800, 510);

        jTabbedPane2.addTab("Ayuda", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLogIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogIn1ActionPerformed
        // TODO add your handling code here:
        String dia,hour="";
        SimpleDateFormat DF = new SimpleDateFormat("dd-MMM-yyyy");
        dia= DF.format(jCalendar3.getDate());
        switch (jComboBox3.getSelectedIndex()){
            case 0:
                hour="7 a.m";
            break;
            case 1:
                hour="8 a.m";
            break;
            case 2:
                hour="9 a.m";
            break;
            case 3:
                hour="10 a.m";
            break;
            case 4:
                hour="11 a.m";
            break;
            case 5:
                hour="12 p.m";
            break;
            case 6:
                hour = "1 p.m";
            break;
            case 7:
                hour = "2 p.m";
            break;
            case 8:
                hour = "3 p.m";
            break;
            case 9:
                hour = "4 p.m";
            break;
            case 10:
                hour = "5 p.m";
            break;
            case 11:
                hour = "6 p.m";
            break;
            case 12:
                hour = "8 p.m"; 
            break;
        }
        
        String query_buscarusuario = "SELECT Día,Hora FROM Reservas WHERE Día='" + dia + "' AND Hora='" + hour + "'";
        String titles_table[] = {"Día", "Hora"};
        DefaultTableModel CheckR = new DefaultTableModel(null, titles_table);
        String Results[] = new String[2];
        CheckR = db.SEARCH(conectar, query_buscarusuario, Results, CheckR);
        int cont = CheckR.getRowCount();
        String usu=usuario1.usuario;
        System.out.println(usu);
        if (cont != 0) {
            JOptionPane.showMessageDialog(null, "Este horario ya se encuentra reservado");
        } else {
            String query_add_reserva = "INSERT INTO Reservas (Día,Hora,Area)" + "VALUES ('" + dia + "','" + hour + "',3)";
            System.out.println(query_add_reserva);
            String query_addperese = "INSERT INTO Reservas_Personas (ID_Reserva,ID_Persona)"+"VALUES ('"+3+"','"+7+"')";
            System.out.println(query_addperese);
            db.add_edit_delete(conectar, query_add_reserva);
        }
    }//GEN-LAST:event_buttonLogIn1ActionPerformed

    private void buttonLogIn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogIn4ActionPerformed
        // TODO add your handling code here:
        String dia,hour="";
        SimpleDateFormat DF = new SimpleDateFormat("dd-MMM-yyyy");
        dia= DF.format(jCalendar2.getDate());
        switch (jComboBox4.getSelectedIndex()){
            case 0:
                hour="7 a.m";
            break;
            case 1:
                hour="8 a.m";
            break;
            case 2:
                hour="9 a.m";
            break;
            case 3:
                hour="10 a.m";
            break;
            case 4:
                hour="11 a.m";
            break;
            case 5:
                hour="12 p.m";
            break;
            case 6:
                hour = "1 p.m";
            break;
            case 7:
                hour = "2 p.m";
            break;
            case 8:
                hour = "3 p.m";
            break;
            case 9:
                hour = "4 p.m";
            break;
            case 10:
                hour = "5 p.m";
            break;
            case 11:
                hour = "6 p.m";
            break;
            case 12:
                hour = "8 p.m"; 
            break;
        }
        String query_buscarusuario = "SELECT Día,Hora FROM Reservas WHERE Día='" + dia + "' AND Hora='" + hour + "'";
        String titles_table[] = {"Día", "Hora"};
        DefaultTableModel CheckR = new DefaultTableModel(null, titles_table);
        String Results[] = new String[2];
        CheckR = db.SEARCH(conectar, query_buscarusuario, Results, CheckR);
        int cont = CheckR.getRowCount();

        if (cont != 0) {
            JOptionPane.showMessageDialog(null, "Este horario ya se encuentra reservado");
        } else {
            String query_add_reserva = "INSERT INTO Reservas (Día,Hora,Area)" + "VALUES ('" + dia + "','" + hour + "',2)";
            System.out.println(query_add_reserva);
            db.add_edit_delete(conectar, query_add_reserva);
        }
    }//GEN-LAST:event_buttonLogIn4ActionPerformed

    private void buttonLogIn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogIn5ActionPerformed
        // TODO add your handling code here:
        String dia,hour="";
        SimpleDateFormat DF = new SimpleDateFormat("dd-MMM-yyyy");
        dia= DF.format(jCalendar1.getDate());
        System.out.println(dia);
        switch (jComboBox1.getSelectedIndex()){
            case 0:
                hour="7 a.m";
            break;
            case 1:
                hour="8 a.m";
            break;
            case 2:
                hour="9 a.m";
            break;
            case 3:
                hour="10 a.m";
            break;
            case 4:
                hour="11 a.m";
            break;
            case 5:
                hour="12 p.m";
            break;
            case 6:
                hour = "1 p.m";
            break;
            case 7:
                hour = "2 p.m";
            break;
            case 8:
                hour = "3 p.m";
            break;
            case 9:
                hour = "4 p.m";
            break;
            case 10:
                hour = "5 p.m";
            break;
            case 11:
                hour = "6 p.m";
            break;
            case 12:
                hour = "8 p.m"; 
            break;
            default:
                hour = "0";
            break;
        }
        
        String query_buscarusuario = "SELECT Día,Hora FROM Reservas WHERE Día='"+dia+"' AND Hora='"+hour+"'";      
        String titles_table[] = {"Día", "Hora"};
        DefaultTableModel CheckR = new DefaultTableModel(null, titles_table);
        String Results[] = new String[2];
        CheckR = db.SEARCH(conectar, query_buscarusuario, Results, CheckR);
        int cont = CheckR.getRowCount();
        
        if(cont != 0){
            JOptionPane.showMessageDialog(null,"Este horario ya se encuentra reservado");
        }
        else
        {
            String query_add_reserva = "INSERT INTO Reservas (Día,Hora,Area)"+"VALUES ('"+dia+"','" +hour+ "',1)";
            System.out.println(query_add_reserva);
            db.add_edit_delete(conectar, query_add_reserva);
            JOptionPane.showMessageDialog(null,"La reserva se realizó correctamente");
        }
        
    }//GEN-LAST:event_buttonLogIn5ActionPerformed

    private void buttonLogIn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogIn6ActionPerformed
        // TODO add your handling code here:
        String dia,hour;
        SimpleDateFormat DF = new SimpleDateFormat("dd-MMM-yyyy");
        dia= DF.format(jCalendar4.getDate());
        
        switch (jComboBox2.getSelectedIndex()){
            case 0:
                hour="7 a.m";
            break;
            case 1:
                hour="8 a.m";
            break;
            case 2:
                hour="9 a.m";
            break;
            case 3:
                hour="10 a.m";
            break;
            case 4:
                hour="11 a.m";
            break;
            case 5:
                hour="12 p.m";
            break;
            case 6:
                hour = "1 p.m";
            break;
            case 7:
                hour = "2 p.m";
            break;
            case 8:
                hour = "3 p.m";
            break;
            case 9:
                hour = "4 p.m";
            break;
            case 10:
                hour = "5 p.m";
            break;
            case 11:
                hour = "6 p.m";
            break;
            case 12:
                hour = "8 p.m"; 
            break;
            default:
                hour = "0";
            break;
        }
        String query_buscarusuario = "SELECT Día,Hora FROM Reservas WHERE Día='" + dia + "' AND Hora='" + hour + "'";
        String titles_table[] = {"Día", "Hora"};
        DefaultTableModel CheckR = new DefaultTableModel(null, titles_table);
        String Results[] = new String[2];
        CheckR = db.SEARCH(conectar, query_buscarusuario, Results, CheckR);
        int cont = CheckR.getRowCount();

        if (cont != 0) {
            JOptionPane.showMessageDialog(null, "Este horario ya se encuentra reservado");
        } else {
            String query_add_reserva = "INSERT INTO Reservas (Día,Hora,Area)" + "VALUES ('" + dia + "','" + hour + "',4)";
            System.out.println(query_add_reserva);
            db.add_edit_delete(conectar, query_add_reserva);
        }
    }//GEN-LAST:event_buttonLogIn6ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String usuario = usuario1.usuario;
        System.out.println(usuario);
        //usuario = userTextField.getText();
        String query_search_reserv = "SELECT PERSONAS.USUARIO,AREAS.NOMBRE,RESERVAS.DÍA,RESERVAS.HORA FROM PERSONAS,RESERVAS_PERSONAS,RESERVAS,AREAS WHERE PERSONAS.USUARIO='"+usuario+"' AND RESERVAS_PERSONAS.ID_PERSONA=PERSONAS.ID AND RESERVAS_PERSONAS.ID_RESERVA = RESERVAS.ID AND RESERVAS.AREA =AREAS.ID";
        System.out.println(query_search_reserv);
        String titles_table[] = {"Usuario","Zona","Día", "Hora"};
        DefaultTableModel T4 = new DefaultTableModel(null, titles_table);
        String Results[] = new String[4];
        T4 = db.SEARCH(conectar, query_search_reserv, Results, T4);
        jTable1.setModel(T4);
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Reservas res = new Reservas(usuario1);
        Frame fre = new Frame();
        res.setVisible(false);
        fre.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
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
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogIn1;
    private javax.swing.JButton buttonLogIn4;
    private javax.swing.JButton buttonLogIn5;
    private javax.swing.JButton buttonLogIn6;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JPanel gymPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private com.toedter.calendar.JCalendar jCalendar3;
    private com.toedter.calendar.JCalendar jCalendar4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDayChooser jDayChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelSubName1;
    private javax.swing.JLabel labelSubName2;
    private javax.swing.JLabel labelSubName3;
    private javax.swing.JLabel messlabel;
    private javax.swing.JPanel poolPanel;
    private javax.swing.JPanel studyPanel;
    // End of variables declaration//GEN-END:variables
}
