package Q5;

import java.util.Scanner;

public class Q5_2 {
    public static int check(int i,int x){
        int count=0;
        while (i>0){
            int num=i%10;
            if(num==x){
                count++;
            }
            i/=10;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int year = sc.nextInt();
            int month = sc.nextInt();
            int x = sc.nextInt();
            int cnt = 0;
            int ans = 0;
            int[] days = {0, 31, 28, 31, 30, 31, 30,
                    31, 31, 30, 31, 30, 31};
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                days[2] = 29;
            }
            int num = 1 + month * 100 + year * 10000;
            while (cnt < days[month]) {
                ans += check(num, x);
                num++;
                cnt++;
            }
            System.out.println(ans);
        }
    }
}
