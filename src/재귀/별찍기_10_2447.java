package 재귀;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 별찍기_10_2447 {
    static char StarBox[][];
    public static void main(String[] args)throws IOException{
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        
        int N = Integer.parseInt(br.readLine());

        StarBox = new char[N][N];

        
        DrawStar(N,N,N);

        for(int i = 0; i<N; i++){
            for(int j =0; j <N; j++){
                if(StarBox[i][j]!='n'){
                    sb.append("*");
                }else{
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        bw.write(sb+"");
        bw.flush();
        bw.close();
    }  

    
    

    static void DrawStar(int H,int C, int len){
        if(len ==1) return;
        int k=len/3; //9.. 3 ..1
        
  
        for(int i =H-(2*k); i<H-k; i++){
            for(int j = C-(2*k); j<C-k; j++){
                StarBox[i][j]='n';
            }
        }
        
        int temp=C;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                DrawStar(H,C,k);
                C-=k; 
            }
            C=temp;
            H-=k;
        }

    }
    
    

}
