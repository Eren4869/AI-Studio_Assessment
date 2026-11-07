package Q3;
import java.util.Scanner;
public class Q3_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int n = c - 'A' + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }
    }
}
