import java.util.Scanner;

public class PemilihanHari24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama hari dalam bahasa Inggris: ");
        String dayName = input.next().toLowerCase(); // Membaca input dan mengubah ke huruf kecil

        String dayType;

        // Struktur switch-case untuk menentukan tipe hari
        switch (dayName) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "Weekday"; // Jika hari adalah salah satu dari weekday
                break;
            case "saturday":
            case "sunday":
                dayType = "Weekend"; // Jika hari adalah sabtu atau minggu
                break;
            default:
                dayType = "Invalid day type"; // Jika bukan hari yang valid
                break;
        }

        System.out.println(dayName + " is a " + dayType + ".");
    }
}
