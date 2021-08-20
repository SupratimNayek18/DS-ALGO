package Greedy_Algorithms.FractionalKnapsackProblem;

class KnapsackItem {
    
    private int index;
    private int value;
    private int weight;
    private double ratio;
    
    KnapsackItem(int index,int value,int weight){
        this.index = index;
        this.value = value;
        this.weight = weight;
        ratio = value*1.0/weight;
    }

    int getIndex(){
        return index;
    }

    void setIndex(int index){
        this.index = index;
    }

    int getValue(){
        return value;
    }

    void setValue(int value){
        this.value = value;
    }

    int getWeight(){
        return weight;
    }

    void setWeight(int weight){
        this.weight = weight;
    }

    double getRatio(){
        return ratio;
    }

    void setRatio(double ratio){
        this.ratio = ratio;
    }

    @Override
    public String toString(){
        return "Item index: "+index+", value: "+value+", weight: "+weight+", ratio: "+ratio;
    }
}
