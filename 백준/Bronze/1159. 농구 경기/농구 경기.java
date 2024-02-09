import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean check = false; // 선발 가능 확인
        int[] arr = new int[26];

        while (n-- > 0) {
            // 아스키 코드를 이용해서 a ~ z - 97 에 해당하는 인덱스의 배열을 + 1
            char c = br.readLine().charAt(0);
            arr[c - 97]++;
            if(arr[c - 97] == 5) check = true; // 같은 첫글자가 5명 이상이라면 가능
        }

        br.close();

        if (check) {
            for (int i = 0; i < 26; i++) {
                if (arr[i] >= 5) {
                    bw.write((char) (i + 97));
                }
            }
        } else {
            bw.write("PREDAJA");
        }

        bw.flush();
        bw.close();
    }
}
