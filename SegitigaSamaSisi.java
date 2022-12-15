import java.util.Scanner;
import FileHandling.WriteFile;

public class SegitigaSamaSisi implements SegitigaInterface {
    public void luas(){
        System.out.print("Masukkan nilai sisi segitiga: ");
        Scanner myObj = new Scanner(System.in);
        Double x = myObj.nextDouble();
        Double y = ((x*x)/4) * Math.sqrt(3);
        System.out.println("Luas segitiga sama sisi = " + y);
        WriteFile.writeDouble(y, "FileLuasSegitigaSamaSisi.txt");
    }
    public void keliling(){
        System.out.print("Masukkan nilai sisi segitiga: ");
        Scanner myObj = new Scanner(System.in);
        Double x = myObj.nextDouble();
        Double y = x*3;
        System.out.println("Keliling segitiga sama sisi = " + y);
        WriteFile.writeDoubleK(y, "FileKelilingSegitigaSamaSisi.txt");
    }
}
