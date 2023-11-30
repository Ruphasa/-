import java.util.Scanner;

public class Percobaan3 {
    static double hitungLaba(int saldo, int tahun){
        if (tahun==0) {
            return saldo;
        } else {
            return(1.11 * hitungLaba(saldo, tahun - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah saldo awal : ");
        int saldo = sc.nextInt();
        System.out.print("Lamanya investasi berapa tahun : ");
        int tahun = sc.nextInt();
        System.out.print("Jumlah saldo setelah "+tahun+" tahun :");
        System.out.print(hitungLaba(saldo, tahun));
    }
}
