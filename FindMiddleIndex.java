public class FindMiddleIndex {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int index=0;
        if(arr.length == 0||arr.length == 1){
            System.out.println(index);
        }
        while(index!= arr.length){
            int leftSum=0;
            int rightSum=0;
            if(index!=0){
                for(int i=index-1; i>=0; i--){
                    leftSum=leftSum+arr[i];
                }
            }
            if(index!= arr.length-1){
                for(int i=index+1; i<arr.length; i++){
                    rightSum=rightSum+arr[i];
                }
            }
            if(leftSum == rightSum){
                System.out.println(index);
                index++;
            }
        }


    }
}
