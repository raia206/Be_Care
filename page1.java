/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.project;
 //import java.lang.System.Timers.Timer timer1;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import static java.awt.Font.ITALIC;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit;
        import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author hp
 */
public class page1 extends javax.swing.JFrame {
    

    int x=0;
    int y=100;
    int a=400;
    int b=200;
     public void paint(Graphics gp)
    {
        super.paint(gp);
        Graphics2D g2d= (Graphics2D) gp;
        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Segoe Script", BOLD, 60));
             
        g2d.drawString("", x, y);
        g2d.drawString("", a, b);
       g2d.drawString("Be Care ", x, 300);
                try {

            Thread.sleep(200);
                                       // g2d.setColor(Color.blue);

            x+=20;
            a-=20;
            
            if(x>getWidth())
        {
                //g2d.drawString("Be Care", 50, 100);

            x=0;
        }
            if(a<0)
        {
        
            a=500;
        }
        repaint();
                      
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    
        
        
    }
    
    /**
     * Creates new form NewJFrame
     */
     
    public page1() {
        //l1.setVisible(false);
        //l.setBackground(Color.red);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Be Care");
        setBackground(new java.awt.Color(0, 51, 51));
        setFont(new java.awt.Font("Bradley Hand ITC", 1, 12)); // NOI18N
        setName("frame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(700, 600));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\aaaaaaaaaaaaaaq.gif")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 211, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                 new Timer().schedule(new TimerTask() {
    public void run() {
                                                      

                        new page2().setVisible(true);

    }
},5000L);
                       new page2().setVisible(false); 

            }       

        });
                        new page1().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}