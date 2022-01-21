import java.util.Scanner;

public class Chapter2_05 {
    public static void main(String[] args){
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 3개 입력>>");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if(a>b&&a>c){
            System.out.println("삼각형이 " + ((a<(b+c))?"됩니다.":"안됩니다."));
        }
        if(b>a&&b>c){
            System.out.println("삼각형이 " + ((b<(a+c))?"됩니다.":"안됩니다."));
        }
        if(c>b&&c>a){
            System.out.println("삼각형이 " + ((c<(a+b))?"됩니다.":"안됩니다."));
        }
    }
}
