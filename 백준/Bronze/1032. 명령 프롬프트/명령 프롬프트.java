import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        char[] base = br.readLine().toCharArray(); // 베이스가 될 문자열을 단어로

        for (int i = 0; i < n - 1; i++) {
            char[] filename = br.readLine().toCharArray(); // 파일 이름

            for (int j = 0; j < base.length; j++) {
                if(base[j] != filename[j]) { // 베이스와 파일이름이 다르다면
                    base[j] = '?'; // ? 로 변경
                }
            }
        }
        System.out.println(base);
    }
}

