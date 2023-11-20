package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼2_27433 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Integer.parseInt(br.readLine());
        System.out.println(solution(N));
    }
    
    public static long solution(long N){
        if(N==0 || N==1){
            return 1;
        }
        return N * solution(N-1);
    }

}
