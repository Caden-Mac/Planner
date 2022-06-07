//Cadence McCarthy Final Project
//Reads in assignment file
      //Fields, constructors, getters, setters, toString

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;

public class ReadIn {
   public static final String DEFAULT_FILE = "AssignmentList_INFO.csv";

// ADD A FIELD FOR THE FILENAME
    private String filename;
    private Assignment[] assign_Info;

//constructors
   public ReadIn() {
      this (DEFAULT_FILE);
   }

   public ReadIn(String filename) {
   // SET THE FILENAME field value here
   
   
   // CALL COUNT LINES HERE ... so you have count to create the array!
   // STORE THE COUNT (it can be a local variable)
     
     //Array
     int count = countLines();
      assign_Info = new Assignment[count];

   //Read & Write the file
      readFile();
      
      
   }

   private Scanner openFile() {
      File file = new File(filename);
      Scanner scanner = new Scanner(file);
   
      return scanner;
   }


   private int countLines() {
   //Open the file
      Scanner file = openFile();
      int count = 0;
      while (file.hasNext()) {
         String line = file.nextLine();
         count++;
      }
      System.out.println("Lines: " + count);
      file.close();
      return count;
   }
   public void setFilename(String filename) {
      this.filename = DEFAULT_FILE;
   }


   private void readFile() {
   // PUT THE FIELDS here as local variables set to null
   String name = null;
   LocalDate dueDate = null;
   int classNum = 0;
   String notes = null;
   
   //Open the file
      Scanner file = openFile(filename);
      int count = 0;
     

      int assignNo = 0;
      
      while (file.hasNext()) {
         String line = file.nextLine();
         // HERE WE NEED TO SPLIT THE LINE INTO an array with 
         
         String parts[] = line.split(",");  // separates the line into an array with the right number of parts
         
         // put the parts into the local variables (will require some conversions - date/int)
         
         name = parts[0];
         dueDate = parts[1];
         classNum = parts[2];
         notes = parts[3];
         
         // now that you have all the parts, make an assignment and put it into the assign_Info array.
         
         Assignment assignment = // create the assignment here
         array[arrayIndex] = yourAssignment; // put assignment into array here
                                 // increment the arrayIndex
         System.out.println(line);
      }
         //Close the file
      file.close();

   }
}

class Tester { 
   
   public static void main(String[] args) {
   
      new ReadIn();
      //new ReadIn("this is my actual file.csv");
   
   }

}

