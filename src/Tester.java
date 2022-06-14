import java.awt.BorderLayout;

public class Tester {

   public static void main(String[] args) {
   
      MyFrame frame = new MyFrame();
   //   frame.add(new AddAssgtPanel(), BorderLayout.CENTER);
      frame.add(new TabbedPane(), BorderLayout.CENTER);
      frame.setVisible(true);
   }
}