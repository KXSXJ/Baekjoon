package 백준_스택;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class 제로_10773 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> st =  new Stack<>();
        int sum =0;

        for(int i = 0; i <N; i++){
            int a = Integer.parseInt(br.readLine());
            
            if(a ==0 && !st.isEmpty()){
                sum-=st.pop();
            }else{
                sum+=st.push(a);
            }
        }
        


        bw.write(sum+"");
        bw.flush();
        bw.close();
    }
}
