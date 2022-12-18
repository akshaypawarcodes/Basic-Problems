import java.util.Arrays;

public class RoateArrayClockWise {
  static int[] arr={1,2,3,4,5};
  static void rotate(){
      int i=0;
      int j= arr.length-1;
      while(i!=j){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
      }
  }

    public static void main(String[] args) {
        rotate();
        System.out.println(Arrays.toString(arr));
    }
}
