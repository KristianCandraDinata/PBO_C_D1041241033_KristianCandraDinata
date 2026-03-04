public class LatihanValidasi {
    public static void main(String[] args) {
        
        int nilai;
        int iterasi = 1;
        System.out.println("=== VALIDASI NILAI UJIAN ===");
        do{

            
            if(iterasi == 1){
                nilai = -10;
            }else if( iterasi == 2){
                nilai = 150;
            }else {
                nilai = 85;
            }

            System.out.println("Percobaan input: " + nilai);
            if(nilai >= 0 && nilai <= 100){
                System.out.println("✓ Nilai valid: " + nilai);
            }else{
                System.out.println("Error: Nilai harus antara 0-100!");
                System.out.println();
            }

            iterasi++;

        } while (iterasi <=3 );
    }
}
