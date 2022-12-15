import java.util.Scanner;
import FileHandling.WriteFile;

public class SegitigaSikuSiku implements SegitigaInterface {
    public void luas(){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Masukkan nilai alas segitiga: ");
        Double x = myObj.nextDouble();
        System.out.print("Masukkan nilai tinggi segitiga: ");
        Double y = myObj.nextDouble();
        Double z = (x*y)/2;
        System.out.println("Luas segitiga siku-siku = " + z);
        WriteFile.writeDouble(z, "FileLuasSegitigaSikuSiku.txt");
    }
    public void keliling(){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Masukkan nilai alas segitiga: ");
        Double x = myObj.nextDouble();
        System.out.print("Masukkan nilai tinggi segitiga: ");
        Double y = myObj.nextDouble();
        Double z = Math.sqrt((x*x) + (y*y));
        Double kl = (x + y + z);
        System.out.println("Keliling segitiga siku-siku = " + kl );
        WriteFile.writeDoubleK(kl, "FileKelilingSegitigaSikuSiku.txt");
    }
}
