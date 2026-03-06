class Mobil{

    String merk;
    String warna;
    int tahun;
    int kecepatan;

    public void tampilkanSpesifikasi(){

        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println();
        System.out.println("Merk: " + merk);
        System.out.println();
        System.out.println("Warna: " + warna);
        System.out.println();
        System.out.println("Tahun: " + tahun);
        System.out.println();
        System.out.println();

    }
    
    public void percepat(){

        System.out.println("Mobil dipercepat...");
        System.out.println();
        kecepatan += 20;

    }

    public void tampilkanKecepatan(){
        System.out.println("Kecepatan saat ini: " + kecepatan + " km/jam");
        System.out.println();
    }
}

public class LatihanClassMobil {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota Avanza";
        mobil1.warna = "Silver";
        mobil1.tahun = 2020;
        mobil1.kecepatan = 0;

        mobil1.tampilkanSpesifikasi();
        System.out.println();
        mobil1.percepat();
        mobil1.percepat();
        mobil1.tampilkanKecepatan();
    }
}
