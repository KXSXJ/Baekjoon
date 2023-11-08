package 백준_브로트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 영화감독숌_1436 {
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =Integer.parseInt(br.readLine());
       

        int Ncount=666;
        int AryCnt=1;
        while(true){
            if(Integer.toString(Ncount).contains("666")){
                if(AryCnt ==N){
                    System.out.println(Ncount);
                    break;
                }
                else{
                    Ncount++;
                    AryCnt++;
                }
            }else{
                Ncount++;
            }
        }
        
    }
}
