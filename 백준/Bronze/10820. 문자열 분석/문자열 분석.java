import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String str;

        while ((str = br.readLine()) != null) {

            int lowerCase = 0;
            int upperCase = 0;
            int number = 0;
            int empty = 0;

            char[] arr = str.toCharArray();

            for (int i = 0; i < arr.length; i++) {
                char c = arr[i];

                if(Character.isLowerCase(c)) lowerCase++;
                if(Character.isUpperCase(c)) upperCase++;
                if(Character.isDigit(c)) number++;
                if(c == ' ') empty++;
            }

            sb.append(lowerCase + " " + upperCase + " " + number + " " + empty).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}