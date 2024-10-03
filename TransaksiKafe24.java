import java.util.Scanner;

public class TransaksiKafe24 {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        boolean isMember;
        String menu;
        char ukuranCup;
        int jumlah;
        double hargaMenu = 0, totalHarga, diskon = 0, nominalBayar;

        // Input keanggotaan pelanggan
        System.out.print("Apakah pelanggan anggota kafe? (true/false): ");
        isMember = input.nextBoolean();
        input.nextLine(); // Membersihkan newline dari input sebelumnya

        // Input menu
        System.out.print("Pilih menu (kopi, teh, coklat): ");
        menu = input.nextLine().toLowerCase();

        // Input jumlah pembelian
        System.out.print("Masukkan jumlah pembelian: ");
        jumlah = input.nextInt();

        // Input ukuran cup
        System.out.print("Masukkan ukuran cup (S, M, L): ");
        ukuranCup = input.next().charAt(0);

        // Tentukan harga menu berdasarkan pilihan menu
        switch (menu) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
            default:
                System.out.println("Menu tidak valid.");
                return; // Menghentikan program jika menu tidak valid
        }

        // Hitung total harga tanpa tambahan ukuran
        totalHarga = hargaMenu * jumlah;

        // Tambahkan harga berdasarkan ukuran cup
        switch (ukuranCup) {
            case 'S':
            case 's':
                // Tidak ada tambahan untuk ukuran S
                break;
            case 'M':
            case 'm':
                totalHarga += totalHarga * 0.25; // Tambahan 25% untuk ukuran M
                break;
            case 'L':
            case 'l':
                totalHarga += totalHarga * 0.40; // Tambahan 40% untuk ukuran L
                break;
            default:
                System.out.println("Ukuran cup tidak valid.");
                return; // Menghentikan program jika ukuran cup tidak valid
        }

        // Tentukan diskon jika pelanggan anggota
        if (isMember) {
            diskon = 0.10 * totalHarga; // Diskon 10%
        }

        // Hitung nominal yang harus dibayar
        nominalBayar = totalHarga - diskon;

        // Tampilkan hasil transaksi
        System.out.println("===== Rincian Pembelian =====");
        System.out.println("Menu: " + menu);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Ukuran cup: " + ukuranCup);
        System.out.printf("Total harga sebelum diskon: Rp %.2f\n", totalHarga);
        System.out.printf("Diskon: Rp %.2f\n", diskon);
        System.out.printf("Nominal yang harus dibayar: Rp %.2f\n", nominalBayar);

        // Menutup scanner
        input.close();
    }
}

