package Disjoint_Set;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();
        nodeList.add(new WeightedNode("A"));
        nodeList.add(new WeightedNode("B"));
        nodeList.add(new WeightedNode("C"));
        nodeList.add(new WeightedNode("D"));
        nodeList.add(new WeightedNode("E"));

        // DisjointSet.makeSet(nodeList);
        // WeightedNode firstNode = nodeList.get(0);
        // WeightedNode secondNode = nodeList.get(1);
        // DisjointSet output = DisjointSet.findSet(secondNode);
        // output.printAllNodesofThisSet();

        // DisjointSet.union(firstNode, secondNode);
        // output = DisjointSet.findSet(secondNode);
        // output.printAllNodesofThisSet();

        // Kruskal graph = new Kruskal(nodeList);
        Prims graph = new Prims(nodeList);
        graph.addWeightedUndirectedEdge(0,1,5);
        graph.addWeightedUndirectedEdge(0,2,13);
        graph.addWeightedUndirectedEdge(0,4,15);
        graph.addWeightedUndirectedEdge(1,2,10);
        graph.addWeightedUndirectedEdge(1,3,8);
        graph.addWeightedUndirectedEdge(2,3,6);
        graph.addWeightedUndirectedEdge(2,4,20);

        // System.out.println("Running Kruskal algo for this graph");
        // graph.kruskal();

        System.out.println("Running Prims algorithm for this graph");
        graph.prims(nodeList.get(4));
    }
}
