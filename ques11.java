import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ques11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String[] inputs = br.readLine().split(" ");
            int n1 = Integer.parseInt(inputs[0]);
            int n2 = Integer.parseInt(inputs[1]);
            if ((n1 + n2) % 3 == 0 && Math.max(n1, n2) <= 2 * Math.min(n1, n2)) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb.toString());
    }
}
