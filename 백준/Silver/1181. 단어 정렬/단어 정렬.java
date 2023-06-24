
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];

        for(int i = 0; i < n; i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 단어 길이가 같을 때
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                // 그 외
                  else {
                    return o1.length() - o2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        // 첫 단어 sb에 입력
        sb.append(arr[0]).append("\n");

        // 앞의 단어와 뒤의 단어가 같다면 입력 X.
        for(int i = 1; i < n; i++){
            // 앞의 단어와 다를 때만 입력한다
            if(!arr[i].equals(arr[i-1])){
                sb.append(arr[i]).append("\n");
            }
        }

        System.out.println(sb);

    }

}

