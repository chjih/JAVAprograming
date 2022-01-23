import java.util.Scanner;

class Day{
    private String work; //하루의 할 일을 나타내는 문자열
    public void set(String work){
        this.work = work;
    }
    public String get(){return work;}
    public void show(){
        if(work==null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
}

class MonthSchedule{
    private Day[] schedule;

    public MonthSchedule(int n){
        schedule = new Day[n+1];
        //배열의 길이 만큼 객체 생성
        for(int i=0; i<=n; i++){
            schedule[i] = new Day();
        }
    }

    public void input(int date, String work){
        schedule[date].set(work);
    }
    public void view(int date){
        System.out.print(date+"의 할일은 ");
        schedule[date].show();
    }
    public void finish(){
        System.out.println("프로그램을 종료합니다.");
    }
    public void run(){
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
            n = scanner.nextInt();
            switch (n){
                case 1:
                    System.out.print("날짜(1~30)?");
                    int date = scanner.nextInt();
                    System.out.print("할일(빈칸없이입력)?");
                    String work = scanner.next();
                    this.input(date, work);
                    break;
                case 2:
                    System.out.print("날짜(1~30)?");
                    date = scanner.nextInt();
                    this.view(date);
                    break;
                case 3:
                    this.finish();
                    break;
                default:
            }
            System.out.println("\n\n");
        }while(n!=3);

    }
}

public class Chapter4_07 {
    public static void main(String[] args) {
        System.out.println("이번달 스케쥴 관리 프로그램.");
        MonthSchedule april = new MonthSchedule(30);
        april.run();
    }
}
