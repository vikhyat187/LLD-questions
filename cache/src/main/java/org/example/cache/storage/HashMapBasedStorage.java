package org.example.cache.storage;

import org.example.cache.exceptions.KeyNotFoundException;
import org.example.cache.exceptions.StorageFullException;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasedStorage<Key, Value> implements Storage<Key, Value>{
    Map<Key, Value> storage;
    private final int capacity;

    public HashMapBasedStorage(int capacity) {
        this.capacity = capacity;
        storage = new HashMap<>();
    }

    @Override
    public void addKey(Key key, Value value) throws StorageFullException {
        if (isStorageFull()) throw new StorageFullException("Storage full cannot add more keys");
        storage.put(key, value);
    }

    public boolean isStorageFull(){
        return storage.size() == capacity;
    }

    @Override
    public void remove(Key key) throws KeyNotFoundException {
        if (!storage.containsKey(key)){
            throw new KeyNotFoundException("No key found with the given value");
        }
        storage.remove(key);

    }

    @Override
    public Value getKey(Key key) {
        if (!storage.containsKey(key)) {
            throw new KeyNotFoundException("No key found with the given value");
        }
        return storage.get(key);
    }

}
