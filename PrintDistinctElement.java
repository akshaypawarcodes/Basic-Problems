public class PrintDistinctElement {
    public static void Disctinct(int[] arr, int n){
        for(int i=0; i<n; i++){
            int j;
            for(j=0; j<i; j++){
                if(arr[i] == arr[j]){
                    break;
                }
            }
            if(i == j){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,1,12,2,2,2,4,4,5};
        int n=arr.length;
        Disctinct(arr, n);
    }
}//output- 1,12,2,4,5
