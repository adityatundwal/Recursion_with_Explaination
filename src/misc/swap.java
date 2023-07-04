package misc;

public class swap {
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50,60,70};
        Swap(arr,0,4);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void Swap(int[] arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    
}
