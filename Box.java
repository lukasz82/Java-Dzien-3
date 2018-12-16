import java.awt.*;

public class Box
{
    int x1 = 0;
    int x2 = 0;
    int y1 = 0;
    int y2 = 0;

    Box buildBox (int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

        return this; // czyli zwracam ten obiekt
    }

    Box buildBox (Point topLeft, Point bottomRight)
    {
        // nie ma konfliktu nazw więc mogę używać bez this
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = bottomRight.x;
        y2 = bottomRight.y;
        return this;
    }

    Box buildBox (Point topLeft, int w, int h)
    {
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = x1 + w;
        y2 = y1 + h;
        return this;
    }

    void printBox()
    {
        System.out.print("Box: <");
        System.out.print(x1 + " , " + y1 + " , ");
        System.out.print(x2 + " , " + y2);
        System.out.print(">");
        System.out.println();
    }

    public static void main(String[] args)
    {
        Box box = new Box();
        System.out.println("Wywołanie buildBox ze współrzednymi (25,25) i (50,50)");
        box.buildBox(25,25,50,50);
        box.printBox();

        // z punktami (10,10) i (20,20)
        Point p1 = new Point(10,10);
        Point p2 = new Point(20,20);
        box.buildBox(p1.x,p1.y,p2.x,p2.y);
        box.printBox();

        // z punktem (12,12) i (30,40)
        p1.x = 12;
        p1.y = 12;
        box.buildBox(p1.x,p1.y,30,40);
        box.printBox();

        // z punktami ALTERNATYWA (10,10) i (20,20)
        box.buildBox(new Point(10,10),new Point(10,10));
        box.printBox();

    }
}
