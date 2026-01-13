package mainapp;

import linkedlist.MyLinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        
        // LinkedList package ko import karke use karna
        MyLinkedList list = new MyLinkedList();
        
        System.out.println("=== LinkedList Demo ===");
        
        // addFirst operations
        System.out.println("\nAddFirst Operations:");
        list.addFirst(100);
        list.addFirst(50);
        list.addFirst(25);
        list.display();
        
        // addLast operations
        System.out.println("\nAddLast Operations:");
        list.addLast(150);
        list.addLast(200);
        list.display();
        
        // Mixed operations
        System.out.println("\nMixed Operations:");
        list.addFirst(10);
        list.addLast(300);
        list.display();
    }
}
