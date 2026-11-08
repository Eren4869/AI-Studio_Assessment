package Q7;

import java.util.*;

public class Q7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (sc.hasNextLine()) {
            str += sc.nextLine();
            if (sc.hasNextLine()) {
                str += "\n";
            }
        }
        String ans = "";
        boolean inString = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '"' && (i == 0 || str.charAt(i - 1) != '\\')) {
                inString = !inString;
                ans += c;
                continue;
            }
            if (inString) {
                ans += c;
                continue;
            }
            if (c == '/' && i + 1 < str.length() && str.charAt(i + 1) == '*') {
                int j = str.indexOf("*/", i + 2);
                if (j != -1) {
                    i = j + 1;
                } else {
                    ans += c;
                }
            } else {
                ans += c;
            }
        }
        System.out.print(ans);
    }
}