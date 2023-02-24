package ds.stacks;

public class Stack {

    Node top;
    int length;

    Stack(){
        this.top = null;
        this.length = 0;
    }

    public boolean push(int value){
        Node newNode = new Node(value);
        if (this.length == 0){
            this.top = newNode;
        }else{
            newNode.next = this.top;
            this.top = newNode;
        }
        this.length += 1;
        return true;
    }

    public Node pop(){
        if (this.length == 0){
            return null;
        }
        Node temp = this.top;
        if (this.length == 1){
            this.top = null;
        }else{
            this.top = this.top.next;
            temp.next = null;
        }
        this.length -= 1;
        return temp;
    }

    public void print_stack(){
        Node temp = this.top;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
