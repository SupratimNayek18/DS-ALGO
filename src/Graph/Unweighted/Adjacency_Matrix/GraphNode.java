package Graph.Unweighted.Adjacency_Matrix;

public class GraphNode {
    String name;
    int index;
    boolean isVisited = false;
    GraphNode parent = null;
    
    GraphNode(String name, int index){
        this.name = name;
        this.index = index;
    }
}
