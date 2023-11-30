import java.util.Scanner;

public class Tugas2 {
    static int jumlah(int i,int n){
        if (i==n) {
            System.out.print(i);
            return i;
        } else {
            System.out.print(i+"+");
            return i+jumlah(i+1,n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        System.out.print("Masukan nilai n : ");
        int n = sc.nextInt();
        System.out.println("="+jumlah(i,n));
    }
}
