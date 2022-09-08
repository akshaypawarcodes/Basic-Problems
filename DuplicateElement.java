public class DuplicateElement {
    public static void main(String[] args) {
        int ans =0;
        int[] arr={1,2,3,4,3,5};
        //XOR every value
        for(int i=0; i<arr.length; i++){
            ans=ans^arr[i];
        }
        for(int i=1; i<arr.length; i++){
            ans=ans^i;
        }
        System.out.println(ans);
    }
}
