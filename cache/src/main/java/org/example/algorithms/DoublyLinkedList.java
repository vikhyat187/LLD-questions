package org.example.algorithms;

import org.example.cache.exceptions.InvalidElementException;

import java.util.NoSuchElementException;

public class DoublyLinkedList<E> {
    //Here E is the type of the key element
    private DoublyLinkedListNode<E> head;
    private DoublyLinkedListNode<E> tail;

    public DoublyLinkedList(){
        head = new DoublyLinkedListNode<>(null);
        tail = new DoublyLinkedListNode<>(null);
        //this we are doing to add the elements in between them
        head.next = tail;
        tail.prev = head;
    }

    public void detachNode(DoublyLinkedListNode node) {
        if (node != null){
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }

    public DoublyLinkedListNode getLastNode() throws NoSuchElementException {
        DoublyLinkedListNode node = null;
        if (!isItemPresent()){
            return null;
        }
        return tail.prev;
    }

    public void addNodeAtLast(DoublyLinkedListNode<E> node){
        DoublyLinkedListNode<E> tailPrev = tail.prev;
        tailPrev.next = node;
        node.prev = tailPrev;
        node.next = tail;
    }

    public DoublyLinkedListNode<E> addElementToLast(E element){
        if (element == null){
            throw new InvalidElementException();
        }
        DoublyLinkedListNode<E> node = new DoublyLinkedListNode<E>(element);
        addNodeAtLast(node);
        return node;
    }



    public DoublyLinkedListNode getFirstNode() throws NoSuchElementException{
        DoublyLinkedListNode node = null;

        if (!isItemPresent()) {
            return null;
        }
        return head.next;
    }

    public boolean isItemPresent(){
        return head.next != tail;
    }

 }
