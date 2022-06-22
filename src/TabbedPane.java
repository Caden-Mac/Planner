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
import java.awt.Font;

public class TabbedPane extends JTabbedPane {  

   private JPanel mainPanel;

   TabbedPane(){  
   
   Font font = new Font("ELEPHNT", Font.CENTER_BASELINE, 32);
      setFont(font);
      setSize(400,250);
         //How do I change the color of the white box indicating a tab is selected
      setBackground(Color.CYAN);
      //setTitle("Cadence's Personal Planner");
      //setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
      
      JTextArea ta = new JTextArea(400,400);  
      
      
      JPanel p1 = new JPanel();  
         mainPanel = new JPanel();
         mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
         mainPanel.add(new AddAssgtPanel()); 
         mainPanel.add(new JSeparator(SwingConstants.VERTICAL));
         mainPanel.add(new AssignDisplay());
      p1.add(mainPanel);
      
      JPanel p2 = new JPanel(); 
      p2.add(new DateAndTime());
      
      JPanel p3 = new JPanel();

      
      
        
      add(" Main ",p1);  
      add("Schedule",p2);  
      add("Settings",p3); 
      

   }  
}

