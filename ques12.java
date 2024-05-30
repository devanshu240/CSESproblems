import java.util.Scanner;
public class ques12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int freq[]= new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'A']++;
        }
        char arr[] = new char[n];
        int c = 0;
        for(int i=0;i<26;i++){
            if(c%2!=0){
                c++;
            }
        }
        if(c>1){
            System.out.println("NO SOLUTION");
        }
        else{
           int l = 0  , r = n-1;
           for(int i=0;i<26;i++){
            while(freq[i]>1){
                arr[l++]=arr[r--]=(char)(i+'A');
                freq[i]-=2;
            }
        }
           for(int i=0;i<n;i++){
            if(freq[i]==1){
                arr[n/2]=(char)(i+'A');
                break;
            }
           }
           System.out.println(new String(arr));


        } 
    }

}

