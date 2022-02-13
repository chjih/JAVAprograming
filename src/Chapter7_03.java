import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Chapter7_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> nations = new HashMap<>();
        System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
        while(true){
            System.out.print("나라 이름, 인구 >> ");
            String s = sc.next();
            if(s.equals("그만")) break;
            nations.put(s, sc.nextInt());
        }
        while(true){
            System.out.print("인구 검색 >> ");
            String s = sc.next();
            if(s.equals("그만")) break;
            if(nations.get(s)!=null){
                int v = nations.get(s);
                System.out.println(s+"의 인구는 "+v);
            }
            else{
                System.out.println(s+" 나라는 없습니다.");
            }
        }
        sc.close();
    }
}
