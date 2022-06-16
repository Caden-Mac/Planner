//Creates the Panel that displays all your assignments

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Dimension;

public class AssignDisplay extends JPanel {

   private JPanel mainPanel;
   private String FONT;
   // private JCheckbox complete;


   public AssignDisplay() {
      setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
      setBackground(Color.WHITE);
      
      createText();
   
   
      changePanelSize(600, 600);
   }
   
   private void createText() {
      JLabel testing = new JLabel("test");
      add(testing);
   }
   
   
   
   
   
   
   

   private void changePanelSize(int width, int height) {
      Dimension dim = new Dimension(width, height);
      setPreferredSize(dim);
      setMinimumSize(dim);
      setMaximumSize(dim);  
   }

}