/*OUTPUT:
Pushed 10 to stack
Pushed 20 to stack
Pushed 30 to stack
Stack elements: 10 20 30
Top element: 30
Popped 30 from stack
Stack elements: 10 20
Is stack empty? false
Stack size: 2 */
public class Stack {
    private int[] stackArray;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public Stack(int size) {
        stackArray = new int[size];
        capacity = size;
        top = -1;
    }

    // Push operation to add an element to the stack
    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + item);
            return;
        }
        stackArray[++top] = item;
        System.out.println("Pushed " + item + " to stack");
    }

    // Pop operation to remove and return the top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop");
            return -1; // or throw exception
        }
        int item = stackArray[top--];
        System.out.println("Popped " + item + " from stack");
        return item;
    }

    // Peek operation to view the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek");
            return -1;
        }
        return stackArray[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Get the size of the stack
    public int size() {
        return top + 1;
    }

    // Display the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the stack
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());
    }
}
