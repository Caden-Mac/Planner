import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Container;
import java.awt.Component;


public class AddAssgtPanel extends JPanel {
    JPanel.setSize(500, 500);
    JPanel.setLayout(new BoxLayout(JPanel, BoxLayout.Y_AXIS));
    //name
    JLabel nameLabel = new JLabel;
    JTextField nameAnswer = new JTextField;
    //dueDate
    JLabel dueDateLabel = new JLabel;
    JTextField dueDateAnswer = new JTextField;
    //classNum
    JLabel classNumLabel = new JLabel;
    JTextField classNumAnswer = new JTextField;
    //notes
    JLabel notesLabel = new JLabel;
    JTextField notesAnswer = new JTextField;
    //complete
    JLabel completeLabel = new JLabel;
    JTextField completeAnswer = new JTextField;
}


public createComponents(JLabel label, JTextField answer) {
   JLabel label = new JLabel;
   
   JTextField answer = new JTextField;
   
}

   JPanel.setVisible(true);

}