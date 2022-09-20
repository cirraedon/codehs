import java.util.*;
import java.lang.Math;

public class BinarySearchTest {

    static int count;

    public static void main(String[] args) {
        
        // Use the helper code to generate arrays, calculate the max
        // iterations, and then find the actual iterations for a randomly
        // selected value.
        
        ArrayList<Integer> NumOfIterations = new ArrayList<>();
        
        NumOfIterations.add(binaryRec(generateArrayOfLength(100), (int) Math.random()*100, 0, 99));
        NumOfIterations.add(binaryRec(generateArrayOfLength(1000), (int) Math.random()*100, 0, 999));
        NumOfIterations.add(binaryRec(generateArrayOfLength(10000), (int) Math.random()*100, 0, 9999));
        NumOfIterations.add(binaryRec(generateArrayOfLength(100000), (int) Math.random()*100, 0, 99999));
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Array Size: " + (int) Math.pow(10, i+2) + "\nMax iterations: " + (int) binaryMax((int) Math.pow(10, i+2)) + "\nActual iterations: " + NumOfIterations.get(i));
        }
 
    }

    public static int binaryRec(int[] array, int target, int begin, int end) {
        if (begin <= end)
        {
        	int mid = (begin + end) / 2;
            count ++;
        	// Base Case
        	if (target == array[mid]) {
        			return count;
        	}
    
            if (target < array[mid]) {
                return binaryRec(array, target, begin, mid - 1);
            }
    
            if (target > array[mid]) {
                return binaryRec(array, target, mid + 1, end);
            }
        }
		return -1; //Alternate Base Case - not found
    }

    public static int[] generateArrayOfLength(int length)
    {
        int[] arr = new int[length];
        for(int i = 0; i < length; i++)
        {
            arr[i] = (int)(Math.random() * 100);
        }

        Arrays.sort(arr);

        return arr;
    }

    private static int binaryMax(int length) {
        return (int) (Math.log(length) / Math.log(2)) + 1;
    }
}