package Q4;

import java.util.Scanner;

public class Q4_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            long sum=0;
            int n= sc.nextInt();
            long[] arr=new long[n];
            long minS=Long.MAX_VALUE;
            long maxS=0;
            for (int j=0;j<n;j++){
                arr[j]= sc.nextLong();
                sum+=arr[j];
                minS=Math.min(minS,arr[j]);
                maxS=Math.max(maxS,arr[j]);
            }
            double avg=(double) sum/n;
            double ans=0;
            for (int j=0;j<n;j++){
                ans+=(arr[j]-avg)*(arr[j]-avg);
            }
            ans/=n;
            System.out.printf("%d %.3f%n",maxS-minS,ans);
        }
    }
}
