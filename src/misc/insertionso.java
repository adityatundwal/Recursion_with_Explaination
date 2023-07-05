package misc;

public class insertionso {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 1 };
        insertion(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Insert(arr, i);
        }
    }

    private static void Insert(int[] arr, int j) {
        int item = arr[j];
        int i = j - 1;
        while (i >= 0 && arr[i] >= item) {
            arr[i + 1] = arr[i];
            i--;
        }
        i++;
        arr[i] = item;
    }

}
