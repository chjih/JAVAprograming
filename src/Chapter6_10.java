import java.util.Scanner;

class Person_gambling{
    private String name;
    public Person_gambling(String name){
        this.name = name;
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

public class Chapter6_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1번째 선수 이름>>");
        Person_gambling first = new Person_gambling(sc.next());
        System.out.print("2번째 선수 이름>>");
        Person_gambling second = new Person_gambling(sc.next());
        while(true){
            if(first.run()) break;
            if(second.run()) break;
        }
        sc.close();
    }
}
