
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();

        int sum = 0;
        int spyA = 0;
        int spyB = 0;

        for(int i = 0; i < 9; i++){
            list.add(Integer.parseInt(br.readLine()));
            sum += list.get(i); // 일단 합계에 모든 키를 합친다
        }
        br.close();
        Collections.sort(list);// 오름차순 정렬

        for(int i = 0; i < 8; i++){
            for( int j = i + 1; j < 9; j++){
                if(sum - list.get(i) - list.get(j) == 100){
                    spyA = list.get(i);
                    spyB = list.get(j);
                }
            }
        }

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == spyA || list.get(i) == spyB){
                continue;
            }
            System.out.println(list.get(i));
        }
    }
}

