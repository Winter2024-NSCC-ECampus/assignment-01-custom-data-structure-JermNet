public class MyDataStructure {
    private Node head;
    private Node tail;

    public MyDataStructure() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        if (contains(value)) {
            return;
        }

        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void prepend(int value) {
        if (contains(value)) {
            return;
        }

        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public Node head() {
        return head;
    }

    public int headValue() {
        return head.data;
    }

    public Node tail() {
        return tail;
    }

    public int tailValue() {
        return tail.data;
    }

    public Node at(int index) {
        if (index < 0) {
            return null;
        }

        Node current = head;
        int count = 0;

        while (current != null) {
            if (count == index) {
                return current;
            }
            current = current.next;
            count++;
        }

        return null;
    }

    public void pop() {
        if (tail == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public boolean contains(int value) {
        Node current = head;

        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public int ind(int value) {
        Node current = head;
        int index = 0;

        while (current != null) {
            if (current.data == value) {
                return index;
            }
            current = current.next;
            index++;
        }

        return -1;
    }
}
