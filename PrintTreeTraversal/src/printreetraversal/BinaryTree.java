package printreetraversal;

public class BinaryTree {

    private TreeNode root;

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
    
    public void printInOrder() throws Exception {
        System.out.println("Printing in-order");
        Stack stack = new Stack();
        TreeNode currentNode = root;
        boolean done = false;

        if (currentNode.getLeft() == null && currentNode.getRight() == null) {
            System.out.print(currentNode.getValue());
            return;
        }

        while (!done) {
            if (currentNode != null){
                stack.push(currentNode);
                currentNode = currentNode.getLeft();
            }
            else {
                if(!stack.isEmpty()){
                    currentNode = stack.pop();
                    System.out.print(currentNode.getValue() + " ");
                    currentNode = currentNode.getRight();
                }
                else{
                    done = true;
                    System.out.println("");
                }
            }
        }
    }

    public void printPostOrder() throws Exception {
        System.out.println("Printing post-order");
        Stack stack = new Stack();
        TreeNode currentNode = root;
        boolean done = false;

        if (currentNode.getLeft() == null && currentNode.getRight() == null) {
            System.out.print(currentNode.getValue());
            return;
        }

        while (!done) {
            if (currentNode != null) {
                if (currentNode.getRight() != null) {
                    stack.push(currentNode.getRight());
                }
                stack.push(currentNode);
                currentNode = currentNode.getLeft();
            } else {
                currentNode = stack.pop();
                if (currentNode.getRight() == stack.peek()) {
                    stack.pop();
                    stack.push(currentNode);
                    currentNode = currentNode.getRight();
                } else {
                    System.out.print(currentNode.getValue() + " ");
                    currentNode = null;
                    if (stack.isEmpty()) {
                        done = true;
                        System.out.println("");
                    }
                }
            }

        }
    }
    
    public void printPreOrder() throws Exception {
        System.out.println("Printing pre-order");
        Stack stack = new Stack();
        TreeNode currentNode = root;
        stack.push(currentNode);
        boolean done = false;
        
        if (currentNode.getLeft() == null && currentNode.getRight() == null){
            System.out.print(currentNode.getValue());
            return;
        }
        
        while (!done) {
            if (!stack.isEmpty()) {
                currentNode = stack.pop();
                System.out.print(currentNode.getValue() + " ");
                if (currentNode.getRight() != null){
                stack.push(currentNode.getRight());
                }
                if (currentNode.getLeft() != null){
                stack.push(currentNode.getLeft());
                }
            }
            else {
                done = true;
                System.out.println("");
            }
        }
    }
}
