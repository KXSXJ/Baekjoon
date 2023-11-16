package 백준_직사각형;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 직사각형_27323 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = a*b;
        bw.write(result+"");
        bw.flush();
        bw.close();

                
    }
}
