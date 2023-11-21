package 백준_백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스도쿠_2580 {

    public static int arr[][];
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = new int[9][9];

       for(int i = 0; i<9; i++){    
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int j = 0; j<9; j++){
            int num =Integer.parseInt(st.nextToken());
            arr[i][j]=num;
            }
        }
        sudoku(0, 0);
 
}


public static void sudoku(int row, int col) {
 
    // 해당 열이 다 채워졌을 경우 다음 행의 첫 번째 열부터 시작
    if (col == 9) {
        sudoku(row + 1, 0);
        return;
    }

    // 행과 열이 모두 채워졌을 경우 출력 후 종료
    if (row == 9) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sb.append(arr[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
        // 출력 뒤 시스템을 종료한다.
        System.exit(0);
    }

    // 만약 해당 위치의 값이 0 이라면 1부터 9까지 중 가능한 수 탐색
    if (arr[row][col] == 0) {
        for (int i = 1; i <= 9; i++) {
            // i 값이 중복되지 않는지 검사
            if (possibility(row, col, i)) {
                arr[row][col] = i;
                sudoku(row, col + 1);
            }
        }
        arr[row][col] = 0;
        return;
        }

        sudoku(row, col + 1);
    }

    public static boolean possibility(int col, int row, int value){
        for(int i =0; i<9; i++){
            if(arr[row][i]==value || arr[i][col] ==value){
                return false;
            }   
        }

        int h = (row/3)*3;
        int c = (col/3)*3;
        
        for(int i = h; i< h+3; i++){
            for(int j = c; j< c+3; j++){
                if(arr[i][j]==value){
                    return false;
                }
            }
        }

        return true;

    }
}