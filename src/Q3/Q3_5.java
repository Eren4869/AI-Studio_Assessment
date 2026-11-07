package Q3;

import java.util.Scanner;

public class Q3_5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 2 * (n-i); j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = i; j >= 0; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 0; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
            for (int i = n; i > 0; i--) {
                for (int j = 2 * (n-i+1); j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = i; j > 0; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
