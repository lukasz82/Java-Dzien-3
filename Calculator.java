public class Calculator {

    public static void main(String[] args)
    {
        int x = 10;
        int y = 10;
        System.out.println(Sum(x,y));
        System.out.println(Sub(x,y));
        System.out.println(Multi(x,y));
    }

    public static int Sum(int x, int y)
    {
        return x + y;
    }

    public static int Sub(int x, int y)
    {
        return x - y;
    }

    public static int Multi(int x, int y)
    {
        return x * y;
    }
}
