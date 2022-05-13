package graph;
public class Vertex {
    private int id;
    private Object data;
    private String color;
    
    /**
     * Constructor for objects of class Vertex
     * @param id of the vertex
     * @param data of the vertex
     * @param color of the vertex
     * */
    public Vertex(int id, Object data, String color) {
        this.id = id;
        this.data = data;
        this.color = color;
    }
    
    /**
     * @return the toString
     */
    public String toString() {
        return "Vertex " + id + ": " + data + " " + color;
    }
}
