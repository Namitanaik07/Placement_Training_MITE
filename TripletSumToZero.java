
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TripletSumToZero {
    static ArrayList<ArrayList<Integer>> findTriplets(int[] arr) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i]+ arr[j] + arr[k] == 0) {
                        ArrayList<Integer> triplet = new ArrayList<>();
                        triplet.add(i);
                        triplet.add(j);
                        triplet.add(k);
                        res.add(triplet);
                    }
                }
            }
        }
        return res;
    }
        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<ArrayList<Integer>> res = findTriplets(arr);
        for (List<Integer> triplet : res)
            System.out.println(triplet.get(0) + " " + triplet.get(1)
                    + " " + triplet.get(2));
    }
}
