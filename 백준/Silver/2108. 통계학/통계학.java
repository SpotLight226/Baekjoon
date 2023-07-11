
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

class Main {
    static ArrayList<Integer> list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

         list = new ArrayList<>();
        while(n --> 0){
            list.add(Integer.parseInt(br.readLine()));
        }

        bw.write(average(list) + "\n");
        bw.write(midValue(list) + "\n");
        bw.write(mode(list) + "\n");
        bw.write(range(list) + "\n");
        bw.flush();
        bw.close();
    }

    // 평균
    static int average(ArrayList<Integer> list){
        int avg = (int) Math.round(list.stream().mapToInt(Integer::intValue).average().getAsDouble());
        return avg;
    }
    // 중간 값
    static int midValue(ArrayList<Integer> list){
        int mid = list.stream().mapToInt(Integer::intValue).sorted().skip(list.size()/2).findFirst().getAsInt();
        return mid;
    }
    // 최빈 값
    static int mode(ArrayList<Integer> list) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i))) {
                map.put(list.get(i), map.get(list.get(i)) + 1);
            } else {
                map.put(list.get(i), 1);
            }
        }

        int maxValue = Collections.max(map.values());
        ArrayList<Integer> mode = new ArrayList<>();
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == maxValue) {
                mode.add(m.getKey());
            }
        }

        IntStream modeStream = mode.stream().mapToInt(Integer::intValue).sorted();
        if(mode.size() > 1){
            return modeStream.skip(1).findFirst().getAsInt();
        } else {
            return modeStream.findFirst().getAsInt();
        }
    }

    static int range(ArrayList<Integer> list){
        int minValue = list.stream().mapToInt(Integer::intValue).sorted().findFirst().getAsInt();
        int maxValue = list.stream().mapToInt(Integer::intValue).max().getAsInt();

        return maxValue - minValue;
    }
}



