class MyLinkedList {
    Node head;
    Node tail;
    int size = 0;

    public class Node {
        int val;
        Node next;
        Node(int val) { 
            this.val = val;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) return -1; // Added boundary check
        
        Node temp = head; // 
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val; 
    }
    
    public void addAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return; // Standard boundary check
        
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        
        Node prev = head;
        for (int i = 0; i < index - 1; i++) { 
            prev = prev.next;
        }
        
        Node temp = new Node(val);
        temp.next = prev.next;
        prev.next = temp;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return; 
        
        if (index == 0) { 
            head = head.next;
            if (head == null) { 
                tail = null;
            }
            size--;
            return;
        }
        
        Node prev = head;
        for (int i = 0; i < index - 1; i++) { 
            prev = prev.next;
        }
        
        prev.next = prev.next.next;
        
        if (index == size - 1) { 
            tail = prev;
        }
        size--;
    }
}