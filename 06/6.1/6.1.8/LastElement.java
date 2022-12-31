public class LastElement
{
    public static void main(String[] args)
    {
        double[] unitCircle = {0, 1.57, 3.14, 6.28, 7.85};
        System.out.println("The final unit circle value is " + getLastElement(unitCircle));
    }

    public static double getLastElement(double[] arr)
    {
        return arr[arr.length-1];
    }
}
