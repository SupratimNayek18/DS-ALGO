package Hashing.Open_Adressing.Linear_Probing;

public class Main {
    public static void main(String[] args) {
        LinearProbing lp = new LinearProbing(13);
        lp.insertInHashTable("The");
        lp.insertInHashTable("Quick");
        lp.insertInHashTable("Brown");
        lp.insertInHashTable("Fox");
        lp.insertInHashTable("Over");
        lp.displayHashTable();
        // lp.searchInHashTable("fox");
        lp.deleteInHashTable("Fox");
        lp.displayHashTable();
    }
}
