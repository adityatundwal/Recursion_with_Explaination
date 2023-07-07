package RecursionPractice;

public class Array_Index {

    public static void main(String[] args) {
        int []arr  = {2,3,5,7,2,5,5,7,5};
        int item = 5;

        System.out.println(find(arr,0,item));
    }

    private static int find(int[] arr, int i, int item) {
        if(arr[i]==item){
            return i;
        }
        if(arr[i]==arr.length){
            return -1;
        }
        return find(arr, i+1, item);
    }
    
}
