public class Node<T extends Comparable<T>> {

    private Node<T> nextNode;
    private T data;

    public Node(T data){
        this.data = data;
    };

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}