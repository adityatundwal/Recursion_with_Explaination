package RecursionPractice;

public class fibo_recursion {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if(n==1 && n==0){
            return n;
        }

        int c = n*(n+1)/2;
        return c;
    }
}
