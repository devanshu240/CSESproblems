package CSESproblems;
import java.util.Scanner;
import java.util.HashSet;
public class ques3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n =s.length();
        HashSet<Character> h = new HashSet<>();
        int res=0;
        int curr=0;
        for(int i=0;i<n;i++){
            if(h.contains(s.charAt(i))){
                curr++;
            }
            else{
                h.clear();
                res=Math.max(curr,res);
                curr=1;
                h.add(s.charAt(i));
            }
            res=Math.max(curr,res);
        }
        System.out.println(res);

    }
}
