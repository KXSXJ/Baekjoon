package 백준_백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연산자끼워넣기_14888 {
    public static int operations[], Num[];
    public static int Max = Integer.MIN_VALUE;
    public static int Min= Integer.MAX_VALUE;
    public static int cnt=0;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        Num = new int[N];
        operations = new int[4];
        

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i =0; i<N; i++){
            Num[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i =0; i<4; i++){
            operations[i] = Integer.parseInt(st.nextToken());
        }


        
        solution(1, Num[0]);
        System.out.print(Max+"\n"+Min);   
    }

    public static void solution(int depth, int op){

        if(depth == Num.length){
            Max = Math.max(Max,op);
            Min = Math.min(Min,op);
            return;
        }
        
        
        for(int i =0; i<4; i++){
            if(operations[i]>0){ //연산자가 1개 이상일 경우
                int temp=op;
                operations[i]-=1;
                if(i==0){
                    temp+=Num[depth];
                }else if(i==1){
                    temp-=Num[depth];
                }else if(i==2){
                    temp*=Num[depth];
                }else {
                    temp/=Num[depth];
                }

                // System.out.println("depth :"+depth+", i: "+i +", op:" + op);
                solution(depth+1, temp);
                operations[i]+=1;
            }    
        }

    }



}
