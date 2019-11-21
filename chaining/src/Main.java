import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.put(1,10);
        System.out.println();
        hashTable.put(2,20);
        System.out.println();
        hashTable.put(3,30);
        System.out.println();
        hashTable.put(4,40);
        System.out.println();
        hashTable.put(5,60);
        System.out.println(hashTable.get(5));
    }
}
