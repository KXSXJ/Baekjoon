package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 커트라인_25305 {
    public  static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken()); //사람 수
        int N = Integer.parseInt(st.nextToken()); //커트라인

        int x[] = new int[k];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        
        for(int i=0; i<k; i++){
            x[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.print(solution(x)[N-1]);

    }

    static int[] solution(int[] x){
        
        for(int i=0; i<x.length; i++){
            int idx= i;
            for(int j =i+1; j<x.length; j++){
                if(x[idx]<x[j]){
                    idx=j;
                }   
            } 
          
            int temp = x[i];
            x[i] = x[idx];
            x[idx] = temp;
        }    
        return x;
        

    }


}
