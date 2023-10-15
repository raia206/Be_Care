/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;
import javax.swing.*;

import java.awt.*;
import static java.awt.Font.BOLD;

import java.awt.event.*;

import javax.swing.event.*;
import java.awt.image.*;
/**
 *
 * @author hp
 */
public class pro extends JFrame{
    
JLabel l,l1;
JPanel p;
ImageIcon icon,fr;

Timer t;

int x=0;

public pro()

 {
  createAndShowGUI();
 }
private void createAndShowGUI()

 {
 
  setTitle("BE CARE");

  setLayout(null);
p=new JPanel();
p.setLayout(null);
p.setSize(700, 500);
p.setLocation(0,0);
p.setBackground(Color.WHITE);
add(p);
  setDefaultCloseOperation(EXIT_ON_CLOSE);

  

  // Create an ImageIcon

  icon=new ImageIcon("eui.gif");  
  fr=new ImageIcon("be1 (1).gif");  
setIconImage(fr.getImage());
  // Create a JLabel

  l=new JLabel("BE CARE");

  

  // Set the text position bottom center relative

  // to the icon so that the icon appears as a

  // a desktop icon

  l.setVerticalTextPosition(SwingConstants.BOTTOM);

  l.setHorizontalTextPosition(SwingConstants.CENTER);

  

  // Set the icon to the JLabel
l1=new JLabel();
//l1.setSize(700,500);
l1.setIcon(icon);
//this.setIcon(fr);

//l1.setsetIcon(icon);

  

  // Set some font

  l.setFont(new Font("Segoe Script", BOLD,48));
l.setForeground(Color.WHITE);
  

  // Initially, the label isn't visible

  l.setVisible(false);
l1.setVisible(true);

  

  // Add the JLabel
l1.setSize(700, 500);
l1.setLocation(0,0);

l.setLocation(250, 250);
l.setSize(300,300);
p.add(l); 

p.add(l1);



  // Create a Timer with that executes

  // each 1ms

  t=new Timer(1,new ActionListener(){

  

   public void actionPerformed(ActionEvent ae)

   {

    if(x==200){ l.setVisible(true);}//l1.setVisible(false);}


    l.setLocation(x++-l.getWidth()/2,getHeight()/2-l.getHeight()/2);

   //if(x==){l1.setVisible(false);setBackground(Color.white);}
    if(x==getWidth()/2) {t.stop();    /* l1.setVisible(false)*/;
 }
    //if(x==)
   }

  });

  

  // Set some initial delay, optional

  t.setInitialDelay(200);

  

  // Start the timer

  t.start();

  

  // Set size and show the frame

  setSize(700,500);
  
  setVisible(true);

  setLocationRelativeTo(null);
 }

 

 public static void main(String args[])

 {

  SwingUtilities.invokeLater(new Runnable(){

   public void run()

   {

    new pro();
    

   }

  });

 }

}
