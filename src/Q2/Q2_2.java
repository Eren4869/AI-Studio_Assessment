package Q2;

import java.util.Scanner;

public class Q2_2 {
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       if(n%2==0){
           System.out.println(n/2);
       }else {
           System.out.println(3*n+1);
       }
   }
}
