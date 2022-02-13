import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student{
    String name;
    String department;
    int cey;
    double average;

    public Student(String name, String department, int cey, double average){
        this.name = name;
        this.department = department;
        this.cey = cey;
        this.average = average;
    }
    public void print(){
        System.out.println("이름:"+name);
        System.out.println("학과:"+department);
        System.out.println("학번:"+cey);
        System.out.println("학점평균:"+average);
    }
    public void get(){
        System.out.println(name+", "+department+", "+cey+", "+average);
    }

    public boolean compare(String s) {
        if(s.equals(this.name)){
            return true;
        } else return false;
    }
}

public class Chapter7_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
        ArrayList<Student> ar = new ArrayList<>();
        for(int i=0; i<4; i++){
            System.out.print(">> ");
            StringTokenizer st = new StringTokenizer(sc.nextLine(), ", ");
            ar.add(new Student(st.nextToken(), st.nextToken(),
                    Integer.parseInt(st.nextToken()), Double.parseDouble(st.nextToken())));
        }
        System.out.println("---------------------------");
        for(int i=0; i<4; i++){
            ar.get(i).print();
            System.out.println("---------------------------");
        }
        while(true){
            System.out.print("학생 이름 >> ");
            String s = sc.next();
            if(s.equals("그만")) break;
            for(int i=0;i<4; i++){
                if(ar.get(i).compare(s)){
                    ar.get(i).get();
                    break;
                }
            }
        }
        sc.close();
    }
}
