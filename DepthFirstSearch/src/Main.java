import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DepthForSearchIterative<String> a = new DepthForSearchIterative<>();
        a.insertVertex("A");
        a.insertVertex("B");
        a.insertVertex("D");
        a.insertVertex("C");
        a.insertVertex("E");
        a.insertVertex("F");

        a.addEdge("A","B");
        a.addEdge("A","C");
        a.addEdge("B","D");
        a.addEdge("C","E");
        a.addEdge("D","E");
        a.addEdge("D","F");
        a.addEdge("E","F");
        a.getElements();
        a.DFSI("A");
    }
}
