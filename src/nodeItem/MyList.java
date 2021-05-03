package nodeItem;

public interface MyList {
    boolean addItem(NodeItem value);

    NodeItem removeItem(NodeItem item);

    NodeItem rootObject();

    NodeItem lastObject();

    void traverse();

    int listSize();


}
