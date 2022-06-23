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

   private JPanel SetupPanel1;
   private JPanel SetupPanel2;
   private JPanel SetupPanel3;

   TabbedPane(){  
   
   Font font = new Font("ELEPHNT", Font.CENTER_BASELINE, 32);
      setFont(font);
      setSize(400,250);
         //How do I change the color of the white box indicating a tab is selected
      setBackground(Color.CYAN);
      //setTitle("Cadence's Personal Planner");
      //setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
      
      JTextArea ta = new JTextArea();  
      
      
      JPanel p1 = new JPanel();  
         SetupPanel1 = new JPanel();
          SetupPanel1.setLayout(new BoxLayout(SetupPanel1, BoxLayout.X_AXIS));
          SetupPanel1.add(new AddAssgtPanel()); 
          SetupPanel1.add(new JSeparator(SwingConstants.VERTICAL));
          SetupPanel1.add(new AssignDisplay());
      p1.add(SetupPanel1);
      
      
      JPanel p2 = new JPanel(); 
         SetupPanel2 = new ClassPanel();
         SetupPanel2.setLayout(new BoxLayout(SetupPanel2, BoxLayout.X_AXIS));
         SetupPanel2.add(new ClassPanel()); 
         SetupPanel2.add(new JSeparator(SwingConstants.VERTICAL));
            SetupPanel3 = new JPanel();
            SetupPanel3.setLayout(new BoxLayout(SetupPanel3, BoxLayout.Y_AXIS));
            SetupPanel3.add(new DateAndTime()); 
            SetupPanel3.add(new JSeparator(SwingConstants.HORIZONTAL));
            SetupPanel3.add(ta); 
         SetupPanel2.add(SetupPanel3);
      p2.add(SetupPanel2);
      
      
      JPanel p3 = new JPanel();

      
      
        
      add(" Main ",p1);  
      add("Schedule",p2);  
      add("Settings",p3); 
      

   }  
}

