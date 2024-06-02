import java.util.*;

public class ques14 {
    public static void solve(int n, int s, int d, int a, List<int[]> moves) {
        if (n == 0) {
            return;
        }
        solve(n - 1, s, a, d, moves);
        moves.add(new int[]{s, d});
        solve(n - 1, a, d, s, moves);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<int[]> moves = new ArrayList<>();

        solve(n, 1, 3, 2, moves);

        System.out.println(moves.size());
        for (int[] move : moves) {
            System.out.println(move[0] + " " + move[1]);
        }

        sc.close();
    }
}
