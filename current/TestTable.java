import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.time.LocalDate;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;

public class TestTable extends JScrollPane {

   private static Object[][] myTable;                                                        
   private static String[] colNames = new String[] {"Assignment", "Class", "Month", "Day", "Year", "Notes", "Complete"};
                                                        
   public TestTable() {
      ReadIn readAssignments = new ReadIn();
      myTable = readAssignments.toMatrix();
      JTable table = new JTable(myTable, colNames); // rows, cols
      setViewportView(table);
   }


   private DefaultTableModel createTableModel() {
      DefaultTableModel model = 
         new DefaultTableModel(new Object[]{"Check Box1","Check Box2", "Check Box3"}, 0) {
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
