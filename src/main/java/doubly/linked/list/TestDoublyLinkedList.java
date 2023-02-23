package doubly.linked.list;

public class TestDoublyLinkedList {

    public static void main(String[] args){
        DoublyLinkedList dbl = new DoublyLinkedList();
        System.out.println("---append----");
        dbl.append(4);
        dbl.append(8);
        dbl.append(1);
        dbl.append(3);
        System.out.println("---print list-----");
        dbl.print_values();
        System.out.println("-----pop--------");
        System.out.println(dbl.pop().value);
        System.out.println("---print list-----");
        dbl.print_values();
        System.out.println("---append----");
        dbl.append(3);
        System.out.println("---print list-----");
        dbl.print_values();
        System.out.println("---prepend----");
        dbl.prepend(7);
        System.out.println("---print list-----");
        dbl.print_values();
        System.out.println("-----pop first--------");
        System.out.println(dbl.pop_first().value);
        System.out.println("---print list-----");
        dbl.print_values();
        System.out.println("-------get--------");
        System.out.println(dbl.get(2).value);
        System.out.println("-------set--------");
        dbl.setValue(2,5);
        System.out.println("---print list-----");
        dbl.print_values();
        System.out.println("--------insert-----------");
        dbl.insert(1,9);
        System.out.println("---print list-----");
        dbl.print_values();

    }
}
