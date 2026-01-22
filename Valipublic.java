 public class Valipublic {
boolean isValidUltra(String s) {
        char[] stack = new char[s.length()];
        int top = 0; // pointer to the top of the stack
        
        for (char c : s.toCharArray()) {
            if (c == 'c') {
                if (top < 2 || stack[top - 1] != 'b' || stack[top - 2] != 'a') {
                    return false;
                }
                top -= 2; // "Pop" 'a' and 'b'
            } else {
                stack[top++] = c; // "Push" current character
            }
        }
        return top == 0;}
