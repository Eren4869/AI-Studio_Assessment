package Q4;
import java.util.Scanner;

public class Q4_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if (a[n - 1] == 15) {
            System.out.println("DOWN");
        } else if (a[n - 1] == 0) {
            System.out.println("UP");
        } else if (n == 1) {
            System.out.println("-1");
        } else if (a[n - 1] > a[n - 2]) {
            System.out.println("UP");
        } else {
            System.out.println("DOWN");
        }
    }
}