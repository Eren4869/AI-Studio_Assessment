package Q6;

import java.util.Arrays;
import java.util.Scanner;

public class Q6_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long sum=0;
        int n= sc.nextInt();
        int k= sc.nextInt();
        int[] diff=new int[n];
        int[] a=new int[n];
        int[] b=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        for (int i = 0; i <n; i++) {
            b[i]= sc.nextInt();
            sum+=a[i];
            diff[i]=b[i]-a[i];
        }
        Arrays.sort(diff);
        for (int i = k; i <n; i++) {
            sum+=diff[i];
        }
        System.out.println(sum);
    }
}
