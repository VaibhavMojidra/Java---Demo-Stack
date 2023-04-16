import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        
        // Creating a new stack
        Stack<Integer> stack = new Stack<>();
        
        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        // Peeking at the top element
        int top = stack.peek();
        System.out.println("Top element: " + top);
        
        // Popping an element from the stack
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);
        
        // Checking if the stack is empty
        boolean isEmpty = stack.empty();
        System.out.println("Is stack empty? " + isEmpty);
        
        // Searching for an element in the stack
        int index = stack.search(20);
        System.out.println("Index of element 20: " + index);
        
        // Printing the contents of the stack
        System.out.println("Stack contents: " + stack);
    }
}
