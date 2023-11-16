package 백준_직사각형;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 대지_9063 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int XY[][]= new int[N][2];

        for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j =0; j<2; j++){
                XY[i][j]=Integer.parseInt(st.nextToken());
            }
        }


        //x최소, 최대  y최소, 최대 구하기
        int max_x=XY[0][0];
        int min_x =XY[0][0];
        int max_y=XY[0][0];
        int min_y =XY[0][1];

        for(int i=0; i<N; i++){
            if(XY[i][0]>=max_x){
                max_x = XY[i][0];
            }
            if(XY[i][0]<=min_x){
                min_x = XY[i][0];
            } 
        }
        for(int i=0; i<N; i++){
            if(XY[i][1]>=max_y){
                max_y = XY[i][1];
            }
            if(XY[i][1]<=min_y){
                min_y = XY[i][1];
            } 
        }


        int result= (max_x - min_x) * (max_y - min_y);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(result+"");
        bw.flush();
        bw.close();


       
    }
}
