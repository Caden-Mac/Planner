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
import java.awt.Font;
import java.io.File;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class TabbedPane extends JTabbedPane {  

   private JPanel mainPanel;

   TabbedPane(){  
   
      setTabPaneFormat();
         //How do I change the color of the white box indicating a tab is selected
               // THIS IS DOABLE, BUT NOT SIMPLE
               
      JPanel p1 = new JPanel();  
      mainPanel = new JPanel();
      mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.LINE_AXIS));
      mainPanel.add(new AddAssgtPanel()); 
      mainPanel.add(new JSeparator(SwingConstants.VERTICAL));
      mainPanel.add(new AssignDisplay());
      p1.add(mainPanel);
      
   
      // Schedule panel
      JPanel p2 = new JPanel(); 
   
      // Settings Panel
      JPanel p3 = new JPanel();
        
      add(" Main ",p1);  
      add("Schedule",p2);  
      add("Settings",p3); 
   }

   private void setTabPaneFormat() {
      String windowsPath = "C:\\Windows\\Fonts\\";
      Font font = CommonGUI.createFont(windowsPath + "ELEPHNT.TTF", 32);
      setFont(font);
      setUI(
         new javax.swing.plaf.basic.BasicTabbedPaneUI() {
            @Override
            protected int calculateTabHeight(int tabPlacement, int tabIndex,
            int fontHeight) {
               return 64;
            }
         });
         
        
      setSize(400,250);
      setBackground(Color.CYAN);
   
   
   }
   
}

