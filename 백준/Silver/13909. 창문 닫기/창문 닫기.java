import java.io.*;


class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // n까지 숫자중에 약수의 개수가 홀수인 숫자를 찾는 문제
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            count++;
        }

        System.out.println(count);
    }
}


