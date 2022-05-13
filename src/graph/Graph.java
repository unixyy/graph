package graph;

public interface Graph {

    /**.
     * @return the number of vertices in the graph
     **/
    public int nbOfVertices();


    /**.
     * @return the number of edges in the graph
     * **/
    public int nbOfEdges();
    
    /**.
     * @param v the vertex to add
     * **/
    public void addVertex(Vertex v);

    /**.
     * @param e the edge to add
     * **/
    public void addEdge(Edge e);

    /**.
     * @param v first vertex to check
     * @param w second vertex to check
     * @return true if the two vertices are connected, false otherwise
     * **/
    public Boolean isConnected(Vertex v, Vertex w);

    /**.
     * @return true if all vertices are connected, false otherwise
     * **/
    public Boolean isConnected();

    /**.
     * @param v first vertex to check
     * @param w second vertex to check
     * @return edges directly connected to vertices v and w
     * **/
    public Edge[] getEdge(Vertex v,Vertex w);
    
    /**.
     * @return all the Edges in the graph
     * **/
    public Edge[] getEdges();

    /**.
     * @return all the Vertices in the graph
     * **/
    public Vertex[] getVertices();

    /**.
     * @param v the vertex to check
     * @return the edges that are connected to the vertice v
     * **/
    public Edge[] getNeighborEdges(Vertex v);


}
