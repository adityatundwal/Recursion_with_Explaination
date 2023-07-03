public class count_increase {
    public static void main(String[] args) {
        int n = 100;
        int i = 0;

        count(i,n);
    }

    public static void count(int i,int n){
        if(i==n){
            System.out.println(i);
            return;
        }
        System.out.print(i+" ");
        count(i+1,n);
    }


}
