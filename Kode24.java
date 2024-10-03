import java.util.Scanner;

public class KategoriUsia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variable
        String kategori = "";
        System.out.print("Masukkan usia: ");
        int usia = input.nextInt();

        // Logika kategori usia
        if (usia >= 0 && usia <= 12) {
            kategori = "Anak";
            System.out.println("Kategori usia: " + kategori);
        } else if (usia >= 13 && usia <= 19) {
            kategori = "Remaja";
            System.out.println("Kategori usia: " + kategori);
        } else if (usia >= 20 && usia <= 64) {
            kategori = "Dewasa";
            System.out.println("Kategori usia: " + kategori);
        } else if (usia >= 65) {
            kategori = "Lansia";
            System.out.println("Kategori usia: " + kategori);
        } else {
            System.out.println("Input tidak valid");
        }
    }
}
