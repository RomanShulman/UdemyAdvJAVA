
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hobbitus Ryzen
 */
public class Search {
    
    int [] a;
    
    void initializeArray(int n)
    {
        a = new int[n];
        for (int i=0; i<n; i++)
        {
            a[i] = i*i;
        }
    }
    
    String printArray()
    {
        return "Array: " + Arrays.toString(a);
    }
    
    String serialSearch(int number)
    {
        int flag = -1;
        String str;
        long start = System.nanoTime();
        for ( int i = 0; i<a.length; i++)
        {
            if ( number == a[i])
            {
                flag = 0;
                i = a.length;
            }
        }
        
        long elapsedTime = System.nanoTime() - start;
        
        if (flag == -1)
            str = "The number was not found";
        else
            str = "The number was found";
        
        return str + "\nThe time it takes to function to complete: " + elapsedTime + "nanoseconds";        
    }
    
    String binarySearch(int number)
    {
        int flag = -1;
        int L = 0, R = a.length-1, M;
        String str;
        long start = System.nanoTime();
        
        while (L<=R)
        {
            M = (L+R)/2;
            if (a[M] == number)
            {
                flag = 0;
                L=R+1; //loop end
            }
            else if (a[M]>number)
            {
                R = M-1;
            }
            else
            {
                L = M+1;
            }
        }
        
        long elapsedTime = System.nanoTime() - start;
        
        if (flag == -1)
            str = "The number was not found";
        else
            str = "The number was found";
        
        return str + "\nThe time it takes to function to complete: " + elapsedTime + "nanoseconds";        
    }
}
