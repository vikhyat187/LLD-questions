package org.example.cache.storage;

import org.example.cache.exceptions.KeyNotFoundException;
import org.example.cache.exceptions.StorageFullException;

public interface Storage<Key, Value> {
    public void addKey(Key key, Value value) throws StorageFullException;

    public void remove(Key key) throws KeyNotFoundException;
    public Value getKey(Key key) throws KeyNotFoundException;
}
