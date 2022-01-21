import java.util.Scanner;

public class Chapter2_04 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 3개 입력>>");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if(a>b){
            if(a<c)
                System.out.println("중간 값은 "+a);
            else{
                if(c>b)
                    System.out.println("중간 값은 "+c);
            }
        }
        else{
            if(b<c)
                System.out.println("중간 값은 "+b);
            else{
                if(c>a)
                    System.out.println("중간 값은 "+c);
            }
        }
        scanner.close();
    }
}
