package misc;

public class maxin {

    public static void main(String[] args) {
        int []arr = {2,3,1,17,5,8};
        System.out.println(max(arr));
    }

    private static int max(int[] arr) {
        int maxc = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxc){
                maxc = arr[i];
            }
        }
        return maxc;
    }
    
}
