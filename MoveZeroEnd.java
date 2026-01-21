import java.util.*; 
public class MoveZeroEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < 10) {
            arr[count++] = 0;
        }
        System.out.println("Array after moving zeros to the end:");
        System.out.println(Arrays.toString(arr));   
    }
}
