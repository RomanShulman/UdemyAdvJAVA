/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hobbitus Ryzen
 */
public class Node<T> 
{
    private T data;
    Node <T> nextNode;
    
    public Node(T data)
    {
        this.data = data;
        nextNode = null;
    }
    public Node(T data, Node <T> next)
    {
        this.data = data;
        nextNode = next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }
    
    
}
