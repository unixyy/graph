package graph;
public class DirectedEdge extends Edge{
    private int source;

    public DirectedEdge(int id, String color, Vertex[] ends,double value, int source) {
        super(id, color,value, ends);
        this.source = source;
    }


    /**
     * @return the source
     * */
    public Vertex getSource() {
        return null;
    }

    /**
     * @return the Sink of the directed Edge
     *  */  
    public Vertex getSink() {
        return null;
    }
}
