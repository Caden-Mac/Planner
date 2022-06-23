//Class number to class name
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClassPanel extends JPanel {

   private String[] classes; // copy of the classes read in from the file
   
   private static String[] colNames = new String[] {"Class Names"};

   public ClassPanel() {
   
      ReadClassNames reader = new ReadClassNames();
      classes = reader.getClasses();
      
      JScrollPane pane = new JScrollPane();
      Object[][] myTable = reader.toMatrix();
      JTable table = new JTable(myTable, colNames); // rows, cols
      pane.setViewportView(table);
   
      setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
      add(pane);
      add(createWriteButton());
   }

   public String getClassName(int num) {
      return classes[num-1];
   }

   private JButton createWriteButton() {
      JButton button = new JButton("Write Changes");
      button.addActionListener(
         new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
               System.out.println("Add Write Method Here");
            }
         });
      return button;
   }
}


class TestClasses{                                                
   public static void main(String[] args) {
      MyFrame frame = new MyFrame("Testing Classes");
      frame.add(new ClassPanel());
      frame.setVisible(true);
   }
                                                        
}
