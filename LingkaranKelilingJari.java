import java.util.Scanner;
import FileHandling.WriteFile;

// interface implement
// implements dan extends merupakan threads
public class LingkaranKelilingJari implements LingkaranInterface {
    public void keliling(){
        System.out.print("Masukkan nilai jari-jari: ");
        Scanner myObj = new Scanner(System.in);
        Double j = myObj.nextDouble();
        Double k = 2 * j * 3.14;
        System.out.println(Math.round(k));
        WriteFile.writeDoubleK(k, "FileKelilingLingkaran.txt");
    }
}
