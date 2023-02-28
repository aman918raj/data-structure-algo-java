package graph;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Graph {

    HashMap<Integer, ArrayList<Integer>> adj_list = new HashMap<>();
    // not creating consturctor. Java will use default constructor

    public boolean addVertex(int vertex) {
        if (!this.adj_list.containsKey(vertex)) {
            this.adj_list.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean addEdge(int v1, int v2) {
        if (this.adj_list.containsKey(v1) && this.adj_list.containsKey(v2)) {
            ArrayList<Integer> al = this.adj_list.get(v1);
            if (!al.contains(v2)) {
                al.add(v2);
                this.adj_list.put(v1, al);
            }

            ArrayList<Integer> al2 = this.adj_list.get(v2);
            if (!al2.contains(v1)) {
                al2.add(v1);
                this.adj_list.put(v2, al2);
            }
            return true;
        }
        return false;
    }

    public boolean removeEdge(int v1, int v2) {
        if (this.adj_list.containsKey(v1) && this.adj_list.containsKey(v2)) {
            ArrayList<Integer> al = this.adj_list.get(v1);
            al.remove(Integer.valueOf(v2));
            this.adj_list.put(v1, al);

            ArrayList<Integer> al2 = this.adj_list.get(v2);
            al2.remove(Integer.valueOf(v1));
            this.adj_list.put(v2, al2);
            return true;
        }
        return false;
    }

    public boolean removeVertex(int v1) {
        if (this.adj_list.containsKey(v1)) {
            ArrayList<Integer> al = this.adj_list.get(v1);
            for (int vertex : al) {
                this.adj_list.get(vertex).remove(Integer.valueOf(v1));
            }
            this.adj_list.remove(v1);
            return true;
        }
        return false;
    }

    public void print_graph() {
        Set<Integer> st = this.adj_list.keySet();
        for (int vertex : this.adj_list.keySet()) {
            System.out.println(vertex + " : " + this.adj_list.get(vertex));
        }
    }

}
