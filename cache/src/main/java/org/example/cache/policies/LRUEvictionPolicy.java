package org.example.cache.policies;

import org.example.algorithms.DoublyLinkedList;
import org.example.algorithms.DoublyLinkedListNode;

import java.util.HashMap;
import java.util.Map;

public class LRUEvictionPolicy<Key> implements EvictionPolicy<Key> {
    private DoublyLinkedList<Key> dll;
    private Map<Key, DoublyLinkedListNode> mapper;

    public LRUEvictionPolicy(){
        this.dll = new DoublyLinkedList<>();
        this.mapper = new HashMap<>();
    }

    @Override
    public void keyAccessed(Key key){
        if (mapper.containsKey(key)){
            dll.detachNode(mapper.get(key));
            dll.addNodeAtLast(mapper.get(key));
        }

    }

    @Override
    public Key removeKey(){
        DoublyLinkedListNode firstNode = dll.getFirstNode();
        if (firstNode == null){
            return null;
        }
        dll.detachNode(firstNode);
        return (Key)firstNode.element;
    }

}
