import java.util.ArrayList;
import java.util.List;

public class FilterAges {
    public static void main(String[] args) {
        // Input array containing ages
        int[] A = {11, 23, 3, 45, 72, 68};

        // Get the filtered array
        int[] filteredAges = getAgesOver18(A);

        // Print the filtered array
        System.out.print("Output: A = ");
        for (int i = 0; i < filteredAges.length; i++) {
            System.out.print(filteredAges[i]);
            if (i < filteredAges.length - 1) {
                System.out.print(",");
            }
        }
    }

    // Method to filter ages over 18
    public static int[] getAgesOver18(int[] ages) {
        // Create a list to store ages over 18
        List<Integer> resultList = new ArrayList<>();

        // Iterate through the input array and add ages over 18 to the list
        for (int age : ages) {
            if (age >= 18) {
                resultList.add(age);
            }
        }

        // Convert the list to an array
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}