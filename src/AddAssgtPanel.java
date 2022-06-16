//Creates the Panel that allows you to add new assignments



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


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;

public class AddAssgtPanel extends JPanel {

   private JTextField nameAnswer;
   private JTextField classNumAnswer;
   private JPanel dueDate;
   private JTextField dueDateAnswer_MM;
   private JTextField dueDateAnswer_DD;
   private JTextField dueDateAnswer_YY;

   private JTextArea notesAnswer;


   public AddAssgtPanel() {
      setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
      setBackground(Color.BLACK);

    //JPanel.setTitle("Cadence's Personal Planner");
   
      createName();
      createDueDate();
      createClassNum();
      createNotes();
      createAddButton();
    
    
      changePanelSize(400, 600);
   }

   private void createName() {
    //name
      JLabel nameLabel = new JLabel("Name: ");
      nameAnswer = new JTextField(12);
      setupComponents(nameLabel);
      setupComponents(nameAnswer);

      add(nameLabel);
      add(nameAnswer);
      add(Box.createRigidArea(new Dimension(0, 25)));
   }

   private void createClassNum() {
    //classNum
      JLabel classNumLabel = new JLabel("Class Number: ");
      classNumAnswer = new JTextField(5);
      setupComponents(classNumLabel);
      setupComponents(classNumAnswer);
      add(classNumLabel);
      add(classNumAnswer);
      add(Box.createRigidArea(new Dimension(0, 25)));
   }
   
   private void createDueDate() {
    //dueDate
      JLabel dueDateLabel = new JLabel("Date Due: ");
 
      dueDate = new JPanel();
      dueDate.setLayout(new BoxLayout(dueDate, BoxLayout.X_AXIS));
 
      JLabel dueDateLabel_MM = new JLabel("Month");   //Month due
      dueDateAnswer_MM = new JTextField(2);
 
      JLabel dueDateLabel_DD = new JLabel("Day");     //Day due
      dueDateAnswer_DD = new JTextField(2);
 
      JLabel dueDateLabel_YY = new JLabel("Year");    //Year due
      dueDateAnswer_YY = new JTextField(4);
 
      setupComponents(dueDateLabel);
      setupComponents(dueDateLabel_MM);
      setupComponents(dueDateAnswer_MM);
      setupComponents(dueDateLabel_DD);
      setupComponents(dueDateAnswer_DD);
      setupComponents(dueDateLabel_YY);
      setupComponents(dueDateAnswer_YY);
 
      add(dueDateLabel);
      dueDate.add(dueDateLabel_MM);
      dueDate.add(dueDateAnswer_MM);
      add(Box.createRigidArea(new Dimension(10, 0)));
      dueDate.add(dueDateLabel_DD);
      dueDate.add(dueDateAnswer_DD);
      add(Box.createRigidArea(new Dimension(10, 0)));
      dueDate.add(dueDateLabel_YY);
      dueDate.add(dueDateAnswer_YY);
      add(dueDate);
      add(Box.createRigidArea(new Dimension(0, 25)));

   }

   private void createNotes() {
    //notes
      JLabel notesLabel = new JLabel("Notes: ");
      notesAnswer = new JTextArea();
      setupComponents(notesLabel);
      setupComponents(notesAnswer);
      add(notesLabel);
      add(notesAnswer);

      add(Box.createRigidArea(new Dimension(0, 25)));

   }

   public ActionListener buttonAction(JButton button){   
      ActionListener al = 
         new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
               //call constructor
               Assignment assignment = new Assignment(nameAnswer.getText(), Integer.parseInt(classNumAnswer.getText()), dueDateAnswer_MM.getText(), dueDateAnswer_DD.getText(), dueDateAnswer_YY.getText(), notesAnswer.getText(), false); 
              System.out.println(assignment);
            }
         } ;
      return al;
   } 

   private void createAddButton() { 
      JButton addButton = new JButton("Add Assignment");
      addButton.addActionListener(buttonAction(addButton));
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