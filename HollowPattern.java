
public class HollowPattern {

    public static void hollow(int n, int m){
        
        int i,j;
        
        for(i=1; i<=n; i++){
            
            for(j=1; j<=m; j++){
                
                if(i == 1||i==n || j == 1||j == m)
                {
                    System.out.print("*");
                }else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row=6;
        int column=20;
        hollow(row,column);
    }
}
//OutPut-

//            ********************
//            *                  *
//            *                  *
//            *                  *
//            *                  *
//            ********************
