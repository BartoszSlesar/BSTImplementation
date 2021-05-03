package testBST;

import bst.MyBinarySearchTree;
import nodeItem.NodeItem;
import nodes.IntegerNode;
import nodes.StringNode;
import org.w3c.dom.Node;

public class TestMyBinarySearchTree {

    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree(new IntegerNode(8));
        String val = "3 1 6 4 7 10 14 13 25 15 12";
        String[] values = val.split(" ");
        for (String s : values) {
            tree.addItem(new IntegerNode(Integer.parseInt(s)));
        }


    }
}
