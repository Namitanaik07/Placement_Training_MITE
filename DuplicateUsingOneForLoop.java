public class DuplicateUsingOneForLoop {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1};
        System.out.println("Duplicate elements in the array:");
		
       for(int i=0;i<arr.length;i++)
	  {
       int index=Math.abs(arr[i]);
         if(arr[index]>=0){
              arr[index]=-arr[index];
      }	
        else{
            System.out.println(index);
        }
	
    }
    }}
