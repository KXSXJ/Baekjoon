package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 알고리즘수업_병합정렬1_24060 {
    public static int sorted[];
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int ary[] = new int[N];
        for(int i=0; i<N; i++){
            ary[i]=Integer.parseInt(st.nextToken());
        }

        sorted = new int[ary.length];

    }

    static void merge_sort(int a[], int left, int right){
        if(left==right) return;

        int mid =(left+right) /2;

        merge_sort(a,left, mid);
        merge_sort(a,mid+1, right);
        merge(a, left, mid, right);
    }

    static void merge(int a[], int left, int mid, int right){
        int l = left;
        int r = mid+1;
        int idx = left;

        while(l<=mid && r<=right){
            if(a[l]<=a[r]){
                sorted[idx] = a[l];
                idx++;
                l++;
            }
            else{
                sorted[idx] =a[r];
                idx++;
                r++;
            }
        }
        if(l>mid){
            while(r <=right){
                sorted[idx] = a[r];
                idx++;
                r++;
            }
        }
        else{
            while(l <=left){
                sorted[idx] = a[l];
                idx++;
                l++;
            }
        }

        for(int i = left; i <=right; i++){
            a[i]=sorted[i];
        }
    }
}
