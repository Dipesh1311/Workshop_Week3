package com.bridgelabz.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedListOperation<Integer> linkedList = new LinkedListOperation<>();
        System.out.println("Append Method");
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.print();
        System.out.println();


        System.out.println("Search & Insert Method");
        linkedList.insertAfter(100,20);
        linkedList.print();
        System.out.println();
    }
}
