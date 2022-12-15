import java.util.Scanner;
import FileHandling.WriteFile;

// interface implement
public class LingkaranKelilingDia implements LingkaranInterface {
    public void keliling(){
        System.out.print("Masukkan nilai diameter: ");
        Scanner myObj = new Scanner(System.in);
        Double d = myObj.nextDouble();
        Double k = d * 3.14;
        System.out.println(Math.round(k));
        WriteFile.writeDouble(k, "FileKelilingLingkaran.txt");
    }
}
