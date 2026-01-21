import java.util.*;
public class EvenLOddR {
    public static int[] RearrangeArray(int arr[],int n){
        int left=0;
        int right=n-1;
		while(left<right){

		while(left<right && arr[left]%2==0){
            left++;
        }
		 
		  
		while(left<right && arr[right]%2!=0){
		  right--;
        }
        if(left<right){
		int temp;
        temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		left++;
		right--;
        }
		}

		return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array after rearranging");
        System.out.println(Arrays.toString(RearrangeArray(arr,n)));
    }
}
