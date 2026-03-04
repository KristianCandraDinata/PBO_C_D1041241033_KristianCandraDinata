public class LatihanRestoran {
    public static void main(String[] args) {
        
        int menuCode = 1;
        int quantity = 2;
        String namaMenu;
        int hargaSatuan;
        int totalBayar;

        System.out.println("=== MENU RESTORAN ===");
        System.out.println("Kode Menu: " + menuCode);
        System.out.println("Jumlah: " + quantity);
        System.out.println();
        System.out.println("Pesanan Anda:");

        switch (menuCode) {
            case 1:
                namaMenu = "Nasi Goreng";
                hargaSatuan = 15000;
                totalBayar = hargaSatuan * quantity;
                System.out.println("Nama Menu: " + namaMenu);
                System.out.println("Harga Satuan: Rp " + hargaSatuan);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + totalBayar);
                break;
            case 2:
                namaMenu = "Mie Ayam";
                hargaSatuan = 12000;
                totalBayar = hargaSatuan * quantity;
                System.out.println("Nama Menu: " + namaMenu);
                System.out.println("Harga Satuan: Rp " + hargaSatuan);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + totalBayar);
                break;
            case 3:
                namaMenu = "Bakso";
                hargaSatuan = 10000;
                totalBayar = hargaSatuan * quantity;
                System.out.println("Nama Menu: " + namaMenu);
                System.out.println("Harga Satuan: Rp " + hargaSatuan);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + totalBayar);
                break;
            case 4:
                namaMenu = "Soto Ayam";
                hargaSatuan = 13000;
                totalBayar = hargaSatuan * quantity;
                System.out.println("Nama Menu: " + namaMenu);
                System.out.println("Harga Satuan: Rp " + hargaSatuan);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + totalBayar);
                break;
            case 5:
                namaMenu = "Es Teh";
                hargaSatuan = 3000;
                totalBayar = hargaSatuan * quantity;
                System.out.println("Nama Menu: " + namaMenu);
                System.out.println("Harga Satuan: Rp " + hargaSatuan);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp " + totalBayar);
                break;
            default:
                System.out.println("Kode Menu yang Anda Pilih Tidak Tersedia!!! (1-5)");
                break;
        }
    }
}
