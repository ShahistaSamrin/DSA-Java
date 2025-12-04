/*OUTPUT:
Adding 10 at the beginning
10 added at beginning.
Adding 20 at the beginning
20 added at beginning.
Adding 30 at the beginning
30 added at beginning.
Adding 40 at the beginning
40 added at beginning.
Displaying linked list:
40 -> 30 -> 20 -> 10 -> null
Inserting 50 at end
50 inserted at end.
Displaying linked list:
40 -> 30 -> 20 -> 10 -> 50 -> null
Inserting 25 at index 2
Inserted 25 at index 2
Displaying linked list:
40 -> 30 -> 25 -> 20 -> 10 -> 50 -> null
Searching for value: 30
Value 30 found at position 2
Searching for value: 99
Value 99 not found in the list.
Total nodes: 6
Reversed List:
Displaying linked list:
50 -> 10 -> 20 -> 25 -> 30 -> 40 -> null */
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ListOfFunctions {
    static Node head;

    // Insert at a specific index
    public static void indexInsert(int data, int index) {
        System.out.println("Inserting " + data + " at index " + index);

        Node newNode = new Node(data);

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Index out of bounds!");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("Inserted " + data + " at index " + index);
    }

    // Count nodes
    public static int count() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total nodes: " + count);
        return count;
    }

    // Insert at beginning
    public static void addFirst(int data) {
        System.out.println("Adding " + data + " at the beginning");

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        System.out.println(data + " added at beginning.");
    }

    // Insert at end
    public static void insert(int data) {
        System.out.println("Inserting " + data + " at end");

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            System.out.println("List was empty. Node added as head.");
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        System.out.println(data + " inserted at end.");
    }

    // Display list
    public static void display() {
        System.out.println("Displaying linked list:");

        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Reverse list
    public static void reverse() {
        

        Node prev = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        head = prev;
        
    }

    // Search for a value
    public static boolean search(int key) {
        System.out.println("Searching for value: " + key);

        Node temp = head;
        int position = 1;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Value " + key + " found at position " + position);
                return true;
            }
            temp = temp.next;
            position++;
        }

        System.out.println("Value " + key + " not found in the list.");
        return false;
    }
}



public class SLL {
    public static void main(String[] args) {

        ListOfFunctions.addFirst(10);
        ListOfFunctions.addFirst(20);
        ListOfFunctions.addFirst(30);
        ListOfFunctions.addFirst(40);

        ListOfFunctions.display();

        ListOfFunctions.insert(50);
        ListOfFunctions.display();

        ListOfFunctions.indexInsert(25, 2);
        ListOfFunctions.display();

        ListOfFunctions.search(30);
        ListOfFunctions.search(99);

        ListOfFunctions.count();

        System.out.println("Reversed List:");
        ListOfFunctions.reverse();
        ListOfFunctions.display();
    }
}
