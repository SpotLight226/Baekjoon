import java.io.*;
import java.util.*;

class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        br.close();

        List<Integer> list = new ArrayList<>();
        List<Integer> copy = new ArrayList<>();

        int max = 0;
        for (int i = n; i >= 0; i--) {
            list.add(n);
            list.add(i);

            while (true) {
                int temp = list.get(list.size() - 2) - list.get(list.size() - 1);
                if(temp < 0) break;
                else list.add(temp);
            }

            if (max < list.size()) {
                max = list.size();
                copy.clear();
                copy.addAll(list);
            }
            list.clear();
        }

        sb.append(max).append("\n");
        for (int i : copy) {
            sb.append(i).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}





