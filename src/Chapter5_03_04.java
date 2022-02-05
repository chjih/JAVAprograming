import java.util.Scanner;
abstract class Converter {
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
        System.out.print(getSrcString()+"을 입력하세요>> ");
        double val = sc.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: "+res+getDestString()+"입니다.");
        sc.close();
    }
}

class Won2Dollar extends Converter{
    public Won2Dollar(double won){
        super.ratio = won;
    }
    @Override
    protected double convert(double val) {
        return val/super.ratio;
    }

    @Override
    protected String getSrcString() {
        return "원";
    }

    @Override
    protected String getDestString() {
        return "달러";
    }
}
class Km2Mile extends Converter{
    public Km2Mile(double ratio){
        super.ratio = ratio;
    }
    @Override
    protected double convert(double val) {
        return val/super.ratio;
    }

    @Override
    protected String getSrcString() {
        return "km";
    }

    @Override
    protected String getDestString() {
        return "mile";
    }
}
public class Chapter5_03_04 {
    public static void main(String[] args) {
        Km2Mile toMile = new Km2Mile(1.6);
        toMile.run();
    }
}
