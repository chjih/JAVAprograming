class Seat{
    private String name;
    public void input(String name){
        this.name = name;
    }
    public void cancel(){
        this.name = null;
    }
    public void view(){
        if(name == null)
            System.out.print("---");
        else
            System.out.print(name);
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
    public void run(int n){
        if(n==1){
            System.out.println();
        }
    }
}

public class Chapter4_012 {
    public static void main(String[] args) {
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        System.out.println("");
    }
}
