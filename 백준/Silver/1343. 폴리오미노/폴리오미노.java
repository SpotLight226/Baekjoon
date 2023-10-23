	import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        String str = br.readLine();
        String[] split_str = str.split("\\."); // .으로 나눈 문자열
        StringBuilder sb = new StringBuilder();
 
        for (int i = 0; i < split_str.length; i++) {
            String x = split_str[i];
 
            if (x.length() % 2 != 0) { // AAAA, BB 는 짝수 이므로 홀수라면 -1 출력
                sb = new StringBuilder("-1");
                break;
            } else if (x.length() % 4 == 0) { // 길이가 4 라면 AAAA로
                sb.append("AAAA".repeat(x.length() / 4));
            } else { // 길이가 2라면 BB로
                sb.append("AAAA".repeat(x.length() / 4));
                sb.append("BB");
            }
 
            if (i != split_str.length - 1) {
                sb.append(".");
            }
        }
 
        String ans = sb.toString();
        if (!ans.equals("-1")) {
            sb.append(".".repeat(str.length() - sb.toString().length()));
        }
 
        bw.write(sb + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}