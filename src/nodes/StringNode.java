package nodes;

import nodeItem.NodeItem;

public class StringNode extends NodeItem {

    public StringNode(String value) {
        super(value);
    }

    @Override
    public int compareTo(NodeItem item) {
        int result = -1;
        if (item != null && item.getValue() != null) {
            String val = (String) super.getValue();
            result = val.compareToIgnoreCase((String) item.getValue());
        }

        return result;
    }


    public String getValue() {
        return (String) super.getValue();
    }

    @Override
    public NodeItem rightNode() {
        return this.rightNode;
    }

    @Override
    public NodeItem leftNode() {
        return this.leftNode;
    }

    @Override
    public NodeItem setRightNode(NodeItem rightNode) {
        this.rightNode = rightNode;
        return rightNode;
    }

    @Override
    public NodeItem setLeftNode(NodeItem leftNode) {
        this.leftNode = leftNode;
        return leftNode;
    }
}
