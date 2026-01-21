import java.util.*;
public class ContainerWithMostWater{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
 
  int n=sc.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<n;i++){
  arr[i]=sc.nextInt();
  }
  int left=0;
  int right=n-1;
  int maxArea=0;
  while(left<right){
     int height=Math.min(arr[left],arr[right]);
	 int breadth=right-left;
	 maxArea=Math.max(maxArea,height*breadth);
	 if(arr[left]<arr[right]){
	 left++;
	 }else{
	 right--;}
  }
    System.out.println(maxArea);
  sc.close();
  }
}
