package test;

import graph.*;

public class TestGraph {

    public static void main(String[] args) {
        Vertex v = new Vertex(1, "v", "red");
        Vertex w = new Vertex(2, "w", "blue");
        Vertex[] tab = { v, w };
    
        Edge e = new Edge(1, "e", 4, tab);
        
        System.out.println("lul");
    }


}
