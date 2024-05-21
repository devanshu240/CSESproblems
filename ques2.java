//package CSESproblems;
import java.util.Scanner;
import java.util.*;
public class ques2 {
    public static long solve( List<Long> ll,long n){
        long sum = n*(n+1)/2;
        for(long i : ll){
            sum=sum-i;
        }
        return sum;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        List<Long> ll = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            long k = sc.nextInt();
            ll.add(k);

        }
        System.out.print(solve(ll,n));
    }
}
