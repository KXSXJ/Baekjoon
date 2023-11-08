package 정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 수정렬하기3_10989 {
        
    public static void main(String[] args)throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        
        int[] ary = new int[10001];
        for ( int i =0; i<N; i++){
            ary[Integer.parseInt(br.readLine())]++;
        }

        for(int i=0; i<ary.length; i++){
            while(ary[i]-- > 0){
                bw.write(i+ "\n");
            }
        }

        
        bw.flush();
        bw.close();
     
    }
}