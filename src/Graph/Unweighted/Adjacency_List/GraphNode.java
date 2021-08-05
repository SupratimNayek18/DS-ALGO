package Graph.Unweighted.Adjacency_List;

import java.util.ArrayList;

public class GraphNode {
    String name;
    int index;
    boolean isVisited = false;
    GraphNode parent = null;

    ArrayList<GraphNode> neighbours = new ArrayList<GraphNode>();

    GraphNode(String name,int index) {
        this.name = name;
        this.index = index;
    }
}
