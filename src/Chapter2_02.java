import java.util.Scanner;

public class Chapter2_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("2자리수 정수 입력(10~99)>>");
        int n = scanner.nextInt();

        System.out.println(((n/10)==(n%10))?"Yes! 10d의 자리와 1의자리가 같습니다.":"No! 10d의 자리와 1의자리가 같지 않습니다.");
    }
}
