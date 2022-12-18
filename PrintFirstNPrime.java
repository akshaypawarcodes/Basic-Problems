public class PrintFirstNPrime {
    public static void main(String[] args) {

        int num=3;
        int temp=1;
        System.out.println(2);
        for(int i=2; i<=100;){
            for(int j=2; j<=Math.sqrt(num); j++){
                if(num%j == 0){
                    temp=0;
                    break;
                }
            }
            if(temp!=0){
                System.out.println(num);
                i++;
            }
            temp=1;
            num++;
        }
    }
}//OutPut- print first 100 prime number
