import java.util.Scanner;

public class soal4 {

    static int jumlahPasanganMarmut(int bulan) {
        if (bulan <= 2) {
            return 1;
        } else {
            return jumlahPasanganMarmut(bulan - 1) + jumlahPasanganMarmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bulan ke-: ");
        int bulanKe = sc.nextInt();

        int totalPasangan = jumlahPasanganMarmut(bulanKe);

        System.out.println("Pada bulan ke-" + bulanKe + ", jumlah pasangan marmut adalah: " + totalPasangan);
    }
}
