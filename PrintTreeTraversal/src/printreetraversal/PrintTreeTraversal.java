
package printreetraversal;

public class PrintTreeTraversal {


    public static void main(String[] args) throws Exception {
        //Binary Tree 1
        TreeNode node8 = new TreeNode(8);
        TreeNode node5 = new TreeNode(5);
        TreeNode node9 = new TreeNode(9);
        TreeNode node7 = new TreeNode(7);
        TreeNode node1 = new TreeNode(1);
        TreeNode node12 = new TreeNode(12);
        TreeNode node2 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node11 = new TreeNode(11);
        TreeNode node3 = new TreeNode(3);
        node8.setLeft(node5);
        node8.getLeft().setLeft(node9);
        node8.getLeft().setRight(node7);
        node8.getLeft().getRight().setLeft(node1);
        node8.getLeft().getRight().setRight(node12);
        node8.getLeft().getRight().getRight().setLeft(node2);
        node8.setRight(node4);
        node8.getRight().setRight(node11);
        node8.getRight().getRight().setLeft(node3); 
        
        //Binary Tree 2
//        TreeNode node11 = new TreeNode(11);
//        TreeNode node6 = new TreeNode(6);
//        TreeNode node4 = new TreeNode(4);
//        TreeNode node5 = new TreeNode(5);
//        TreeNode node19 = new TreeNode(19);
//        TreeNode node17 = new TreeNode(17);
//        TreeNode node43 = new TreeNode(43);
//        TreeNode node31 = new TreeNode(31);
//        TreeNode node49 = new TreeNode(49);
//        
//        node11.setLeft(node6);
//        node11.getLeft().setLeft(node4);
//        node11.getLeft().getLeft().setRight(node5);
//        node11.setRight(node19);
//        node11.getRight().setLeft(node17);
//        node11.getRight().setRight(node43);
//        node11.getRight().getRight().setLeft(node31);
//        node11.getRight().getRight().setRight(node49);
        
        //Binary Tree 3
//        TreeNode node1 = new TreeNode(1);
//        TreeNode node2 = new TreeNode(2);
//        TreeNode node4 = new TreeNode(4);
//        TreeNode node5 = new TreeNode(5);
//        TreeNode node3 = new TreeNode(3);
//        TreeNode node6 = new TreeNode(6);
//        TreeNode node7 = new TreeNode(7);
//        
//        node1.setLeft(node2);
//        node1.getLeft().setLeft(node4);
//        node1.getLeft().setRight(node5);
//        node1.setRight(node3);
//        node1.getRight().setLeft(node6);
//        node1.getRight().setRight(node7);
        
        BinaryTree tree1 = new BinaryTree(node8);
//        BinaryTree tree2 = new BinaryTree(node11);
//        BinaryTree tree3 = new BinaryTree(node1);
        tree1.printInOrder();
        tree1.printPostOrder();
        tree1.printPreOrder();
    } 
}
