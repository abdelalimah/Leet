import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class DepthForSearchIterative<T> {
    private Stack<T> verticesStack;
    private ArrayList<T> visitedVertices;
    private HashMap<T,ArrayList<T>> adjacencyList;

    public DepthForSearchIterative(){
        this.visitedVertices = new ArrayList<>();
        this.verticesStack = new Stack<>();
        this.adjacencyList = new HashMap<>();
    }

    public void insertVertex(T vertex){
        adjacencyList.put(vertex,new ArrayList());
    }

    public void addEdge(T vertex1,T vertex2){
        adjacencyList.get(vertex1).add(vertex2);
        adjacencyList.get(vertex2).add(vertex1);
    }

    public void getElements(){
        for (T key:
                adjacencyList.keySet()) {
            System.out.println("Key : "+key+" Values : "+adjacencyList.get(key));
        }
    }

    public void DFSI(T vertex){
        verticesStack.push(vertex);
        while(!verticesStack.isEmpty()){
            T vertice = verticesStack.pop();
            if(!visitedVertices.contains(vertice)){
                visitedVertices.add(vertice);
                for (T value:
                     adjacencyList.get(vertice)) {
                    verticesStack.push(value);
                }
            }
        }

        for (T value:
             visitedVertices) {
            System.out.println("element visited : "+value);
        }
    }
}
