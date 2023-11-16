package 백준_직사각형;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 네번째점_3009 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int XY[][] = new int[3][2];

        
         for(int i = 0; i<3; i++){
             StringTokenizer st = new StringTokenizer(br.readLine());

             for(int j = 0; j<2; j++){
                 XY[i][j] = Integer.parseInt(st.nextToken()); 
             }
            
         }
         int X=XY[0][0];
         int Y=XY[0][1];

        

            //X값 구하기
            if(X==XY[1][0]){
                X=XY[2][0];
            }
            else if (X==XY[2][0]){
                X=XY[1][0];
            }
            //Y값 구하기
            if(Y==XY[1][1]){
                Y=XY[2][1];
            }
            else if (Y==XY[2][1]){
                Y=XY[1][1];
            }
        
            
        String result= X+" "+Y;
        bw.write(result);
        bw.flush();
        bw.close();
         
    

    }
}
