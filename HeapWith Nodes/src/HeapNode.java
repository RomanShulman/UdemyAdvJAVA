/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hobbitus Ryzen
 */
public class HeapNode {
    private int value;
    private HeapNode left, right;

    public HeapNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public int getValue() {
        return value;
    }

    public HeapNode getLeft() {
        return left;
    }

    public HeapNode getRight() {
        return right;
    }
    
    public void setValue(int value) {
        this.value = value;
    }

    public void setLeft(HeapNode left) {
        this.left = left;
    }

    public void setRight(HeapNode right) {
        this.right = right;
    }
    
    
    
    
    
    
}
