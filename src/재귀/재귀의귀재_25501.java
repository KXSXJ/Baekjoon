package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 재귀의귀재_25501 {
    static int cnt;
    public static void main(String[] agrs)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        for(int i= 0; i< N; i++){
            System.out.println(isPalindrome(br.readLine())+" "+cnt);

        }
    }


    static int isPalindrome(String s){
        cnt=0;
        return recursion(s, 0, s.length()-1);
    }

    static int recursion(String s, int l, int r){
        cnt++;
        if(s.charAt(l) != s.charAt(r)) return 0;
        else if(l>=r) return 1;
        else return recursion(s, l+1, r-1);
    }
    
}
