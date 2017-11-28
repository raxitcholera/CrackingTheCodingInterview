class Node<T> implements Comparable<T> {

    private T value;
    private Node<T> nextNode;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getnextNode() {
        return nextNode;
    }

    public void setnextNode(Node<T> ref) {
        this.nextNode = ref;
    }

    @Override
    public int compareTo(T arg) {
        if (arg == this.value) {
            return 0;
        } else {
            return 1;
        }
    }
}