public class RangeListener
{
    public static void main(String[] args)
    {
        int [] range;

        RangeListener obj = new RangeListener();
        range = obj.makeRange(10,20);
        showArray(range);

    }
    int[] makeRange(int lower, int upper)
    {
        int[] range = new int [(upper-lower) + 1];

        for (int i=0;i<range.length; i++)
        {
            range[i] = lower++;
        }

        return range;
    }

     public static void showArray(int[] arr)
     {
         System.out.println("Wyswietlam przekazana tablice: ");
         for (int i=0; i<arr.length; i++)
         {
             System.out.println(arr[i]);
         }

     }
}
