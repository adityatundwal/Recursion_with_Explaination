package misc;
public class Bubbe {
    public static void main(String[] args) {
        int []arr = { 4, 5, 1, 2, 8, 9, 10};
        Bubbee(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void Bubbee(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

