package hp;

public class Main {
    public static void main(String[] args) {
        try {
            Handphone android = new Android("Samsung Galaxy", 7000000);
            Handphone iphone = new iPhone("iPhone 41", 15000000);
            Handphone featurePhone = new FeaturePhone("Nokia 3320", 500000);

            System.out.println("\n===== Daftar HP =====");
            android.tampilkanInfo();
            android.hitungDiskon();
            android.kategoriHP();
            ((Android) android).gunakanFaceUnlock();
            ((Android) android).gunakanWirelessCharging();

            System.out.println();
            iphone.tampilkanInfo();
            iphone.hitungDiskon();
            iphone.kategoriHP();
            ((iPhone) iphone).gunakanFaceUnlock();
            ((iPhone) iphone).gunakanWirelessCharging();

            System.out.println();
            featurePhone.tampilkanInfo();
            featurePhone.hitungDiskon();
            featurePhone.kategoriHP();

            System.out.println();
            beliHandphone(featurePhone);
        } catch (TransaksiException e) {
            System.out.println("Terjadi Kesalahan: " + e.getMessage());
        }
    }

    public static void beliHandphone(Handphone hp) throws TransaksiException {
        if (hp instanceof FeaturePhone) {
            throw new TransaksiException("Feature Phone tidak tersedia untuk pembelian online!");
        } else {
            System.out.println("Pembelian " + hp.merk + " berhasil!");
        }
    }
}