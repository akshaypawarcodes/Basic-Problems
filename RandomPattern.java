public class RandomPattern {
    public static void main(String[] args) {
        int n=5;

        //Problem 1
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

        //problem 2
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();

        //problem 3
        for(int i=n;i>=1;i--){
            for(int j=5;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

        //problem 4
        for(int i=n;i>=1;i--){
            for(int j=5;j>=i;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();

        //problem 5
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

        //problem 6
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();

        //problem 7
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
        //problem 8(Piramid)
        int i,j, row=4;
       for(i=0; i<row; i++){

           for (j=row-i; j>1; j--){
               System.out.print(" ");
           }
           for (j=0; j<=i; j++){
               System.out.print("* ");
           }
           System.out.println();
       }
        
        //problem 9(Diamond)
        
    }
}
