package RecursionPractice;

public class decrease {

    public static void main(String[] args) {
        int n = 5;
        PI(n);
    }

    private static void PI(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        PI(n-1);
    }
    
}
