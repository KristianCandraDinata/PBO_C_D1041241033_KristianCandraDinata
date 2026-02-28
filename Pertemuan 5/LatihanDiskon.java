public class LatihanDiskon {
    public static void main(String[] args) {
        
        double totalBelanja = 750000;
        double hargaDiskon;
        String diskon;
        if(totalBelanja < 100000){
            diskon = "0%";
            hargaDiskon = totalBelanja;
        } else if(totalBelanja >= 100000 && totalBelanja <= 499999){
            diskon = "5%";
            hargaDiskon = totalBelanja * 0.05;
        } else if(totalBelanja >= 500000 && totalBelanja <= 999999){
            diskon = "10%";
            hargaDiskon = totalBelanja * 0.1;
        } else {
            diskon = "15%";
            hargaDiskon = totalBelanja * 0.15;
        }

        System.out.println("=== KALKULATOR DISKON ===");
        System.out.println("Total Belanja: Rp " + totalBelanja);
        System.out.println("Diskon (" + diskon + "): Rp " + hargaDiskon);
        System.out.println("Harga Akhir: Rp " + (totalBelanja - hargaDiskon));
        System.out.println("Anda hemat: Rp " + hargaDiskon);

    }
}
