package Greedy_Algorithms.FractionalKnapsackProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class FractionalKnapsack {
    
    static void knapSack(ArrayList<KnapsackItem> items,int capacity){
        Comparator<KnapsackItem> comparator = new Comparator<KnapsackItem>(){
            @Override
            public int compare(KnapsackItem o1,KnapsackItem o2){
                if(o2.getRatio()>o1.getRatio()) return 1;
                else return -1;
            }
        };
        Collections.sort(items, comparator);
        int usedCapacity = 0;
        double totalValue = 0;

        for(KnapsackItem item: items){
            if(usedCapacity + item.getWeight()<=capacity){
                usedCapacity += item.getWeight();
                System.out.println("Taken: "+item);
                totalValue+=item.getValue();
            }else{
                int usableWeight = capacity - usedCapacity;
                double value = item.getRatio()*usableWeight;
                System.out.println("Taken: item index: "+item.getIndex()+", obtained value= "
                +value+", used weight= "+usableWeight+", ratio= "+item.getRatio());
                usedCapacity+=usableWeight;
                totalValue+=value;
            }
            if(usedCapacity==capacity) break;
        }
        System.out.println("\nTotal Value obtained: "+totalValue);
    }
}
