class Point{
    private int x, y;
    public Point(int x, int y){
        this.x = x; this.y = y;
    }
    public int getX(){return x;}
    public int getY(){return y;}
    protected void move(int x, int y){this.x = x; this.y = y;}
}

class ColorPoint extends Point{
    private String color="BLACK";
    public ColorPoint(){
        super(0,0);
    }
    public ColorPoint(int x, int y){
        super(x,y);
    }
    public void setXY(int x, int y){
        super.move(x, y);
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        return color+"색의 ("+super.getX()+","+getY()+")의 점";
    }
}
public class Chapter5_06 {
    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint();
        System.out.println(zeroPoint.toString()+"입니다.");

        ColorPoint cp = new ColorPoint(10, 10);
        cp.setXY(5,5);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str+"입니다.");
    }
}
