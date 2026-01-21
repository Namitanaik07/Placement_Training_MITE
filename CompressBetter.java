public class CompressBetter {
    public static String compressBetter(int[] arr) {
    if (arr == null || arr.length == 0) return "";
    
    StringBuilder result = new StringBuilder();
    int count = 1;

    for (int i = 1; i <= arr.length; i++) {
        if (i == arr.length || arr[i] != arr[i - 1]) {
            result.append("(").append(arr[i - 1]).append(",").append(count).append(") ");
            count = 1; 
        } else {
            count++;
        }
    }
    return result.toString().trim();
}


}
