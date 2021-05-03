package bst;

import nodeItem.MyList;
import nodeItem.NodeItem;

public class MyBinarySearchTree implements MyList {

    private NodeItem root;


    public MyBinarySearchTree() {
        this(null);
    }

    public MyBinarySearchTree(NodeItem root) {
        this.root = root;
    }

    @Override
    public boolean addItem(NodeItem value) {
        return false;
    }

    @Override
    public NodeItem removeItem(NodeItem Item) {
        return null;
    }

    @Override
    public NodeItem rootObject() {
        return null;
    }

    @Override
    public NodeItem lastObject() {
        return null;
    }

    @Override
    public void traverse() {

    }

    @Override
    public int listSize() {
        return 0;
    }
}
