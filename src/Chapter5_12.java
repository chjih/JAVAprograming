import java.util.Scanner;

abstract class Shape{
    private Shape next;
    public Shape() {next = null;}
    public void setNext(Shape obj) {next = obj;}
    public Shape getNext(){return next;}
    public abstract void draw();
}

class Line extends Shape{
    public void draw(){
        System.out.println("Line");
    }
}

class Rect extends Shape{
    public void draw(){
        System.out.println("Rect");
    }
}

class Circle extends Shape{
    public void draw(){
        System.out.println("Circle");
    }
}

public class Chapter5_12 {
    public static void main(String[] args) {
        Shape head=null;
        Shape tail=null;
        Scanner sc = new Scanner(System.in);
        int a,b;
        Shape cur = null;
        System.out.println("그래픽 에디터 beauty를 실행합니다.");
        while(true){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            a = sc.nextInt();
            if(a==4){
                System.out.println("beauty을 종료합니다.");
                break;
            }
            else if(a==1){
                System.out.print("Line(1), Rect(2), Circle(3)>>");
                b=sc.nextInt();
                switch(b){
                    case 1:
                        cur=new Line();
                        break;
                    case 2:
                        cur=new Rect();
                        break;
                    case 3:
                        cur=new Circle();
                        break;
                    default:
                        break;
                }
                if(head==null){
                    head = cur;
                    tail = head;
                } else{
                    tail.setNext(cur);
                    tail = cur;
                }
            }
            else if(a==2){
                System.out.print("삭제할 도형의 위치>>");
                b = sc.nextInt();
                if(b==1){
                    if(head==tail){
                        head=null;
                        tail=null;
                    }
                    else{
                        head=head.getNext();
                    }
                }
                else{
                    Shape c = head;
                    Shape r=null;
                    int i;
                    for(i=1; i<b; i++){
                        r = c;
                        c = c.getNext();
                        if(c==null){
                            System.out.println("삭제할 수 없습니다.");
                            break;
                        }
                    }
                    if(i==b){
                        r.setNext(c.getNext());
                    }
                }
            }
            else if(a==3){
                Shape c = head;
                while(true){
                    c.draw();
                    c = c.getNext();
                    if(c==null) break;
                }
            }
        }

    }
}
