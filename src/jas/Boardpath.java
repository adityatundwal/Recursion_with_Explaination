package jas;

public class Boardpath {
    public static void main(String[] args) {
        int n = 4;
        Boardp(n, 0, "");
    }

    public static void Boardp(int n, int curr, String ans) {
        if (curr == n) {
            System.out.println(ans);
            return;
        }

        if (curr > n) {
            return;
        }

        for (int dice = 1; dice < n; dice++) {
            Boardp(n, curr + dice, ans + dice);
        }
    }

}
