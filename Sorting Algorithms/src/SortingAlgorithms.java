
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
public class SortingAlgorithms {
    
    int[] arr = new int[50];
    int[] arr2 = new int[50];

    public SortingAlgorithms() 
    {
        Random rand = new Random();
        
        for (int i = 0; i< arr.length; i++)
        {
            int n = rand.nextInt(101);
            arr[i] = n;
            arr2[i] = n;
        }
    }
    
    void SelectionSort()
    {
        int n = arr. length;
        
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
            {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    
    String printSelectionSortArray()
    {
        String str = null;
        for (int i = 0; i < arr.length; i++)
            str = str + arr[i] + " ";
        str = str + "\n";
        
        return str;        
    }
    
    void BubbleSort()
    {
        int n = arr2.length;
        
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-i-1; j++)
            {
                if (arr2[j] > arr2[j+1])
                {
                    int temp = arr2[j];
                    arr[j] = arr[j+1];
                    arr[j] = temp;
                }
            }
            
        }
    }
    
    String printBubbleSortArray()
    {
        String str = null;
        for (int i = 0; i < arr2.length; i++)
            str = str + arr2[i] + " ";
        str = str + "\n";
        
        return str;        
    }
    
    
    
}
