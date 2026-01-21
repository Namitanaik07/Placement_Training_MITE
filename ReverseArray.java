import java.util.*;
public class ReverseArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();//accdemmna
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}
