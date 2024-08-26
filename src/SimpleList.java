public class SimpleList<T> {
    Node header;

    public void add(T value){
        Node newNode = new Node<T>();
        newNode.setInfo(value);
        newNode.setPointer(null);

        if(header == null){
            header = newNode;
        }else{
            Node lastNode = header;
            while (lastNode.getPointer() != null) {
                lastNode = lastNode.getPointer();
                
            }
            lastNode.setPointer(newNode);
        }
        
        
    }

    public void addFromStart(T value){
        Node newNode = new Node<T>();
        newNode.setInfo(value);
        
        if(header == null){
            newNode.setPointer(null);
            header=newNode;
        }else{
            newNode.setPointer(header);
            header = newNode;
            
        }
        
    }



    public void showList(){
        Node lastNode = header;
        System.out.println(header.getInfo());
        System.out.println(header.getPointer());

        while (lastNode.getPointer() != null) {
            lastNode = lastNode.getPointer();
            System.out.println(lastNode.getInfo());
            System.out.println(lastNode.getPointer());
                
        }
        

    }
    
}
