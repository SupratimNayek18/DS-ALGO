package Hashing.Direct_Chaining;

class Main {
    public static void main(String[] args) {
        DirectChaining dc = new DirectChaining(13);
        dc.insertHashTable("The");
        dc.insertHashTable("Quick");
        dc.insertHashTable("Brown");
        dc.insertHashTable("Fox");
        dc.insertHashTable("Over");
        dc.displayHashTable();
        dc.searchHashTable("Brown");
        dc.deleteHastable("Quick");
        dc.displayHashTable();
    }
}
