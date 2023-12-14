import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        A = A * D + B * C; // 분자
        B = B * D; // 분모

        int gcd = getGCD(A,B); // 최대 공약수

        System.out.println(A/gcd + " " + B/gcd); // 기약분수


    }

    //최대 공약수를 구하는 유클리드 호제법
    public static int getGCD(int a, int b) {
        if(a%b == 0){
            return b;
        }
        return getGCD(b, a%b);
    }
}


