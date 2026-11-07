package Q2;

import java.util.Scanner;

public class Q2_4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long m=sc.nextLong();
        long n=sc.nextLong();
        if(m%n==0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
