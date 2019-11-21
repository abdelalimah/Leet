public class Main {

    public static void main(String[] args) {
        BreadthFirst<String> a = new BreadthFirst<String>();
        a.addVertex("A");
        a.addVertex("B");
        a.addVertex("C");
        a.addVertex("D");
        a.addVertex("E");
        a.addVertex("F");

        a.addEdges("A","B");
        a.addEdges("A","C");
        a.addEdges("B","D");
        a.addEdges("C","E");
        a.addEdges("D","E");
        a.addEdges("D","F");
        a.addEdges("E","F");
        a.getElement();
        a.BFS("A");
    }
}