import FileHandling.WriteFile;
public class Persegi extends PersegiAbs{
    public Integer sisi;

    public void Luas(Integer sisi){
        Integer luasBangun;
        luasBangun = sisi * this.sisi;
        System.out.println("Luas persegi = " + luasBangun);
        WriteFile.writeInt(luasBangun, "FileLuasPersegi.txt");
    }
}
