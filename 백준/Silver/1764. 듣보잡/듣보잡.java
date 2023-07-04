
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 듣도 못한 사람
        int m = Integer.parseInt(st.nextToken()); // 보도 못한 사람

        Map<String, Integer> map = new HashMap<>();
        while(n-->0){
            map.put(br.readLine(), 1);
        }
        while(m-->0){
            String name = br.readLine();
            if(map.containsKey(name)){
                map.put(name, map.get(name)+1);
            } else {
                map.put(name, 1);
            }
        }

        Set<String> set = map.keySet();
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        for(String key : set){
            int tmp = map.get(key);
            if(tmp == 2){
                count++;
                list.add(key);
            }
        }

        Collections.sort(list);
        System.out.println(count);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}


