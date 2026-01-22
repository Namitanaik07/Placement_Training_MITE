import java.util.*;
public class validSumatEvenPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
    
        int arr[]=new int[str.length()];
        int sum=0;
        for(int i=0;i<str.length();i++){
            arr[i]=Character.getNumericValue(str.charAt(i));
            if(i%2==0){
                sum=sum+arr[i];
            }
        }
        System.out.println("sum: "+sum);
		}
    }
