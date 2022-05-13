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
        return this.getEnds()[this.source];
    }

    /**
     * @return the Sink of the directed Edge
     *  */  
    public Vertex getSink() {
        return this.source==0 ? this.getEnds()[1] : this.getEnds()[0];
    }
}
