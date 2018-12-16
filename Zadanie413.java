public class Zadanie413
{
    public static void main(String[] args)
    {
        System.out.println(" Przyklad 1: ");
        new AA();
        System.out.println();
        new BB();
        System.out.println();
        new CC();
        System.out.println();

        System.out.println(" Przyklad 2: ");
        new AA(true);
        new BB(true);
        new CC(true);

        System.out.println(" Przyklad 3: ");
        new AA(false);
        new BB(false);
        new CC(false);
    }

}

class AA
{
    AA ()
    {
        System.out.println("Wywolalem konstruktor klasy " + AA.class.getName());
    }

    AA (boolean b) {

        if (b == false) {
            System.out.println("Wywolalem konstruktor klasy " + AA.class.getName());
        }
        if (b == true) {
        }
    }
}

class BB extends AA {
    BB() {
        System.out.println("Wywolalem konstruktor klasy " + BB.class.getName());
    }

    BB(boolean b)
    {
        super(true);

        if (b == false) {
            System.out.println("Wywolalem konstruktor klasy " + BB.class.getName());
        }
        if (b == true) {
        }
    }
}

class CC extends BB
{
    CC ()
    {
        System.out.println("Wywolalem konstruktor klasy " + CC.class.getName());
    }

    CC(boolean b)
    {
        super(true);
        if (b == false) {
            System.out.println("Wywolalem konstruktor klasy " + CC.class.getName());
        }
        if (b == true) {
        }
    }
}

