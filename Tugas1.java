import java.util.Scanner;

public class Tugas1 {
    static void iteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void rekursif(int n){
        if (n==0) {
            System.out.print(0);
        } else {
            System.out.print(n+" ");
            n-=1;
            rekursif(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan niali n :");
        int n = sc.nextInt();
        iteratif(n);
        rekursif(n);
    }
}
