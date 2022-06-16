//TEST

//Cadence McCarthy Final Project
//Reads in assignment file
      //Fields, constructors, getters, setters, toString

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class ReadIn {
   public static final String FOLDER = "../resources/";
   public static final String DEFAULT_FILE = "AssignmentList_INFO.csv";

// ADD A FIELD FOR THE FILENAME
   private String filename;
   private Assignment[] assign_Info;

//constructors
   public ReadIn() {
      this (FOLDER + DEFAULT_FILE);
   }

   public ReadIn(String filename) {
   // SET THE FILENAME field value here
   
      this.filename = filename;
      int count = countLines(); 
   
            // CALL COUNT LINES HERE ... so you have count to create the array!
            // STORE THE COUNT (it can be a local variable)
     
     //Array
      assign_Info = new Assignment[count];
   
   //Read & Write the file
      readFile();
      
      
   }

   private Scanner openFile() {
      File file = new File(filename);
      Scanner scanner = null;
      try {
         scanner = new Scanner(file);
      } catch(FileNotFoundException e) {
         System.out.println("Did not find file: " + filename);
         System.exit(-1);
      }
   
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
      String dueDate = null;
      int classNum = 0;
      String notes = null;
      boolean complete = false;
   
   //Open the file
      Scanner file = openFile();
      int count = 0;
     
   
      int assignNo = 0;
      
      while (file.hasNext()) {
         String line = file.nextLine();
         // HERE WE NEED TO SPLIT THE LINE INTO an array with 
         
         String parts[] = line.split(",");  // separates the line into an array with the right number of parts
         
         // put the parts into the local variables (will require some conversions - date/int)
         
         name = parts[0];
         dueDate = parts[1];
         classNum = Integer.parseInt(parts[2]);
         notes = parts[3];
         complete = Boolean.parseBoolean(parts[4]);
         
         // now that you have all the parts, make an assignment and put it into the assign_Info array.
         
         Assignment assignment = new Assignment(name, dueDate, classNum, notes, complete);// create the assignment here
         assign_Info[assignNo] = assignment; // put assignment into array here
         assignNo++;                        // increment the arrayIndex
      //        System.out.println(line);
      }
         //Close the file
      file.close();
   
   }
   
   public void addAssignmentToArray(Assignment assignment) {
   
     Assignment[] assignments = new Assignment[assign_Info.length+1]; // make new array, 1 bigger
     
     // put the new assignment at the beginning of the array
     assignments[0] = assignment;
     
     // copy the old assignments into the new array 
     for (int a = 0; a < assign_Info.length; a++)
       assignments[a] = assign_Info[a+1];
       
     // replace the old array with the new array
     assign_Info = assignments;
       
   }
   
   public void printAll() {
      for (int i = 0; i < assign_Info.length; i++) {
         System.out.println(assign_Info[i]);
      }
      System.out.println("Done");
   }
      
      
}

class Tester2 { 
   
   public static void main(String[] args) {
      
      
      ReadIn test = new ReadIn();
      
      test.printAll();
      //new ReadIn("this is my actual file.csv");
      
      Assignment newA = new Assignment("New Assignment", "The new one", 99, "new Assignment", false);
      test.addAssignmentToArray(newA);
      test.printAll();
      
   
   
   }

}
