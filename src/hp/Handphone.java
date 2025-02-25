package hp;

public abstract class Handphone {
    protected String merk;
    protected int harga;
    
    public Handphone(String merk, int harga) {
        this.merk = merk;
        this.harga = harga;
    }
    
    public abstract void tampilkanInfo();
    public abstract void hitungDiskon();
    public abstract void kategoriHP();
}
