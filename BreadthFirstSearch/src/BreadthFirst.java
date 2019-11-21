import java.beans.Visibility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirst<T> {

    private HashMap<T, ArrayList<T>> adjacencyList;
    private ArrayList<T> visited;
    private Queue<T> queue;

    BreadthFirst(){
        adjacencyList = new HashMap<>();
        visited = new ArrayList<>();
        queue = new LinkedList<>();
    }

    void addVertex(T vertex){
        adjacencyList.put(vertex,new ArrayList<>());
    }

    void getElement(){
        for (T key:
             adjacencyList.keySet()) {
            System.out.println(key+" "+adjacencyList.get(key));
        }
    }

    void addEdges(T vertex1 , T vertex2){
        adjacencyList.get(vertex1).add(vertex2);
        adjacencyList.get(vertex2).add(vertex1);
    }

    void BFS(T vertex) {
            visited.add(vertex);
            queue.add(vertex);
            while(!queue.isEmpty()){
                for (T value:
                     adjacencyList.get(queue.peek())) {
                    if(!visited.contains(value)){
                        queue.add(value);
                        visited.add(value);
                    }
                }
                queue.remove();
            }
        for (T value:
             visited) {
            System.out.print(value);
        }
        }
}
