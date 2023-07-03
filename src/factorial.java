class factorial{
    public static void main(String[] args) {

        int n = 5;
        //Here we have called the function
        System.out.println(fact(n));


    }

    public static int  fact(int n){
        /*this is our base case which will stop the 
         * stackoverflow error
         */
        if(n==1){
            return 1;
        }

        /*Formula of calculating factorial */
        int fn = fact(n-1);

        //Function returning the value
        return fn*n;
    }
}