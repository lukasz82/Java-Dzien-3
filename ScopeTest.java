public class ScopeTest
{
    private String name;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    private int test = 10;

    public void printTest()
    {
        int test = 20;
        System.out.println("test = " + test);
    }

    public static void main(String[] args)
    {
        ScopeTest obj = new ScopeTest();
        obj.printTest();
        System.out.println(obj.test);

        ScopeTest x = new ScopeTest();
        x.setName("Łukasz");
        System.out.printf(x.getName());
    }
}
