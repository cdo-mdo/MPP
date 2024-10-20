package lab10.assignment_10_5;

//Show the methods are not threadsafe.
//Then modify so that they are threadsafe.
public class Queue {
    class Node {
        Object value;
        Node next;
    }

    private Node head;
    private Node tail;

    public synchronized void add(Object newValue) {
        Node n = new Node();
        if (head == null) {
            head = n;
        }
        else {
            tail.next = n;
        }
        tail = n;
        tail.value = newValue;
    }

    public synchronized Object remove() {
        if (head == null) {
            return null;
        }
        Node n = head;
        head = n.next;
        return n.value;
    }
    
    public synchronized long getSize() {
        if (head == null) {
            return 0;
        }
        Node node = head;
        long count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }
    
    public String toString() {
        if (head == null) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Node node = head;
        while (node != null) {
            builder.append(node.value + ", ");
            node = node.next;
        }
        builder.append("]");
        
        return builder.toString();
    }
}
