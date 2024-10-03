import java.util.Scanner;

public class PemesananMinuman24 {
    public static void main(String[] args) {
        // Scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Input jumlah item yang dibeli
        System.out.print("Masukkan jumlah item: ");
        int jumlah = input.nextInt();
        
        // Input nama menu
        System.out.print("Masukkan nama menu: ");
        String menu = input.next();
        
        // Input ukuran cup
        System.out.print("Masukkan ukuran cup (S/M/L): ");
        char ukuranCup = input.next().charAt(0);
        
        // Input status keanggotaan
        System.out.print("Apakah pelanggan anggota (true/false): ");
        boolean keanggotaan = input.nextBoolean();
        
        // Harga dasar (misal)
        double totalHarga = 20000 * jumlah;
        
        // Mengupdate total harga berdasarkan ukuran cup
        switch (ukuranCup) {
            case 'S':
                break;  // Tidak ada tambahan untuk ukuran S
            case 'M':
                totalHarga += 0.25 * totalHarga;  // Tambah 25% untuk ukuran M
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;  // Tambah 40% untuk ukuran L
                break;
            default:
                System.out.println("Ukuran tidak valid");
                return;  // Keluar dari program jika ukuran tidak valid
        }
        
        // Menentukan diskon berdasarkan status keanggotaan
        double diskon = keanggotaan ? 0.1 : 0;  // Diskon 10% untuk anggota
        double nominalBayar = totalHarga - (diskon * totalHarga);
        
        // Menampilkan ringkasan item dan nominal bayar
        System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal bayar: Rp " + nominalBayar);
        
        // Menutup scanner
        input.close();
    }
}
