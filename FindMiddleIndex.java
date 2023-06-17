public class FindMiddleIndex {
   public static void main(String[] args) {
        int[] arr={2,3,5,4,6,5};
        findMiddle(arr);
    }
    public static void findMiddle(int[] arr){
        int middle=arr.length/2;
        int middle1=arr[middle];
        System.out.println(middle1);
    }
}
