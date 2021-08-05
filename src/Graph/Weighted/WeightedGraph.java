package Graph.Weighted;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class WeightedGraph {
    ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();

    WeightedGraph(ArrayList<WeightedNode> nodeList){
        this.nodeList = nodeList;
    }

    void dijkstra(WeightedNode node) {
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        node.distance = 0;
        queue.addAll(nodeList);
        while(!queue.isEmpty()){
            WeightedNode currentNode = queue.remove(); 
            System.out.println("Current Node Popped : " + currentNode);
            for(WeightedNode neighbour : currentNode.neighbours){ 
                if(queue.contains(neighbour)){
                    if(neighbour.distance>currentNode.distance+currentNode.weightMap.get(neighbour)){
                        neighbour.distance = currentNode.distance+currentNode.weightMap.get(neighbour);
                        neighbour.parent = currentNode;
                        System.out.println("Parent Name : " + neighbour.parent.name);
                        queue.remove(neighbour);
                        queue.add(neighbour);
                    }
                }
            }
        }

        for(WeightedNode nodeToCheck : nodeList){
            System.out.print("Node "+nodeToCheck+", distance: "+nodeToCheck.distance+", Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }

    void pathPrint(WeightedNode node){
        if(node.parent != null){
            pathPrint(node.parent);
        }
        System.out.print(node.name+" ");
    }

    void addWeightedEdge(int i,int j,int d){
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.neighbours.add(second);
        first.weightMap.put(second,d);
    }
}
