public class raxitLinkList<T>{

    private Node<T> head;
    private Node<T> tail;
    //add
    public void add(T element){
        Node<T> newnode = new Node<T>();
        newnode.setValue(element);
        if(head == null){
            head = newnode;
            tail = newnode;
        } else {
            tail.setnextNode(newnode);
            tail = newnode;
        }
    }
    //addAfter
    public void addAfter(T element,T after){
        Node<T> temp = head;
        Node<T> locatedNode = null;
        while(true){
            if(temp == null){
                break;
            }
            if(temp.compareTo(after) == 0){
                locatedNode = temp;
                break;
            }
            temp = temp.getnextNode();
        }

        if(locatedNode != null) {
            Node<T> newnode = new Node<T>();
            newnode.setValue(element);
            newnode.setnextNode(temp.getnextNode());
            if (temp == tail) {
                tail = newnode;
            }
            temp.setnextNode(newnode);
        }else {
            System.out.println("After node not found");
        }
    }
    //deletAfter
    public  void deleteAfter(T after){
        Node<T> temp = head;
        Node<T> locatedNode = null;
        while(true){
            if(temp == null){
                break;
            }
            if(temp.compareTo(after) == 0){
                locatedNode = temp;
                break;
            }
            temp = temp.getnextNode();
        }
        if(locatedNode != null)
        {
            temp = locatedNode.getnextNode();
            locatedNode.setnextNode(temp.getnextNode());
            if(locatedNode.getnextNode() == null){
                tail = locatedNode;
            }
        }else {
            System.out.println("After node not found");
        }
    }
    //deleteHead
    public void deleteHead(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node<T> temp = head;
        head  = temp.getnextNode();
        if(head == null){
            tail = null;
        }
    }
    //list all
    public void listall(){

        Node<T> tmp = head;
        while(true){
            if(tmp == null){
                break;
            }
            System.out.println(tmp.getValue());
            tmp = tmp.getnextNode();
        }
    }

    public static void main(String[] args) {
        raxitLinkList<Integer> sl = new raxitLinkList<Integer>();
        sl.add(3);
        sl.add(32);
        sl.add(54);
        sl.add(89);
        sl.addAfter(76, 54);
        sl.deleteHead();
        sl.deleteAfter(76);
        sl.listall();
    }
}