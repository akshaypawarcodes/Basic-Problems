class main{
    private String name;
    private int roll;

   public String getName(){
       return name;
   }
   public int getRoll(){
       return roll;
   }
   public  void setName(String newName){
       name =newName;
       System.out.println(newName);
   }
   public void setRoll(int newRoll){
       roll=newRoll;
       System.out.println(newRoll);
   }
}
public class Encapsulation  {
    public static void main(String[] args) {
        main m=new main();
        m.setName("akshay");
        m.setRoll(20);
    }

}
