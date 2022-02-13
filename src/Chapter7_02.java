import java.util.ArrayList;
import java.util.Scanner;

public class Chapter7_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        ArrayList<Character> ar = new ArrayList<>();
        double hap = 0.0;
        for(int i=0; i<6; i++){
            ar.add(sc.next().charAt(0));
        }
        for(int i=0;i<6; i++){
            switch (ar.get(i)){
                case 'A':
                    hap+=4.0;
                    break;
                case 'B':
                    hap+=3.0;
                    break;
                case 'C':
                    hap+=2.0;
                    break;
                case 'D':
                    hap+=1.0;
                    break;
                default:
                    break;
            }
        }
        System.out.println(hap/6);
        sc.close();
    }
}
