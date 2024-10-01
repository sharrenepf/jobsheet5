import java.util.Scanner;

public class TernaryOperator24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        // ternary operator
        String hasil = (bilangan % 2 == 0) ? bilangan + " adalah bilangan genap." : bilangan + " adalah bilangan ganjil.";
        System.out.println(hasil);
    }
}
