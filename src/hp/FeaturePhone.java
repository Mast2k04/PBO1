package hp;

public class FeaturePhone extends Handphone {
    public FeaturePhone(String merk, int harga) {
        super(merk, harga);
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Feature Phone: " + merk + ", Harga: " + harga);
    }
    
    @Override
    public void hitungDiskon() {
        System.out.println("Diskon 20% untuk Feature Phone: " + (harga * 0.8));
    }
    
    @Override
    public void kategoriHP() {
        System.out.println("Kategori: HP Fitur");
    }
}
