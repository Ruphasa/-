import java.util.Scanner;

public class Tugas4 {
    static int fib(int n){
        if (n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bulan bepara ? ");
        int bulan = sc.nextInt();
        System.out.printf("pada bulan %d ada %d pasang",bulan,fib(bulan));
    }
}
