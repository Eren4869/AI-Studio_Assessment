package Q5;

import java.util.Scanner;

public class Q5_1 {
    public static int check(int x){
        int count=0;
        while (x>0){
            int num=x%10;
            if(num==2){
                count++;
            }
            x/=10;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int left= sc.nextInt();
        int right= sc.nextInt();
        int ans=0;
        for (int i = left; i <=right; i++) {
            ans+=check(i);
        }
        System.out.println(ans);
    }
}
