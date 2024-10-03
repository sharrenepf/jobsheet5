import java.util.Scanner;

public class Siakad24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         // Input data mahasiswa
         System.out.println("=============Aplikasi SiAkad=============");
         System.out.print("Masukkan nama mahasiswa   : ");
         String nama = input.nextLine();
         
         System.out.print("Masukkan NIM              : ");
         String nim = input.nextLine();
         
         System.out.print("Masukkan kelas            : ");
         String kelas = input.nextLine();
         
         System.out.print("Masukkan no. absen        : ");
         int absen = input.nextInt();
         
         System.out.println("\n------------------------------------------");
         
         // Input nilai
         System.out.print("Masukkan nilai kuis       : ");
         double nilaiKuis = input.nextDouble();
         
         System.out.print("Masukkan nilai tugas      : ");
         double nilaiTugas = input.nextDouble();
         
         System.out.print("Masukkan nilai UTS        : ");
         double nilaiUTS = input.nextDouble();
         
         System.out.print("Masukkan nilai UAS        : ");
         double nilaiUAS = input.nextDouble();
         
         // Menghitung nilai akhir
         double nilaiAkhir = (nilaiKuis * 0.2) + (nilaiTugas * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3);
         
         // Inisialisasi variabel untuk nilai huruf dan kualifikasi
         String nilaiHuruf = "";
         double nilaiMutu = 0;
         String kualifikasi = "";
         
         // Menentukan nilai huruf, mutu, dan kualifikasi berdasarkan nilai akhir
         if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
             nilaiHuruf = "A";
             nilaiMutu = 4.0;
             kualifikasi = "Sangat Baik";
         } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
             nilaiHuruf = "B+";
             nilaiMutu = 3.5;
             kualifikasi = "Lebih dari Baik";
         } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
             nilaiHuruf = "B";
             nilaiMutu = 3.0;
             kualifikasi = "Baik";
         } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
             nilaiHuruf = "C+";
             nilaiMutu = 2.5;
             kualifikasi = "Lebih dari Cukup";
         } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
             nilaiHuruf = "C";
             nilaiMutu = 2.0;
             kualifikasi = "Cukup";
         } else if (nilaiAkhir >= 40 && nilaiAkhir < 50) {
             nilaiHuruf = "D";
             nilaiMutu = 1.0;
             kualifikasi = "Kurang";
         } else {
             nilaiHuruf = "E";
             nilaiMutu = 0.0;
             kualifikasi = "Gagal";
         }
         
         // Output hasil
         System.out.println("\n=============Hasil=============");
         System.out.println("Nama        : " + nama);
         System.out.println("NIM         : " + nim);
         System.out.println("Kelas       : " + kelas + "    Absen  : " + absen);
         System.out.println("------------------------------------------");
         System.out.println("Nilai Akhir : " + nilaiAkhir);
         System.out.println("Nilai Huruf : " + nilaiHuruf);
         System.out.println("Nilai Setara: " + nilaiMutu);
         System.out.println("Kualifikasi : " + kualifikasi);
    }
}
