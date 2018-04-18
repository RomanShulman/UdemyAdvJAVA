
import static java.lang.Double.min;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hobbitus Ryzen
 */
public class HeapArray {
    int[] A;
    int size;

    public HeapArray(int size) {
        this.size = size;
        A = new int[size + 3];
        createArray(size +1);
    }

    public HeapArray() {
        this.size = 50;
        A = new int[size + 3];
        createArray(size +1);
    }
    
    void createArray(int s)
    {
        int random, i;
        Random rand = new Random();
        for (i=0; i<s+1; i++)
        {
            int n = rand.nextInt(100) + 1;
            A[i+1] = n;
        }
    }
    
    void createHeap()
    {
        int hs;
        hs = size;
        for (int i = size/2; i>0; i --)
        {
            fixHeap(i);
        }
    }
    
    void fixHeap( int i)
    {
        A[i] = (int)min(A[2*i], A[2*i+1]);
    }
    
    void print()
    {
        System.out.println("Print");
        for (int i = 1; i< size; i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    
    void printTree()
    {
        System.out.println("Tree Print");
        int i, j=1;
        
        for (i = 1; i < size +1; i++)
        {
            System.out.print(A[i] + " ");
            if((Math.pow(2, j)-1) == i)
            {
                j++;
                System.out.println();
            }
        }
        System.out.println();
    }
}
