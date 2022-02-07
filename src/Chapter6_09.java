import java.util.Scanner;

public class Chapter6_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
            int n = sc.nextInt();
            if(n==4) break;
            int r = (int)(Math.random()*3+1);
            System.out.print("철수");
            switch (n){
                case 1:
                    System.out.print("(가위)");
                    break;
                case 2:
                    System.out.print("(바위)");
                    break;
                case 3:
                    System.out.print("(보)");
                    break;
            }
            System.out.print(" : 컴퓨터");
            switch (r){
                case 1:
                    System.out.println("(가위)");
                    break;
                case 2:
                    System.out.println("(바위)");
                    break;
                case 3:
                    System.out.println("(보)");
                    break;
            }
            if(n==r) System.out.println("비겼습니다.");
            else if((n==1&&r==3)||(n==2&&r==1)||(n==3&&r==2)) System.out.println("철수가 이겼습니다.");
            else System.out.println("컴퓨터가 이겼습니다.");
        }
        sc.close();
    }
}
