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


public class TabbedPane extends JTabbedPane {  

   TabbedPane(){  
      //How do I change the color of the white box indicating a tab is selected
      setBackground(Color.CYAN);
      
      JTextArea ta = new JTextArea(400,400);  
      
      
      JPanel p1 = new JPanel();  
      p1.add(ta); 
      
      JPanel p2 = new JPanel(); 
      p2.add(new AddAssgtPanel());
      
      JPanel p3 = new JPanel();  
      
      
      setBounds(50,50,250,300);  
      add("main",p1);  
      add("add",p2);  
      add("help",p3);    
      
   }  
}



