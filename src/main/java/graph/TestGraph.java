package graph;

public class TestGraph {

    public static void main(String[] args) {

        Graph g = new Graph();
        System.out.println("-------add vertex-------");
        g.addVertex(10);
        g.addVertex(20);
        g.addVertex(30);
        System.out.println("-------add edge-------");
        g.addEdge(10, 20);
        g.addEdge(20, 30);
        g.addEdge(30, 10);
        System.out.println("-------print graph-------");
        g.print_graph();
        System.out.println("-----remove edge-----");
        g.removeEdge(10,30);
        System.out.println("-------print graph-------");
        g.print_graph();
        System.out.println("-------add edge-------");
        g.addEdge(10, 20);
        g.addEdge(20, 30);
        g.addEdge(30, 10);
        System.out.println("-------print graph-------");
        g.print_graph();
        System.out.println("-----remove edge-----");
        g.removeVertex(10);
        System.out.println("-------print graph-------");
        g.print_graph();

    }
}
