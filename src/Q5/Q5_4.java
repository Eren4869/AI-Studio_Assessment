package Q5;

import java.util.Scanner;

public class Q5_4 {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n%10+ sum(n /10);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        int count=0;
        for (int i = x; i <=y; i++) {
            if( sum(i)%5==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
