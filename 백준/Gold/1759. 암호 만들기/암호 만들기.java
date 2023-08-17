
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int l;
    static int c;
    static char[] inputs;
    static char[] code;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        l = Integer.parseInt(st.nextToken()); // 암호의 길이
        c = Integer.parseInt(st.nextToken()); // 입력받을 알파벳 개수

        inputs = new char[c]; // 입력 받은 알파벳
        code = new char[l]; // 만들 암호

        st = new StringTokenizer(br.readLine());
        for(int i = 0; st.hasMoreTokens(); i++){
            inputs[i] = st.nextToken().charAt(0);
        }

        // 알파벳 큰 순서대로 배열되므로 정렬
        Arrays.sort(inputs);

        makeCode(0, 0);
    }

    public static void makeCode(int start, int count){
        // 길이가 l 과 같을 때
        if(count == l){
            if(isValid(code)){
                System.out.println(code);
            }
            return;
        }

        for(int i = start; i < c; i++){
            code[count] = inputs[i];
            makeCode(i + 1, count + 1);
        }
    }

    public static boolean isValid(char[] arr){
        int mo = 0; // 모음
        int ja = 0; // 자음

        for(char c : arr){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                mo++;
            } else {
                ja++;
            }
        }

        if(mo >= 1 && ja >= 2){
            return true;
        } else {
            return false;
        }

    }
}




