
import java.awt.BorderLayout;

public class Tester {

   public static void main(String[] args) {
    MyFrame frame = new MyFrame("Planner");
    
      frame.add(new TabbedPane());
      frame.pack();
      frame.setVisible(true);
   }
}