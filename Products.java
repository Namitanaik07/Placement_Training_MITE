import java.util.*;
public class Products {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
     
        int result[]=new int[n];
        for(int i=0;i<n;i++){
             result[i]=1;
             for(int j=0;j<n;j++){
                if(i!=j){
                    result[i]*=arr[j];
                }
             }
        }
        System.out.println("products array:");
        for(int i=0;i<n;i++){
            System.out.print(result[i]+ " ");
        }
    }
}
