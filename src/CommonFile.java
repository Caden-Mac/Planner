import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CommonFile {

   public static String path = ".." + File.separator + "resources" + File.separator;

   public static Scanner openFileForReading(String filename) {
      File file = new File(path + filename);
      Scanner scanner = null;
      try {
         scanner = new Scanner(file);
      } catch (FileNotFoundException e) {
         System.out.printf("File not found: %s\n", file);
      }
      return scanner;
   }

   public static PrintWriter openFileForWriting(String filename) {
      File file = new File(path + filename);
      PrintWriter printwriter = null;
      try {
         printwriter = new PrintWriter(file);
      } catch (FileNotFoundException e) {
         System.out.printf("File not found: %s\n", file);
      }
      return printwriter;
   }

   public static int getLines(String filename) {
   
      Scanner file = openFileForReading(filename);
      if (file == null) 
         return 0;
   
      int lines = 0;
   
      while(file.hasNext()) {
         lines++;
         file.nextLine();
      }
      file.close();
      return lines;
   }

}