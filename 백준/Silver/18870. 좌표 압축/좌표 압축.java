
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> sortList = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreElements()){
            int tmp = Integer.parseInt(st.nextToken());
            list.add(tmp);
            sortList.add(tmp);
        }

        Collections.sort(sortList);

        int order = 0;
        for(int key : sortList){
            if(!map.containsKey(key)){
                map.put(key, order);
                order++;
            }
        }

        for(int key : list){
            sb.append(map.get(key)).append(" ");
        }

        System.out.println(sb);
    }
}



