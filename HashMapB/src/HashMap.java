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
    
    LinkedHashEntry[] table;

    public HashMap() 
    {
        table = new LinkedHashEntry[TABLE_SIZE];
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
        if (table[hash] == null)
            table[hash] = new LinkedHashEntry(key, value);
        else
        {
            LinkedHashEntry entry = table[hash];
            while (entry.getNext() != null && entry.getKey() != key)
                entry = entry.getNext();
            if (entry.getKey() == key)
                entry.setValue(value);
            else
                entry.setNext(new LinkedHashEntry(key, value));
        }            
    }
    
    public String get(int key)
    {
        int hash = (key % TABLE_SIZE);
        if (table[hash] == null)
            return "Does not exist1";
        else
        {
            LinkedHashEntry entry = table[hash];
            while (entry != null && entry.getKey() != key)
                entry = entry.getNext();
            if (entry == null)
                return "Does not exist2";
            else
                return entry.getValue();
        }
    }
    
    public void remove(int key)
    {
        int hash = (key % TABLE_SIZE);
        if (table[hash] != null)
        {
            LinkedHashEntry prevEntry = null;
            LinkedHashEntry entry = table[hash];
            while (entry.getNext() != null && entry.getKey() != key)
            {
                prevEntry = entry;
                entry = entry.getNext();
            }
            if (entry.getKey() == key) 
            {
                if (prevEntry == null)
                    table[hash] = entry.getNext();
                else
                    prevEntry.setNext(entry.getNext());
            }
        }
    }
}
