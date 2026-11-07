package Q4;

import java.util.Scanner;

public class Q4_4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int L= sc.nextInt();
        int M= sc.nextInt();
        int count=0;
        boolean[] alive=new boolean[L+1];
        for (int i = 0; i <=L; i++) {
            alive[i]=true;
        }
        for (int i = 0; i < M; i++) {
            int left=sc.nextInt();
            int right=sc.nextInt();
            for(int j=left;j<=right;j++){
                if(alive[j]){
                    count++;
                    alive[j]=false;
                }
            }
        }
        System.out.println(L+1-count);
    }
}
