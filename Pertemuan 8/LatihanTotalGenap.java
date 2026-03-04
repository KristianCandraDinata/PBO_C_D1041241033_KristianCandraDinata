public class LatihanTotalGenap {
    public static void main(String[] args) {
        
        int totalGenap = 0;
        System.out.println("=== TOTAL BILANGAN GENAP 1-20 ===");
        for(int bilangan = 1; bilangan <= 20; bilangan++){
            if(bilangan % 2 != 0){
                continue;
            }
            totalGenap+=bilangan;
            System.out.println("Tambah: " + bilangan + " → Total: " + totalGenap);
        }

        System.out.println("---");
        System.out.println("Total akhir: " + totalGenap);
    }
}