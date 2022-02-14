import java.util.Vector;

interface IStack<T>{
    T pop();
    boolean push(T ob);
}

class MyStack<T> implements IStack<T>{
    Vector<T> v;
    int count;

    public MyStack(){
        v = new Vector<>();
        count=0;
    }

    @Override
    public T pop() {
        if(count==0) return null;
        else{
            count--;
            return v.get(count);
        }
    }
    @Override
    public boolean push(T ob) {
        v.add(ob);
        count++;
        return true;
    }
}

public class Chapter7_09 {
    public static void main(String[] args) {
        IStack<Integer> stack = new MyStack<Integer>();
        for(int i=0; i<10; i++) stack.push(i);
        while(true){
            Integer n = stack.pop();
            if(n==null) break;
            System.out.print(n+" ");
        }
    }
}