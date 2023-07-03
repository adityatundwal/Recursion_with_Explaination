public class Count_Decreasing {
    public static void main(String[] args) {
        int n = 100;
        int i = 0;
        decrement(i,n);
    }

    public static void decrement(int i,  int n){
        if(n==i){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        decrement(i, n-1);
    }


}
