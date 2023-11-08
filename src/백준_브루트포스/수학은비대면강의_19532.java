package 백준_브로트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 수학은비대면강의_19532 { 
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x[] = new int[2];
        int y[] = new int[2];
        int n[] = new int[2];
        int operation[] = new int[2]; //누산기 역할
        int resultY;
        int resultX;


        for(int i =0; i <2; i++){
            x[i]=Integer.parseInt(st.nextToken());
            y[i]=Integer.parseInt(st.nextToken());
            n[i]=Integer.parseInt(st.nextToken());
        }
        operation = x.clone();

        int j =1;
        for(int i =0; i<2; i++){
            if(x[i]==0 || y[i]==0){
                if(x[i]==0){
                    resultY=n[i]/y[i];
                    resultX=((n[j]-y[j]*resultY)/x[1]);
                    System.out.println(resultX+" "+resultY);
                    break;
                }else{
                    resultX=n[i]/x[i];
                    resultY=((n[j]-x[j]*resultX)/y[j]);
                    System.out.println(resultX+" "+resultY);
                    break;
                }
            }else{
                x[i]=x[i]* operation[j];
                y[i]=y[i]* operation[j];
                n[i]=n[i]* operation[j];
            }
            j--;
        }
        
        if(operation[0]!=0 && operation[1]!=0 && y[0]!=0 && y[1]!=0){
            operation[0]=y[0]-y[1];       
            operation[1]=n[0]-n[1];            
            resultY = operation[1]/operation[0];
            resultX=((n[1]-y[1]*resultY)/x[1]);
            System.out.println(resultX+" "+resultY);
        }
        
        
        
        
        
        


    }
}
