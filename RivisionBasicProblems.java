public class RivisionBasicProblems {
       public static void main(String[] args) {
           int[] arr={1,3,2,3,1,2,4,5,6,5,4};
           int n= arr.length;

           //sort an array
//           for(int i=0; i< arr.length; i++){
//               for(int j=i+1; j< arr.length; j++){
//                   if(arr[j]<arr[i]){
//                       int temp=arr[i];
//                       arr[i]=arr[j];
//                       arr[j]=temp;
//                   }
//               }
//               System.out.print(arr[i]+" ");
//           }

          //check isSorted or not
//          boolean isSorted=true;
//          for(int i=0; i< arr.length-1; i++){
//              if(arr[i]>arr[i+1]){
//                  isSorted=false;
//              }
//          }
//          if(isSorted){
//              System.out.println("array is sorted");
//          }else {
//              System.out.println("not sorted");
//          }

          //sum of array element
//           int sum=0;
//           for(int i=0; i<=n; i++){
//               sum=sum+i;
//           }
//           System.out.print(sum+" ");

           //find max
//           int max=0;
//           for(int i:arr){
//               if(max<i){
//                   max=i;
//               }
//           }
//           System.out.println(max);

           //find a given element
//           int x=1;
//           boolean present=false;
//           for(int i:arr){
//               if(x == i){
//                   present=true;
//                   break;
//               }
//           }
//           if(present){
//               System.out.println(x+" present in array");
//           }else {
//               System.out.println(x+" not present in array");
//           }
//
//           //avg of element
//           float sum=0f;
//           for(int i=0; i<=n; i++){
//               sum=sum+i;
//           }
//           System.out.print(sum/n+" ");

           //find unique element in array
           int ans=0;
           for (int i:arr){
               ans=ans^i;
           }
           System.out.println(ans);

    }
}











