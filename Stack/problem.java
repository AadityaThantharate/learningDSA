import java.util.Stack;

public class problem {
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>(); // Create a stack to store characters
        for (char ch : str.toCharArray()) {     //for loop to iterate through the string
            stack.push(ch);                     //
        }
        StringBuilder reversed = new StringBuilder();//Creating a new StringBuilder object
        while (!stack.isEmpty()) {                   //while loop to pop elements from the stack
            reversed.append(stack.pop());            //append the popped element to the StringBuilder
        }
        
        return reversed.toString();

    }

    public static void main(String[] args) {
        // reverseString("hello");
        System.out.println(reverseString("hello"));
    }
}
