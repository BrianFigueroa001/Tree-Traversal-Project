/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printreetraversal;

/**
 *
 * @author B-Man
 */
public class QueueNode {
    private TreeNode node;
    private QueueNode next;
    
    public QueueNode(TreeNode node){
        this.node = node;
        this.next = null;
    }
    
    public TreeNode getNode(){
        return node;
    }
    
    public QueueNode getNext(){
        return next;
    }
    
    public void setNext(QueueNode next){
        this.next = next;
    }
}
