import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> tree = new HashMap<String, Integer>();
        float count = 0; //전체 나무의 수
        String name = "";
        while(((name = br.readLine()) != null) && (name.length()>0)){

            if(!tree.containsKey(name)){
                tree.put(name, 1);
                count++;
            } else {
                tree.replace(name, tree.get(name)+1);
                count++;
            }
        }

        List<String> list = new ArrayList<>(tree.keySet()); // tree의 키로 list를 만든다

        Collections.sort(list);

        for(String key : list){
            float val = (tree.get(key)/count)*100;
            System.out.printf("%s %6.4f\n", key, val);
        }
    }
}