import java.util.Scanner;

public class Chapter3_04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        String n = scanner.next();
        char c = n.charAt(0);
        int num = (int)c;
        for(int i=num; i>=(int)'a' ; i--){
            for(int j=(int)'a';j<=i; j++){
                System.out.print((char)j);
            }
            System.out.println("");
        }


    }

}
