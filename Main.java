package CSESproblems;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N= sc.nextInt();
        while (N != 1) {
            System.out.print(N + " ");
            if (N % 2 != 0)
                N = N * 3 + 1;
            else
                N /= 2;
        }
        System.out.print(1);
    }
}