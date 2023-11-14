package 백준_큐;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 덱2_28279 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Deque<Integer> deque = new LinkedList<>();
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        int N = Integer.parseInt(br.readLine());
        
        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()); 
            solution(st);       
        }
        bw.flush();
        bw.close();
    }

    public static void solution(StringTokenizer st)throws IOException{
        int input =Integer.parseInt(st.nextToken());
        switch(input){
            case 1:
                deque.addFirst(Integer.parseInt(st.nextToken()));
                break;
            case 2:
                deque.add(Integer.parseInt(st.nextToken()));
                break;
            case 3:
                if(deque.isEmpty()){
                    bw.write("-1\n");
                }else{
                    bw.write(deque.poll()+"\n");
                }
                break;
            case 4:
                if(deque.isEmpty()){
                    bw.write("-1\n");
                }else{
                    bw.write(deque.pollLast()+"\n");
                }
                break;
            case 5:
                bw.write(deque.size()+"\n");
                break;
            case 6:
                if(deque.isEmpty()){
                    bw.write("1\n");
                }else{
                    bw.write("0\n");
                }
                break;
            case 7:
                if(deque.isEmpty()){
                    bw.write("-1\n");
                }else{
                    bw.write(deque.peek()+"\n");
                }
                break;
            case 8:
                if(deque.isEmpty()){
                    bw.write("-1\n");
                }else{
                    bw.write(deque.peekLast()+"\n");
                }
        }
       
        }  
}
