package Hashing.Open_Adressing.Double_Hashing;

public class Main {
    public static void main(String[] args) {
        DoubleHashing dh = new DoubleHashing(12);
        dh.insertInHashTable("The");
        dh.insertInHashTable("Quick");
        dh.insertInHashTable("Brown");
        dh.insertInHashTable("Fox");
        dh.insertInHashTable("Over");
        dh.displayHashTable();
    }
}
