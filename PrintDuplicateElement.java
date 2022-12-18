public class PrintDuplicateElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1,2,3,5,6,4,8,7};
        for(int i=0; i< arr.length; i++){
            int j;
            for(j=i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}//OutPut-1,2,3,4
