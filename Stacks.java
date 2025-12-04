/*OUTPUT:
Pushed: 10
Pushed: 20
Pushed: 30
Stack: 30 -> 20 -> 10 -> null
Top element: 30
Popped: 30
Stack: 20 -> 10 -> null */
// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


// Stack implemented using Linked List
class Stack {
    private Node top;

    // Push operation
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + data);
    }

    // Pop operation
    public  void pop() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Popped: " + top.data);
        top = top.next;
    }

    // Peek / Top value
    public void topValue() {
        if (top == null) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }

    // Display stack
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return;
        }

        Node temp = top;
        System.out.print("Stack: ");

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}


// Main class
public class Stacks{
    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);

        st.display();

        st.topValue();

        st.pop();
        st.display();
    }
}