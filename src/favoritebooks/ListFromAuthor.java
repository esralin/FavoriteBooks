
package favoritebooks;

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
import javax.swing.JFrame;


public class ListFromAuthor extends javax.swing.JFrame {

   
    public ListFromAuthor() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 1, 14)); // NOI18N
        jLabel1.setText("Enter the Author Name to see book titles and descriptions: ");

        jLabel2.setText("Author Name (fully):");

        jLabel3.setText("List of books and their descriptions:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Display");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 1, 14)); // NOI18N
        jLabel5.setText("Enter the Category to see book titles: ");

        jLabel6.setText("Category:");

        jButton2.setText("Display");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel7.setText("List of books with the category entered: ");

        jLabel9.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 1, 14)); // NOI18N
        jLabel9.setText("Enter the Category to see book titles sorted by their rating:");

        jLabel10.setText("Category:");

        jButton3.setText("Display");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel11.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 1, 14)); // NOI18N
        jLabel11.setText("Enter the Year to see  the number of books that the user has finished reading: ");

        jLabel12.setText("Year:");

        jButton4.setText("Display");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(265, 265, 265))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(203, 203, 203)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jButton2))
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel12)
                        .addGap(33, 33, 33)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)
                            .addComponent(jLabel12)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
        //This function lists the books (book title and short description) with respect to the given author name.
         try{
        
          BufferedReader b = new BufferedReader(new FileReader("BooksList.txt"));
          
          String line = null;
          String author = jTextField2.getText();
        
          //ArrayList<String> listAuthor = new ArrayList<>();   
          
          String title;
          String description;
          
     
          
            while((line = b.readLine()) != null){
                String[] elements = line.split(",");
                
                
                if(elements[3].equals(author)){
                    
                    title = elements[1];
                    description = elements[8];
                    
                    //listAuthor.add("Title: "       + title + " "+
                                  // "  - Description: " + description + "\n");
                    
                    jTextArea1.append("Title: "       + title + " "+
                                       "  - Description: " + description + "\n");
                    
                    
                }
                
                   
                
            }
            
            /*if(listAuthor.isEmpty()){
                    jLabel4.setText(("Please enter the name and surname (FULLY) of the author which is exists in the BooksList."));
                }
           jTextArea1.setText(listAuthor.toString());
            */
           
          }
         
          catch (FileNotFoundException ex) {
            Logger.getLogger(FavoriteBooks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FavoriteBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        //This function lists the books (book title) with respect to the given category from jTextField.

        
        try{
        
          BufferedReader b = new BufferedReader(new FileReader("BooksList.txt"));
          
          String line = null;
          String category = jTextField3.getText();
        
          
          
          String title;
          
          
          
          
            while((line = b.readLine()) != null){
                String[] elements = line.split(",");
                
                
                if(elements[2].equals(category)){
                    
                    title = elements[1];
     
                    
                    jTextArea2.append("Title: " + title + "\n");
                }
                   
                
            }
            
           
           
          }
         
          catch (FileNotFoundException ex) {
            Logger.getLogger(FavoriteBooks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FavoriteBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        //This function lists the books (book title) with respect to the given category from a JTextField, sorted by their rating.
        
        ArrayList<String> listCategory = new ArrayList<String>();  
        
        try{
        
          BufferedReader b = new BufferedReader(new FileReader("BooksList.txt"));
          
          String line = null;
          String category = jTextField1.getText(); 
          
         
          String title;
          
          
          
            while((line = b.readLine()) != null){
                String[] elements = line.split(",");
                
                if(elements[2].equals(category)){
                    if(elements[5].equals("5")){
                        
                        title = elements[1];
                        listCategory.add(title + " Rate:5" + "\n");
                        
                        
                    }
                }
               
                
            }
            
            
           
          }
         
          catch (FileNotFoundException ex) {
            Logger.getLogger(FavoriteBooks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FavoriteBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try{
        
          BufferedReader b = new BufferedReader(new FileReader("BooksList.txt"));
          
          String line = null;
          String category = jTextField1.getText(); 
          
         
          String title;
          
          
          
            while((line = b.readLine()) != null){
                String[] elements = line.split(",");
                
                if(elements[2].equals(category)){
                    if(elements[5].equals("4")){
                        
                        title = elements[1];
                        listCategory.add(title + " Rate:4" + "\n");
                        
                        
                    }
                }
               
                
            }
            
            
           
          }
         
          catch (FileNotFoundException ex) {
            Logger.getLogger(FavoriteBooks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FavoriteBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try{
        
          BufferedReader b = new BufferedReader(new FileReader("BooksList.txt"));
          
          String line = null;
          String category = jTextField1.getText(); 
          
         
          String title;
          
          
          
            while((line = b.readLine()) != null){
                String[] elements = line.split(",");
                
                if(elements[2].equals(category)){
                    if(elements[5].equals("3")){
                        
                        title = elements[1];
                        listCategory.add(title + " Rate:3" + "\n");
                        
                        
                    }
                }
               
                
            }
            
            
           
          }
         
          catch (FileNotFoundException ex) {
            Logger.getLogger(FavoriteBooks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FavoriteBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try{
        
          BufferedReader b = new BufferedReader(new FileReader("BooksList.txt"));
          
          String line = null;
          String category = jTextField1.getText(); 
          
         
          String title;
          
          
          
            while((line = b.readLine()) != null){
                String[] elements = line.split(",");
                
                if(elements[2].equals(category)){
                    if(elements[5].equals("2")){
                        
                        title = elements[1];
                        listCategory.add(title + " Rate:2" + "\n");
                        
                        
                    }
                }
               
                
            }
            
            
           
          }
         
          catch (FileNotFoundException ex) {
            Logger.getLogger(FavoriteBooks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FavoriteBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try{
        
          BufferedReader b = new BufferedReader(new FileReader("BooksList.txt"));
          
          String line = null;
          String category = jTextField1.getText(); 
          
         
          String title;
          
          
          
            while((line = b.readLine()) != null){
                String[] elements = line.split(",");
                
                if(elements[2].equals(category)){
                    if(elements[5].equals("1")){
                        
                        title = elements[1];
                        listCategory.add(title + " Rate:1" + "\n");
                        
                        
                    }
                }
               
                
            }
            
            
           
          }
         
          catch (FileNotFoundException ex) {
            Logger.getLogger(FavoriteBooks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FavoriteBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        if(listCategory.isEmpty()){
                    jLabel4.setText(("Please enter the category which is exist in the list. "));
                }
           jTextArea3.setText(listCategory.toString());
       
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        //This function displays the number of books that the user has finished reading in the given year from a JTextField.

        
        try{
        
          BufferedReader b = new BufferedReader(new FileReader("BooksList.txt"));
          
          String line = null;
          String year = jTextField4.getText();
        
            
          
          int count=0;
          
          
          
          
            while((line = b.readLine()) != null){
                String[] elements = line.split(",");
                
                
                if(elements[6].equals(year)){
                    
                    
                  count++;
                    
                    
                }
                   
                
            }
            
            jTextArea4.append("The number of books: " + String.valueOf(count));
            
           
          }
         
          catch (FileNotFoundException ex) {
            Logger.getLogger(FavoriteBooks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FavoriteBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ListFromAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListFromAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListFromAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListFromAuthor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListFromAuthor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
