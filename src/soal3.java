import java.util.Scanner;

public class soal3 {

    static boolean cekPrimaRekursif(int n, int i) {
        if (i <= 1) {
            return true;
        } else {
            if (n % i == 0) {
                return false;
            } else {
                return cekPrimaRekursif(n, i - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan suatu bilangan: ");
        int bilangan = sc.nextInt();

        if (cekPrimaRekursif(bilangan, bilangan / 2)) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }
    }
}
