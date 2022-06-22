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

import java.util.Locale;
import java.util.TimeZone;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class TimeToClassNum extends JPanel {

   //private JTextField;
   private JTextField Period1;
   private JTextField Period2;
   private JTextField Period3;
   private JTextField Period4;
   private JTextField Period5;
   private JTextField Period6;
   private JTextField Period7;
   private JTextField Period8;


   public TimeToClassNum() {
      setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
      setBackground(Color.WHITE);

   }

public int getClassNum() {
      return this.classNum;
   }

public class Greeting {

   GregorianCalendar cal = new GregorianCalendar();
   
   int hour = cal.get(Calendar.HOUR);
   int min = cal.get(Calendar.MINUTE);
   String time = (hour + ":" + min);
   
   
   if (hour < 12) { 
      System.out.println("Good Morning");
   } else if (hour < 17) {       //17 is 5 pm
         System.out.println("Good Afternoon");
   } else {
      System.out.println("Good Evening");
   }
   
   
   System.out.print(time);


}