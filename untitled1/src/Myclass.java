public class Myclass {
    static public int x = 2;

    static {
        x=1;
    }
    static public void method(){
        x=5;
    }
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.x = 1;

        Myclass.method();

        Myclass.x =5;

        System.out.printf("x=%d, y=%d",obj.x, Myclass.x);

    }
}
