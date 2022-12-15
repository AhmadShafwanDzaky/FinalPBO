import FileHandling.WriteFile;
public class PersegiPanjang extends Persegi {
    // method overriding
    public void Luas(Integer sisi){
        Integer luasBangunPP;
        luasBangunPP = sisi * this.sisi;
        System.out.println("Luas persegi panjang = " + luasBangunPP);
        WriteFile.writeInt(luasBangunPP, "FileLuasPersegiPanjang.txt");
    }
}
