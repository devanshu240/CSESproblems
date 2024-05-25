//package CSESproblems;

//package CSESproblems;

import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); 
        for(int i=1;i<=n;i++){
            if(i==1){
                System.out.println(0);
                continue;
            }
            if(i==2){
                System.out.println(6);
                continue;
            }
            else{
                long sq =(long) i*i;
                long tt = (long)sq*(sq-1)/2;
                long box = (long)(i-1)*(i-2)*4;
                System.out.println(tt-box);

            }
        }
    }
}
