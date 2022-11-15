class overload{
    int x;
    double y;
    void add(int a, int b){
        x=a+b;
    }
    void add(double c, double d){
        y=c+d;
    }
    overload(){

        this.y=0;
        this.x=0;
    }
}


public class interview {
    public static void main(String[] args) {
        overload obj=new overload();
        int a=2;
        double b=3.2;
        obj.add(b,b);
        obj.add(a,a);

        System.out.println(obj.x+" "+obj.y);

    }
}
