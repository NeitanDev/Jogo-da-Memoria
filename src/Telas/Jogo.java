/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

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
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 81, 71));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/will.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 81, 71));

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 188, 81, 71));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 81, 71));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 188, 81, 71));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Abner.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 81, 71));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/brunin.png"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 81, 71));

        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 81, 71));

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 81, 71));

        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 81, 71));

        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 81, 71));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 81, 71));

        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 81, 71));

        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 81, 71));

        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 81, 71));

        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 81, 71));

        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 81, 71));

        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 81, 71));

        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 81, 71));

        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 81, 71));

        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 81, 71));

        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 81, 71));

        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 81, 71));

        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 81, 71));

        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 81, 71));

        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 81, 71));

        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 81, 71));

        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 81, 71));

        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 81, 71));

        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 81, 71));

        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 81, 71));

        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 81, 71));

        jLabel3.setText("     ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, -1, -1));

        jLabel36.setText("     ");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
