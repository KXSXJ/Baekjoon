package 백준_스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호_9012 {
    static String result="";
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        for(int i =0; i<N; i++){
            String a = br.readLine();
            solution(a);
            System.out.println(result);
        }
        
    }
    
    public static void solution(String a){
        Stack<Character> stack = new Stack<>();
       
        for(int j=0; j<a.length(); j++){
            char b = a.charAt(j);

            
            if(b =='('){
                stack.push(b);
            }else if(b ==')' && stack.isEmpty()){
                stack.push(b);
                break;
            }else if(b==')'&& stack.peek()=='('){ //짝이 맞으면
                stack.pop();
            }
        }if(stack.size()==0){
            result="YES";
        }else{
            result="NO";
        }
    }   
}
