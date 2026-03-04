public class LatihanKombinasiLoop {
    public static void main(String[] args) {

        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");
        boolean isFound = false;
        for(int baris = 1; baris <= 3; baris++){
            for(int kolom = 1; kolom <= 5; kolom++){
                System.out.println("Cek: [" + baris + "," + kolom + "]");
                if(baris == 2 && kolom == 3){
                    isFound = true;
                    System.out.println("✓ Koordinat ditemukan!");
                    break;
                }
            }
            if(isFound){
                break;
            }
        }

        
        System.out.println("Pencarian selesai.");
    }
}
