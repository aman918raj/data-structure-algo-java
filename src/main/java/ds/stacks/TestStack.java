package ds.stacks;

public class TestStack {

    public static void main(String[] args) {

        Stack st = new Stack();
        System.out.println("-----push-----");
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println("-----print-----");
        st.print_stack();
        System.out.println("-----pop----");
        System.out.println(st.pop().value);
        System.out.println("-----print-----");
        st.print_stack();
    }
}
