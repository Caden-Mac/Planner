import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.io.PrintWriter;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilePanel extends JScrollPane {

   private static final String MY_FILE = "MyFile.csv";
   private static final Color BACKGROUND = Color.GREEN;
   private DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("MM/dd/yyyy");
   
   private Assignment[] assignments;
   private MyFrame frame;
   private int count = 0;
   
   public FilePanel(MyFrame frame) {
      this.frame = frame;
      readMyFile();
      createView();
      frame.add(this);
   }
      
   private void createView() {
      JViewport viewport = new JViewport();
      viewport.setView(createPanel());
      setViewport(viewport);  
   }

   private void readMyFile() {
      int lines = CommonFile.getLines(MY_FILE);
      if (lines <= 0) 
         return;
      assignments = new Assignment[lines];
      Scanner fileScanner = CommonFile.openFileForReading(MY_FILE);
      if ( fileScanner == null) 
         return;
   
      if (fileScanner.hasNext())
         fileScanner.nextLine(); // read in and skip the column headers
      while (fileScanner.hasNext()) {
         String line = fileScanner.nextLine();
         String[] info = line.split(",");
         try {
            LocalDate date = LocalDate.ofEpochDay(Long.parseLong(info[0]));
            int minutes = info[2]== "" ? Integer.MIN_VALUE : Integer.parseInt(info[2]);
            boolean done = Boolean.valueOf(info[3]);
            double grade = info[4]=="" ? Double.MIN_VALUE : Double.parseDouble(info[4]);
            assignments[count++] = new Assignment(date, info[1], minutes, 
                               done, grade, info[5]);
         } catch(NumberFormatException e) {
            System.out.print("Bad Number Format: ");
            System.out.println(e.getMessage());
            e.printStackTrace();
         }
      }
      fileScanner.close();
   }

   private void writeTemperatures() {
   
      PrintWriter file = CommonFile.openFileForWriting(MY_FILE);
      file.println("Date,Subject,Minutes,Complete,Grade,Comments,");
      for (Assignment assignment : assignments) {
         file.println(assignment);
      }
      file.close(); 
   }

   private JPanel createPanel() {
      JPanel panel = new JPanel();
      panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
      panel.setBackground(BACKGROUND);
   
      for (Assignment assignment : assignments) {
         JPanel assignmentPanel = createFilePanel(assignment);
         if (assignmentPanel != null)
            panel.add(createFilePanel(assignment));
      }
      
      panel.add(createAddButton());
      return panel;
   }

   private JPanel createFilePanel(Assignment assignment) {
      if (assignment == null) 
         return null;
      JPanel panel = new JPanel();
      panel.setBackground(CommonGUI.BACKGROUND);
      panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
      panel.add(Box.createHorizontalGlue());
      panel.add(CommonGUI.createLabel(assignment.getDate().format(FORMAT)));
      panel.add(Box.createRigidArea(new Dimension(10, 10)));
      panel.add(CommonGUI.createLabel(assignment.getSubject()));
      panel.add(Box.createHorizontalGlue());
      return panel;
   }

   private JButton createAddButton() {
      JButton button = new JButton("Add");
      button.addActionListener(
         new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            //   int numAssignments = assignments.length;
            //       new AddAssignmentDialog(frame, assignments);
            //  if (numAssignments != assignments.length) {
            //    writeTemperatures();
            //    createView(); 
            //    }
            }
         });
      return button;
   }
}