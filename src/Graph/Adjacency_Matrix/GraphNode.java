package Graph.Adjacency_Matrix;

public class GraphNode {
    String name;
    int index;
    boolean isVisited = false;
    
    GraphNode(String name, int index){
        this.name = name;
        this.index = index;
    }
}
