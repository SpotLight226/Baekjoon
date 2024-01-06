import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[][] arr = new String[N][5];  //N개의 행, 5 개열 2차원 배열
        int[] max = new int[N]; //각 행의 1의 자리의 최대값을 저장할 배열

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            arr[i] = str.split(" ");

            int sum = 0;    //현재 1의 자리 최댓값
            int temp;       //현재 숫자의 합

            for (int j = 0; j < 3; j++) {
                for (int k = j + 1; k < 4; k++) {
                    for (int l = k + 1; l < 5; l++) {
                        temp = Integer.parseInt(arr[i][j]) + Integer.parseInt(arr[i][k]) + Integer.parseInt(arr[i][l]);
                        if (sum <= temp % 10)   //1의 자리 비교를 위해 10으로 나눈 나머지
                            sum = temp % 10;
                    }
                }
            }
            max[i] = sum;
        }

        int maxIndex = 0;
        int result = max[0];

        for (int i = 0; i < max.length; i++) {
            if (max[i] >= result) {
                result = max[i];
                maxIndex = i + 1;
            }
        }

        System.out.println(maxIndex);

    }

}
