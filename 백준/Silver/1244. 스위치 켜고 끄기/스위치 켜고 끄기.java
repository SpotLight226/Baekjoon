import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken()); // 성별
            int num = Integer.parseInt(st.nextToken()); // 번호

            // 남학생
            if (gender == 1) {
                for (int i = 0; i < n; i++) {
                    if((i+1) % num == 0)
                        arr[i] ^= 1;
                }
            }
            // 여학생
            else {

                arr[num -1] ^= 1;

                int left = num - 2; // 왼쪽
                int right = num; // 오른쪽

                while (left >= 0 && right < n) {
                    if(arr[left] != arr[right]) break;
                    arr[left] ^= 1;
                    arr[right] ^= 1;
                    left--;
                    right++;
                }
            }
        }

        br.close();

        for (int i = 0; i < n; i++) {
            bw.write(arr[i] + " ");
            if ((i + 1) % 20 == 0) {
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}





