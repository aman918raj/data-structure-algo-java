package doublyLinkedList;

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

    public Node get(int index){
        if (index >= this.length || index < 0){
            return null;
        }
        if (index == 0) return this.head;
        if (index == this.length - 1) return this.tail;
        if (index == 1) return this.head.next;
        Node temp = this.head;
        if (index < this.length / 2){
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
        }else {
            temp = this.tail;
            for (int i = this.length - 1; i > index; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean setValue(int index, int value){
        Node temp = this.get(index);
        if (temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if (index > this.length || index < 0){
            return false;
        }
        if (index == 0) return this.prepend(value);
        if (index == this.length) return this.append(value);

        Node newNode = new Node(value);
        Node temp = this.get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        this.length += 1;
        return true;
    }

    public Node remove(int index){
        if (index >= this.length || index < 0){
            return null;
        }
        if (index == 0) return this.pop();
        if (index == this.length - 1) return this.pop_first();
        Node temp = this.get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;
        this.length -= 1;
        return  temp;
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
