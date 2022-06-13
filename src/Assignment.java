//Cadence McCarthy Final Project
//Assignment file
      //After print out array
      
//import
import java.time.LocalDate;

public class Assignment {

   private String name;
   private String dueDate;
   private int classNum;
   private String notes;
   private boolean complete;
   
   
   
// creates what is in an assignment
   Assignment(String name, String dueDate, int classNum, String notes, boolean complete) {
      this.name = name;
      this.dueDate = dueDate;
      this.classNum = classNum;
      this.notes = notes;
      this.complete = complete;
   }

// getters
   public String getName() {
      return this.name;
   }
   public String getDueDate() {
      return this.dueDate;
   }

   public int getClassNum() {
      return this.classNum;
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
      return name + ", " + dueDate + ", " + classNum + ", " + notes + ", " + complete;
   }
 // toStrings are public
 // toStrings return a String
 // toStrings have ZERO parameters
 // inside the toString, you build a String (so you have to declare one and add the fields to it)
 // at the end you return the string you built.
 
}