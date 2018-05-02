package printreetraversal;

public class Stack {
    private StackNode top;
    

    public void push(TreeNode treeNode) throws Exception { 
        StackNode newTop = new StackNode(treeNode);
        newTop.setNext(top);
        top = newTop;
    }

    public TreeNode pop() throws Exception { 
        TreeNode pop = top.getNode();
        top = top.getNext();
        return pop;
    }
    
    public TreeNode peek() throws Exception{
        if (isEmpty()){
            return null;
        }
        return top.getNode();
    }

    public boolean isEmpty() throws Exception { 
        return top == null;
    }

}
