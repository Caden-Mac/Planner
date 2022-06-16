//Creates the Panel that displays all your assignments


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

import javax.swing.JCheckBox;



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