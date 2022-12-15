import FileHandling.WriteFile;

public class KelilingPersegi extends Persegi {
    
    public void Luas(Integer sisi){
        Integer kelilingP;
        kelilingP = sisi * 4;
        System.out.println("Keliling persegi = " + kelilingP);
        WriteFile.writeIntK(kelilingP, "FileKelilingPersegi.txt");
    }
}
