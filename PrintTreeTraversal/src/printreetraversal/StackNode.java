package printreetraversal;

public class StackNode {
    private TreeNode node;
    private StackNode next;

    public StackNode(TreeNode treeNode){
        this.node = treeNode;
    }

    public TreeNode getNode(){
        return node;
    }
    public StackNode getNext(){
        return next;
    }
    public void setNode(TreeNode treeNode){
        this.node = treeNode;
    }
    public void setNext(StackNode next){
        this.next = next;
    }
}
