//Cadence McCarthy Final Project
//Assignment file
      //After print out array
      
//import
import java.time.LocalDate;

public class Assignment {

   private String name;
   private int classNum;
   private String dueDate_MM;
   private String dueDate_DD;
   private String dueDate_YY;
   private String notes;
   private boolean complete;
   
   
   
// creates what is in an assignment
   Assignment(String name, int classNum, String dueDate_MM, String dueDate_DD, String dueDate_YY, String notes, boolean complete) {
      this.name = name;
      this.classNum = classNum;
      this.dueDate_MM = dueDate_MM;
      this.dueDate_DD = dueDate_DD;
      this.dueDate_YY = dueDate_YY;
      this.notes = notes;
      this.complete = complete;
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