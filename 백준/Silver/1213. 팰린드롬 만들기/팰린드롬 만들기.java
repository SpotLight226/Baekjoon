import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();

        // 대문자 글자의 개수가 홀수인 알파벳이 0개
        //ABAB
        //A = 2개, B = 2개
        //"개수 ÷ 2"만큼 연속한 문장 : front (AB)
        //"개수 ÷ 2"만큼 연속한 문장의 반대 형태 : end(BA)
        //front + end = ABBA = 팰린드롬!
        //
        //대문자 글자의 개수가 홀수인 알파벳이 1개일 때
        //ABABCCC
        //A = 2개, B = 2개, C = 3개
        //"개수 ÷ 2"만큼 연속한 문장 : front (ABC)
        //홀수 알파벳 : mid(C)
        //"개수 ÷ 2"만큼 연속한 문장의 반대 형태 : end(CBA)
        //front + mid + end = ABCCCBA = 팰린드롬!
        //
        //대문자 글자의 개수가 홀수인 알파벳이 2개이상 일 때
        //AABBBCCC
        //A = 2개, B = 3개, C = 3개
        //"개수 ÷ 2"만큼 연속한 문장 : front (ABC)
        //홀수 알파벳 : mid(BC)
        //"개수 ÷ 2"만큼 연속한 문장의 반대 형태 : end(CBA)
        //front + mid + end = ABCBCCBA = 팰린드롬 X!
        // 즉.. 홀수개인 알파벳의 수가 2개 이상이라면 펠린드롬이 아니다

        int[] alpha = new int[26];
        for(int i=0; i<name.length(); i++) {
            int idx = name.charAt(i)-'A'; // A를 빼서 0 ~ 부터
            alpha[idx]++;
        }

        int OddCheck =0;
        for(int i=0; i<alpha.length; i++) {
            if(alpha[i]%2!=0) OddCheck++;
        }

        String answer ="";
        StringBuilder sb = new StringBuilder();
        // 홀수개의 알파벳 체크해서 2 이상이면 I'm sorry Hansoo 출력
        if(OddCheck>1) answer += "I'm Sorry Hansoo";
        else {
            for(int i=0; i<alpha.length; i++) {
                for(int r=0; r<alpha[i]/2; r++) {
                    sb.append((char)(i+65));
                }
            }
            answer += sb.toString();
            String end = sb.reverse().toString();

            sb = new StringBuilder();
            for(int i=0; i<alpha.length; i++) {
                if(alpha[i]%2==1) {
                    sb.append((char)(i+65));
                }
            }
            answer +=sb.toString()+end;
        }
        System.out.println(answer);


    }
}

