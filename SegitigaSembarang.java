import java.util.Scanner;
import FileHandling.WriteFile;

public class SegitigaSembarang {
    public static void luas(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Masukkan sisi 1 segitiga: ");
        Double a = myObj.nextDouble();
        System.out.println("Masukkan sisi 2 segitiga: ");
        Double b = myObj.nextDouble();
        System.out.println("Masukkan sisi 3 segitiga: ");
        Double c = myObj.nextDouble();
        Double s = (a + b + c)/2;
        Double luas = s*(s-a)*(s-b)*(s-c);
        System.out.println("luas segitiga sama sisi = " + luas);
        WriteFile.writeDoubleK(luas, "FileKelilingSegitigaSamaSisi.txt");
    }
    public static void keliling(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Masukkan sisi 1 segitiga: ");
        Double a = myObj.nextDouble();
        System.out.println("Masukkan sisi 2 segitiga: ");
        Double b = myObj.nextDouble();
        System.out.println("Masukkan sisi 3 segitiga: ");
        Double c = myObj.nextDouble();
        Double s = (a + b + c);
        System.out.println("Keliling segitiga sama sisi = " + s);
        WriteFile.writeDoubleK(s, "FileKelilingSegitigaSamaSisi.txt");
    }
}
