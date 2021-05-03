package nodes;

import nodeItem.NodeItem;

public class IntegerNode extends NodeItem {

    public IntegerNode(Integer value) {
        super(value);
    }

    @Override
    public int compareTo(NodeItem item) {
        int result = -1;
        if (item != null && item.getValue() != null) {
            Integer val = (int) super.getValue();
            result = val.compareTo((Integer) item.getValue());
        }

        return result;
    }


    public Integer getValue() {
        return super.getValue() != null ? (int) super.getValue() : null;
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
