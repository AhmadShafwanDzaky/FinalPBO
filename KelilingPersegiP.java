import FileHandling.WriteFile;

public class KelilingPersegiP extends KelilingPersegi {
    
    public void Luas(Integer sisi){
        Integer kelilingPP;
        kelilingPP = (sisi * 2) + (this.sisi * 2);
        System.out.println("Keliling persegi panjang = " + kelilingPP);
        WriteFile.writeIntK(kelilingPP, "FileKelilingPersegiPanjang.txt");
    }
}
