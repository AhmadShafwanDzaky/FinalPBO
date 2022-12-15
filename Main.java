import java.util.Scanner;
import FileHandling.WriteFile;


public class Main {
    public void main(){
        Scanner myObj = new Scanner(System.in); // implementasi user input (scanner)
        
        System.out.println("\n\n\nSekarang anda bisa mengakses final project ini \nSelamat menjelajah!!!");

        main1:while (true) {
            System.out.println("\n_____________________________________________________________");
            System.out.println("| Menu yang tersedia                                        |");
            System.out.println("| 1. Menghitung luas bangunan                               |");
            System.out.println("| 2. Menghitung keliling bangunan                           |");
            System.out.println("| 3. Menampilkan luas bangunan                              |");
            System.out.println("| 4. Menampilkan keliling bangunan                          |");
            System.out.println("| 5. Mengkuadratkan angka                                   |");
            System.out.println("| 6. Ke bagian login                                        |");
            System.out.println("| 7. Keluar dari project ini                                |");
            System.out.println("|___________________________________________________________|");
            System.out.print("Silahkan pilih 1-7: ");
            // conditional untuk memilih
            int pil = myObj.nextInt();
            switch (pil) {
                case 1:
                        System.out.println("\n____________________________________________________________");
                        System.out.println("| Silahkan pilih bangunan yang mau dihitung luasnya         |");
                        System.out.println("| 1. Persegi                                                |");
                        System.out.println("| 2. Persegi panjang                                        |");
                        System.out.println("| 3. Lingkaran                                              |");
                        System.out.println("| 4. Segitiga sama sisi                                     |");
                        System.out.println("| 5. Segitiga siku-siku                                     |");
                        System.out.println("| 6. Segitiga sembarang                                     |");
                        System.out.println("| 7. Jajar genjang                                          |");
                        System.out.println("|___________________________________________________________|");
                        System.out.print("Silahkan pilih 1-7: ");
                        int pilLuas = myObj.nextInt();
                        switch (pilLuas) {
                            case 1:
                                // class luas Persegi
                                System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                                System.err.println("\nMenghitung Luas Persegi\n");
                                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                                Persegi persegi = new Persegi();
                                System.out.print("Masukkan sisi persegi : ");
                                persegi.sisi = myObj.nextInt();
                                Integer sisiP = persegi.sisi;
                                persegi.Luas(sisiP);
                                System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                                break;
                            case 2:
                                // class luas PersegiPanjang
                                System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                                System.err.println("\nMenghitung Luas Persegi Panjang\n");
                                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                                var luasPP = new PersegiPanjang();
                                System.out.print("Masukkan sisi 1 persegi panjang : ");
                                luasPP.sisi = myObj.nextInt();
                                System.out.print("Masukkan sisi 2 persegi panjang : ");
                                Integer sisiPP = myObj.nextInt();
                                System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                                luasPP.Luas(sisiPP);
                                break;
                            case 3:
                                // class luas lingkaran encapsulation
                                System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                                System.err.println("\nMenghitung Luas Lingkaran\n");
                                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                                LingkaranLuas lingkaran = new LingkaranLuas();
                                lingkaran.luasLingkaran();
                                System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                                break;
                            case 4:
                                // interface tapi pakai default luas segitiga
                                System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                                System.err.println("\nMenghitung Luas Segitiga Sama Sisi\n");
                                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                                SegitigaInterface lSegitigaSS = new SegitigaSamaSisi();
                                lSegitigaSS.luas();
                                System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                                break;
                            case 5:
                                // interface tapi pakai default luas segitiga
                                System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                                System.err.println("\nMenghitung Luas Segitiga Sama Kaki\n");
                                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                                SegitigaInterface lSegitigaSs = new SegitigaSamaSisi();
                                lSegitigaSs.luas();
                                System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                                break;
                            case 6:
                                // interface tapi pakai default luas segitiga
                                System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                                System.err.println("\nMenghitung Luas Segitiga Sembarang\n");
                                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                                SegitigaSembarang.luas();
                                System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                                break;
                            case 7:
                                // inner class luas JajarGenjang\
                                System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                                System.err.println("\nMenghitung Luas Jajar Genjang\n");
                                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                                System.out.print("Masukkan alas jajar genjang : ");
                                JajarGenjang outer = new JajarGenjang();
                                System.out.print("Masukkan tinggi jajar genjang : ");
                                JajarGenjang.JajarGenjang2 inner = outer.new JajarGenjang2();
                                int ljg = inner.y * outer.x;
                                System.out.println(ljg);
                                WriteFile.writeInt(ljg, "FileLuasJajarGenjang.txt");
                                System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                                break;
                            default:
                                System.out.println("pilih 1-8!!!");
                                break;
                        }
                    break;
                case 2:
                    System.out.println("\n____________________________________________________________");
                    System.out.println("| Silahkan pilih bangunan yang mau dihitung kelilingnya     |");
                    System.out.println("| 1. Persegi                                                |");
                    System.out.println("| 2. Persegi panjang                                        |");
                    System.out.println("| 3. Lingkaran                                              |");
                    System.out.println("| 4. Segitiga sama sisi                                     |");
                    System.out.println("| 5. Segitiga siku-siku                                     |");
                    System.out.println("| 6. Segitiga sembarang                                     |");
                    System.out.println("| 7. Jajar genjang                                          |");
                    System.out.println("|___________________________________________________________|");
                    System.out.print("Silahkan pilih 1-7: ");
                    int pilKel = myObj.nextInt();
                    switch (pilKel) {
                        case 1:
                            // class keliling Persegi <polymorphism>\
                            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.err.println("\nMenghitung Keliling Persegi\n");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                            
                            Persegi persegi = new Persegi();
                            persegi = new KelilingPersegi();
                            System.out.print("Masukkan sisi persegi : ");
                            Integer sisi1 = myObj.nextInt();
                            persegi.Luas(sisi1);
                            System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                            break;
                        case 2:
                            // class keliling PersegiPanjang <polymorphism>
                            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.err.println("\nMenghitung Keliling Persegi Panjang\n");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                            
                            persegi = new KelilingPersegiP();
                            System.out.print("Masukkan sisi 1 persegi panjang : ");
                            persegi.sisi = myObj.nextInt();
                            System.out.print("Masukkan sisi 2 persegi panjang : ");
                            Integer sisi2 = myObj.nextInt();
                            persegi.Luas(sisi2);
                            System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                            break;
                        case 3:
                            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.err.println("\nMenghitung Keliling Lingkaran\n");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                            System.out.print("Mau menggunakan diameter atau jair-jari? (d/j) : ");
                            String DJ = myObj.next();
                            switch (DJ) {
                                case "d":
                                    // interface keliling Lingkaran <diameter>
                                    LingkaranInterface keliling = new LingkaranKelilingDia();
                                    keliling.keliling();
                                    break;
                                case "j":
                                    // interface keliling Lingkaran <jari-jari>
                                    LingkaranInterface kelilingJ = new LingkaranKelilingJari();
                                    kelilingJ.keliling();
                                    break;
                                default:
                                    System.out.println("d/j!!!");
                                    break;
                            }
                            System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                            break;
                        case 4:
                            // interface tapi pakai default keliling segitiga
                            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.err.println("\nMenghitung Keliling Segitiga Sama Sisi\n");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                            SegitigaInterface lSegitigaSS = new SegitigaSamaSisi();
                            lSegitigaSS.keliling();
                            System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                            break;
                        case 5:
                            // interface tapi pakai default keliling segitiga
                            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.err.println("\nMenghitung Keliling Segitiga Siku-SIku\n");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                            SegitigaInterface lSegitigaSs = new SegitigaSikuSiku();
                            lSegitigaSs.keliling();
                            System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                            break;
                        case 6:
                            // interface tapi pakai default keliling segitiga
                            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.err.println("\nMenghitung Keliling Segitiga Sembarang\n");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                            SegitigaSembarang.keliling();
                            System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                            break;
                        case 7:
                            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.err.println("\nMenghitung Keliling Jajar Genjang\n");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");

                            System.out.print("Masukkan alas jajar genjang : ");
                            JajarGenjang outer = new JajarGenjang();
                            System.out.print("Masukkan tinggi jajar genjang : ");
                            JajarGenjang.JajarGenjang2 inner = outer.new JajarGenjang2();
                            int ljg = 2 *(inner.y + outer.x);
                            System.out.println(ljg);
                            WriteFile.writeInt(ljg, "FileKelilingJajarGenjang.txt");
                            System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                            break;
                    
                        default:
                            System.out.println("pilih 1-8!!!");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("\n____________________________________________________________");
                    System.out.println("| Silahkan pilih bangunan yang mau ditampilkan luasnya      |");
                    System.out.println("| 1. Persegi                                                |");
                    System.out.println("| 2. Persegi panjang                                        |");
                    System.out.println("| 3. Lingkaran                                              |");
                    System.out.println("| 4. Segitiga sama sisi                                     |");
                    System.out.println("| 5. Segitiga siku-siku                                     |");
                    System.out.println("| 6. Segitiga sembarang                                     |");
                    System.out.println("| 7. Jajar genjang                                          |");
                    System.out.println("|___________________________________________________________|");
                    System.out.print("Silahkan pilih 1-7: ");
                    int pilRL = myObj.nextInt();
                    switch (pilRL) {
                        case 1:
                            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.err.println("\nIsi File Luas Persegi\n");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                            ReadFile.read("FileLuasPersegi.txt");
                            System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                            break;
                        case 2:
                            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.err.println("\nIsi File Luas Persegi Panjang\n");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                            ReadFile.read("FileLuasPersegiPanjang.txt");
                            System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                            break;
                        case 3:
                            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.err.println("\nIsi File Luas Lingkaran\n");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                            ReadFile.read("FileLuasLingkaran.txt");
                            System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                            break;
                        case 4:
                            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.err.println("\nIsi File Luas Segitiga Sama Sisi\n");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                            ReadFile.read("FileLuasSegitigaSamaSisi.txt");
                            System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                            break;
                        case 5:
                            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.err.println("\nIsi File Luas Segitiga Sama Kaki\n");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                            ReadFile.read("FileLuasSegitigaSikuSiku.txt");
                            System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                            break;
                        case 6:
                            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.err.println("\nIsi File Luas Segitiga Sembarang\n");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                            ReadFile.read("FileLuasSegitigaSembarang.txt");
                            System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                            break;
                        case 7:
                            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.err.println("\nIsi File Luas Jajar Genjang\n");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                            ReadFile.read("FileLuasJajarGenjang.txt");
                            System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                            break;
                    
                        default:
                            break;
                    }
                    break;
                case 4:
                    System.out.println("\n____________________________________________________________");
                    System.out.println("| Silahkan pilih bangunan yang mau ditampilkan kelilingnya  |");
                    System.out.println("| 1. Persegi                                                |");
                    System.out.println("| 2. Persegi panjang                                        |");
                    System.out.println("| 3. Lingkaran                                              |");
                    System.out.println("| 4. Segitiga sama sisi                                     |");
                    System.out.println("| 5. Segitiga siku-siku                                     |");
                    System.out.println("| 6. Segitiga sembarang                                     |");
                    System.out.println("| 7. Jajar genjang                                          |");
                    System.out.println("|___________________________________________________________|");
                    System.out.print("Silahkan pilih 1-7: ");
                    int pilRK = myObj.nextInt();
                    switch (pilRK){
                        case 1:
                            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.err.println("\nIsi File Keliling Persegi\n");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                            ReadFile.read("FileKelilingPersegi.txt");
                            System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                            break;
                        case 2:
                            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.err.println("\nIsi File Keliling Persegi Panjang\n");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                            ReadFile.read("FileKelilingPersegiPanjang.txt");
                            System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                            break;
                        case 3:
                            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.err.println("\nIsi File Keliling Lingkaran\n");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                            ReadFile.read("FileKelilingLingkaran.txt");
                            System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                            break;
                        case 4:
                        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.err.println("\nIsi File Keliling Segitiga Sama Sisi\n");
                        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                            ReadFile.read("FileKelilingSegitigaSamaSisi.txt");
                            System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                            break;
                        case 5:
                            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.err.println("\nIsi File Keliling Segitiga Sama Kaki\n");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                            ReadFile.read("FileKelilingSegitigaSikuSiku.txt");
                            System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                            break;
                        case 6:
                            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.err.println("\nIsi File Keliling Segitiga Sembarang\n");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                            ReadFile.read("FileKelilingSegitigaSembarang.txt");
                            System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                            break;
                        case 7:
                            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                            System.err.println("\nIsi File Keliling Jajar Genjang\n");
                            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                            ReadFile.read("FileKelilingJajarGenjang.txt");
                            System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.err.println("\nKuadrat bilangan\n");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++\n");
                    LambdaTesting.Lamda();
                    System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                    continue;
                case 6:
                    break main1;
                case 7:
                    System.out.println("\n:):):):):):):):):):):):):):):):):):):):):):):):):):):):):):):):):):)\n");
                    System.out.println("Terima kasih telah menjelajahi project final yang sederhana ini :)");
                    System.out.println("Sampai jumpa! :(");
                    System.out.println("\n:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(");
                    System.exit(0);
            
                default:
                    System.out.println("pilih 1-6!!!");
                    System.out.println("\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\///\n");
                    break;
            }
            
        }

        
    }
    
}



// // welkam welkaman
        // System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        // System.out.println("\nSelamat datang di <WELCOME> Final Project Ahmad Shafwan Dzaky\n");
        // System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        // System.out.println("\nSebelum mengakses Final Project ini kami perlu mengetahui Identitas anda");
        // masukkan identitas
        // Login.login();
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



        // // class luas Persegi
        // Persegi persegi = new Persegi();
        // System.out.print("Masukkan sisi persegi : ");
        // persegi.sisi = myObj.nextInt();
        // Integer sisiP = persegi.sisi;
        // persegi.Luas(sisiP);

        // // class luas PersegiPanjang
        // var luasPP = new PersegiPanjang();
        // System.out.print("Masukkan sisi 1 persegi panjang : ");
        // luasPP.sisi = myObj.nextInt();
        // System.out.print("Masukkan sisi 2 persegi panjang : ");
        // Integer sisiPP = myObj.nextInt();
        // luasPP.Luas(sisiPP);

        // System.out.println("");

        // // class keliling Persegi <polymorphism>
        // persegi = new KelilingPersegi();
        // System.out.print("Masukkan sisi persegi : ");
        // Integer sisi1 = myObj.nextInt();
        // persegi.Luas(sisi1);

        // // class keliling PersegiPanjang <polymorphism>
        // persegi = new KelilingPersegiP();
        // System.out.print("Masukkan sisi 1 persegi panjang : ");
        // persegi.sisi = myObj.nextInt();
        // System.out.print("Masukkan sisi 2 persegi panjang : ");
        // Integer sisi2 = myObj.nextInt();
        // persegi.Luas(sisi2);

        // System.out.println("");

        // // inner class luas JajarGenjang
        // System.out.print("Masukkan sisi 1 jajar genjang : ");
        // JajarGenjang outer = new JajarGenjang();
        // System.out.print("Masukkan sisi 2 jajar genjang : ");
        // JajarGenjang.JajarGenjang2 inner = outer.new JajarGenjang2();
        // int ljg = 2 * (inner.y + outer.x);
        // System.out.println(ljg);
        // WriteFile.readInt(luasBangun, "FileLuasJajarGenjang.txt");

        // // class luas lingkaran encapsulation
        // LingkaranLuas lingkaran = new LingkaranLuas();
        // lingkaran.luasLingkaran();

        // // interface keliling Lingkaran
        // LingkaranInterface kelilingD = new LingkaranKelilingDia();
        // kelilingD.keliling();
        // LingkaranInterface kelilingJ = new LingkaranKelilingJari();
        // kelilingJ.keliling();

        // keliling lingkaran interface inheritance
