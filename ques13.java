//package CSESproblems;
import java.util.*;

public class ques13 {
    public static ArrayList<String> solve(int n) {
        if (n == 0) {
            return new ArrayList<>(Arrays.asList("0"));
        }
        if (n == 1) {
            return new ArrayList<>(Arrays.asList("0", "1"));
        }

        ArrayList<String> previous = solve(n - 1);
        ArrayList<String> result = new ArrayList<>();

        for (long i =0;i<previous.size();i++) {
            result.add("0" + previous.get((int) i));
        }
        for (long i=previous.size()-1;i>=0;i--) {
            result.add("1" + previous.get((int) i));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> arr = solve(n);

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
