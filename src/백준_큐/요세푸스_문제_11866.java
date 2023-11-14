package 백준_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;

public class 요세푸스_문제_11866 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> result = new LinkedList<>();
        

        for(int i=0; i<N; i++){
            queue.offer(i+1);   
        }


        for(int i=0; i<N; i++){
            for(int j=0; j<K-1; j++){
                queue.offer(queue.poll());
            }
            result.offer(queue.poll());
        }

        System.out.print("<");
        for(int i =0; i<N; i++){
            if(result.size()!=1){
                System.out.print(result.poll()+", ");
            }
            else{
                System.out.print(result.poll());
            }
        }
        System.out.print(">");

    }
}
