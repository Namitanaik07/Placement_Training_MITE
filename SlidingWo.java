import java.util.Scanner;
public class SlidingWo{   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
		int k=sc.nextInt();
        int result[]=new int[arr.length-k+1];
        // for (int i=0;i<arr.length-k+1;i++){
        //     int max = arr[i];
        //     for (int j = 1; j < k; j++) {
		// 		if(arr[i+j]>max){
		// 		max=arr[i+j];
        //         }
        // }
        // result[i]=max;}
        

        for (int i=0;i<arr.length-k+1;i++){
            System.out.print(result[i]+" ");
        }
    }}
