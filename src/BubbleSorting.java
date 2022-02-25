import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int []arr={5,6,7,8,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean isSwapped=false;
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i ; j++) {
                if(arr[j]<arr[j-1]){
                    //swap
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    isSwapped=true;
                }
            }
           if (!isSwapped){
                break;
            }
        }
    }
}
