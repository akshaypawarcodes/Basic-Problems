public class Alternate {
    public static void main(String[] args) {

        int[] arr={1,2,5,3,4,6};
        for(int i=0; i<arr.length; i +=2){

                int temp=arr[i];
                arr[i] =arr[i+1];
                arr[i+1]=temp;

        }
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
