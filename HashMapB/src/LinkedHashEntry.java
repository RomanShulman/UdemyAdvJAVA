/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hobbitus Ryzen
 */
public class LinkedHashEntry {
     private int key;
    private String value;
    private LinkedHashEntry next;

    public LinkedHashEntry(int key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public LinkedHashEntry getNext() {
        return next;
    }
    
    public void setKey(int key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setNext(LinkedHashEntry next) {
        this.next = next;
    }
    
    
}
