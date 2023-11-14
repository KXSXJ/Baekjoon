package 백준_큐;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 풍선터뜨리기_2346 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new LinkedList<>();
        Deque<Integer> dequeNum = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            deque.add(Integer.parseInt(st.nextToken())); 
            dequeNum.add(i+1);
        }

        int direct = deque.pollFirst();
        int n = dequeNum.pollFirst();
        
        while(!deque.isEmpty()){ 
            bw.write(n+ " "); 
            if(direct<0){
                for(int i =direct+1; i <0;  i++){
                    deque.addFirst((deque.pollLast()));
                    dequeNum.addFirst(dequeNum.pollLast());
                }
                direct = deque.pollLast();
                n = dequeNum.pollLast();
                
            }else{
                for(int i = 0; i < direct-1; i++){
                    deque.add(deque.pollFirst());
                    dequeNum.add(dequeNum.pollFirst());
                }
                direct = deque.pollFirst();
                n = dequeNum.pollFirst();
            }
        }
        bw.write(n+"");     
        bw.flush();
        bw.close();

    }   

}
