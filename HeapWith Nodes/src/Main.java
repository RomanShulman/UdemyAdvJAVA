/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hobbitus Ryzen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Heap heap = new Heap();
        heap.addNode(0);
        heap.addNode(1);
        heap.addNode(2);
        heap.addNode(3);
        heap.addNode(4);
        heap.addNode(5);
        heap.addNode(6);
        heap.addNode(8);
        heap.addNode(7);
        
        System.out.println("Post");
        heap.postOrderPrint(heap.getHeapNode());
        System.out.println("Pre");
        heap.preOrderPrint(heap.getHeapNode());
        System.out.println("In");
        heap.inOrderPrint(heap.getHeapNode());
        
        heap.deleteNode(heap.getHeapNode(), 2);
        System.out.println("Post2");
        heap.postOrderPrint(heap.getHeapNode());
        System.out.println("Pre2");
        heap.preOrderPrint(heap.getHeapNode());
        System.out.println("In2");
        heap.inOrderPrint(heap.getHeapNode());
        
        
    }
    
}
