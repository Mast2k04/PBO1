package hp;

public class iPhone extends Handphone implements Tambahan {
    public iPhone(String merk, int harga) {
        super(merk, harga);
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("iPhone: " + merk + ", Harga: " + harga);
    }
    
    @Override
    public void hitungDiskon() {
        System.out.println("Diskon 5% untuk iPhone: " + (harga * 0.95));
    }
    
    @Override
    public void kategoriHP() {
        System.out.println("Kategori: Smartphone iOS");
    }
    
    @Override
    public void gunakanFaceUnlock() {
        System.out.println("Face ID digunakan di iPhone");
    }
    
    @Override
    public void gunakanWirelessCharging() {
        System.out.println("Wireless Charging tersedia di iPhone");
    }
}
