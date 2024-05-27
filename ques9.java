import java.util.Scanner;
import java.util.*;

public class ques9 {
    static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long res = 1;
        for(int i=1;i<=n;i++){
            res=res*2;
            res=res%mod;
        }
        System.out.println(res);
    }
}
