import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String col = "> is acceptable.\n"; // 완벽
        String not = "> is not acceptable.\n"; // 불완벽

        while (true) {
            String str = br.readLine(); // 입력 비밀번호

            if(str.equals("end")) break; // end 입력 시 끝

            sb.append("<").append(str); // 출력 문장 처음

            if (!isGood(str)) {
                sb.append(not);
            } else {
                sb.append(col);
            }
        }

        br.close();
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();

    }

    static boolean isGood(String str) {
        char[] arr = str.toCharArray();
        List<Character> list = new ArrayList<>();
        // contain 을 쓸 수 있게 list 에 넣기
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        // 모음 확인
        if(!containsVowel(list)) return false;

        // 모음, 자음이 3개 연속으로 오는지 확인
        for (int i = 2; i < arr.length; i++) {

            // 2부터 시작해서 0, 1 , 2 를 확인하면서 나아간다
            // 모음
            if (isVowel(arr[i])) {
                if (isVowel(arr[i - 1]) && isVowel(arr[i - 2])) {
                    return false;
                }
                // 자음
            } else {
                if (!isVowel(arr[i - 1]) && !isVowel(arr[i - 2])) {
                    return false;
                }
            }
        }

        // ee, oo 가 아닌 연속 2개의 모음이 오는 지 확인
        for (int i = 1; i < arr.length; i++) {
            // 앞뒤 2개의 문자가 같다면
            if (arr[i] == arr[i - 1]) {
                // e, o 가 아니라면
                if (arr[i] != 'e' && arr[i] != 'o') {
                    return false;
                }
            }
        }
        return true;

    }

    // 모음 포함 확인
    static boolean containsVowel(List<Character> List) {
        return (List.contains('a') || List.contains('e') || List.contains('i') || List.contains('o') || List.contains('u'));
    }

    // 모음인지 확인
    static boolean isVowel(Character c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }



}





