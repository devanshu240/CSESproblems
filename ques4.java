package CSESproblems;
import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        long arr[] = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }
        long res = 0; 
        for (int i = 1; i < N; i++) {
            if (arr[i - 1] > arr[i]) {
                res += (arr[i - 1] - arr[i]);
                arr[i] = arr[i - 1];
            }
        }
        System.out.println(res);
    }
}

