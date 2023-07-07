package RecursionPractice;

public class Boardpath {
    public static void main(String[] args) {
        int n = 4;
        Boardpath(n,0,"");
    }

    private static void Boardpath(int n, int curr, String ans) {
        if(curr==n){
            System.out.println(ans);
            return;
        }
        if(curr>n){
            return;
        }

        for (int dice = 1; dice < n; dice++) {
            Boardpath(n, curr+dice, ans+dice);
        }
    
    
    }
    
}
