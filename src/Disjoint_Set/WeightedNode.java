package Disjoint_Set;

import java.util.ArrayList;
import java.util.HashMap;

class WeightedNode implements Comparable<WeightedNode>{
    String name;
    ArrayList<WeightedNode> neighbours = new ArrayList<WeightedNode>();
    HashMap<WeightedNode,Integer> weightMap = new HashMap<>();
    boolean isVisited = false;
    WeightedNode parent = null;
    int distance;
    DisjointSet set;

    WeightedNode(String name){
        this.name = name;
        distance = Integer.MAX_VALUE;
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
