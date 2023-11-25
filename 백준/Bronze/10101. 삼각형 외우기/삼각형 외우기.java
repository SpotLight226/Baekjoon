import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        if (a + b + c != 180) { // 180 아니라면 error 밑에는 할 필요 없음
            System.out.print("Error");
        } else {
            if (a == 60 && b == 60 && c == 60) {
                System.out.print("Equilateral");
            } else if (a == b || b == c || c == a) {
                System.out.print("Isosceles");
            } else {
                System.out.print("Scalene");
            }
        }
    }
}