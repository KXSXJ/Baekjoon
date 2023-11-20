package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class 칸도어_집합_4779 {

    static  StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        while((str = br.readLine()) != null){

            int n =(int) Math.pow(3,Integer.parseInt(str));

            for(int i =0; i <n; i++){
                sb.append("-");
            }

            Cantoor(sb, 1, sb.length(), sb.length());
            System.out.println(sb);
            
            sb.delete(0, sb.length());

        }
    }

    public static void Cantoor(StringBuilder s, int left, int right, int cnt){   
        
        int N = cnt/3; //9 ... 3 ...1
        int endMid= right-N; //18 ..()
        int startMid= endMid-N; //9
        if(N==0) return;
  

        for(int i = startMid; i<endMid; i++){
            sb.setCharAt(i, ' ');
        }
        
        Cantoor(s, left, startMid, N);
        Cantoor(s, startMid+1, endMid, N);
        Cantoor(s, endMid+1, right, N);
        
    }


    
    
}
