package doubly.linked.list;

public class DoublyLinkedList {

    Node head;
    Node tail;
    int length;

    DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean append(int value){
        Node newNode = new Node(value);
        if(this.length == 0){
            this.head = newNode;
            this.tail = newNode;
            this.length += 1;
            return true;
        }
        this.tail.next = newNode;
        newNode.prev = this.tail;
        this.tail = newNode;
        this.length += 1;
        return true;
    }

    public Node pop(){
        if (this.length == 0){
            return null;
        }
        Node temp = this.tail;
        if (this.length == 1){
            this.head = null;
            this.tail = null;
        }else{
            this.tail = this.tail.prev;
            this.tail.next = null;
            temp.prev = null;
        }
        this.length -= 1;
        return temp;
    }

    public boolean prepend(int value){
        Node newNode = new Node(value);
        if(this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
        this.length += 1;
        return true;
    }

    public Node pop_first(){
        if(this.length == 0){
            return null;
        }
        Node temp = this.head;
        if(this.length == 1){
            this.head = null;
            this.tail = null;
        }else{
            this.head = this.head.next;
            this.head.prev = null;
            temp.next = null;
        }
        this.length -= 1;
        return temp;
    }

    public void print_values(){
        if (this.length == 0) System.out.println("No elements in list");
        Node temp = this.head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
