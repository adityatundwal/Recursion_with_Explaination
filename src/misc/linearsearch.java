package misc;

public class linearsearch {

    public static void main(String[] args) {
        int []arr = {10,20,30,40,50,60,70,80,90,100,110,112,1,20,5};
        System.out.println(Search(arr,1));
    }

    private static int Search(int[] arr, int i) {
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]==i){
                return j;
            }
        }
        return 0;

    }

    
    
}
