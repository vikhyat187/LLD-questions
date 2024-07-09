package org.example.cache;

import org.example.cache.exceptions.KeyNotFoundException;
import org.example.cache.exceptions.StorageFullException;
import org.example.cache.policies.EvictionPolicy;
import org.example.cache.storage.Storage;

public class Cache<Key, Value> {
    private final EvictionPolicy<Key> evictionPolicy;
    private final Storage<Key, Value> storage;

    public Cache(EvictionPolicy<Key> evictionPolicy, Storage<Key, Value> storage){
        this.evictionPolicy = evictionPolicy;
        this.storage = storage;
    }
    //cache will use the storage to store the elements and eviction policy
    public void put(Key key, Value value){
        try{
            storage.addKey(key, value);
            evictionPolicy.keyAccessed(key);
        } catch(StorageFullException e){
            System.out.println("Got storage full exception");
            Key keyToRemove = evictionPolicy.removeKey();
            storage.remove(keyToRemove);
            storage.addKey(key, value);
            System.out.println("Evicted key to free up space");
        }
    }

    public Value get(Key key){
        Value value = null;
        try{
             value = storage.getKey(key);
             evictionPolicy.keyAccessed(key);
        } catch(KeyNotFoundException e){
            System.out.println("Key not found exception");
        }
        return value;
    }

}
