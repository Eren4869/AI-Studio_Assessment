package Q7;

import java.util.*;

public class Q7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[9];
        int[] b = {1, 2, 1, 3, 0, 3, 1, 2, 1};
        while (sc.hasNext()) {
            String c = sc.next();
            int pt = 1;
            Arrays.fill(a, 0);
            for (int i = 0; i < c.length() - 1; i++) {
                int a1 = c.charAt(i) - '0';
                int a2 = c.charAt(i + 1) - '0';
                if (a1 == a2) {
                    pt = 0;
                    break;
                }
                if (a[a1 - 1] == 1 || a[a2 - 1] == 1) {
                    pt = 0;
                    break;
                }
                a[a1 - 1] = 1;
                if (b[a1 - 1] == b[a2 - 1]
                        && a[(a1 + a2) / 2 - 1] == 0) {
                    pt = 0;
                    break;
                }
            }
            if (pt == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}