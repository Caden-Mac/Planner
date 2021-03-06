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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;

public class p2 extends JPanel {

   private String name;
   private String dueDate;
   private int classNum;
   private String notes;


   public p2() {
      setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
      setBackground(Color.BLACK);
    //JPanel.setTitle("Cadence's Personal Planner");
   
      createName();
      createDueDate();
      createClassNum();
      createNotes();
      createAddButton();
    
    
      changePanelSize(600, 400);
   }

   private void createName() {
    //name
      JLabel nameLabel = new JLabel("Name: ");
      JTextField nameAnswer = new JTextField(12);
      setupComponents(nameLabel);
      setupComponents(nameAnswer);
      nameAnswer.setText("THIS IS THE TEXT FIELD");
      add(nameLabel);
      add(nameAnswer);
      add(Box.createRigidArea(new Dimension(0, 10)));
   }

   private void createDueDate() {
    //dueDate
      JLabel dueDateLabel = new JLabel("Date Due: ");
      JTextField dueDateAnswer = new JTextField(12);
      setupComponents(dueDateLabel);
      setupComponents(dueDateAnswer);
      add(dueDateLabel);
      add(dueDateAnswer);
      add(Box.createRigidArea(new Dimension(0, 10)));
   }

   private void createClassNum() {
    //classNum
      JLabel classNumLabel = new JLabel("Class Number: ");
      JTextField classNumAnswer = new JTextField(5);
      setupComponents(classNumLabel);
      setupComponents(classNumAnswer);
      add(classNumLabel);
      add(classNumAnswer);
      add(Box.createRigidArea(new Dimension(0, 10)));
   }

   private void createNotes() {
    //notes
      JLabel notesLabel = new JLabel("Notes: ");
      JTextArea notesAnswer = new JTextArea();
      setupComponents(notesLabel);
      setupComponents(notesAnswer);
      add(notesLabel);
      add(notesAnswer);
      add(Box.createRigidArea(new Dimension(0, 10)));
   }

   private void createAddButton() { 
      JButton addButton = new JButton("Add Assignment");
      addButton.addActionListener(
         new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               addButton.setText("Welcome to Java");
            }
         });
      add(addButton);
   }


   public void setupComponents(JComponent component) {
   
      component.setOpaque(true);
      component.setForeground(Color.BLUE);
      component.setBackground(Color.LIGHT_GRAY);   
   }

   private void changePanelSize(int width, int height) {
      Dimension dim = new Dimension(width, height);
      setPreferredSize(dim);
      setMinimumSize(dim);
      setMaximumSize(dim);  
   }
}