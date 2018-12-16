import java.awt.*;

public class Box2
{
    int x1 = 0;
    int x2 = 0;
    int y1 = 0;
    int y2 = 0;

    Box2 (int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    Box2 (Point topLeft, Point bottomRight)
    {
        // nie ma konfliktu nazw więc mogę używać bez this
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = bottomRight.x;
        y2 = bottomRight.y;
    }

    Box2 (Point topLeft, int w, int h)
    {
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = x1 + w;
        y2 = y1 + h;
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

        Box2 box2;

        box2 = new Box2(25,25,50,50);
        System.out.println("Wywołanie buildBox ze współrzednymi (25,25) i (50,50)");
        box2.printBox();

        // z punktami (10,10) i (20,20)
        Point p1 = new Point(10,10);
        Point p2 = new Point(20,20);
        box2 = new Box2(p1.x,p1.y,p2.x,p2.y);
        box2.printBox();

        // z punktem (12,12) i (30,40)
        p1.x = 12;
        p1.y = 12;
        box2 = new Box2(p1.x,p1.y,30,40);
        box2.printBox();

        // z punktami ALTERNATYWA (10,10) i (20,20)
        box2 = new Box2(new Point(10,10),new Point(10,10));
        box2.printBox();

    }
}