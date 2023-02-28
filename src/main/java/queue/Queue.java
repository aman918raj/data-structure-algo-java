package queue;

public class Queue {

    Node first;
    Node last;
    int length;

    Queue(){
        this.first = null;
        this.last = null;
        this.length = 0;
    }
    
    public boolean enqueue(int value){
        Node newNode = new Node(value);
        if (this.length == 0){
            this.first = newNode;
            this.last = newNode;
        }else{
            this.last.next = newNode;
            this.last = newNode;
        }
        this.length += 1;
        return true;
    }

    public Node dequeue(){
        if (this.length == 0){
            return null;
        }
        Node temp = this.first;
        if (this.length == 1){
            this.first = null;
            this.last = null;
        }else{
            this.first = this.first.next;
            temp.next = null;
        }
        this.length -= 1;
        return temp;
    }

    public void print_queue(){
        Node temp = this.first;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }


}
