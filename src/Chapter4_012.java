import java.util.Scanner;

class Seat{
    private String name;
    public void input(String name){
        this.name = name;
    }
    public void cancel(){
        this.name = null;
    }
    public String view(){
        if(name == null)
            return "---";
        else
            return name;
    }
}

class A{
    private Seat[] ASeats = new Seat[10];
    public A(){
        //객체 자리 할당
        for(int i=0; i<10;i++){
            ASeats[i] = new Seat();
        }
    }
    public void view(){
        for(int i=0; i<10;i++){
            System.out.print(ASeats[i].view());
            System.out.print(" ");
        }
        System.out.println("");
    }
    public void cancel(){
        Scanner scanner = new Scanner(System.in);
        boolean exist = false;
        String name;
        while(!exist){
            System.out.print("이름>>");
            name = scanner.next();
            for(int i=0; i<10; i++){
                if(ASeats[i].view().equals(name)){
                    ASeats[i].cancel();
                    exist = true;
                    break;
                }
            }
            if(exist == false){
                System.out.println("없는 이름입니다. 다시 입력해주세요.");
            }
        }
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름>>");
        String name = scanner.next();
        while(true){
            System.out.print("번호>>");
            int n = scanner.nextInt();
            if(ASeats[n-1].view().equals("---")){
                ASeats[n-1].input(name);
                break;
            }
            else{
                System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택해주세요");
            }
        }

    }
    public void run(int n){
        this.view();
        if(n==1){
            this.input();
        }
        else{
            this.cancel();
        }
    }
}

class B{
    private Seat[] BSeats = new Seat[10];
    public B(){
        //객체 자리 할당
        for(int i=0; i<10;i++){
            BSeats[i] = new Seat();
        }
    }
    public void view(){
        for(int i=0; i<10;i++){
            System.out.print(BSeats[i].view());
            System.out.print(" ");
        }
        System.out.println("");
    }
    public void cancel(){
        Scanner scanner = new Scanner(System.in);
        boolean exist = false;
        String name;
        while(!exist){
            System.out.print("이름>>");
            name = scanner.next();
            for(int i=0; i<10; i++){
                if(BSeats[i].view().equals(name)){
                    BSeats[i].cancel();
                    exist = true;
                    break;
                }
            }
            if(exist == false){
                System.out.println("없는 이름입니다. 다시 입력해주세요.");
            }
        }
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름>>");
        String name = scanner.next();
        while(true){
            System.out.print("번호>>");
            int n = scanner.nextInt();
            if(BSeats[n-1].view().equals("---")){
                BSeats[n-1].input(name);
                break;
            }
            else{
                System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택해주세요");
            }
        }

    }
    public void run(int n){
        this.view();
        if(n==1){
            this.input();
        }
        else{
            this.cancel();
        }
    }
}

class S{
    private Seat[] SSeats = new Seat[10];
    public S(){
        //객체 자리 할당
        for(int i=0; i<10;i++){
            SSeats[i] = new Seat();
        }
    }
    public void view(){
        for(int i=0; i<10;i++){
            System.out.print(SSeats[i].view());
            System.out.print(" ");
        }
        System.out.println("");
    }
    public void cancel(){
        Scanner scanner = new Scanner(System.in);
        boolean exist = false;
        String name;
        while(!exist){
            System.out.print("이름>>");
            name = scanner.next();
            for(int i=0; i<10; i++){
                if(SSeats[i].view().equals(name)){
                    SSeats[i].cancel();
                    exist = true;
                    break;
                }
            }
            if(exist == false){
                System.out.println("없는 이름입니다. 다시 입력해주세요.");
            }
        }
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름>>");
        String name = scanner.next();
        while(true){
            System.out.print("번호>>");
            int n = scanner.nextInt();
            if(SSeats[n-1].view().equals("---")){
                SSeats[n-1].input(name);
                break;
            }
            else{
                System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택해주세요");
            }
        }

    }
    public void run(int n){
        this.view();
        if(n==1){
            this.input();
        }
        else{
            this.cancel();
        }
    }
}

public class Chapter4_012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        A Aseat = new A();
        B Bseat = new B();
        S Sseat = new S();

        System.out.println("명품콘서트홀 예약 시스템입니다.");
        int n=0, n2;
        while(true){
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            n = scanner.nextInt();
            if(n==4){
                break;
            }
            if(n==2){
                Aseat.view();
                Bseat.view();
                Sseat.view();
                System.out.println("<<<조회를 완료하였습니다.>>>");
            }
            else{
                System.out.print("좌석구분 S(1), A(2), B(3)>>");
                n2 = scanner.nextInt();
                switch(n2){
                    case 1:
                        Aseat.run(n);
                        break;
                    case 2:
                        Bseat.run(n);
                        break;
                    case 3:
                        Sseat.run(n);
                        break;
                    default:
                        break;
                }
            }
        }

    }
}
