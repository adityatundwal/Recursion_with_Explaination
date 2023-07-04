package misc;

public class product {

    public static void main(String[] args) {
        int []arr = {5,6,7,8,9};
        int []ans  = product1(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }

    private static int[] product1(int[] arr) {
        int []left = new int[arr.length];
        left[0] = 1;
        for (int i = 1; i < left.length; i++) {
            left[i] = left[i-1]*arr[i-1];
        }
        int []right = new int[arr.length];
        right[arr.length-1] = 1;
        for (int i = right.length-2; i>=0; i--) {
            right[i] = right[i+1] *arr[i+1];
        }

        for (int i = 0; i < right.length; i++) {
            arr[i] = left[i]*right[i];
        }
        return arr;
    }
    
}
