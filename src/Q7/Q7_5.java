package Q7;

import java.util.*;

public class Q7_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int odd = 0;
        int mid=-1;
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();

            if (a[i] % 2 == 1) {
                odd++;
                mid = i;
            }
        }
        if (odd > 1) {
            System.out.println(-1);
            return;
        }
        String left = "";
        String right = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < a[i] / 2; j++) {
                left += i;
            }
        }
        if (left.length() > 0 && left.charAt(0) == '0') {
            int pos = -1;

            for (int i = 0; i < left.length(); i++) {
                if (left.charAt(i) != '0') {
                    pos = i;
                    break;
                }
            }
            if (pos == -1) {
                System.out.println(-1);
                return;
            }
            char c = left.charAt(pos);
            left = c + left.substring(0, pos) + left.substring(pos + 1);
        }
        for (int i = left.length() - 1; i >= 0; i--) {
            right += left.charAt(i);
        }
        if (mid != -1) {
            if (left.length() == 0 && mid == 0) {
                System.out.println(0);
                return;
            }
            System.out.println(left + mid + right);
        } else {
            if (left.length() == 0) {
                System.out.println(-1);
            } else {
                System.out.println(left + right);
            }
        }
    }
}