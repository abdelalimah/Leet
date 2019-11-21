public class Main {

    public static void main(String[] args) {
        HashTable a = new HashTable();
        a.put(1,10);
        System.out.println();
        a.put(2,100);
        System.out.println();
        a.put(3,1000);
        System.out.println();
        a.put(4,10000);
        System.out.println();
        System.out.println(a.get(4));
    }
}
