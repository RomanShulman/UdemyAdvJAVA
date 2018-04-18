/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hobbitus Ryzen
 */
public class HashMap {
    private final static int TABLE_SIZE = 128;
    
    HashEntry[] table;

    public HashMap() 
    {
        table = new HashEntry[TABLE_SIZE];
        for (int i =0; i<TABLE_SIZE; i++)
            table[i] = null;
    }
    
    int getKey(String username)
    {
        int i, j=0;
        for(i=0; i<username.length();i++)
            j = j + username.charAt(i);
        return j;
    }
    
    public void put(int key, String value)
    {
        int hash = (key % TABLE_SIZE);
        while (table[hash] != null && table[hash].getKey() != key)
            hash = (hash +1) % TABLE_SIZE;
        table[hash] = new HashEntry(key, value);
    }
    
    public String get(int key)
    {
        int hash = (key % TABLE_SIZE);
        while (table[hash] != null && table[hash].getKey() != key)
            hash = (hash +1) % TABLE_SIZE;
        if (table[hash] == null)
            return "Was not found";
        else
            return table[hash].getValue();
    }
    
}
