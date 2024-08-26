
public class Node<T> {
    private T info;
    private Node pointer;

    Node(){
        this.info = null;
        this.pointer= null;
    }

    public Node(T info, Node pointer) {
        this.info = info;
        this.pointer = pointer;
    }

    public T getInfo(){
        return info;
    }

    public void setInfo(T info){
        this.info = info;
    }

    public Node getPointer(){
        return pointer;
    }

    public void setPointer(Node node){
        this.pointer = node;
    }
    
}
