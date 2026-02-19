public class LatihanKalkulator {
    public static void main(String[] args) {
        int angka1 = 25;
        int angka2 = 4;

        int hasilPenjumlahan = angka1 + angka2;
        int hasilPengurangan = angka1 - angka2;
        int hasilPerkalian = angka1 * angka2;
        int hasilPembagian = angka1 / angka2;
        int sisaBagi = angka1 % angka2;
        double pembagianDesimal = (double) angka1 / angka2;

        System.out.println("=== KALKULATOR ===");
        System.out.println("Angka 1: " + angka1);
        System.out.println("Angka 2: " + angka2);
        System.out.println("---");
        System.out.println("Penjumlahan: " + hasilPenjumlahan);
        System.out.println("Pengurangan: " + hasilPengurangan);
        System.out.println("Perkalian: " + hasilPerkalian);
        System.out.println("Pembagian: " + hasilPembagian);
        System.out.println("Sisa Bagi: " + sisaBagi);
        System.out.println("Pembagian Desimal: " + pembagianDesimal);

    }
}
