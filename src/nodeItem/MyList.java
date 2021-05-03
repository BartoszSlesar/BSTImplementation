package nodeItem;

public interface MyList {
    boolean addItem(NodeItem value);

    NodeItem removeItem(NodeItem Item);

    NodeItem rootObject();

    NodeItem lastObject();

    void traverse();

    int listSize();


}
