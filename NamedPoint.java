import java.awt.*;

public class NamedPoint extends Point
{
    String name;

    public NamedPoint(int x, int y, String name)
    {
        super(x, y); // wywolanie konstruktowa z klasy ktora dziedziczymy

        // alternatywa, odwoluje sie do zmiennych klasy bazowej
        //this.x = x;
        //this.y = y;

        this.name = name;
    }

    public static void main(String[] args)
    {
        NamedPoint np = new NamedPoint(5,5,"Small Point");
        System.out.println("x wynosi " + np.x);
        System.out.println("y wynosi " + np.y);
        System.out.println("name " + np.name);
    }
}
