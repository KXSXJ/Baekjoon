package 정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class 수정렬하기_2750 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list1 = new ArrayList<>();

        //숫자 넣기
        for(int i =0; i<N; i++){
            list1.add(Integer.parseInt(br.readLine()));            
        }
        for(int i =0; i<list1.size()-1; i++){
            for (int j = i+1; j<list1.size(); j++){
                
                if(list1.get(i)>list1.get(j)){
                    int temp = list1.get(i);
                    list1.set(i, list1.get(j));
                    list1.set(j, temp);
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i =0; i<N; i++){
            bw.write(list1.get(i)+"\n");
        }

        bw.flush();
        bw.close();
    }
}
