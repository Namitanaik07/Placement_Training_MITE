public class SortAnagramArray{

    public static void main(String[] args) {
        String[] arr = {"cat", "dog", "tac", "god", "act"};
        java.util.Arrays.sort(arr, (s1, s2) -> {
            char[] charArray1 = s1.toCharArray();
            char[] charArray2 = s2.toCharArray();
            java.util.Arrays.sort(charArray1);
            java.util.Arrays.sort(charArray2);
            return new String(charArray1).compareTo(new String(charArray2));
        });

        for (String str : arr) {
            System.out.print(str + " ");
        }
    }
}
