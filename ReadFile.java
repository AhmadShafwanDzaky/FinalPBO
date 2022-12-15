import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
  public static void read(String x) {
    try {
      File myObj = new File("/dzaky/Kuliah/Semester 3/pbo/Final Project/" + x);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("Ada error nih, afaan tuh??");
      e.printStackTrace();
    }
  }
  public static void main(String[] args) throws FileNotFoundException {
  }
}