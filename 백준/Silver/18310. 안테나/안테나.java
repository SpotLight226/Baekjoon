import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 집 수

        List<Integer> house = new ArrayList<>(); // 집 리스트

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            house.add(Integer.parseInt(st.nextToken()));
        }
        // 집을 오름차순으로 정렬한 뒤에 안테나를 중간값에 설치
        // 안테나가 좌, 우로  이동할 때 좌, 우측에 있는 집 만큼 거리가 +- 되기 때문에

        Collections.sort(house); // 집들을 오름차순으로 정렬

        if (N % 2 == 0) {
            System.out.println(house.get(N/2-1));
        } else {
            System.out.println(house.get(N/2));
        }

    }
}

