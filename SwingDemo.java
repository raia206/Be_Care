/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//from   ww  w  .  j  av  a 2  s  .com
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class SwingDemo {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Testing");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());
    frame.add(new JLabel("Auto Hide"));
    frame.pack();
    frame.setVisible(true);

    Timer autoHideTimer = new Timer(2000, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        frame.dispose();
            //    new page3();

      }
    });
    autoHideTimer.setRepeats(false);

    frame.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseExited(MouseEvent e) {
        System.out.println("Restart...");
        autoHideTimer.restart();
      }
      @Override
      public void mouseEntered(MouseEvent e) {
        System.out.println("Stop");
        autoHideTimer.stop();
      }
    });
  }
}