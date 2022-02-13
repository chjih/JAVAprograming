import java.util.*;

class Location {
    int la;
    int lo;

    public Location(int la, int lo) {
        this.la = la;
        this.lo = lo;
    }

    public String print() {
        return " " + la + " " + lo;
    }
}

public class Chapter7_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Location> hm = new HashMap<>();
        ArrayList<String> ar = new ArrayList<>();
        System.out.println("도시,경도,위도를 입력하세요.");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            StringTokenizer st = new StringTokenizer(sc.nextLine(), ", ");
            String s = st.nextToken();
            hm.put(s, new Location(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
            ar.add(s);
        }
        System.out.println("---------------------------");
        Iterator<String> it = ar.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s+hm.get(s).print());
        }
        System.out.println("---------------------------");
        while(true){
            System.out.print("도시 이름 >> ");
            String s = sc.next();
            if(s.equals("그만")) break;
            if(hm.get(s)!=null){
                System.out.println(s+hm.get(s).print());
            } else{
                System.out.println(s+"는 없습니다.");
            }
        }
        sc.close();
    }
}
