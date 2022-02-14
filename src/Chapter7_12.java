import java.util.*;


public class Chapter7_12 {
    private static HashMap<String, String> list = new HashMap<>();
    private static ArrayList<String> en = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void run(){
        boolean b = true;
        System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다.");
        while(b){
            System.out.print("단어테스트:1, 단어 삽입:2, 종료:3>> ");
            int n = sc.nextInt();
            switch (n){
                case 1:
                    test();
                    break;
                case 2:
                    input();
                    break;
                case 3:
                    b=false;
                    System.out.println("\"명품영어\"를 종료합니다.");
                    break;
            }
            System.out.println();
        }
    }

    public static void test(){
        System.out.println("현재 "+list.size()+"개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다.");
        if(list.size()<4) {
            System.out.println("단어가 부족합니다.");
            return;
        }
        else{
            while(true){
                int n = (int)(Math.random()*list.size());
                boolean b=false;
                System.out.println(en.get(n)+"?");
                int[] ar = new int[4];
                int aa=0;
                for(int i=0; i<4; i++){
                    int a = (int)(Math.random()*list.size());
                    int j;
                    //중복 확인
                    for(j=0; j<i; j++){
                        if(a==ar[j]){
                            break;
                        }
                    }
                    if(j==i){
                        if(a==n){
                            b = true;
                            aa = i;
                        }
                        ar[i]=a;
                        continue;
                    }
                    i--;
                }
                if(!b){
                    aa = (int)(Math.random()*4);
                    ar[aa]=n;
                }
                for(int i=0; i<4; i++){
                    System.out.print("("+(i+1)+")"+list.get(en.get(ar[i]))+" ");
                }
                System.out.print(":>");
                try{
                    int s = sc.nextInt();
                    if(s==-1) return;
                    if((aa+1)==s) System.out.println("Excellent !!");
                    else System.out.println("No. !!");
                }
                catch (InputMismatchException e){
                    sc.nextLine();
                    System.out.println("숫자를 입력해주세요 !!");
                }
            }

        }
    }
    public static void input(){
        System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
        while(true){
            System.out.print("영어 한글 입력 >> ");
            String s = sc.next();
            if(s.equals("그만")){
                return;
            }
            en.add(s);
            list.put(s, sc.next());
        }
    }
    public static void main(String[] args) {
        Chapter7_12 c = new Chapter7_12();
        c.run();
    }
}
