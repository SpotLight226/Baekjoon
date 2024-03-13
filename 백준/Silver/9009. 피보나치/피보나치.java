import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {

            int test = Integer.parseInt(br.readLine());
            for (int i : solution(test)) {
                bw.write(i + " ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();

    }

    static List<Integer> solution(int n) {
        List<Integer> fibo = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        fibo.add(0);
        fibo.add(1);
        int idx = 2;

        while (true) {
            int temp = fibo.get(idx - 1) + fibo.get(idx - 2);
            if (temp > n) {
                break;
            }
            fibo.add(temp);
            idx++;
        }

        Collections.sort(fibo, Collections.reverseOrder());

        while (n != 0) {
            for (int i = 0; i < fibo.size(); i++) {
                int fiboTemp = fibo.get(i);
                if (fiboTemp <= n) {
                    n -= fiboTemp;
                    answer.add(fiboTemp);
                }
            }
        }

        Collections.sort(answer);
        answer.remove(0);
        return answer;

    }

}
