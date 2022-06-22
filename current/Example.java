import javax.swing.JPanel;
import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;

public class Example extends JPanel {


// Only do one example at a time.  THe first one should be sufficient
   public Example() {
   //    exampleOne();
   //     exampleTwo();
      exampleThree();   
   }
   
   private void exampleOne() {
      setBackground(Color.GREEN);
      setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
      add(Box.createRigidArea(new Dimension(20, 40))); // header space
      add(CommonGUI.createLabel("First Label"));
      add(Box.createRigidArea(new Dimension(20, 5)));  // space between label/textfield
      add(CommonGUI.createField(5));
      add(Box.createRigidArea(new Dimension(20, 30)));  // bigger space between pairs 
      add(CommonGUI.createLabel("Third Label"));
      add(Box.createRigidArea(new Dimension(20, 5)));  // space between label/textfield
      add(CommonGUI.createField(10));
      add(Box.createRigidArea(new Dimension(20, 30)));  // bigger space between pairs 
      add(CommonGUI.createLabel("Fifth Label"));
      add(Box.createRigidArea(new Dimension(20, 5)));  // space between label/textarea
      JTextArea bigText = new JTextArea();
      
      
      // WITHOUT THIS LINE - all of the JLABELS appear in the center of the panel,
      // WITH THIS LINE, everyhting is on the left ... try commenting it out and running
      bigText.setAlignmentX(Component.LEFT_ALIGNMENT);      
      bigText.setText("I am the very model of a modern major General\nI've information vegetable, animal, and mineral\nI know the kings of England, and I quote the fights Historical\nFrom Marathon to Waterloo, in order categorical");
      add(bigText);
      add(Box.createRigidArea(new Dimension(20, 50)));  // bigger space at bottom 
   
   }
   
   private void exampleTwo() {
      setBackground(Color.GREEN);
      // Without this line, the layout is a flow layout - 
      // so everything is just added one right after the other
   //   setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
      add(Box.createRigidArea(new Dimension(20, 40))); // header space
      add(CommonGUI.createLabel("First Label"));
      add(Box.createRigidArea(new Dimension(20, 5)));  // space between label/textfield
      add(CommonGUI.createField(5));
      add(Box.createRigidArea(new Dimension(20, 30)));  // bigger space between pairs 
      add(CommonGUI.createLabel("Third Label"));
      add(Box.createRigidArea(new Dimension(20, 5)));  // space between label/textfield
      add(CommonGUI.createField(10));
      add(Box.createRigidArea(new Dimension(20, 30)));  // bigger space between pairs 
      add(CommonGUI.createLabel("Fifth Label"));
      add(Box.createRigidArea(new Dimension(20, 5)));  // space between label/textarea
      JTextArea bigText = new JTextArea();
      
      
      // WITHOUT THIS LINE - all of the JLABELS appear in the center of the panel,
      // WITH THIS LINE, everyhting is on the left ... try commenting it out and running
      bigText.setAlignmentX(Component.LEFT_ALIGNMENT);
      
      
      bigText.setText("I am the very model of a modern major General\nI've information vegetable, animal, and mineral\nI know the kings of England, and I quote the fights Historical\nFrom Marathon to Waterloo, in order categorical");
      add(bigText);
      add(Box.createRigidArea(new Dimension(20, 50)));  // bigger space at bottom 
   
   }


// This puts the label for the field on the same line as the field
// and makes the textfield actually be only as big as we want it

   private void exampleThree() {
      setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
      add( pairs("One", 10, Color.BLUE));
      add( pairs("Two", 30, Color.RED));
      add( pairs("Three", 20, Color.GREEN));
      add( pairsCheckBox("Completed", Color.YELLOW));
      add( pairsArea("Four", Color.ORANGE));
      setAlignmentX(Component.LEFT_ALIGNMENT);
   }
   
   private JPanel pairs(String labelName, int textfieldSize, Color color) {
      FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
      layout.setHgap(25);
      JPanel panel = new JPanel(layout);
      panel.setBackground(color);
      panel.add(CommonGUI.createLabel(labelName));
      panel.add(CommonGUI.createField(textfieldSize));
      return panel;
   }

   private JPanel pairsCheckBox(String labelName, Color color) {
      FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
      layout.setHgap(25);
      JPanel panel = new JPanel(layout);
      panel.setBackground(color);
      panel.add(new JCheckBox(labelName));
      return panel;
   }

   private JPanel pairsArea(String labelName, Color color) {
      FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
      layout.setHgap(25);
      JPanel panel = new JPanel(layout);
   
      panel.setBackground(color);
   
      panel.add(CommonGUI.createLabel(labelName));
   
      JTextArea bigText = new JTextArea();      
      bigText.setText("I am the very model of a modern major General\nI've information vegetable, animal, and mineral\nI know the kings of England, and I quote the fights Historical\nFrom Marathon to Waterloo, in order categorical");
   
      panel.add(bigText);
      return panel;
   }

}

class TestExample {

   public static void main(String[] args) {
      MyFrame frame = new MyFrame("Example");
      frame.add(new Example());
      frame.pack();
      frame.setVisible(true);
   }
}