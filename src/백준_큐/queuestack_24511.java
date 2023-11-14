package 백준_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class queuestack_24511 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();        

        int N = Integer.parseInt(br.readLine());
        StringTokenizer A = new StringTokenizer(br.readLine());//자료구조 종류
        StringTokenizer B = new StringTokenizer(br.readLine());//초기 값
        
        int a= N;
        
        for(int i=0; i<a; i++){
            int dq=Integer.parseInt(A.nextToken());
            if(dq==1){
                N--; //stack은 신경 안써도됨
                B.nextToken();
            }else{
                deque.add(Integer.parseInt(B.nextToken()));
            }
        }
    
        int M = Integer.parseInt(br.readLine());
        StringTokenizer C = new StringTokenizer(br.readLine());

    

        while(C.hasMoreTokens()){
            deque.addFirst(Integer.parseInt(C.nextToken()));
            sb.append(deque.pollLast()).append(" ");
        }

        System.out.print(sb);
    }
}
