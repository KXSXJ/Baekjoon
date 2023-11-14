package 백준_큐;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.StringTokenizer;
import java.util.ArrayDeque;

public class 풍선터뜨리기_2346_copy {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        Deque<int[]> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        sb.append("1 ");
        int direct = Integer.parseInt(st.nextToken());

        for(int i = 2; i <=N; i++){
            deque.add(new int[] {i,Integer.parseInt(st.nextToken())}); 
        }

        
        while(!deque.isEmpty()){ 
    
            if(direct<0){
                for(int i =direct+1; i <0;  i++){
                    deque.addFirst((deque.pollLast()));
                }
                int next[] = deque.pollLast(); 
                direct = next[1];
                sb.append(next[0]).append(" ");
                
            }else{
                for(int i = 0; i < direct-1; i++){
                    deque.add(deque.pollFirst());
                }
                int next[] =deque.pollFirst();
                direct = next[1];
                sb.append(next[0]).append(" ");
            }
        }     
        bw.write(sb+"");
        bw.flush();
        bw.close();

    }   

}
