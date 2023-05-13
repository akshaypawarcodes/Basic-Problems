public class Singleton {

    private static Singleton s=null;

    public String str;

    private Singleton()
    {
        str="this is singleton class";
    }

    public static Singleton getInstance()
    {
        if(s == null)
            s=new Singleton();

        return s;
    }
}
