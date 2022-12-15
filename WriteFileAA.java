import java.io.FileWriter;   // Import the FileWriter class
import java.io.BufferedWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteFileAA {
    public static void writeInt(Integer x, String y){
        try {
            FileWriter myWriter = new FileWriter(y, true);
            BufferedWriter bw = new BufferedWriter(myWriter);
            bw.write(x + " satuan luas");
            bw.newLine();
            bw.close();
            System.out.println("File kamu sukses ditulis!");
        } catch (IOException e) {
            System.out.println("Ada error nih, afaan tuh??");
            e.printStackTrace();
        }
    }
    
    public static void writeDouble(Double x, String y){
        try {
            FileWriter myWriter = new FileWriter(y, true);
            BufferedWriter bw = new BufferedWriter(myWriter);
            bw.write(x + " satuan luas");
            bw.newLine();
            bw.close();
            System.out.println("File kamu sukses ditulis!");
        } catch (IOException e) {
            System.out.println("Ada error nih, afaan tuh??");
            e.printStackTrace();
        }
    }
    
    public static void writeIntK(Integer x, String y){
        try {
            FileWriter myWriter = new FileWriter(y, true);
            BufferedWriter bw = new BufferedWriter(myWriter);
            bw.write(x + " satuan keliling");
            bw.newLine();
            bw.close();
            System.out.println("File kamu sukses ditulis!");
        } catch (IOException e) {
            System.out.println("Ada error nih, afaan tuh??");
            e.printStackTrace();
        }
    }
    
    public static void writeDoubleK(Double x, String y){
        try {
            FileWriter myWriter = new FileWriter(y, true);
            BufferedWriter bw = new BufferedWriter(myWriter);
            bw.write(x + " satuan keliling");
            bw.newLine();
            bw.close();
            System.out.println("File kamu sukses ditulis!");
        } catch (IOException e) {
            System.out.println("Ada error nih, afaan tuh??");
            e.printStackTrace();
        }
    }
}
