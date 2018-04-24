
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
    int[] arr3 = new int[50];
    int[] arr4 = new int[50];

    public SortingAlgorithms() 
    {
        Random rand = new Random();
        
        for (int i = 0; i< arr.length; i++)
        {
            int n = rand.nextInt(101);
            arr[i] = n;
            arr2[i] = n;
            arr3[i] = n;
            arr4[i] = n;
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
        
        for (int i = 0; i <= n-1; i++)
        {
            for (int j = 0; j < n-i-1; j++)
            {
                if (arr2[j] > arr2[j+1])
                {
                    int temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
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
    
    void InsertionSort()
    {
        int n = arr3.length;
        
        for (int i = 0; i <= n-1; i++)
        {
            int key = arr3[i];
            int j = i-1;
            while (j >= 0 && arr3[j] > key)
            {
                arr3[j+1] = arr3[j];
                j--;
            }
            arr3[j+1] = key;            
        }
    }
    
        String printInsertionSortArray()
    {
        String str = null;
        for (int i = 0; i < arr3.length; i++)
            str = str + arr3[i] + " ";
        str = str + "\n";
        
        return str;        
    }
        
    void MergeSort(int arr[], int l, int r)
    {
        if (l<r)
        {
            int m = (l + r)/2;
            MergeSort(arr, l, m);
            MergeSort(arr, m+1, r);
            merge (arr, l, m, r);
        }
    }
    
    void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l +1;
        int n2 = r - m;
        
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for (int i=0; i< n1; i++)
            L[i] = arr[l+i];
        for (int j=0; j< n2; j++)
            R[j] = arr[m + 1 + j];
        
        int i=0, j=0;
        int k = l;
        
        while ( i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    String printMergeSortArray()
    {
        String str = null;
        for (int i = 0; i < arr4.length; i++)
            str = str + arr4[i] + " ";
        str = str + "\n";
        
        return str;        
    }
}
