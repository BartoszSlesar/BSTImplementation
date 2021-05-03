package nodeItem;

public abstract class NodeItem {

    protected NodeItem rightNode = null;
    protected NodeItem leftNode = null;
    private Object value;

    public NodeItem(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public abstract int compareTo(NodeItem item);

    public abstract NodeItem rightNode();

    public abstract NodeItem leftNode();

    public abstract NodeItem setRightNode(NodeItem rightNode);

    public abstract NodeItem setLeftNode(NodeItem setPrevious);


}
