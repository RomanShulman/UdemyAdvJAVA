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
        HashMap map = new HashMap();
        
     
        map.put(123, "1");
        map.put(124, "2");
        map.put(125, "3");
        map.put(126, "4");
        
        System.out.println(map.get(123));
        System.out.println(map.get(map.getKey("1")));
    }
    
}
