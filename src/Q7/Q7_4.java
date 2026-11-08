package Q7;

import java.util.*;

public class Q7_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] words = {"zero", "two", "four", "six", "nine"};
        char[] nums = {'0', '2', '4', '6', '9'};
        while (T>0) {
            String s = sc.next();
            String ans = "";
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '0' || c == '2' || c == '4'
                        || c == '6' || c == '9') {
                    ans += c;
                    continue;
                }
                for (int j = 0; j < 5; j++) {
                    if (s.startsWith(words[j], i)) {
                        ans += nums[j];
                        i += words[j].length() - 1;
                        break;
                    }
                }
            }
            System.out.println(ans);
            T--;
        }
    }
}