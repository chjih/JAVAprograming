import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Chapter7_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        System.out.print("정수(-1이 입력될 때까지)>> ");
        while(true){
            int n = sc.nextInt();
            if(n==-1) break;
            v.add(n);
        }
        Collections.sort(v);
        System.out.print("가장 큰 수는 ");
        System.out.println(v.get(v.size()-1));
        sc.close();
    }
}
