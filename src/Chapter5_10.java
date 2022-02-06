abstract class PairMap{
    protected String keyArray[];
    protected String valueArray[];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}

class Dictionary extends PairMap{
    private int l=0;
    public Dictionary(int n){
        keyArray = new String[n];
        valueArray = new String[n];
    }
    @Override
    String get(String key) {
        int i=0;
        for(String Key : keyArray){
            if(key.equals(Key))
                return valueArray[i];
            i++;
        }
        return null;
    }

    @Override
    void put(String key, String value) {
        int i;
        for(i=0; i<l; i++){
            if(key.equals(keyArray[i])){
                valueArray[i]=value;
                break;
            }
        }
        if(i==l){
            keyArray[l]=key;
            valueArray[l]=value;
        }
        l++;
    }

    @Override
    String delete(String key) {
        for(int i=0; i<l; i++){
            if(key.equals(keyArray[i])){
                keyArray[i]=null;
                String s = valueArray[i];
                valueArray[i]=null;
                return s;
            }
        }
        return null;
    }

    @Override
    int length() {
        return l;
    }
}
public class Chapter5_10 {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이썬");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
    }
}
