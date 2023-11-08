package 정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class 대표값2_2587 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();

        for(int i =0; i <5; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum=0;

        //선택정렬
        for(int i=0; i <list.size(); i++){
            int idx=i;
            for(int j =i+1; j<list.size(); j++){
                if(list.get(idx)>list.get(j)){
                    idx=j;
                }
            }
            int temp = list.get(i);
            list.set(i, list.get(idx));
            list.set(idx,temp);
            sum+=list.get(i);
        }
        bw.write(sum/5 +"\n" + list.get(2));
        bw.flush();
        bw.close();


    }    
}
