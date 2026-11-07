package Q3;
import java.util.Scanner;
public class Q3_4 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    while (m>0){
        m--;
        int n= sc.nextInt();
        int mid=(n+1)/2;
        for (int i = 1; i <= mid; i++) {
            for(int j=0;j<mid-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n-mid;i>0;i--){
            for (int j=mid-1;j>=i;j--){
                System.out.print(" ");
            }
            for (int j=2*i-1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
            }
        }
    }
}
