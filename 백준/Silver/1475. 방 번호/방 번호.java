import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray(); // 입력의 문자들 배열

        int[] numArr = new int[10]; // 0~9 까지 숫자
        for (int i = 0; i < arr.length; i++) {
            int n = Character.getNumericValue(arr[i]); // 숫자 문자를 int 형으로

            if (n == 6) { // 6이라면 9로 사용할 수 있기 때문에 9 를 ++
                numArr[9]++;
            } else {
                numArr[n]++;
            }
        }

        int max = 0; // 최대 갯수
        // 9 전 까지의 숫자들에서 최대 개수(9는 6으로 뒤집어 사용할 수 있기에 9를 기중으로 만든다)
        for (int i = 0; i < 9; i++) {
            max = Math.max(max, numArr[i]);
        }

        int nine = numArr[9] / 2; // 9의 개수 
        if(numArr[9]%2 ==1) nine++; // 만약 9의 개수가 홀수 라면 한 세트 더 필요
        max = Math.max(max, nine); // 다른 숫자들의 세트 개수와 9를 기준으로한 세트 중에 큰 수를 최대로

        System.out.println(max);
    }
}