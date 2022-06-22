//Class number to class name


import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.Container;
import javax.swing.JComponent;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*; 
import javax.swing.*;  


public class ClassNumToName extends JPanel {

   //private JTextField;
   private JTextField p1Name;
   private JTextField p2Name;
   private JTextField p3Name;
   private JTextField p4Name;
   private JTextField p5Name;
   private JTextField p6Name;
   private JTextField p7Name;
   private JTextField p8Name;


   public ClassNumToName() {
      setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
      setBackground(Color.WHITE);
      
      createPeriod1();
      createPeriod2();
      createPeriod3();
      createPeriod4();
      createPeriod5();
      createPeriod6();
      createPeriod7();
      createPeriod8();
   
   }

   private void createPeriod1() {
      JLabel p1Label = new JLabel("Period 1:");
      p1Name = new JTextField(12);
      setupComponents(p1Label);
      setupComponents(p1Name);
   
      add(p1Label);
      add(p1Name);
      add(Box.createRigidArea(new Dimension(0, 25)));
   }

   private void createPeriod2() {
      JLabel p2Label = new JLabel("Period 2:");
      p2Name = new JTextField(12);
      setupComponents(p2Label);
      setupComponents(p2Name);
   
      add(p2Label);
      add(p2Name);
      add(Box.createRigidArea(new Dimension(0, 25)));
   }
   
   private void createPeriod3() {
      JLabel p3Label = new JLabel("Period 3:");
      p3Name = new JTextField(12);
      setupComponents(p3Label);
      setupComponents(p3Name);
   
      add(p3Label);
      add(p3Name);
      add(Box.createRigidArea(new Dimension(0, 25)));
   }

   private void createPeriod4() {
      JLabel p4Label = new JLabel("Period 4:");
      p4Name = new JTextField(12);
      setupComponents(p4Label);
      setupComponents(p4Name);
   
      add(p4Label);
      add(p4Name);
      add(Box.createRigidArea(new Dimension(0, 25)));
   }
   
   private void createPeriod5() {
      JLabel p5Label = new JLabel("Period 5:");
      p5Name = new JTextField(12);
      setupComponents(p5Label);
      setupComponents(p5Name);
   
      add(p5Label);
      add(p5Name);
      add(Box.createRigidArea(new Dimension(0, 25)));
   }

   private void createPeriod6() {
      JLabel p6Label = new JLabel("Period 6:");
      p6Name = new JTextField(12);
      setupComponents(p6Label);
      setupComponents(p6Name);
   
      add(p6Label);
      add(p6Name);
      add(Box.createRigidArea(new Dimension(0, 25)));
   }
   
   private void createPeriod7() {
      JLabel p7Label = new JLabel("Period 7:");
      p7Name = new JTextField(12);
      setupComponents(p7Label);
      setupComponents(p7Name);
   
      add(p7Label);
      add(p7Name);
      add(Box.createRigidArea(new Dimension(0, 25)));
   }

   private void createPeriod8() {
      JLabel p8Label = new JLabel("Period 8:");
      p8Name = new JTextField(12);
      setupComponents(p8Label);
      setupComponents(p8Name);
   
      add(p8Label);
      add(p8Name);
   }

   public void setupComponents(JComponent component) {
   
      component.setOpaque(true);
      component.setForeground(Color.DARK_GRAY);
      component.setBackground(Color.LIGHT_GRAY);   
   }

public int getClassNum() {
      return classNum;
   }

public class ifStatements {
   
   if (classNum = 1) { 
         JLabel p1Label
   } else if (classNum = 2) {      
         System.out.println("Good Afternoon");
   } else if (classNum = 3) {     
         System.out.println("Good Afternoon");
   } else if (classNum = 4) {      
         System.out.println("Good Afternoon");
   } else if (classNum = 5) {      
         System.out.println("Good Afternoon");
   } else if (classNum = 6) {      
         System.out.println("Good Afternoon");
   } else if (classNum = 7) {      
         System.out.println("Good Afternoon");
   } else if (classNum = 8) {      
         System.out.println("Good Afternoon");
   } else {
      System.out.println("Error");
   }
   
   


}