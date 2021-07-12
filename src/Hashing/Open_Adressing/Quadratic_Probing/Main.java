package Hashing.Open_Adressing.Quadratic_Probing;

public class Main {
    public static void main(String[] args) {
        QuadraticProbing qp = new QuadraticProbing(13);
        qp.insertInHashTable("The");
        qp.insertInHashTable("Quick");
        qp.insertInHashTable("Brown");
        qp.insertInHashTable("Fox");
        qp.insertInHashTable("Over");
        qp.displayHashTable();
    }
}
