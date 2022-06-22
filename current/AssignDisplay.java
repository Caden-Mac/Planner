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

   private static Object[][] myTable = assign_Info;
   
   private static String[] colNames = new String[] {"Assignment Name", "Period", "Due Date", "Notes", "Complete"};
   
   
   
   public AssignDisplay() {
      JTable adTable = new JTable(myTable, colNames); // rows, cols
      setViewportView(table);
   }



}