package Q5;

import java.util.HashMap;
import java.util.Scanner;
import java.math.BigInteger;

public class Q5_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(a.multiply(b));
      }
    }
}
