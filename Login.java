import java.util.ArrayList; // import ArrayList
import java.util.Scanner; // import Scanner
import java.time.LocalDateTime; // import LocalDateTime class
import java.time.format.DateTimeFormatter; // Import DateTimeFormatter class
import java.io.IOException;
// 👋🙏
public class Login {
    public static void login(){
        
        ArrayList<String> apakek = new ArrayList<String>();
        Scanner myObj = new Scanner(System.in);
        LocalDateTime timeNow = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // format waktu dalam bentuk dd-MM-yyy HH:mm:ss
        String formattedDate = timeNow.format(myFormatObj);

        apakek.add("admin");
        apakek.add("admin123");
        // welkam welkaman
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("\n      Selamat datang di <WELCOME> Final Project Ahmad Shafwan Dzaky");
        System.out.println  ("        Anda mengakses final project ini pada " + formattedDate + "\n");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("\n\n\nUntuk mengakses Final Project ini, anda perlu memiliki username dan password");

        Task:while (true) {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("1. Masuk(sudah memiliki username dan password");
            System.out.println("2. Daftar(belum memiliki username dan password");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("\nSilahkan tulis 'masuk' untuk masuk dan 'daftar' untuk daftar: ");
            String yn = myObj.next();
            if (yn.equals("masuk") || yn.equals("Masuk")) {  
                System.out.print("\nMasukkan username : ");
                String username = myObj.next();
                System.out.print("Masukkan password : ");
                String password = myObj.next();
                try {
                    if (username.equals(apakek.get(0)) && password.equals(apakek.get(1))) {
                        System.out.println("\nAnda berhasil login!!");
                        Main main1 = new Main();
                        try {
                            main1.main();
                            
                        } catch (Exception e) {
                            System.out.println("!!!Masukkan input sesuai instruksi!!!");
                            // TODO: handle exception
                        }
                    } else if(username.equals(apakek.get(2)) && password.equals(apakek.get(3))){
                        System.out.println("\nAnda berhasil login!!");
                        Main main1 = new Main();
                        try {
                            main1.main();
                            
                        } catch (Exception e) {
                            System.out.println("!!!Masukkan input sesuai instruksi!!!");
                            // TODO: handle exception
                        }
                    } else {
                        continue;
                    }
                    
                } catch (Exception e) {
                    System.out.println("\n!!!Ada yang salah di username atau password anda!!!\n");
                    // TODO: handle exception
                }
            } 
            else if (yn.equals("daftar") || yn.equals("Daftar")){
                System.out.println("Silahkan isi data di bawah ini!");
                System.out.print("Username : ");
                String newUsername = myObj.next();
                apakek.add(newUsername);
                System.out.print("Paswword : ");
                String newPassword = myObj.next();
                apakek.add(newPassword);
                System.out.print("Anda laki-laki atau perempuan? (L/P): "); 
                String af = myObj.next();
                task1:while (true) {
                    if (af.equals("L")) { // implementasi equals method
                        String jenisK = JenisKelaminEnum.LAKILAKI.name(); // implementasi Enum
                        System.out.println("Anda adalah seorang " + jenisK);
                        break task1;
                    } else if(af.equals("P")){
                        String jenisK = JenisKelaminEnum.PEREMPUAN.name();
                        System.out.println("Anda adalah seorang " + jenisK);
                        break task1;
                    } else {
                        System.out.println("Masukkan L/P!!!!");
                        continue;
                    }
                    
                }
                
                continue;
            }
            else{
                System.out.println("Masukkan masuk/Masuk untuk masuk dan daftar/Daftar untuk daftar!!!");
                continue;
            }
            
        }
        
        // System.out.print("Masukkan nama kamu : ");
        // String ab = myObj.next();
        // System.out.print("Masukkan NIM kamu  : ");
        // String ad = myObj.next();
        // System.out.print("Kamu laki-laki atau perempuan? (L/P): "); 
        // String af = myObj.next();
        // System.out.println("\nNama kamu   : " + ab);
        // System.out.println("NIM kamu    : " + ad);
        // if (af.equals("L")) { // implementasi equals method
        //     String jenisK = JenisKelaminEnum.LAKILAKI.name(); // implementasi Enum
        //     System.out.println("Kamu adalah seorang " + jenisK);
        // } else if(af.equals("P")){
        //     String jenisK = JenisKelaminEnum.PEREMPUAN.name();
        //     System.out.println("Kamu adalah seorang " + jenisK);
        // } else {
        //     System.out.println("Masukkan L/P!!!!");
        // }
        // System.out.println();

    }

    

}
