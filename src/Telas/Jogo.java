/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Class.img;
import java.text.Normalizer.Form;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author natan
 */
public class Jogo extends javax.swing.JFrame {

    /**
     * Creates new form Jogo
     */
    public Jogo() {
        initComponents();
        //sortea();
    }

    public void sortea(){
        while(num<17){
            int lin = ran.nextInt(4);
            int col = ran.nextInt(8);
            boolean existe = true;
            
            while(existe==true){
                if(m[lin][col]==0){
                    m[lin][col]=num;
                    existe = false;
                } else {
                    lin = ran.nextInt(4);
                    col = ran.nextInt(8);
                }
            }
            existe = true;
            lin = ran.nextInt(4);
            col = ran.nextInt(8);
            while(existe==true){
                if(m[lin][col]==0){
                    m[lin][col]=num;
                    existe = false;
                } else {
                    lin = ran.nextInt(4);
                    col = ran.nextInt(8);
                }
            }
        
            num++;
        }
        
        for(int i=0; i<4; i++){
            for(int j=0; j<8;j++){
                System.out.print(m[i][j]+"  ");
            }
            System.out.println("    ");
        }
    }
    
    public String verifica(int num1, int num2){
        select = false;
        img sounou = new img();
        String camin = sounou.caminho(m[num1][num2]);
        System.out.println(camin);
        return camin;
    }
    
    public String init(int num1, int num2){
        select = true;
        img sounou = new img();
        String camin = sounou.caminho(m[num1][num2]);
        System.out.println(camin);
        return camin;
    }
    
    public void desconhecido(){
        ImageIcon imagem1= new ImageIcon(getClass().getResource("/Images/desconhecido.png"));
        imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
        jLabel2.setIcon(imagem1);
        jLabel4.setIcon(imagem1);
        jLabel5.setIcon(imagem1);
        jLabel6.setIcon(imagem1);
        jLabel7.setIcon(imagem1);
        jLabel8.setIcon(imagem1);
        jLabel9.setIcon(imagem1);
        jLabel10.setIcon(imagem1);
        jLabel11.setIcon(imagem1);
        jLabel12.setIcon(imagem1);
        jLabel13.setIcon(imagem1);
        jLabel14.setIcon(imagem1);
        jLabel15.setIcon(imagem1);
        jLabel17.setIcon(imagem1);
        jLabel18.setIcon(imagem1);
        jLabel19.setIcon(imagem1);
        jLabel20.setIcon(imagem1);
        jLabel21.setIcon(imagem1);
        jLabel22.setIcon(imagem1);
        jLabel23.setIcon(imagem1);
        jLabel24.setIcon(imagem1);
        jLabel25.setIcon(imagem1);
        jLabel26.setIcon(imagem1);
        jLabel27.setIcon(imagem1);
        jLabel28.setIcon(imagem1);
        jLabel29.setIcon(imagem1);
        jLabel30.setIcon(imagem1);
        jLabel31.setIcon(imagem1);
        jLabel32.setIcon(imagem1);
        jLabel33.setIcon(imagem1);
        jLabel34.setIcon(imagem1);
        jLabel35.setIcon(imagem1);
//        jLabel36.setIcon(imagem1);
    }
    
    int m[][] = new int[4][8];
    Random ran = new Random();
    int num = 1;
    int line = 0, column = 0;
    boolean select = false;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Jogo da Memoria");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 27, -1, -1));

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 23, -1, -1));

        jButton2.setText("Reiniciar");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 23, -1, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 81, 71));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/will.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 81, 71));

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 188, 81, 71));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 81, 71));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 188, 81, 71));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Abner.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 81, 71));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/brunin.png"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 81, 71));

        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 81, 71));

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 81, 71));

        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 81, 71));

        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 81, 71));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 81, 71));

        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 81, 71));

        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 81, 71));

        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 81, 71));

        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 81, 71));

        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 81, 71));

        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 81, 71));

        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 81, 71));

        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 81, 71));

        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 81, 71));

        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 81, 71));

        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 81, 71));

        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 81, 71));

        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 81, 71));

        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 81, 71));

        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 81, 71));

        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 81, 71));

        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 81, 71));

        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 81, 71));

        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 81, 71));

        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 81, 71));

        jLabel3.setText("     ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, -1, -1));

        jLabel36.setText("     ");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        line = 0;
        column = 0;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel4.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel4.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        line = 0;
        column = 1;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel8.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel8.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        line = 0;
        column = 2;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel9.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel9.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        line = 0;
        column = 3;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel10.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel10.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        line = 0;
        column = 4;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel12.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel12.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        line = 0;
        column = 5;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel6.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel6.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        line = 0;
        column = 6;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel11.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel11.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        // TODO add your handling code here:
        line = 0;
        column = 7;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel35.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel35.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        line = 1;
        column = 0;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel7.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel7.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        line = 1;
        column = 1;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel5.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel5.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        line = 1;
        column = 2;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel2.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel2.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        line = 1;
        column = 3;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel17.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel17.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        line = 1;
        column = 4;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel14.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel14.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        line = 1;
        column = 5;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel13.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel13.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        line = 1;
        column = 6;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel15.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel15.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        // TODO add your handling code here:
        line = 1;
        column = 7;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel34.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel34.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        line = 2;
        column = 0;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel18.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel18.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        line = 2;
        column = 1;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel19.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel19.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        line = 2;
        column = 2;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel20.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel20.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        line = 2;
        column = 3;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel21.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel21.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        line = 2;
        column = 4;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel22.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel22.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        line = 2;
        column = 5;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel23.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel23.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        line = 2;
        column = 6;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel24.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel24.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        // TODO add your handling code here:
        line = 2;
        column = 7;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel33.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel33.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
        line = 3;
        column = 0;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel25.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel25.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        line = 3;
        column = 1;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel26.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel26.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        line = 3;
        column = 2;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel27.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel27.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        line = 3;
        column = 3;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel28.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel28.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        // TODO add your handling code here:
        line = 3;
        column = 4;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel29.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel29.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        // TODO add your handling code here:
        line = 3;
        column = 5;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel30.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel30.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        // TODO add your handling code here:
        line = 3;
        column = 6;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel31.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel31.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        // TODO add your handling code here:
        line = 3;
        column = 7;
        
        if(select == true){
            String sent = verifica(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel32.setIcon(imagem1);
        } else if(select == false){
            String sent = init(line, column);
            ImageIcon imagem1= new ImageIcon(getClass().getResource(sent));
            imagem1.setImage(imagem1.getImage().getScaledInstance(81, 71, 100));
            jLabel32.setIcon(imagem1);
        }
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        desconhecido();
        sortea();
    }
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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
