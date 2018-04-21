/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hobbitus Ryzen
 */
public class Heap {
    
    HeapNode node;
    
    void addNode(int x)
    {
        HeapNode tmp, prev = null;
        tmp = node;
        HeapNode current = new HeapNode(x);
        
        while (tmp != null)
        {
            prev = tmp;
            if (x < tmp.getValue())
                tmp = tmp. getLeft();
            else if (x > tmp.getValue())
                tmp = tmp.getRight();
            else if (x == tmp.getValue())
                tmp = new HeapNode(x);
        }
        
        if (prev == null)
            node = current;
        else if (x < prev.getValue())
            prev.setLeft(current);
        else if (x > prev.getValue())
            prev.setRight(current);
        
    }
    
    HeapNode minValueNode(HeapNode node)
    {
        HeapNode current = node;
        while (current.getLeft() != null)
            current = current.getLeft();
        return current;
    }
    
    HeapNode deleteNode(HeapNode node, int value)
    {
        HeapNode tmp = node;
        if (tmp == null)
            return tmp;
        if (value < tmp.getValue())
            tmp.setLeft(deleteNode(tmp.getLeft(), value));
        else if (value > tmp.getValue())
            tmp.setRight(deleteNode(tmp.getRight(), value));
        else
        {
            if (tmp.getLeft() == null)
            {
                HeapNode tmp2 = tmp.getRight();
                return tmp2;
            }
            else if (tmp.getRight() == null)
            {
                HeapNode tmp2 = tmp.getLeft();
                return tmp2;
            }
            
            HeapNode tmp2 = minValueNode(tmp.getRight());
            tmp.setValue(tmp2.getValue());
            tmp.setRight(deleteNode(tmp.getRight(), tmp2.getValue()));
        }
        return tmp;
    }
    
    HeapNode getHeapNode()
    {
        HeapNode tmp = node;
        return tmp;
    }
    
    void preOrderPrint (HeapNode tmp)
    {
        if (tmp != null)
        {
            System.out.println(tmp.getValue());
            preOrderPrint(tmp.getLeft());
            preOrderPrint(tmp.getRight());
        }
    }
    
    void inOrderPrint (HeapNode tmp)
    {
        if (tmp != null)
        {
            inOrderPrint(tmp.getLeft());
            System.out.println(tmp.getValue());
            inOrderPrint(tmp.getRight());
        }
    }
    void postOrderPrint (HeapNode tmp)
    {
        if (tmp != null)
        {
            postOrderPrint(tmp.getLeft());
            postOrderPrint(tmp.getRight());
            System.out.println(tmp.getValue());
        }
    }
    
}
