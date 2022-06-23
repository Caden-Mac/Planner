//Cadence McCarthy Final Project
//Theme file
      //After print out array
      
//import
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontFormatException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.io.File;
import java.io.IOException;



public class Theme {



   //tab
   private Color tab_PanelBCKGRND;
   private Color tab_PanelFRGRND;
   private Font tabFont;
   //AddAssgtPanel
   private Color addAssgtPanel_PanelBCKGRND;
   private Color addAssgtPanel_ComponentFRGRND;
   private Color addAssgtPanel_ComponentBCKGRND;
   private Font addAssgtPanel_Font;
   //AssignDisplay
   private Color assignDisplay_PanelBCKGRND;
   private Color assignDisplay_ComponentFRGRND;
   private Color assignDisplay_ComponentBCKGRND;
   private Font assignDisplay_Font;
   //ClassPanel
   private Color classPanel_PanelBCKGRND;
   private Color classPanel_ComponentFRGRND;
   private Color classPanel_ComponentBCKGRND;
   private Font classPanel_Font;
   //DateAndTime
   private Color dateAndTime_PanelBCKGRND;
   private Color dateAndTime_ComponentFRGRND;
   private Color dateAndTime_ComponentBCKGRND;
   private Font dateAndTime_Font;
   
   
   
// creates what is in an theme
   Theme(Color tab_PanelBCKGRND, Color tab_PanelFRGRND, Font tabFont, Color addAssgtPanel_PanelBCKGRND, Color addAssgtPanel_ComponentFRGRND, Color addAssgtPanel_ComponentBCKGRND, Font addAssgtPanel_Font, Color assignDisplay_PanelBCKGRND, Color assignDisplay_ComponentFRGRND, Color assignDisplay_ComponentBCKGRND, Font assignDisplay_Font, Color classPanel_PanelBCKGRND, Color classPanel_ComponentFRGRND, Color classPanel_ComponentBCKGRND, Font classPanel_Font, Color dateAndTime_PanelBCKGRND, Color dateAndTime_ComponentFRGRND, Color dateAndTime_ComponentBCKGRND, Font dateAndTime_Font) {
      this.tab_PanelBCKGRND = tab_PanelBCKGRND;
      this.tab_PanelFRGRND = tab_PanelFRGRND;
      this.tabFont = tabFont;
      
      this.addAssgtPanel_PanelBCKGRND = addAssgtPanel_PanelBCKGRND;
      this.addAssgtPanel_ComponentFRGRND = addAssgtPanel_ComponentFRGRND;
      this.addAssgtPanel_ComponentBCKGRND = addAssgtPanel_ComponentBCKGRND;
      this.addAssgtPanel_Font = addAssgtPanel_Font;
      
      this.assignDisplay_PanelBCKGRND = assignDisplay_PanelBCKGRND;
      this.assignDisplay_ComponentFRGRND = assignDisplay_ComponentFRGRND;
      this.assignDisplay_ComponentBCKGRND = assignDisplay_ComponentBCKGRND;
      this.notes = assignDisplay_Font;
      
      this.classPanel_PanelBCKGRND = classPanel_PanelBCKGRND;
      this.classPanel_ComponentFRGRND = classPanel_ComponentFRGRND;
      this.classPanel_ComponentBCKGRND = classPanel_ComponentBCKGRND;
      this.classPanel_Font = classPanel_Font;
      
      this.dateAndTime_PanelBCKGRND = dateAndTime_PanelBCKGRND;
      this.dateAndTime_ComponentFRGRND = dateAndTime_ComponentFRGRND;
      this.dateAndTime_ComponentBCKGRND = dateAndTime_ComponentBCKGRND;
      this.dateAndTime_Font = dateAndTime_Font;
   }

// getters
   public String getName() {
      return this.name;
   }

   public int getClassNum() {
      return this.classNum;
   }
   
   public String getDueDate_MM() {
      return this.dueDate_MM;
   }

   public String getDueDate_DD() {
      return this.dueDate_DD;
   }

   public String getDueDate_YY() {
      return this.dueDate_YY;
   }
   
   public String getNotes() {
      return this.notes;
   }
   
   public boolean getComplete() {
      return this.complete;
   }


// setters - later ... as needed

// toString
   public String toString() {
      return name + ", " + classNum + ", " + dueDate_MM + "," + dueDate_DD + "," + dueDate_YY + ", " + notes + ", " + complete;
   }
   
   public Object[] toArray() {
     return new Object[] {name, classNum, dueDate_MM, dueDate_DD, dueDate_YY, notes, complete};
   }
 // toStrings are public
 // toStrings return a String
 // toStrings have ZERO parameters
 // inside the toString, you build a String (so you have to declare one and add the fields to it)
 // at the end you return the string you built.
 
}