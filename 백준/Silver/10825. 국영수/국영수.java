
import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        ArrayList<Member> members = new ArrayList<>();

        while(n --> 0){
            st = new StringTokenizer(br.readLine());
            // 각 입력 라인을 나누어서
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            // member 객체를 만들고
            Member member = new Member(name, kor, eng, math);
            // members List 에 넣는다
            members.add(member);
        }

        Collections.sort(members, ((o1, o2) -> {

            if(o1.getKor() < o2.getKor()){
                return 1;
            } else if(o1.getKor() > o2.getKor()){
                return -1;
            } else {
                if(o1.getEng() < o2.getEng()){
                    return -1;
                } else if(o1.getEng() > o2.getEng()) {
                    return 1;
                } else {
                    if(o1.getMath() < o2.getMath()){
                        return 1;
                    } else if(o1.getMath() > o2.getMath()) {
                        return -1;
                    } else {
                        return o1.getName().compareTo(o2.getName());
                    }
                }
            }

        }));

        for(int i = 0; i < members.size(); i++){
            System.out.println(members.get(i).getName());
        }
    }
}

// 멤버 객체
class Member {
    private String name;
    private int kor;
    private int eng;
    private int math;

    public Member(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

}
