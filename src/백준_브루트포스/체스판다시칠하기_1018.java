package 백준_브로트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 체스판다시칠하기_1018 {
    static int CheckIndexH =0;
    static int CheckIndexW =0;
    static int minCount=10000;
    static int h; //높이
    static int w; //가로
    static int BW=1;//기본컬러 블랙

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        h =Integer.parseInt(st.nextToken());
        w =Integer.parseInt(st.nextToken());
        
        String board[][]= new String[h][w]; //보드 저장
        

        for(int i =0; i<h; i++){
            String a[] = br.readLine().split("");    
            for(int j =0; j<w; j++){
                board[i][j]=a[j]; //보드판 저장
            }
        }

        int ary[][] = new int[h][w];
  
        
        for(int i =0; i<h; i++){
            for(int j=0; j<w; j++){
                if(board[i][j].equals("B")){
                    ary[i][j]=1; //블랙은 1
                }else{
                    ary[i][j]=0; //흰색은 0
                }
            }
        }


        
        //2*(n-7)*(n-7) 가로세로
        for(int t = 0; t <2; t++){
            for(int i =0; i<h-7; i++){
                for(int j =0; j<w-7; j++){
                    CheckBorad(ary,t);
                    CheckIndexW++;
                }
                CheckIndexW=0; //초기화
                CheckIndexH++;
            }
            CheckIndexH=0;
            CheckIndexW=0;
        }

        System.out.print(minCount);
        
        
        
        
    

        
    }
    static void CheckBorad(int[][] Board, int t){
        int cnt =0; //cnt 초기화
        
        if(t==0){ //1회 try 첫시작 화이트
            BW=0;
        }
        else{
            BW=1;
        }


        for(int i=0; i<8; i++){ //높이
            for(int j=0; j<8; j++){ //넓이
                
                if((Integer)Board[i+CheckIndexH][j+CheckIndexW]==BW){
                }
                else{
                    cnt ++;
                }


                //색바꾸기
                if(BW==1){
                    BW=0;
                }else{
                    BW=1;
                }                
            }

             //색바꾸기(다음줄로 넘어가면 그대로)
             if(BW==1){
                BW=0;
            }else{
                BW=1;
            }   
                 
        }
        if(cnt <minCount){
            minCount=cnt;
            
        }

    }
    
    
}
