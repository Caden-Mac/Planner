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

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.time.LocalDate;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;



public class AssignDisplay extends JScrollPane {

   JTabel table;
   public table 
   
   
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
      JLabel testing = new JLabel("Name: Date");
      add(testing);
   }
   
   
   
   
   
   
   

   private void changePanelSize(int width, int height) {
      Dimension dim = new Dimension(width, height);
      setPreferredSize(dim);
      setMinimumSize(dim);
      setMaximumSize(dim);  
   }

}