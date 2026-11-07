package Q5;

import java.util.Scanner;

public class Q5_3 {
    public static boolean isPrime(long result){
        for (long i = 2;  i *i <result; i++) {
            if(result%i==0){
                return false;
            }
        }
        return true;
    }
    public static long reserve(long t){
        long reserve=0;
        long temp=t/10;
        while (temp>0){
            reserve=reserve*10+temp%10;
            temp/=10;
        }
        long result=t;
        long x=reserve;
        while (x>0){
            result*=10;
            x/=10;
        }
        return reserve+result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long t= sc.nextLong();
        long result=reserve(t);
        if(isPrime(result)){
            System.out.println("prime");
        }else {
            System.out.println("noprime");
        }
    }
}
