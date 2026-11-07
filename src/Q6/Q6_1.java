package Q6;

public class Q6_1 {
    static int[] arr = new int[8];
    static boolean[] used = new boolean[9];
    public static void dfs(int depth) {
        if (depth == 8) {
            for (int i = 0; i < 8; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(arr[i]);
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= 8; i++) {
            if (used[i]) {
                continue;
            }
            arr[depth] = i;
            used[i] = true;
            dfs(depth + 1);
            used[i] = false;
        }
    }
    public static void main(String[] args) {
        dfs(0);
    }
}
