package Q6;

import java.util.Scanner;
import java.util.Arrays;

public class Q6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        Arrays.sort(s, (A, B) -> {
            return (B + A).compareTo(A + B);
        });
        for (int i = 0; i < n; i++) {
            System.out.print(s[i]);
        }
    }
}