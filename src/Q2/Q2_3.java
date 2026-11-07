package Q2;

import java.util.Scanner;

public class Q2_3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y= sc.nextInt();
        if(x==y){
            System.out.println("Tacit！");
        }else {
            System.out.println("No Tacit!");
        }
    }
}
