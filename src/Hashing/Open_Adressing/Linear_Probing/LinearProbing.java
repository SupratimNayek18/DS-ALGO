package Hashing.Open_Adressing.Linear_Probing;
import java.util.*;

public class LinearProbing {
    String[] hashTable;
    int usedCellNumber;
    LinearProbing(int size){
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    int modASCIIHashFunction(String word,int M){
        char ch[];
        ch = word.toCharArray();
        int sum,i;
        for(sum = 0, i = 0;i<word.length();i++){
            sum = sum + ch[i];
        }
        return sum%M;
    }

    // loadfactor for better performance of hashTable.
    // If>0.7 need to create new hashTable
    double getLoadFactor(){
        double loadFactor = usedCellNumber * 1.0/hashTable.length;
        return loadFactor;
    }

    void rehashKeys(String word){
        ArrayList<String> data = new ArrayList<String>();
        for(String s : hashTable){
            if(s!=null){
                data.add(s);
            }
        }
            data.add(word);
            hashTable = new String[hashTable.length*2];
            for(String s : data){
                insertInHashTable(s);
            }   
    }


    void insertInHashTable(String word){
        double loadFactor = getLoadFactor();
        if(loadFactor>=0.75){
            rehashKeys(word);
        }else{
            int index = modASCIIHashFunction(word,hashTable.length);
            for(int i = index;i<index+hashTable.length;i++){
                int newIndex = i % hashTable.length;
                if(hashTable[newIndex]==null){
                    hashTable[newIndex] = word;
                    System.out.println("The "+word+" successfully inserted at location: "+newIndex);
                    break;
                }else{
                    System.out.println(newIndex+" is already occupied. Trying next cell");
                }
            }
        }
        usedCellNumber++;
    }

    void displayHashTable(){
        if(hashTable==null){
            System.out.println("Hashtable does not exist");
            return;
        }else{
            System.out.println("---------Hashtable---------");
            for(int i=0;i<hashTable.length;i++){
                System.out.println("Index "+i+",key:"+hashTable[i]);
            }
        }
    }

    int searchInHashTable(String word){
        int index = modASCIIHashFunction(word,hashTable.length);
        for(int i = index;i<index+hashTable.length;i++){
            int newIndex = i%hashTable.length;
            if(hashTable[newIndex]!=null && hashTable[newIndex].equals(word)){
                System.out.println(word+" found at location "+newIndex);
                return newIndex;
            }
        }
        System.out.println(word+" not found in hashTable");
        return -1;
    }

    void deleteInHashTable(String word) {
        int index = searchInHashTable(word);
        if(index>-1){
            hashTable[index] = null;
            System.out.println(word+" deleted from hashTable");
        }else{
            System.out.println(word+" not found in hashTable");
        }
    }

    void deleteHastable(){
        hashTable = null;
        System.out.println("HashTable deleted");
    }
}
