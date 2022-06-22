import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class ErrorPanel extends JPanel {

   private static JLabel error = CommonGUI.createLabel("ERRORS GO HERE");
   private static int errorTime = 3000;
   private Timer errorResetTimer;

   public ErrorPanel() {
      createErrorResetTimer();
      setBackground(Color.BLACK);
      error.setForeground(Color.YELLOW);
      error.setBackground(Color.RED);
      error.setVisible(false);
      add(error);
   }

   public void reportError(String text) {
      error.setText(text);
      error.setVisible(true);
   
      errorResetTimer.start();
   }
   
   private void createErrorResetTimer() {
      errorResetTimer = new Timer(errorTime, 
         new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               error.setVisible(false);
               errorResetTimer.stop();
            }
         });
   }   
}