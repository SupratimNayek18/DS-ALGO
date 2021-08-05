package Graph.Weighted;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedNode implements Comparable<WeightedNode>{
    String name;
    ArrayList<WeightedNode> neighbours = new ArrayList<WeightedNode>();
    HashMap<WeightedNode,Integer> weightMap = new HashMap<>();
    boolean isVisited = false;
    WeightedNode parent = null;
    int distance;
    int index;

    WeightedNode(String name, int index){
        this.name = name;
        distance = Integer.MAX_VALUE;
        this.index = index;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(WeightedNode o){
        return this.distance - o.distance;
    }
}
