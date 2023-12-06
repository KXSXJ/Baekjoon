package 백준_동적계획법;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 파도반_수열_9461 {
    
    static StringBuilder sb= new StringBuilder();
    static long[] visit;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i =0; i<N; i++){
            int n = Integer.parseInt(br.readLine());

            visit = new long[n];
            Pado(n);
        }
        System.out.println(sb);
        
    }

    static void Pado(int n){
        
        if(n<4){
            sb.append("1\n");
            return;
        } 

        visit[0] =1;
        visit[1] =1;
        visit[2] =1;

        for(int i =3; i<n; i++){
            visit[i] = visit[i-2] + visit[i-3];
        }

        sb.append(visit[n-1]+"\n");
        return;

    }
}
