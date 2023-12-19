import java.util.Scanner;

public class soal2 {

    static int penjumlahanRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        int hasilPenjumlahan = penjumlahanRekursif(n);

        System.out.println("Penjumlahan bilangan dari 1 hingga " + n + " adalah: " + hasilPenjumlahan);
    }
}
