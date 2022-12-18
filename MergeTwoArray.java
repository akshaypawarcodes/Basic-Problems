public class MergeTwoArray {
    //with use of third array
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] arr1={5,6,9,8};

        int a= arr.length;
        int b=arr1.length;
        int c=a+b;

        int[] arr2=new int[c];

        for(int i=0; i<a; i++){
            arr2[i]=arr[i];
        }
        for(int i=0; i<b; i++){
            arr2[a+i]=arr1[i];
        }

        for(int i=0;i<c; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
