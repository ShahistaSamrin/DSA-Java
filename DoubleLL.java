/*OUTPUT:
Forward: 10 20 30 
Backward: 30 20 10
Forward: 10 20
Backward: 20 10
Forward: 20
Backward: 20 */
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoubleLLMethods {

    // 🌍 GLOBAL VARIABLES
    private Node head = null;
    private Node tail = null;

    // Insert at end
    public void addEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {        
            head = tail = newNode; 
            return;
        } 
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Insert at front
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Display Forward (Head → Tail)
    public void displayForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    } 
    //  Display Backward (Tail → Head)
    public void displayBackward() {
        Node temp = tail;
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    //delete at end
    public void deleteEnd() {
        if(tail == null){
            head = tail = null;
            System.out.println("No null");
        }
        tail = tail.prev;
        if(tail!=null){
            tail.next=null;
        }else{
            head = null;
        }
        
    }
    //delete at front
    public void deleteFront() {
        if(head == null){
            System.out.println("No data");
        }
        head = head.next;
        if(head!=null){
            head.prev=null;
        }else{
            tail = null;
        }
        
    }
    
}

public class DoubleLL {
    public static void main(String[] args) {

        DoubleLLMethods dm = new DoubleLLMethods(); 
        
        // Add elements at end
        dm.addEnd(20);
        dm.addEnd(30);

        // Add element at front
        dm.addFirst(10); // This will be the first element now

        dm.displayForward();  // Output: Forward: 10 20 30
        dm.displayBackward();   // Backward: 30 20 10
        dm.deleteEnd();
        dm.displayForward();
        dm.displayBackward();
        dm.deleteFront();
        dm.displayForward();
        dm.displayBackward();
    }
}
