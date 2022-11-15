import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        //for user input
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int temp=n;
        int p=0;

        while(n>0){
            int rem=n%10;
            p=(p)+(rem*rem*rem);
            n=n/10;
        }
        
        if(temp == p){
            System.out.println("given number is ArmStrong");
        }else{
            System.out.println("given number is not ArmStrong");
        }

    }
}
