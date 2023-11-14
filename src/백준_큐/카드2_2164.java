package 백준_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 카드2_2164 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            queue.offer(i+1);
        }

        while(queue.size()!=1){
            queue.poll();
            queue.offer(queue.poll());
        }

        System.out.println(queue.peek());
        
    }
}
