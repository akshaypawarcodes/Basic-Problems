import java.util.Arrays;

public class SortArrayUsingOneLoop {
    public static int[] sortArray(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            //check condition
            if(arr[i]>arr[i+1]){
                //swap
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i=-1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={5,27,3,2,1,6,4,7};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
