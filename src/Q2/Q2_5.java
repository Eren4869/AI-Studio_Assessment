package Q2;

import java.util.Scanner;

public class Q2_5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long x= sc.nextLong();
        long y= sc.nextLong();
        if(y%x==0){
            System.out.println(x+y);
        }else {
            System.out.println(y-x);
        }
    }
}
