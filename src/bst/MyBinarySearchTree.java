package bst;

import nodeItem.MyList;
import nodeItem.NodeItem;

public class MyBinarySearchTree implements MyList {

    private NodeItem root;
    private int size;

    public MyBinarySearchTree() {
        this(null);
    }

    public MyBinarySearchTree(NodeItem root) {
        this.root = root;
        size = root != null ? 1 : 0;
    }

    @Override
    public boolean addItem(NodeItem value) {
        if (this.root == null) {
            size++;
            this.root = value;

            return true;
        }
        boolean result = add(this.root, value);
        if (result) {
            size++;
        }
        return result;
    }

    //    Add value recursively to the BST
    private boolean add(NodeItem currentRoot, NodeItem value) {
        int compare = value.compareTo(currentRoot);
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

    //    remove first occurrence of passed item value from BST
    @Override
    public NodeItem removeItem(NodeItem item) {
        if (item == null || item.getValue() == null) {
            System.out.println("Item has no value");
            return null;
        }

        if (this.root == null) {
            System.out.println("BST is empty");
            return null;
        }


        return remove(null, this.root, item);
    }

    //    delete value, it returns successor subtree, otherwise null
    private NodeItem remove(NodeItem ParentRoot, NodeItem currentNode, NodeItem toBeDeleted) {
        if (currentNode == null) {
            return null;
        }
        int compare = currentNode.compareTo(toBeDeleted);
        if (compare > 0) {
            currentNode.setLeftNode(remove(currentNode, currentNode.leftNode(), toBeDeleted));
        } else if (compare < 0) {
            currentNode.setRightNode(remove(currentNode, currentNode.rightNode(), toBeDeleted));
        } else {
//            Is current node is equal, so this node should be deleted
//            case1:
            if (currentNode.rightNode() == null && currentNode.leftNode() == null) {
                //  if this is first item in BST
                if (ParentRoot == null) {
                    this.root = null;
                }
                return null;
            }
//            case 2:
            if (currentNode.rightNode() != null && currentNode.leftNode() == null) {
                if (ParentRoot == null) {
                    //     if this is first item in BST
                    this.root = currentNode.rightNode();
                }
                return currentNode.rightNode();
            } else if (currentNode.rightNode() == null && currentNode.leftNode() != null) {
                if (ParentRoot == null) {
                    //     if this is first item in BST
                    this.root = currentNode.leftNode();
                }
                return currentNode.leftNode();
            } else {
//                case 3: if there is left and right nodes
                NodeItem replacement = findMinInRightSubTree(currentNode.rightNode(), currentNode.rightNode());
                if (ParentRoot == null) {
                    //     if this is first item in BST
                    this.root.setValue(replacement.getValue());
                    return remove(this.root, this.root.rightNode(), replacement);
                }
                currentNode.setValue(replacement.getValue());
                return remove(currentNode, currentNode.rightNode(), replacement);
            }

        }


        return null;

    }

    private NodeItem findMinInRightSubTree(NodeItem currentNode, NodeItem currentMin) {
        while (currentNode != null) {
            int compare = currentMin.compareTo(currentNode);
            if (compare > 0) {
                currentMin = currentNode;
            }
            currentNode = currentNode.leftNode();
        }

        return currentMin;
    }

    @Override
    public NodeItem rootObject() {
        return this.root;
    }

    @Override
    public NodeItem lastObject() {
        System.out.println("Not implemented in Binary search Tree, will always return null");
        return null;
    }

    @Override
    public void traverse() {

    }

    @Override
    public int listSize() {

        return this.size;
    }
}
