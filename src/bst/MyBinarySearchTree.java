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
        if (this.root == null) {
            this.root = value;
            return true;
        }

        return add(this.root, value);
    }

    private boolean add(NodeItem currentRoot, NodeItem value) {
        int compare = currentRoot.compareTo(value);
        if (compare > 0) {
            if (currentRoot.rightNode() == null) {
                currentRoot.setRightNode(value);
                return true;
            } else {
                return add(currentRoot.rightNode(), value);
            }
        } else {
            if (currentRoot.leftNode() == null) {
                currentRoot.setLeftNode(value);
                return true;
            } else {
                return add(currentRoot.leftNode(), value);
            }
        }

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
