package com.bridgelabz.linkedlist;

public class LinkedListOperation<K> {
    Node<K> head;
    Node<K> tail;

    public void append(K key) {
        Node<K> newNode = new Node<>(key);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void print() {
        Node<K> temp = head;
        while(temp != null) {
            System.out.print(temp.key+"->");
            temp = temp.next;
        }
    }
    public Node<K> search(K key) {
        Node<K> temp = head;
        Node<K> searchedNode = null;
        while (temp != null) {
            if(temp.key.equals(key)) {
                searchedNode = temp;
                break;
            }
            temp = temp.next;
        }
        return searchedNode;
    }


    public void insertAfter(K insertData, K searchData) {
        Node<K> newNode = new Node<>(insertData);
        Node<K> searchedNode = search(searchData);
        newNode.next = searchedNode.next;
        searchedNode.next = newNode;
    }

}
