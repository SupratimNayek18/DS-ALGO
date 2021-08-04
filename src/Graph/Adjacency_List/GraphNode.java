package Graph.Adjacency_List;

import java.util.ArrayList;

public class GraphNode {
    String name;
    int index;
    boolean isVisited = false;

    ArrayList<GraphNode> neighbours = new ArrayList<GraphNode>();

    GraphNode(String name,int index) {
        this.name = name;
        this.index = index;
    }
}
