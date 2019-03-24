package com.acquisio.basic.java.question02;

/**
 * QUESTION 2: TreeNode
 * Using the tree structure define at
 * http://en.wikipedia.org/wiki/File:Binary_tree.svg,
 * add the code necessary to optain the following output.
 * ..2
 * ....7
 * ......2
 * ......6
 * ........5
 * ........11
 * ....5
 * ......9
 * ........4
 *
 * IMPORTANT: Add all missing javadoc and/or unit tests that you think is necessary.
 */
public class TreeNavigation {

    private static final String TWO_DOTS = "..";

    public static void main(String[] args) {
        TreeNavigation main = new TreeNavigation();
        main.treeNode();
    }

    /**
     * create tree node and feed root to Traverse()
     */
    private void treeNode() {
        Node n1 = new Node("6", new Node("5"), new Node("11"));
        Node n2 = new Node("7", new Node("2"), n1);
        Node n3 = new Node("9", new Node("4"));
        Node n4 = new Node("5", null, n3);
        Node n = new Node("2", n2, n4);
        // TODO: Implement code here
        int level = 1;
        preOrderTraverse(n, level);
    }

    /**
     * This method traverse the tree from root recursively.
     * @param root the root node of tree
     * @param level the depth of the current node in tree
     */
    private void preOrderTraverse(Node root, int level){

        if(root == null) {
            return;
        }
        System.out.println(levelStringCalculator(level) + root.name);
        if(root.children != null){
            level++;
            for(int i = 0; i < root.children.length; i++){
                preOrderTraverse(root.children[i], level);
            }
        }
    }

    /**
     * This method calculate the dots need for display
     * @param level the depth of the current node in tree
     * @return the dots needed for display
     */
    private String levelStringCalculator(int level){
        String dot = "";
        for(int i = 0 ; i < level; i++){
            dot = dot + TWO_DOTS;
        }
        return dot;
    }
}
