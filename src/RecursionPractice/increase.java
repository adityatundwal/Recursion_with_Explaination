package RecursionPractice;

public class increase {

    public static void main(String[] args) {
        int n = 5;
        PD(n);
    }

    private static void PD(int n) {
        if (n == 0) {
            return;
        }
        PD(n - 1);
        System.out.println(n);
    }

}
