import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[3];

        //무한 루프
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break; // 0 0 0 입력시 루프 종료

            Arrays.sort(arr); // 오름차순 정렬

            if(arr[2] >= arr[0] + arr[1]) { // 작은 두 변이 가장 큰 변보다 작으면 Invalid
                bw.write("Invalid\n");
            } else if(arr[0] == arr[1] && arr[1] == arr[2]) { // 세 변의 길이가 모두 같은 경우
                bw.write("Equilateral\n");
            }else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {  // 두 변의 길이만 같은 경우
                bw.write("Isosceles\n");
            }else { // 세 변의 길이가 모두 다른 경우
                bw.write("Scalene\n");
            }

        }

        br.close();
        bw.flush();
        bw.close();

    }
}

