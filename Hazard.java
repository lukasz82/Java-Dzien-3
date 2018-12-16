import java.util.Random;

public class Hazard
{
    public static void main(String[] args)
    {
        int count = 0;
        // Jak długi ma być ciąg 777
        int howManyNumbers = 5;

        while (compareNumbers(generateNumbers(howManyNumbers), howManyNumbers) != true)
        {
            count++;
        }
        System.out.println("Wygrales po : " + count + " razie");
    }

    public static int [] generateNumbers( int howManyNumbers)
    {
        int [] arr = new int[howManyNumbers];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i]);
        }
        System.out.println();
        return arr;
    }

    public static boolean compareNumbers(int [] arr, int howManyNumbers)
    {
        int tries = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 7) tries++;
        }
        if (tries == howManyNumbers)
        {
            return true;
        } else return false;
    }
}
