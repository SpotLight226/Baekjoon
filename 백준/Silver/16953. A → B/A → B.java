
import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int count = 1; // 1 추가해서 출력하므로 1로 설정

        while (A != B) {
            if(B < A){ // B가 A보다 작으면 만들 수 없음
                count = -1;
                break;
            }

            String str = String.valueOf(B); // B의 끝자리를 확인하기 위해 문자열로

            // B의 끝자리가 1이 아니거나 2로 안 나누어지면 -1 출력
            if(str.charAt(str.length() -1) != '1' && B % 2 != 0){
                count = -1;
                break;
            }

            if (B % 2 == 0) { // 2로 나누어 떨어지면 2로 나누기
                B /= 2;
            } else { // 아니라면 맨 뒤의 1을 떼어낸다
                str = str.substring(0, str.length() - 1); // 0 ~ 길이 -1 까지 자르기
                B = Integer.parseInt(str); // B를 교체
            }

            count++; // 횟수 증가
        }

        br.close();
        System.out.println(count);

    }
}

