package 백준_브로트포스;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 분해합_2231 {
    public static void main(String args[])throws IOException{
        /*분해합
         * 자연수 M의 분해합은 N (M은 N의 생성자)
         * 245의 분해합은 256(245+2+4+5) -> 245는 생성자(M)
         * 생성자 중 가장 작은 것을 구하시오
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N =Integer.parseInt(br.readLine());
        int i =0;
        int result=0;
        String a[] = (N+"").split("");
        
        i=i-(9*a.length); //i를 1부터가 아닌 각 자리수의 최대(9)의 합만큼만 뺀 것부터 계산
        if(i<0){ //i가 음수면 0으로 초기화
            i=0;
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        

        while(i<N){
            result+=i;
            String Sresult[] = (i+"").split("");
            
            for(int j =0; j<Sresult.length; j++){
                result+=Integer.parseInt(Sresult[j]);
            }

            if(result==N){ 
                result=i;
                break;
            }else{
                result=0;
            }          
            i++;  
        }
        bw.write(result+"");
        bw.flush();
        bw.close();
    }
}
