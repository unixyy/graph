package graph;
public class Edge {
    private int id;
    private String color;
    private double value;
    private Vertex[] ends;

    /**
     * Constructor for objects of class Edge
     * @param id of the edge
     * @param color of the edge
     * @param value of the edge
     * @param ends Vertex that represents the ends of the edge
     */
    public Edge(int id, String color, double value, Vertex[] ends) {
        this.id = id;
        this.color = color;
        this.value = value;
        this.ends = ends;
    }
    /**
     * @return the Vertex[] ends
     */
    public Vertex[] getEnds() {
        return ends;
    }
}
