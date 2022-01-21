import java.util.Scanner;

public class Chapter2_03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int money = scanner.nextInt();
        int[] nm;
        int n;
        nm = change(money,50000);
        money = nm[1];
        n = nm[0];
        System.out.println("오만원권"+ n +"매");
        nm = change(money,10000);
        money = nm[1];
        n = nm[0];
        System.out.println("만원권"+ n +"매");
        nm = change(money,5000);
        money = nm[1];
        n = nm[0];
        System.out.println("오천원권"+ n +"매");
        nm = change(money,1000);
        money = nm[1];
        n = nm[0];
        System.out.println("천원권"+ n +"매");
        nm = change(money,500);
        money = nm[1];
        n = nm[0];
        System.out.println("오백원권"+ n +"매");
        nm = change(money,100);
        money = nm[1];
        n = nm[0];
        System.out.println("백원권"+ n +"개");
        nm = change(money,50);
        money = nm[1];
        n = nm[0];
        System.out.println("오십원권"+ n +"개");
        nm = change(money,10);
        money = nm[1];
        n = nm[0];
        System.out.println("십원권"+ n +"개");
        nm = change(money,1);
        money = nm[1];
        n = nm[0];
        System.out.println("일원권"+ n +"개");
        scanner.close();
    }

    private static int[] change(int money, int m){
        int n;
        int[] nm = new int[2];
        n = money/m;
        money-=n*m;
        nm[0]=n;
        nm[1]=money;
        return nm;
    }
}
