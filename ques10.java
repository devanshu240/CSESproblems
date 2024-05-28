
import java.util.Scanner;
public class ques10 {
    public static int solve(int n){
        if(n==0){
            return 0;
        }
        return n/5+solve(n/5);
    }
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(solve(n));
    }
}
