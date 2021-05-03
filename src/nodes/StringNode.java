package nodes;

import nodeItem.NodeItem;

public class StringNode extends NodeItem {

    public StringNode(Object value) {
        super(value);
    }

    @Override
    public int compareTo(NodeItem item) {
        return 0;
    }

    @Override
    public NodeItem rightNode() {
        return null;
    }

    @Override
    public NodeItem leftNode() {
        return null;
    }

    @Override
    public NodeItem setRightNode(NodeItem rightNode) {
        return null;
    }

    @Override
    public NodeItem setLeftNode(NodeItem setPrevious) {
        return null;
    }
}
