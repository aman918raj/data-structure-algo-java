package linked.list;

public class TestList {

    public static void main(String[] args) {
        CreateLinkedList linkedList = new CreateLinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.print_values();
        System.out.println(linkedList.pop().value);
        linkedList.print_values();
    }
}
