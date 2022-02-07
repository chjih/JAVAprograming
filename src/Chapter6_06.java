import java.util.Calendar;
import java.util.Scanner;

class Person{
    private String name;
    private int gap;
    public Person(String name){
        this.name=name;
    }
    public int run(){
        System.out.print(name+" 시작 <Enter>키>>");
        Scanner sc = new Scanner(System.in);
        String enter = sc.nextLine();
        if(enter.equals("")){
            int start = Calendar.getInstance().get(Calendar.SECOND);
            int end=0;
            System.out.println("    현재 초 시간 = "+ start);
            System.out.print("10초 예상 후 <Enter>키>>");
            enter = sc.nextLine();
            if(enter.equals("")){
                end = Calendar.getInstance().get(Calendar.SECOND);
                System.out.println("    현재 초 시간 = "+ end);
            }
            gap=(end-start>0)?end-start:end-start+60;
        }
        return gap;
    }
}
public class Chapter6_06 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Person hawng = new Person("황기태");
        Person lee = new Person("이재문");
        int a = hawng.run();
        int b = lee.run();
        System.out.println("황기태의 결과 "+a+", 이재문의 결과 "+b+", 승자는 "+((Math.abs(a-10)>Math.abs(b-10))?"이재문":"황기태"));
    }
}