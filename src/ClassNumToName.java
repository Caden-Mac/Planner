//Class number to class name


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


public class ClassNumToName extends JPanel {

   private JTextField Period1;
   private JTextField Period2;
   private JTextField Period3;
   private JTextField Period4;
   private JTextField Period5;
   private JTextField Period6;
   private JTextField Period7;
   private JTextField Period8;


   public ClassNumToName() {
      setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
      setBackground(Color.BLACK);
      
   
   //       createName();
   //       createClassNum();
   //       createDueDate();
   //       createNotes();
   //       createAddButton();
    
    
//      changePanelSize(400, 600);
   }


   public void calculate() {
      if (classNum <= 4) { 
         System.out.println("Good Morning");
      } else 
            System.out.println("Good Evening");
         }
   
   
   
   }
   
//    private void createName() {
//     //name
//       JLabel nameLabel = new JLabel("Name: ");
//       nameAnswer = new JTextField(12);
//       setupComponents(nameLabel);
//       setupComponents(nameAnswer);
//       add(nameLabel);
//       add(nameAnswer);
//       add(Box.createRigidArea(new Dimension(0, 25)));
//    }
// 
//    private void createClassNum() {
//     //classNum
//       JLabel classNumLabel = new JLabel("Class Number: ");
//       classNumAnswer = new JTextField(5);
//       setupComponents(classNumLabel);
//       setupComponents(classNumAnswer);
//       add(classNumLabel);
//       add(classNumAnswer);
//       add(Box.createRigidArea(new Dimension(0, 25)));
//    }
   
//}