import java.util.Scanner;

public class PemilihanHariDenganIf24 {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan angka (1-7)
        System.out.print("Masukkan angka (1-7) untuk hari: ");
        int dayNumber = input.nextInt();

        // Menentukan tipe hari dengan if-else
        if (dayNumber >= 1 && dayNumber <= 5) {
            System.out.println("Weekday");
        } else if (dayNumber == 6 || dayNumber == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }

        // Menutup scanner
        input.close();
    }
}
