
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int k; // 저장되는 k번째
    static int[] arr; // 숫자 배열
    static int[] tmp;

    static int result = -1; // 결과
    static int count = 0; // 정렬 횟수
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i]  = Integer.parseInt(st.nextToken());
        }

        tmp = new int[n];

        merge_sort(arr, 0, n-1); // 병합 정렬
        System.out.println(result);
    }

    public static void merge_sort(int[] arr, int p, int r){
        if(count > k) return; // k 보다 크다면 할 필요 없다
        if(p < r){
            int q = Math.abs((p+r)/2);
            merge_sort(arr, p, q);
            merge_sort(arr, q+1, r);
            merge(arr, p, q, r);
        }
    }
    
    // 병합정렬 구현
    public static void merge(int[] arr, int p, int q, int r){
        int i = p;
        int j = q + 1;
        int t = 0;

        while(i <= q && j <= r){
            if(arr[i] <= arr[j]){
                tmp[t] = arr[i];
                i++;
            } else {
                tmp[t] = arr[j];
                j++;
            }
            t++;
        }

        while(i <= q){
            tmp[t++] = arr[i++];
        }

        while(j <= r){
            tmp[t++] = arr[j++];
        }

        i = p;
        t = 0;
        while(i <= r){
            count++;
            if(count == k){
                result = tmp[t];
                break;
            }
            arr[i++] = tmp[t++];
        }
    }
}