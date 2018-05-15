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
public class Queue {
    private QueueNode front;
    private QueueNode rear;
    
    public Queue(){
        this.front = null;
        this.rear = null;
    }
    
    public boolean isEmpty(){
        return rear == null && front == null;
    }
    
    public void enqueue(TreeNode node){
       QueueNode temp = new QueueNode(node);
       if (rear == null){
           front = temp;
           rear = temp;
           return;
       }
       rear.setNext(temp);
       rear = temp;
    }
    
    public TreeNode dequeue(){
        if (front == null){
            return null;
        }
       
        QueueNode temporary = front;
        front = rear.getNext();
        
        if (front == null){
            rear = null;
        }
        return temporary.getNode();
    }
}
