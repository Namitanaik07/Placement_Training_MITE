import java.util.*;

public class BruteForceTriplets {
    public static void findTriplets(int[] arr) {
        int n = arr.length;
        List<String> results = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int a = arr[i], b = arr[j], c = arr[k];
                    // Check all permutations of a^2 + b^2 = c^2
                    if ((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a)) {
                        int[] triplet = {a, b, c};
                        Arrays.sort(triplet); // Sort to display as (3, 4 and 5)
                        String s = "(" + triplet[0] + ", " + triplet[1] + " and " + triplet[2] + ")";
                        if (!results.contains(s)) {results.add(s);}
                    }
                }
            }
        }
        if (results.isEmpty()) System.out.println("False, there are no Pythagorean triplets");
        else System.out.println("True - " + String.join(", ", results) + " are Pythagorean triplets");
    }
    

    public static void main(String[] args) {
        findTriplets(new int[]{3, 1, 4, 6, 5});
    }
}
