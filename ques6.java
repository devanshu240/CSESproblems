package CSESproblems;

import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            int y = sc.nextInt();
            int x = sc.nextInt();
            int l = Math.max(y,x);
            if(l % 2 == 0){
                if(x == l){
                    int r = (l-1)*(l-1)+y;
                    System.out.println(r);
                } else {
                    int r = (l-1)*(l-1)+l+(l-x);
                    System.out.println(r);
                }
            } else {
                if(x == l){
                    int r = (l-1)*(l-1)+x;
                    System.out.println(r);
                } else {
                    int r = (l-1)*(l-1)+l+(l-y);
                    System.out.println(r);
                }
            }
        }

    }
}
