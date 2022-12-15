import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile {
  public static void create(String y) {
    try {
      File myObj = new File(y);
      if (myObj.createNewFile()) {
        System.out.println("Filenya udah dibuat, namanya adalahhh " + myObj.getName());
      } else {
        System.out.println("Filenya udah ada brader");
      }
    } catch (IOException e) {
        System.out.println("Ada error nih, afaan tuh??");
      e.printStackTrace();
    }
  }
}