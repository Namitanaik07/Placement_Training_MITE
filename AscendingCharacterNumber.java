public class AscendingCharacterNumber {
    public static void main(String[] args) {
        System.out.println("Numbers between 1 and 100 with letters in alphabetical order:");
        
        for (int i = 1; i <= 100; i++) {
            String word = convertToWord(i);
            if (isAlphabetical(word)) {
                System.out.println(i + " (" + word + ")");
            }
        }
    }

    //to turn numbers into Englsh wrds
    public static String convertToWord(int n) {
        if (n == 100) return "onehundred";
        
        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", 
                          "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (n < 20) return units[n];
        return tens[n / 10] + units[n % 10];
    }

    public static boolean isAlphabetical(String word) {
        if (word.isEmpty()) return false;
        word = word.toLowerCase();
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
