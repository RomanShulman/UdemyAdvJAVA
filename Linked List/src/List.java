
import java.util.EmptyStackException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hobbitus Ryzen
 */
public class List<T> 
{
    private Node<T> firstNode;
    private Node<T> lastNode;
    private String name;
    
    public List()
    {
        name = "List";
        firstNode = lastNode = null;
    }
    public List(String ListName)
    {
        name = ListName;
        firstNode = lastNode = null;
    }
    public boolean isEmpty()
    {
        return firstNode==null;
    }
    public void insertAtFront(T insertItem)
    {
        if (isEmpty())
        {
            firstNode = lastNode = new Node<T>(insertItem);
        }
        else
            firstNode = new Node<T>(insertItem, firstNode);
    }
    public void insertAtBack(T insertItem)
    {
        if(isEmpty())
            firstNode = lastNode = new Node<>(insertItem);
        else
        {
            lastNode.nextNode = new Node<>(insertItem);
            lastNode = lastNode.nextNode;
        }
                
    }
    
    public String Print()
    {
        String str = null;
        
        if (isEmpty())
        {
            str = "Empty " + name;
        }
        else
        {
            str = "The " + name + "is : \n \n";
        }
        Node<T> current = firstNode;
        
        while (current != null)
        {
            str = str + current.getData() + "\n";
            current = current.getNextNode();
        }
        str = str + "\n" + "End " + name + "\n";       
        
        return str;
    }
    
    public void removeAll()
    {
        firstNode = lastNode = null;
    }
    public T removeFromFront() throws EmptyListException
    {
        if (isEmpty())//no nodes
            throw new EmptyListException(name);
        
        T removedItem = firstNode.getData();//"lost" node
        
        if (firstNode == lastNode)//only 1 node
            firstNode = lastNode = null;
        else//pointer to first node is moved to next node
            firstNode = firstNode.getNextNode();
        
        return removedItem;
    }
    
    public T removeFromBack() throws EmptyListException
    {
        if (isEmpty())//no nodes
            throw new EmptyListException(name);
        
        T removedItem = lastNode.getData();//"lost" node
        
        if (firstNode == lastNode)//only 1 node
            firstNode = lastNode = null;
        else
        {
            Node<T> current = firstNode;
            while (current.getNextNode() != lastNode)
        {
            current = current.getNextNode();
        }
            lastNode = current;
            current.setNextNode(null);
        }
                               
        return removedItem;
    }
    
    public T removeByData(T datar) throws EmptyListException
    {
        if (isEmpty())//no nodes
            throw new EmptyListException(name);
        
        T removedItem = lastNode.getData();//"lost" node
        
        Node<T> current = firstNode;
        Node<T> prev = firstNode ;
        while (current.getNextNode() != null)
        {
            if(current.getData().equals(datar))
            { //if we find Node
                prev.nextNode = current.nextNode;
                removedItem = current.getData();
                
            }

            prev = current;
            current = current.getNextNode();
        } 
        return removedItem;
    }
                
            
}
