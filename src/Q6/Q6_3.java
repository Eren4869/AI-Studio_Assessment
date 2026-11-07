package Q6;
import java.util.Arrays;
import java.util.Scanner;

public class Q6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums= new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLong();
        }
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] + nums[i + 1] > nums[i + 2]) {
                System.out.println(nums[i] + " " + nums[i + 1] + " " + nums[i + 2]);
                return;
            }
        }
        System.out.println("No solution");
    }
}