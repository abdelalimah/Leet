public class LinkedList<T extends Comparable<T>> implements List<T>{

    private Node<T> root;
    private int sizeOfList;

    @Override
    public void insert(T data) {

        ++this.sizeOfList;
        if( root == null ) {
            this.root = new Node<>(data);
        }else {
            insertDataAtBeginning(data);
        }

    }

    private void insertDataAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        this.root = newNode;
    }

    private void insertDataAtEnd(T data, Node<T> node){
        if(node.getNextNode() != null) {
            insertDataAtEnd(data, node.getNextNode());
        }else{
            Node<T> newNode = new Node<>(data);
            newNode.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {

        if(this.root == null) return ;
        --sizeOfList;
        if(this.root.getData().compareTo(data) == 0){

        }

    }

    @Override
    public void traverseList() {

    }

    @Override
    public int size() {
        return 0;
    }
}
