
public class Main {

    public static void main(String[] args) {

        boolean[] check = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            if (check[i] == false) {
                System.out.println(i);
            }

            int tmp = i;
            int sum = i;
            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            if (sum > 10000) {
                continue;
            } else {
                check[sum] = true;
            }
        }


    }
}

