public class Sample
{
    public static void main(String[] args)
    {
        new A();
        new A(1);
        new A("String");
        new B();
        new C();
    }
}

class A
{
    A()
    {
        System.out.println("A - konstruktor");
    }

    A(int i)
    {
        System.out.println("Z intem " + i);
    }

    A(String s)
    {
        System.out.println("ze stringiem " + s);
    }
}

class B extends A
{
    public B(){
        System.out.println("B - konstruktor");
    }
}

class C extends B
{
    public C(){
        System.out.println("C - konstruktor");
    }
}
