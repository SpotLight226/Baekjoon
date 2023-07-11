
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        ArrayList<String> list = new ArrayList<>();
        while(n --> 0){
            list.add(br.readLine());
        }

        list.sort((o1,o2) -> {
            if(o1.length() == o2.length()){
                return o1.compareTo(o2);
            }
            return o1.length() - o2.length();
        });

        sb.append(list.get(0)).append("\n");
        for(int i = 1; i < list.size(); i++){
            if(!list.get(i).equals(list.get(i-1))){
                sb.append(list.get(i)).append("\n");
            }
        }
        System.out.println(sb);
    }
}



