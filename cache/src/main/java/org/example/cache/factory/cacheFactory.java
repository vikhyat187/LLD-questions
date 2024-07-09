package org.example.cache.factory;

import org.example.cache.Cache;
import org.example.cache.policies.LRUEvictionPolicy;
import org.example.cache.storage.HashMapBasedStorage;

public class cacheFactory<Key,Value> {
    public Cache<Key, Value> defaultCache(int capacity){
        return new Cache<Key, Value>(new LRUEvictionPolicy<Key>(), new HashMapBasedStorage<Key, Value>(capacity));
    }


}
