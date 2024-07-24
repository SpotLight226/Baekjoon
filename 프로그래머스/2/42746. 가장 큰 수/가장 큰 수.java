import java.util.*;

class Solution {
    public String solution(int[] numbers) {
       StringBuilder sb = new StringBuilder();
        String[] arr = new String[numbers.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                while (true) {
                    if (o1.length() == o2.length()) { // 길이가 같을 때
                        return o2.compareTo(o1);
                    }

                    if (o1.length() < o2.length()) {
                        for (int i = 0; i < o1.length(); i++) {
                            if (o1.charAt(i) != o2.charAt(i)) {
                                return o2.substring(i, i + 1).compareTo(o1.substring(i, i + 1));
                            }
                        }
                        o2 = o2.substring(o1.length());
                    }

                    if (o1.length() > o2.length()) {
                        for (int i = 0; i < o2.length(); i++) {
                            if (o1.charAt(i) != o2.charAt(i)) {
                                return o2.substring(i, i + 1).compareTo(o1.substring(i, i + 1));
                            }
                        }
                        o1 = o1.substring(o2.length());
                    }
                }
            }
        };

        Arrays.sort(arr, com);

        for (String str : arr) {
            sb.append(str);
        }

        return sb.substring(0, 1).equals("0") ? "0" : String.valueOf(sb);
    }
}