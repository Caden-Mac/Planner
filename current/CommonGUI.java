import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontFormatException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.io.File;
import java.io.IOException;

public class CommonGUI {

   public static String FONT = "Sans Serif";
   public static int SMALL = 12;
   public static int MEDIUM = 24;
   public static int LARGE = 32;
   
   public static Color BACKGROUND = Color.BLACK;
   
   public static Color LBL_FOREGROUND = Color.BLUE;
   public static Color LBL_BACKGROUND = Color.LIGHT_GRAY;
   
   public static Color TXT_FOREGROUND = Color.BLACK;
   public static Color TXT_BACKGROUND = Color.LIGHT_GRAY;
   
   public static Color BTN_FOREGROUND = Color.GREEN;
   public static Color BTN_BACKGROUND = Color.BLUE;
   
   public static Font lblFont = new Font(FONT, Font.PLAIN, MEDIUM);
   
   public static JLabel createLabel(String words) {
      JLabel label = new JLabel(words);
      label.setFont(lblFont);
      label.setForeground(LBL_FOREGROUND);
      label.setBackground(LBL_BACKGROUND);
      label.setOpaque(true);
      return label;
   }
   public static JTextField createField(int size) {
      JTextField field = new JTextField(size);
      field.setFont(lblFont);
      field.setForeground(TXT_FOREGROUND);
      field.setBackground(TXT_BACKGROUND);
      return field;
   }
   
   public static JPasswordField createPassword(int size) {
      JPasswordField field = new JPasswordField(size);
      field.setFont(lblFont);
      field.setForeground(TXT_FOREGROUND);
      field.setBackground(TXT_BACKGROUND);
      return field;
   }
   
   public static JButton createButton(String name) {
      JButton button = new JButton(name);
      button.setFont(lblFont);
      button.setForeground(BTN_FOREGROUND);
      button.setBackground(BTN_BACKGROUND);
      button.setAlignmentX(Component.CENTER_ALIGNMENT);
      return button;
   } 
   
   
   public static Font createFont(String fontFileName, float pt) {
   
     Font font = null;
      try {
      //Returned font is of pt size 1
         font = Font.createFont(Font.TRUETYPE_FONT, new File(fontFileName));
      
      //Derive and return a 12 pt version:
      //Need to use float otherwise
      //it would be interpreted as style
      
         return font.deriveFont(pt);
      
      } catch (IOException|FontFormatException e) {
      System.out.println("IO Exception creating font: " + fontFileName);
      // Handle exception
      }
      return font;
   }
}