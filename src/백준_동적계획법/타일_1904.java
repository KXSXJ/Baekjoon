package 백준_동적계획법;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class 타일_1904 {
    public static int[] countN;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        countN = new int [N+1];
        solution(N);
        

    }

    public static void solution(int N){
        countN[0] =1;
        countN[1] =2;
        
        for(int i=2; i<N; i++){
            countN[i] = (countN[i-1] +countN[i-2])%15746;
        }

        System.out.println(countN[N-1]);
        
    }


}
