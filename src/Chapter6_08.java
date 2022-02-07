import java.util.Scanner;

public class Chapter6_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
        String s = sc.nextLine();
        for(int i=1; i<s.length(); i++){
            String a = s.substring(i)+s.substring(0,i);
            System.out.println(a);
        }
        System.out.println(s);
        sc.close();
    }
}
