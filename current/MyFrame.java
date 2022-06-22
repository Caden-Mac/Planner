import javax.swing.JFrame;
import java.awt.BorderLayout;

public class MyFrame extends JFrame {

   public MyFrame() {
      this("Cadence's Custom Personal Planner");
   }
   
   public MyFrame(String title) {
      super(title);
      setup();
      add(new ErrorPanel(), BorderLayout.PAGE_END);
   }

// Sets the common properties for the JFrame
   private void setup() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(1000, 1200);
      setLocationRelativeTo(null);
     // pack();
      // setLocation(200, 100);
   }
}