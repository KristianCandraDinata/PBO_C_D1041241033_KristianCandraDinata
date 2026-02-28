public class LatihanBilangan {
    public static void main(String[] args) {

        int number = -7;
        String jenisBilangan;
        if(number > 0){
           jenisBilangan = "Bilangan positif";
        } else if(number < 0){
            jenisBilangan = "Bilangan negatif";
        } else {
            jenisBilangan = "Bilangan Nol";
        }

        String tipeBilangan;
        if(number != 0){
            tipeBilangan = (number % 2 == 0) ? "Genap" : "Ganjil";
        } else {
            tipeBilangan = "-";
        }

        System.out.println("=== PEMERIKSAAN BILANGAN ===");
        System.out.println("Bilangan: " + number);
        System.out.println("Jenis: " + jenisBilangan);
        System.out.println("Tipe: " + tipeBilangan);
        
    }
}
