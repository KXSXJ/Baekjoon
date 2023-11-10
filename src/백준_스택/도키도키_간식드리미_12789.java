package 백준_스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 도키도키_간식드리미_12789 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        Stack<Integer> Stay = new Stack<>();
        Stack<Integer> SubStay = new Stack<>();
      
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            SubStay.push(Integer.parseInt(st.nextToken()));
        }

        for(int i=0; i<N; i++ ){
            Stay.push(SubStay.pop());
        }


        int cnt=1;

        while(true){
            if(!Stay.empty() && Stay.peek() == cnt){
                Stay.pop();
                cnt++;
            }else if(!SubStay.empty() && SubStay.peek()==cnt){
                SubStay.pop();
                cnt++;
            }
            else{
                SubStay.push(Stay.pop());
            }
            

            if(cnt==N+1){
                System.out.println("Nice");
                break;
            }else if(Stay.empty() && SubStay.peek()!=cnt){
                System.out.println("Sad");
                break;
            }
        }

    }
}
