package linkedList;

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

    public Node remove(int index){
        if(index >= this.length || index < 0){
            return null;
        }
        if(index == 0) return popFirst();
        if (index == this.length - 1)  return pop();
        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        this.length -= 1;
        return temp;
    }

    public void reverse(){
        Node temp = this.head;
        Node before = null;
        Node after = temp.next;
        this.head = this.tail;
        this.tail = temp;
        for(int i = 0; i < this.length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public Node middleElement(){
        Node slow = this.head;
        Node fast = this.head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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

