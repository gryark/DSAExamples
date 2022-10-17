import java.util.Arrays;

public class CodeExamples {

    /**
     * Returns the maximum value of a nonempty array of numbers.
     */
    public double arrayMax(double[] data) {
        int n = data.length;
        double currentMax = data[0]; // assume first entry is biggest (for now)
        for (int j = 1; j < n; j++) // consider all other entries
            if (data[j] > currentMax) // if data[j] is biggest thus far...
                currentMax = data[j]; // record it as the current max
        return currentMax;
    }

    /**
     * Returns true if there are no duplicate elements in the array.
     */
    public boolean unique(int[] data) {
        int n = data.length;
        for (int j = 0; j < (n - 1); j++)
            for (int k = j + 1; k < n; k++)
                if (data[j] == data[k])
                    return false; // found duplicate pair
        return true;
    }

    /**
     * Returns true if there is no element common to all three arrays.
     */
    public static boolean disjoint1(int[] groupA, int[] groupB, int[] groupC) {
        for (int a : groupA)
            for (int b : groupB)
                for (int c : groupC)
                    if ((a == b) && (b == c))
                        return false; // we found a common value
        return true; // if we reach this, sets are disjoint
    }

    /** Returns true if there are no duplicate elements in the array.*/
    public static boolean unique2(int[] data) {
        int n = data.length;
        int[] temp = Arrays.copyOf(data, n); // make copy of data
        Arrays.sort(temp); // and sort the copy
        for (int j = 0; j < n-1; j++)
            if (temp[j] == temp[j + 1]) // check neighboring entries
                return false; // found duplicate pair
        return true; // if we reach this, elements are unique
    }
}
