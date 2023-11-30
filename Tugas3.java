import java.util.Scanner;

public class Tugas3 {
    static void prime(int f, int i) {
        if (f == 1) {
            System.out.print("bukan bilangan prima");
        } else if (i == f) {
            System.out.print("bilangan prima");
        } else {
            if (f % i != 0) {
                prime(f, i + 1);
            } else {
                System.out.print("bukan bilangan prima");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 2;
        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();
        System.out.print(n + " itu ");
        prime(n, i);
    }
}
