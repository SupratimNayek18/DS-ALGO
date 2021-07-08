package Hashing.Direct_Chaining;
import java.util.*;

class DirectChaining {
    LinkedList<String>[] hashTable;
    int maxChainSize = 5;

    DirectChaining(int size){
        hashTable = new LinkedList[size];
    }

    int modASCIIHashFunction(String word,int M){
        char ch[];
        ch = word.toCharArray();
        int i,sum;
        for(sum=0,i=0;i<word.length();i++){
            sum = sum+ch[i];
        }
        return sum%M;
    }

    void insertHashTable(String word){
        int newIndex = modASCIIHashFunction(word,hashTable.length);
        if(hashTable[newIndex]==null){
            hashTable[newIndex] = new LinkedList<String>();
            hashTable[newIndex].add(word);
        }else{
            hashTable[newIndex].add(word);
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

    boolean searchHashTable(String word){
        int hashIndex = modASCIIHashFunction(word,hashTable.length);
        if(hashTable[hashIndex]!=null && hashTable[hashIndex].contains(word)){
            System.out.println(word+" found in hashTable at index "+hashIndex);
            return true;
        }else{
            System.out.println(word+" not found in hashTable");
            return false;
        }
    }

    void deleteHastable(String word){
        int newIndex = modASCIIHashFunction(word,hashTable.length);
        boolean result = searchHashTable(word);
        if(result){
            hashTable[newIndex].remove(word);
            System.out.println(word+" has been deleted succesfully");
        }
    }
}
