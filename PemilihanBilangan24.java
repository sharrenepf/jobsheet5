import java.util.Scanner;

public class PemilihanBilangan24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat scanner untuk menerima input

        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt(); // Membaca input bilangan dari user

        // Struktur if-else untuk menentukan apakah bilangan genap atau ganjil
        if (bilangan % 2 == 0) { 
            System.out.println("Angka " + bilangan + " adalah bilangan genap");
        } else {
            System.out.println("Angka " + bilangan + " adalah bilangan ganjil");
        }
    }
}
