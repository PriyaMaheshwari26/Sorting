import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        //int []arr={9,87,0,-90,65,55};
        int arr[]={0,9};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            int last=arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);

        }

    }

     static void swap(int[] arr,int maxIndex, int last) {
        int temp=arr[last];
        arr[last]=arr[maxIndex];
        arr[maxIndex]=temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
