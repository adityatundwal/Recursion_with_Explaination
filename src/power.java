public class power {

    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        System.out.println(spower(a,b));
    }

    public static int spower(int a, int b){
        if(b==0){
            return 1;
        }

        int pow = spower(a,b-1);
        return pow*a;
    }
    
}
