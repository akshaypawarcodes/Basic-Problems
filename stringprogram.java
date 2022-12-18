public class stringprogram {
    public static void main(String[] args) {
        String str= "Akshay";
        int n=str.length();
        System.out.println(n);
        for(int i=0; i<=n-1; i++){
            char ch=str.charAt(i);
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println(str.substring(2,5)+" ");
        System.out.println(str.substring(1));
        System.out.println(str.replace('k', 'a'));
        System.out.println(str.startsWith("A"));
        System.out.println(str.indexOf('a'));

    }
}
