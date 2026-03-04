public class LatihanRefleksi {
    public static void main(String[] args) {
        
        System.out.println("=== MENGGUNAKAN WHILE === ");
        int counterWhile = 1;
        while(counterWhile <= 5){
            System.out.print(counterWhile + " ");
            counterWhile++;
        }
        System.out.println();

        System.out.println("=== MENGGUNAKAN DO-WHILE ===");
        int counterDoWhile = 1;
        do{
            System.out.print(counterDoWhile + " ");
            counterDoWhile++;
        } while (counterDoWhile <= 5);
        System.out.println();

        System.out.println("=== MENGGUNAKAN FOR ===");
        for(int counterFor = 1; counterFor <= 5; counterFor++){
            System.out.print(counterFor + " ");
        }

    }
}
/* Refleksi: Jenis loop yang mudah untuk dipahami untuk kasus ini adalah for loop.
Alasanya, karena for loop  menggabungkan inisialisasi, kondisi, dan update dalam satu baris
sehingga terlihat lebih ringkas, terstruktur, dan mudah dibaca  */