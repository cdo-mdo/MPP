package test18;

import java.util.Stack;

public class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
    
    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }
        Node node = head;
        Stack<Node> stack = new Stack<>();
        while (true) {
            if (node.child != null) {
                // put next node to stack
                if (node.next != null) {
                    stack.push(node.next);
                    // flatten the child
                    node.next = node.child;
                    node.child.prev = node;
                    node.child = null;
                    
                    node = node.next;
                } else {
                    // check if there is node in stack
                    if (stack.isEmpty()) {
                        // done, return
                        return head;
                    } else {
                        Node tmp = stack.pop();
                        node.next = tmp;
                        tmp.prev = node;
                        node = tmp;
                    }
                }
            } else {
                if (node.next != null) {
                    node = node.next;
                } else {
                    if (stack.isEmpty()) {
                     // done, return
                        return head;
                    } else {
                        Node tmp = stack.pop();
                        node.next = tmp;
                        tmp.prev = node;
                        node = tmp;
                    }
                }
            }
        }

        Map<Character, Integer> seens = new HashMap<>();
        seens.pu
    }
}
