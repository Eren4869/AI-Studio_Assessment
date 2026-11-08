package Q7;

import java.util.*;

public class Q7_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();
        char[] a = s.toCharArray();
        int pos = s.indexOf('.');
        if (pos == -1) {
            System.out.println(s);
            return;
        }
        int len = n;
        for (int i = pos + 1; i < n; i++) {
            if (a[i] >= '5') {
                len = i;
                t--;
                i--;
                while (a[i] == '4' && t != 0) {
                    len = i;
                    t--;
                    i--;
                }
                if (a[i] == '.') {
                    len = i;
                    i--;
                    while (i >= 0 && a[i] == '9') {
                        a[i] = '0';
                        i--;
                    }
                    if (i == -1) {
                        System.out.print("1");
                    } else {
                        a[i] += 1;
                    }
                } else {
                    a[i] += 1;
                }
                break;
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print(a[i]);
        }
    }
}
