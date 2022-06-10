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

public class AddAssgtPanel extends JPanel {

public AddAssgtPanel() {
    setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    setBackground(Color.BLACK);

    createName();
    createDueDate();
    
    //classNum
    JLabel classNumLabel = new JLabel("Class Number");
    JTextField classNumAnswer = new JTextField(5);
    //notes
    JLabel notesLabel = new JLabel();
    JTextArea notesAnswer = new JTextArea();
    //complete
    JLabel completeLabel = new JLabel();
    JCheckBox completeAnswer = new JCheckBox();
    
    
    changePanelSize(400, 600);
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
}

private void createDueDate() {
    //dueDate
    JLabel dueDateLabel = new JLabel("Date Due");
    JTextField dueDateAnswer = new JTextField(12);
    setupComponents(dueDateLabel);
    setupComponents(dueDateAnswer);
    add(dueDateLabel);
    add(dueDateAnswer);
}
public void setupComponents(JComponent component) {
   
   component.setOpaque(true);
   component.setForeground(Color.BLUE);
   component.setBackground(Color.YELLOW);   
}

private void changePanelSize(int width, int height) {
  Dimension dim = new Dimension(width, height);
  setPreferredSize(dim);
  setMinimumSize(dim);
  setMaximumSize(dim);  
}
}