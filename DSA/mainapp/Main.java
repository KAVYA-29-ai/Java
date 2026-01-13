package mainapp;

import linkedlist.MyLinkedList;

public class Main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);

        list.display();
    }
}
