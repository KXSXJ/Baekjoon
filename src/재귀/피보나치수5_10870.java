package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class 피보나치수5_10870 {
    public static void main(String[] agrs)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int N = Integer.parseInt(br.readLine());
        System.out.print(solution(N));
    }
    
    public static int solution(int fn){      
        if(fn ==0) return 0;
        if(fn ==1) return 1;
        return solution(fn-1) + solution(fn-2);
               
    }
}
