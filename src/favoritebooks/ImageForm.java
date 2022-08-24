/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package favoritebooks;

import java.awt.image.BufferedImage;
import java.io.File; 
import javax.imageio.ImageIO;
import java.awt.List;
import static java.awt.PageAttributes.MediaType.C;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import static java.nio.file.Files.lines;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;



public class ImageForm extends javax.swing.JFrame {

  
    public ImageForm() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Book ID:");

        jButton1.setText("Display");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 1, 14)); // NOI18N
        jLabel2.setText("Enter the book ID to see image of book cover ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(267, 267, 267))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //This function display the image of the book cover.
        
        File file1 = new File("Book1Cover.jpg");
        File file2 = new File("Book2Cover.jpg");
        File file3 = new File("Book3Cover.jpg");
        File file4 = new File("Book4Cover.jpg");
        File file5 = new File("Book5Cover.jpg");
        
        try{
            
            if(Integer.parseInt(jTextField1.getText())== 1){
            BufferedImage img = ImageIO.read(file1);
            
            
            
            Icon icon = new ImageIcon(img);
            
           
            setSize(724 + img.getWidth(), 588 + img.getHeight());
            
            jLabel3.setSize(img.getWidth(),img.getHeight());
            jLabel3.setIcon(icon);
            }
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(ImageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        try{
            
            if(Integer.parseInt(jTextField1.getText())== 2){
            BufferedImage img = ImageIO.read(file2);
            
            
            
            Icon icon = new ImageIcon(img);
            
            
            
            setSize(724 + img.getWidth(), 588 + img.getHeight());
            
            jLabel3.setSize(img.getWidth(),img.getHeight());
            jLabel3.setIcon(icon);
            }
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(ImageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try{
            
            if(Integer.parseInt(jTextField1.getText())== 3){
            BufferedImage img = ImageIO.read(file3);
            
            
            
            Icon icon = new ImageIcon(img);
            
            
            setSize(724 + img.getWidth(), 588 + img.getHeight());
            
            jLabel3.setSize(img.getWidth(),img.getHeight());
            jLabel3.setIcon(icon);
            }
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(ImageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try{
            
            if(Integer.parseInt(jTextField1.getText())== 4){
            BufferedImage img = ImageIO.read(file4);
            
            
            
            Icon icon = new ImageIcon(img);
            
           
            setSize(724 + img.getWidth(), 588 + img.getHeight());
            
            jLabel3.setSize(img.getWidth(),img.getHeight());
            jLabel3.setIcon(icon);
            }
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(ImageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try{
            
            if(Integer.parseInt(jTextField1.getText())== 5){
            BufferedImage img = ImageIO.read(file5);
            
            
            
            Icon icon = new ImageIcon(img);
            
            
            setSize(724 + img.getWidth(), 588 + img.getHeight());
            
            jLabel3.setSize(img.getWidth(),img.getHeight());
            jLabel3.setIcon(icon);
            }
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(ImageForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       
        






        
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
            java.util.logging.Logger.getLogger(ImageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
