package linked.list;

public class CreateLinkedList {

    Node head;
    Node tail;
    int length;

    CreateLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;

    }

    public boolean append(int value){
        Node new_node = new Node(value);

        if(this.length == 0){
            this.head = new_node;
            this.tail = new_node;
        } else{
            this.tail.next = new_node;
            this.tail = new_node;
        }

        this.length += 1;
        return true;
    }

    public Node pop(){
        if (this.length == 0){
            return null;
        }
        Node temp = this.head;
        if (this.length == 1){
            this.head = null;
            this.tail = null;
            this.length -= 1;
            return temp;
        }

        Node pre = temp;
        for (int i = 0; i < this.length-1; i++){
            pre = temp;
            temp = temp.next;
        }
        this.tail = pre;
        this.tail.next = null;
        this.length -= 1;
        return temp;
    }

    public void print_values(){
        if(this.length == 0){
            System.out.println("Empty List");
        }
        Node temp = this.head;
        for (int i=0; i < this.length; i++){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}

