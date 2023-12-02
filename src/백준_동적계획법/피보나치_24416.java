package 백준_동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치_24416 {
    
    public static int[] visit;
    public static int cnt;

    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        visit = new int[N+1];

        System.out.println(fn(N)+" "+fn2(N));

    }

    static int fn(int N){
        if(N<2) return visit[N] =N; 
        
        if(visit[N]>0) return visit[N];

        
        visit[N] = fn(N-1) + fn(N-2);

        return visit[N];
    }

    static int fn2(int N){
        visit = new int[N+1];
        visit[1]=1;
        visit[2]=1;

        for(int i=3; i<=N; i++ ){
            cnt++;
            visit[i] = visit[i-1] + visit[i-2];
        }

        return cnt;
    }
}
