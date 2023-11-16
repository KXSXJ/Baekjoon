package 백준_직사각형;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 삼각형과세변_5073 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int triangle_A;
        int triangle_B;
        int triangle_C;
        int N=0;
        ArrayList<String> result = new ArrayList<>();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            triangle_A=Integer.parseInt(st.nextToken());
            triangle_B=Integer.parseInt(st.nextToken());
            triangle_C=Integer.parseInt(st.nextToken());


           
            if(triangle_A==0 && triangle_B==0 && triangle_C==0){
                break;
            }
            int max =triangle_A;
            int triangle_sum=triangle_B+triangle_C;
                
            if(triangle_B>=max && triangle_B>=triangle_C){
                max=triangle_B;
                triangle_sum=triangle_A+triangle_C;
            }else if(triangle_C>=max && triangle_C >=triangle_B){
                max=triangle_C;
                triangle_sum=triangle_A+triangle_B;
            }


            //정삼각형
            if(triangle_A==triangle_B && triangle_B==triangle_C){
                result.add("Equilateral");
            //두변의 길이만 같을 경우
            }else if(triangle_A==triangle_B  || triangle_B==triangle_C|| triangle_A==triangle_C){
                if(triangle_sum<=max){
                    result.add("Invalid");
                }else{
                    result.add("Isosceles");
                }
                
            // 세변이 다 다를 경우
            }else if(triangle_A!=triangle_B || triangle_B != triangle_C || triangle_A !=triangle_C ){
                

                if(triangle_sum<=max){
                    result.add("Invalid");
                }else{
                    result.add("Scalene");
                }
            }
            N++;
             
        }

        
        for(int j=0; j<N;j++){
            bw.write(result.get(j));
            if(j+1!=N){
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
        
        
    }
    
}
