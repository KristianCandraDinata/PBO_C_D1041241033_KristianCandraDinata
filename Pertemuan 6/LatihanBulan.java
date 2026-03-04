public class LatihanBulan {
    public static void main(String[] args) {

        int month = 13;
        String namaBulan;

        System.out.println("=== KONVERSI BULAN ===");
        System.out.println("Angka Bulan: " + month);
        switch (month) {
            case 1:
                namaBulan = "Januari";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 2:
                namaBulan = "Februari";
                System.out.println("Nama Bulan: " + namaBulan);
                break; 
            case 3: 
                namaBulan = "Maret"; 
                System.out.println("Nama Bulan: " + namaBulan);
                break; 
            case 4: 
                namaBulan = "April"; 
                System.out.println("Nama Bulan: " + namaBulan);
                break; 
            case 5: 
                namaBulan = "Mei"; 
                System.out.println("Nama Bulan: " + namaBulan);
                break; 
            case 6:
                namaBulan = "Juni";
                System.out.println("Nama Bulan: " + namaBulan);
                break; 
            case 7:
                namaBulan = "Juli";
                System.out.println("Nama Bulan: " + namaBulan);
                break; 
            case 8:
                namaBulan = "Agustus";
                System.out.println("Nama Bulan: " + namaBulan);
                break; 
            case 9:
                namaBulan = "September";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 10:
                namaBulan = "Oktober";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 11:
                namaBulan = "November";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            case 12:
                namaBulan = "Desember";
                System.out.println("Nama Bulan: " + namaBulan);
                break;
            default:
                namaBulan = "Angka bulan tidak valid (1-12)";
                System.out.println("Error: " + namaBulan);
                break;
        }

    }
}
