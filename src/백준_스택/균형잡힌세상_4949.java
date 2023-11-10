package 백준_스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 균형잡힌세상_4949 {
    public static Stack<String> stack = new Stack<>();
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        while(true){
            String s = br.readLine();
            if(s.length()==1 && s.equals(".")){
                break;
            }else{
                solution(s);
            }
           
        }
    }

    static void solution(String s){
        
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String word = st.nextToken();
            if(word.contains("[") || word.contains("]") || word.contains("(")|| word.contains(")")){
                operation(word);
            }
        }
        if (stack.empty()){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        stack.clear();
    }

    static void operation(String word){
        
        for(int i =0; i < word.length(); i++){
            char c = word.charAt(i);

            if(c=='('){
                stack.push("(");
            }
            else if(c==')'){
                if(!stack.empty() && stack.peek()=="("){
                    stack.pop();
                }else{
                    stack.push("]");
                    return;
                }
            }else if(c=='['){
                stack.push("[");
            }
            else if(c==']'){
                if(!stack.empty()&&stack.peek()=="["){
                    stack.pop();
                }else{
                    stack.push("]");
                    return;
                }
            }
        }
    }
}
