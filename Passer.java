import java.awt.*;

public class Passer
{
    Point point = new Point(1,1);
    int x = 1;


    void changePoint(Point point)
    {
        point.x = 10;
        point.y = 10;
    }

    void changeX(int x)
    {
        this.x = 8;
    }

    void toUpperCase(String[] text)
    {
        for (int i = 0; i < text.length ; i++)
        {
            text[i] = text[i].toUpperCase();
        }
    }

    public static void main(String[] args)
    {
        Passer p = new Passer();
        System.out.println("Wyswietl point: " + p.point);
        p.changePoint(p.point);
        System.out.println("Wyswietl point: " + p.point);
        System.out.println();

        System.out.println(p.x);
        p.changeX(5);
        System.out.println(p.x);


        p.toUpperCase(args);

        for(String str : args)
        {
            System.out.println(str);
        }
    }
}
