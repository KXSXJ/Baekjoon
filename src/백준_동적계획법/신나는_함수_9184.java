package 백준_동적계획법;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 신나는_함수_9184 {
    public static int[][][] memo= new int[21][21][21];
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            int c= Integer.parseInt(st.nextToken());
            
           
            if(a==-1 && b ==-1 && c==-1){
                break;
            }
            if(a<=0|| b<=0 ||c <=0){
                sb.append("w("+a+", "+b+", "+c+") = 1").append("\n");
            }else{
                sb.append("w("+a+", "+b+", "+c+") = "+w(a,b,c)).append("\n");
            }
        }

        System.out.println(sb);
    }
    
    static int w(int a, int b, int c){

        //하나라도 0보다 작으면 1로 반환
        if(a<=0 || b<=0|| c<=0){
            return 1;
        }

        //하나라도 20보다 크면
        if(a>20 || b>20 || c>20){
            return memo[20][20][20]= w(20,20,20);
        }

        if(memo[a][b][c]!=0) return memo[a][b][c];

        

        //a<b<c이면
        if(a < b && b < c) {
			return memo[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
		}
		
		return memo[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
	
    }
}
