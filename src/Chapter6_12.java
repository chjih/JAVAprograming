import java.util.Scanner;

class PersonGambling{
    private String name;
    public PersonGambling(String name){
        this.name=name;
    }
    public boolean run(){
        System.out.print("["+name+"]:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a=(int)(Math.random()*3+1),b=(int)(Math.random()*3+1),c=(int)(Math.random()*3+1);
        System.out.println("    "+a+"  "+b+"  "+c+"  "+((a==b&&b==c)?(name+"님이 이겼습니다!"):"아쉽군요!"));
        if(a==b&&b==c) return true;
        else return false;
    }
}

public class Chapter6_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("갬블링 게임에 참여할 선수 숫자>>");
        int n = sc.nextInt();
        PersonGambling[] ar = new PersonGambling[n];
        for(int i=0; i<n; i++){
            System.out.print((i+1)+"번째 선수 이름>>");
            ar[i]=new PersonGambling(sc.next());
        }
        while(true){
            int i;
            for(i=0; i<n; i++){
                if(ar[i].run()) break;
            }
            if(i!=n) break;
        }
    }
}