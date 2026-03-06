class Konstruk { 
    // Atribut  
    int i; 
    float f;

    // Constructor 1: Tanpa parameter 
    public Konstruk() { 
        i = 5; 
        f = 5.5f; 
        System.out.println("Hi");
    } 
     
    // Constructor 2: 1 parameter int 
    public Konstruk(int k) { 
        i = k; 
        System.out.println("Hello"); 
    }

    // Constructor 3: 2 parameter (SOLUSI TUGAS) 
    public Konstruk(int k, float fl) { 
        i = k; 
        f = fl; 
        System.out.println("Constructor dengan 2 parameter"); 
    } 
} 
 
public class p02Konstruktor { 
    public static void main(String args[]) { 
         
        // Object memanggil constructor pertama (tanpa parameter) 
        Konstruk k1 = new Konstruk(); 
         
        // Object memanggil constructor kedua (1 parameter) 
        Konstruk k2 = new Konstruk(5); 
         
        // Tugas: Membuat constructor dengan 2 parameter 
        Konstruk k3 = new Konstruk(10, 7.5f);
    } 
} 