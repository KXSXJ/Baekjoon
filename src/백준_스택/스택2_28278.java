package 백준_스택;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;



public class 스택2_28278 {
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<N; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            
            switch(Integer.parseInt(st.nextToken())){
                case 1:
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    if(stack.isEmpty()){
                        bw.write(-1+"\n");
                    }else{
                        bw.write(stack.pop()+"\n");
                    }
                    break;
                case 3:
                        bw.write(stack.size()+"\n");
                    break;
                case 4:
                    if(stack.isEmpty()){
                        bw.write(1+"\n");
                    }else{
                        bw.write(0+"\n");
                    }
                    break;
                case 5:
                    if(stack.isEmpty()){
                        bw.write(-1+"\n");
                    }else{
                        bw.write(stack.peek()+"\n");
                    }
                    break;
            }
           
           
        }
        bw.flush();
        bw.close();

       
    }

}
