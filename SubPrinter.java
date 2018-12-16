public class SubPrinter extends  Printer
{
    int z = 3;

    void printMe()
    {
        super.printMe(); // wywołuję metodę z klasy bazowej
        System.out.println("z wynosi " + z);
        System.out.println("jestem egzemplarzem klasy " + this.getClass().getName());
    }

    public static void main(String[] args)
    {
        Printer objPronter = new Printer();
        objPronter.printMe();

        SubPrinter subPrinter = new SubPrinter();
        subPrinter.printMe();
    }
}
