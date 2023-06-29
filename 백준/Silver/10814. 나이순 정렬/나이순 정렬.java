
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Member implements Comparable<Member> { // 멤버객체
    private int age;
    private String name;

    public Member(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Member m) {
        return Integer.compare(this.age, m.age);
    }
}


public class Main {
    static ArrayList<Member> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        list = new ArrayList<>(); // 멤버 객체를 저장할 list

        while (n-- > 0) {

            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            // 새로운 멤버 객체를 생성하여 list 에 넣는다
            list.add(new Member(age, name));
        }

        Collections.sort(list);

        for (Member m : list) {
            System.out.println(m.getAge() + " " + m.getName());
        }
    }

}


