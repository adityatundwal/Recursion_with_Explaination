package misc;

public class Reversal {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 17, 5, 8 };
        revese(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void revese(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

}
