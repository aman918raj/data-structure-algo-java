package linked.list;

public class TestList {

    public static void main(String[] args) {
        CreateLinkedList linkedList = new CreateLinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.print_values();
        System.out.println("----------");
        System.out.println(linkedList.pop().value);
        System.out.println("----------");
        linkedList.prepend(3);
        linkedList.prepend(4);
        linkedList.print_values();
        System.out.println("----------");
        System.out.println(linkedList.popFirst().value);
        System.out.println("----------");
        linkedList.print_values();
        System.out.println("----------");
        System.out.println(linkedList.get(2).value);
        System.out.println("----------");
        System.out.println(linkedList.setValue(0,1));
        System.out.println(linkedList.setValue(1,2));
        System.out.println(linkedList.setValue(2,3));
        linkedList.print_values();
        System.out.println("----------");
        System.out.println(linkedList.insert(1, 7));
        linkedList.print_values();
        System.out.println("----------");
        System.out.println(linkedList.remove(2).value);
        linkedList.print_values();
        System.out.println("----------");
        linkedList.reverse();
        linkedList.print_values();
        System.out.println("----------");
        System.out.println(linkedList.middleElement().value);
    }
}
