import java.util.Scanner;
import FileHandling.WriteFile;

public class LingkaranLuas {
    
    void luasLingkaran(){
        while (true) {
            
            Scanner myobj = new Scanner(System.in);
            System.out.print("Mau menggunakan diameter atau jair-jari? (d/j) : ");
            String pil = myobj.next();
            switch (pil) {
                case "d":
                    System.out.print("Masukkan nilai diameter: ");
                    int d = myobj.nextInt();
                    LingkaranEncapsulation lingkaranD = new LingkaranEncapsulation();
                    lingkaranD.setDiameterLingkaran(d/2);
                    double luasLingkaranD = 3.14 * Math.pow(lingkaranD.getDiameterLingkaran(), 2);
                    System.out.println("Luas lingkaran: " + Math.round(luasLingkaranD));
                    System.exit(0);
                case "j":
                    System.out.print("Masukkan nilai jari-jari: ");
                    int j = myobj.nextInt();
                    LingkaranEncapsulation lingkaranJ = new LingkaranEncapsulation();
                    lingkaranJ.setJariLingkaran(j);
                    double luasLingkaranJ = 3.14 * Math.pow(lingkaranJ.getJariLingkaran(), 2);
                    System.out.println("Luas lingkaran: " + Math.round(luasLingkaranJ));

                    WriteFile.writeDouble(luasLingkaranJ, "FileLuasLingkaran.txt");
                    System.exit(0);
            
                default:
                    System.out.println("Masukkan d/j!!!");
                    continue;
            }
        }
    }


}
