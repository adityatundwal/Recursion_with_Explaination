package RecursionPractice;

public class facto {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }

    private static int fact(int n) {
        if(n==1){
            return 1;
        }
        int fn = fact(n-1);
        System.out.println(fn);
        return fn * n;
    }
    
}
