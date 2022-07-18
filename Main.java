import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Main {

    // Method to reverse a string in Java using `StringBuilder`
    public String reverse1(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method to reverse a string in Java using a stack and character array
    public String reverse2(String str)
    {
        // base case: if the string is null or empty
        if (str == null || str.equals("")) {
            return str;
        }
    
        // create an empty stack of characters
        Stack<Character> stack = new Stack<Character>();
    
        // push every character of the given string into the stack
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            stack.push(ch[i]);
        }
    
        // start from index 0
        int k = 0;
    
        // pop characters from the stack until it is empty
        while (!stack.isEmpty())
        {
            // assign each popped character back to the character array
            ch[k++] = stack.pop();
        }
    
        // convert the character array into a string and return it
        return String.copyValueOf(ch);
    }

        // Method to reverse a string in Java using `Stack` and `StringBuilder` class
    public String reverse3(String str)
    {
        // base case: if the string is null or empty
        if (str == null || str.equals("")) {
            return str;
        }
    
        // create an empty stack of characters
        Stack<Character> stack = new Stack<Character>();
    
        // push every character of the given string into the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
    
        // pop characters from the stack and append them into `StringBuilder`
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
    
        // convert `StringBuilder` to `String` and return
        return sb.toString();
    }
    // Method to reverse a string in Java using `Collections.reverse()`
    public String reverse4(String str)
    {
        // base case: if the string is null or empty
        if (str == null || str.equals("")) {
            return str;
        }
 
        // create an empty list of characters
        List<Character> list = new ArrayList<Character>();
 
        // push every character of the given string into it
        for (char c: str.toCharArray()) {
            list.add(c);
        }
 
        // reverse list using `java.util.Collections` `reverse()`
        Collections.reverse(list);
 
        // convert `ArrayList` into string using `StringBuilder` and return it
        StringBuilder builder = new StringBuilder(list.size());
        for (Character c: list) {
            builder.append(c);
        }
 
        return builder.toString();
    }
    // Method to reverse a string in Java using `Collections.reverse()`
    public String reverse5(String str)
    {
        // return if the string is null or empty
        if (str == null || str.equals("")) {
            return str;
        }
 
        // create an empty list of characters and push every
        // character of the given string into it
        List<Character> list = new ArrayList<Character>();
        for (char c: str.toCharArray()) {
            list.add(c);
        }
 
        // reverse list using `java.util.Collections` `reverse()`
        Collections.reverse(list);
 
        // `list.toString()` is [t, h, g, i, l, e, D,  , e, i, h, c, e, T]
 
        // convert `list.toString()` to valid string
        return list.toString()
            .replaceAll("[,\\[\\]]", "")    // t h g i l e D   e i h c e T
            .replaceAll("  ", "@")          // t h g i l e D@ e i h c e T
            .replaceAll(" ", "")            // thgileD@eihceT
            .replaceAll("@", " ");          // thgileD eihceT
    }

}
