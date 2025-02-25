package hp;

public class Android extends Handphone implements Tambahan {
    public Android(String merk, int harga) {
        super(merk, harga);
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Android: " + merk + ", Harga: " + harga);
    }
    
    @Override
    public void hitungDiskon() {
        System.out.println("Diskon 10% untuk Android: " + (harga * 0.9));
    }
    
    @Override
    public void kategoriHP() {
        System.out.println("Kategori: Smartphone Android");
    }
    
    @Override
    public void gunakanFaceUnlock() {
        System.out.println("Face Unlock diaktifkan di Android");
    }
    
    @Override
    public void gunakanWirelessCharging() {
        System.out.println("Wireless Charging tersedia di Android");
    }
}
