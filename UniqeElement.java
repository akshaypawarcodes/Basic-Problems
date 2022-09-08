public class UniqeElement {
    public static void main(String[] args) {
        int ans=0;
        int[] arr={2,3,2,7,3,7,4};
        for(int i=0;i< arr.length;i++){
            ans=ans^arr[i];
        }
        System.out.println(ans);
    }
}
