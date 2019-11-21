import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class DepthForSearch<T> {

    private HashMap<T, ArrayList<T>> adjacencyList;
    private ArrayList<T> visitedVertices;

    public DepthForSearch(){
        visitedVertices = new ArrayList<>();
        adjacencyList = new HashMap<>();
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

    public void DFSR(T vertex){
        DFSRhelper(vertex);
        for (T value:
            visitedVertices) {
            System.out.println("element visited "+value);
        }
    }

    private ArrayList DFSRhelper(T vertex){
        if(adjacencyList.get(vertex) == null){
            return null;
        }else {
            visitedVertices.add(vertex);
            for (T connectedToVertex:
                 adjacencyList.get(vertex)) {
                if(!visitedVertices.contains(connectedToVertex)){
                    DFSRhelper(connectedToVertex);
                }
            }
        }
        return visitedVertices;
    }
}