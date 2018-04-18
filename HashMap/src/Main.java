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
        
        System.out.println(map.getKey("George"));
        System.out.println(map.getKey("Chris"));
        
        map.put(map.getKey("George"), "George");
        map.put(1234, "Chris");
        map.put(1235, "Nik");
        map.put(1236, "Michael");
        
        System.out.println(map.get(1234));
        System.out.println(map.get(map.getKey("George")));
    }
    
}
