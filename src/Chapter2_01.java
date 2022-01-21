import java.util.Scanner;

public class Chapter2_01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("원화를 입력하세요(단위 원)>>");
        int money = scanner.nextInt();
        System.out.println(money+"원은 $"+money/(double)1100+"입니다.");

        scanner.close();
    }
}
