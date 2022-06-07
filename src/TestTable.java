import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.time.LocalDate;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;

public class TestTable extends JScrollPane {

private static Object[][] myTable = new Object[][] {  {3, "Read pp. 216-221", "Make sure you pay attention to the parts of the cell", LocalDate.ofEpochDay(14350), Boolean.valueOf(false)},
                                                      {2, "p. 304, odd problems", "Should be easy", LocalDate.ofEpochDay(14350), Boolean.valueOf(false)},
                                                      {1, "p. 100, Read about St. Monica", "Discuss with mom", LocalDate.ofEpochDay(14357), Boolean.valueOf(false)},
                                                      {5, "Write short story about baseball", "Go talk to Baseball Coach", LocalDate.ofEpochDay(14349), Boolean.valueOf(false)},
                                                      {6, "Duo Lingo Spanish 7-2", "Do this first", LocalDate.ofEpochDay(14351), Boolean.valueOf(false)},
                                                      {7, "write paragraph on civil war battle", "rough draft", LocalDate.ofEpochDay(14352), Boolean.valueOf(false)}
                                                      };
                                                      
private static String[] colNames = new String[] {"Class", "Assignment", "Notes", "Date Due", "Complete"};
                                                      
public TestTable() {
  JTable table = new JTable(myTable, colNames); // rows, cols
  setViewportView(table);
}


private DefaultTableModel createTableModel() {
DefaultTableModel model = new DefaultTableModel(new Object[]{"Check Box1","Check Box2", "Check Box3"}, 0) {
         @Override
         public Class getColumnClass(int columnIndex) {
            return Boolean.class;
         }
      };
return model;
}
                                                      
}
class TableTest {

  public static void main(String[] args) {
  
  
  MyFrame frame = new MyFrame("Testing out a table view");
  TestTable table = new TestTable();
  frame.add(table);
  frame.setVisible(true);
  
  
  }
  
  

}
