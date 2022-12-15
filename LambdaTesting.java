import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class LambdaTesting {
  public static void Lamda(){
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    Scanner myObj = new Scanner(System.in);
    System.out.print("Masukkan total angka yang mau dikuadratkan: ");
    int jum_angka = myObj.nextInt();
    // int i = 1;
    // while (i <= jum_angka) {
    //     System.out.print("Masukkan angka " + i + " yang mau dikuadratkan: ");
    //     int x = myObj.nextInt();
    //     numbers.add(x);
    //     i++;
    // }
    for (int i = 1; i <= jum_angka; i++) {
        System.out.print("Masukkan angka " + i + " yang mau dikuadratkan: ");
        int y = myObj.nextInt();
        numbers.add(y);
    }
    Consumer<Integer> method = (n) -> { System.out.println("\nKuadrat dari " +  n + " adalah " + n*n); };
    numbers.forEach( method );
  }
}