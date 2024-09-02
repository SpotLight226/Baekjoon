import java.util.Scanner;

public class Main {

    private static String findLongestDecreasigSuffix(String s) {
        /* Your code should return the longest decreasing suffix of the string "s". */

        /* ------------------- INSERT CODE HERE ---------------------*/
        char[] arr = s.toCharArray();
        int len = arr.length;

        int start = len - 1;

        for (int j = len - 2; j >= 0; j--) {
            if (arr[j] > arr[j + 1]) {
                start = j;
            } else {
                break;
            }
        }
        /* -------------------- END OF INSERTION --------------------*/
        return s.substring(start);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCases = sc.nextInt();

        for(int i = 0; i < numCases; i++)
        {
            String s = sc.next();
            System.out.println("The longest decreasing suffix of " + s + " is " + findLongestDecreasigSuffix(s));
        }
    }
}
