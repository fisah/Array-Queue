/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Nurhafisah Baidilah
 */
public class TestArrayQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QueueInterface kids = new ArrayQueue(2);
        kids.add("Sara");
        kids.add("John");
        kids.add("Andy");
        
        System.out.println("kids.size(): " + kids.size());
        System.out.println("kids.first(): " + kids.first());
        System.out.println("kids.remove(): " + kids.remove());
        System.out.println("kids.size(): " + kids.size());
        System.out.println("kids.first(): " + kids.first());
        
        kids.add("Mike");
        
        System.out.println("kids.size(): " + kids.size());
        System.out.println("kids.first(): " + kids.first());
        System.out.println("kids.remove(): " + kids.remove());
        System.out.println("kids.size(): " + kids.size());
        System.out.println("kids.first(): " + kids.first());
        System.out.println("kids.remove(): " + kids.remove());
        System.out.println("kids.size(): " + kids.size());
        System.out.println("kids.first(): " + kids.first());
        System.out.println("kids.remove(): " + kids.remove());
        System.out.println("kids.size(): " + kids.size());
        System.out.println("kids.first(): " + kids.first());
        
    }
    
}
