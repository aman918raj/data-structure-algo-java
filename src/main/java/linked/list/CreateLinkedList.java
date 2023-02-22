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

    public boolean prepend(int value){
        Node new_node = new Node(value);
        if (this.length == 0){
            this.head = new_node;
            this.tail = new_node;
            this.length += 1;
            return true;
        }
        new_node.next = this.head;
        this.head = new_node;
        this.length += 1;
        return true;
    }

    public Node popFirst(){
        if (this.length == 0){
            return null;
        }
        Node temp = this.head;
        if (this.length == 1){
            this.head = null;
            this.tail = null;
            this.length -= 1;
            return temp;
        }else{
            this.head = this.head.next;
            temp.next = null;
            this.length -= 1;
            return temp;
        }
    }

    public Node get(int index){
        if (index >= this.length || index < 0 ){
            return null;
        }
        if (index == 0){
            return this.head;
        }
        Node temp = this.head;
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;

    }

    public boolean setValue(int index, int value){
        Node temp = get(index);
        if (temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if (index > this.length || index < 0) return false;
        if (index == 0) return this.prepend(value);
        if (index == this.length) return this.append(value);
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        this.length += 1;
        return true;
    }
    /*
    public Node remove(int index){
        if(index >= this.length || index < 0){

        }
    }*/

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

