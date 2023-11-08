package 백준_브로트포스;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 블랙잭_2798 {
    
    
    
    public static void main(String[] args)throws IOException{

        /*  1. 주어진 M을 넘으면 안됨
            2. 3개의 카드로 M이랑 가장 가까운 수를 만들어야함
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        
        int ary[]=new int[N];
        for(int i =0; i<N; i++){
            ary[i]=Integer.parseInt(st2.nextToken());
        }

        int sum=0;
        int result=0;

        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++){
                for(int z=j+1; z<N; z++){
                    sum+=ary[i]+ary[j]+ary[z];
                    if(sum<=M && sum>result){
                        result=sum;
                        sum=0;
                    }
                    sum=0;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result+ "");
        bw.flush();
        bw.close();
    }
}
