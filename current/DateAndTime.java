

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
import java.awt.event.*; 
import javax.swing.*;

import java.util.Locale;
import java.util.TimeZone;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class DateAndTime extends JPanel {

   private JLabel nameDateLabel;
   private JLabel nameDateInfo;
   private JLabel nameTimeLabel;
   private JLabel nameTimeInfo;

public DateAndTime() {
      setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
      setBackground(Color.WHITE);

   
      createFindDate();
      createFindTime();
    
    
    //  changePanelSize(100, 100);
   }


   	// declaring an array to store month abbreviations
      String month[] = { "Jan", "Feb", "Mar", "Apr",
         			"May", "Jun", "Jul", "Aug",
         			"Sep", "Oct", "Nov", "Dec" };
   
   	// declaring an array to store AM or PM
      String amPm[] = { "AM", "PM" };
   

      GregorianCalendar gcal = new GregorianCalendar();
      
      private void createFindDate() {
      nameDateLabel = new JLabel("Date: ");
      nameDateInfo = new JLabel(" "
         			+ month[gcal.get(Calendar.MONTH)] + " "
         			+ gcal.get(Calendar.DATE) + ", "
         			+ gcal.get(Calendar.YEAR) + "\n");
      add(nameDateLabel);
      add(nameDateInfo);
      }
      
      private void createFindTime() {
      nameTimeLabel = new JLabel("Time: ");
      nameTimeInfo = new JLabel(" "
         			+ gcal.get(Calendar.HOUR) + ":"
         			+ gcal.get(Calendar.MINUTE) + " 
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  "
         			+ amPm[gcal.get(Calendar.AM_PM)] + "\n");
      add(nameTimeLabel);
      add(nameTimeInfo);
      }
      

} 