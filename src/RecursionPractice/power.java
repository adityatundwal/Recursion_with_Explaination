package RecursionPractice;

public class power {

    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        System.out.println(powe(a,b));
    }

    private static int powe(int a, int b) {
        if(b==0){
            return 1;
        }
        int pow = powe(a, b-1);
        System.out.println(pow);
        return pow*a;
    }
    
}
