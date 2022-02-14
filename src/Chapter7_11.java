import java.util.Scanner;
import java.util.Vector;

class Nation{
    String country;
    String capital;

    public Nation(String country, String capital){
        this.country = country;
        this.capital = capital;
    }

}

public class Chapter7_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Nation> v = new Vector<>();
        Vector<String> vs = new Vector<>();
        System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
        boolean b = true;
        while(b){
            System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
            int n = sc.nextInt();
            switch (n){
                case 1:
                    System.out.println("현재 "+v.size()+"개 나라와 수도가 입력되어 있습니다.");
                    while(true){
                        System.out.print("나라와 수도 입력"+v.size()+">> ");
                        String s = sc.next();
                        if(s.equals("그만")){
                            break;
                        }
                        if(vs.contains(s)){
                            System.out.println(s+"은(는) 이미 있습니다!");
                            continue;
                        }
                        vs.add(s);
                        v.add(new Nation(s, sc.next()));
                    }
                    break;
                case 2:
                    while(true){
                        int i = (int)(Math.random()*v.size());
                        System.out.print(v.get(i).country+"의 수도는? ");
                        String c = sc.next();
                        if(c.equals("그만")) break;
                        if(c.equals(v.get(i).capital)) System.out.println("정답!!");
                        else System.out.println("아닙니다!");
                    }
                    break;
                case 3:
                    System.out.println("게임을 종료합니다.");
                    b=false;
                    break;
            }
        }
        sc.close();
    }
}
