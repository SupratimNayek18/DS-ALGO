package Hashing.Open_Adressing.Double_Hashing;
import java.util.*;

public class DoubleHashing {
    String[] hashTable;
    int noOfCellsUsedInHashTable;

    //constructor
    DoubleHashing(int size){
        hashTable = new String[size];
        noOfCellsUsedInHashTable = 0;
    }

    //mod hash function
    int modASCIIHashFunction(String word,int M){
        char ch[];
        ch = word.toCharArray();
        int i,sum;
        for(sum=0,i=0;i<word.length();i++){
            sum = sum + ch[i];
        }
        return sum%M;
    }

    private int addAllDigitsTogether(int sum){
        int value = 0;
        while(sum>0){
            value = sum%10;
            sum = sum/10;
        }
        return value;
    }

    int secondHashFunction(String word,int M){
        char ch[];
        ch  = word.toCharArray();
        int i,sum;
        for(sum= 0,i=0;i<word.length();i++){
            sum += ch[i];
        }
        while(sum>hashTable.length){
            sum = addAllDigitsTogether(sum);
        }
        return sum%M;
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

    double getLoadFactor(){
        return noOfCellsUsedInHashTable * 1.0/hashTable.length;
    }

    void insertInHashTable(String word){
        double loadFactor = getLoadFactor();
        if(loadFactor>=0.75){
            rehashKeys(word);
        }else{
            int x = modASCIIHashFunction(word,hashTable.length);
            int y = secondHashFunction(word,hashTable.length);
            System.out.println(x+" "+y); 
            for(int i = 0; i < hashTable.length; i++){
                int newIndex = (x + i*y) % hashTable.length;
                if(hashTable[newIndex]==null){
                    hashTable[newIndex] = word;
                    System.out.println(word + " has been inserted at location " + newIndex);
                    break;
                }else{
                    System.out.println(newIndex + " Index occupied. Trying next index ");
                }
            }
        }
        noOfCellsUsedInHashTable++;
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
}
