package Q4;

import java.util.Scanner;

public class Q4_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int x= sc.nextInt();
        int rel=0;
        for (int i = 1; i <= n; i++) {
            int num=i;
            while (num>0){
                int ans=num%10;
                if(ans==x){
                    rel++;
                }
                num/=10;
            }
        }
        System.out.println(rel);
    }
}
