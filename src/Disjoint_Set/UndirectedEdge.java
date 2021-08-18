package Disjoint_Set;

public class UndirectedEdge {
    WeightedNode first;
    WeightedNode second;
    int weight;


    UndirectedEdge(WeightedNode first, WeightedNode second,int weight){
        this.first = first;
        this.second = second;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge ("+first+","+second+"), weight = " +weight;
    }
}
