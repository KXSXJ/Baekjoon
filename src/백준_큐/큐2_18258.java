package 백준_큐;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.LinkedList;

public class 큐2_18258 {
        static Queue<Integer> queue = new LinkedList<>();
        static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        static int last;
        public static void main(String[] args)throws IOException{
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            int N = Integer.parseInt(br.readLine());
            
            
        for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            solution(st);
        }
        bw.flush();
        bw.close();
    }

    static void solution(StringTokenizer st)throws IOException{
        
        
        
        String s = st.nextToken();
        switch(s){
            case "push":
                int n = Integer.parseInt(st.nextToken());
                queue.offer(n);
                last=n;
                
                break;
            case "pop":
                if(!queue.isEmpty()){
                    bw.write(queue.poll()+"\n");
                }else{
                    bw.write("-1\n");
                }
                break;
            case "size":
                bw.write(queue.size()+"\n");
                break;
            case "empty":
                if(queue.isEmpty()){
                    bw.write("1\n");
                }else{
                    bw.write("0\n");
                }
                break;
            case "front":
                if(!queue.isEmpty()){
                    bw.write(queue.peek()+"\n");
                }else{
                    bw.write("-1\n");
                }
                break;
            case "back":
                if(!queue.isEmpty()){
                    bw.write(last+"\n");
                }else{
                    bw.write("-1\n");
                }
                break;       
        }
        
        
    }
}
