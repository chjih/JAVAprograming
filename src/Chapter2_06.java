import java.util.Scanner;

public class Chapter2_06 {
    public static void main(String[] args){
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("박수");
        if((n%10==3||n%10==6||n%10==9)||(n/10==3||n/10==6||n/10==9)){
            System.out.print("짝");
        } else{
            System.out.print("x");
        }
    }
}
