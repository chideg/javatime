package laborator11Tema;

import java.util.*;

public class MultiMapValue<K, V> {

    private HashMap<K, List<V>> hashMap;
    List<V> arrayList = new ArrayList<>();

    public void add(K key, V value) {
        // TODO
        if (!hashMap.containsKey(key)) {
            arrayList.add(value);
            hashMap.put(key,arrayList);
        }
        else {
            List<V> newList = hashMap.get(key);
            newList.add(value);
            hashMap.put(key,newList);
        }
    }

    public void addAll(K key, List<V> values) {
        // TODO
        if (!hashMap.containsKey(key)) {
            hashMap.put(key,values);
        }
        else {
            List<V> newValues = hashMap.get(key);
            newValues.addAll(values);
            hashMap.put(key,newValues);
        }
    }

    public void addAll(MultiMapValue<K, V> map) {
        // TODO
        for (K key : map.hashMap.keySet()) {
            List<V> values = new ArrayList<>(map.hashMap.get(key));
            if (!hashMap.containsKey(key)) {
                hashMap.put(key, values);
            } else {
                List<V> newValues = new ArrayList<>(hashMap.get(key));
                newValues.addAll(values);
                hashMap.put(key, newValues);
            }
        }
    }

    public V getFirst(K key) {
        // TODO
        if (hashMap.containsKey(key)) {
            return hashMap.get(key).get(0);
        }
        else return null;
    }

    public List<V> getValues(K key) {
        // TODO
        if (hashMap.containsKey(key)) {
            return hashMap.get(key);
        }
        else return null;
    }

    public boolean containsKey(K key) {
        // TODO
        return hashMap.containsKey(key);
    }

    public boolean isEmpty() {
        // TODO
        return hashMap != null;
    }

    public List<V> remove(K key) {
        // TODO
        if (hashMap.containsKey(key)) {
            return hashMap.remove(key);
        }
        else return null;
    }

    public int size() {
        // TODO
        if (hashMap == null) {
            return 0;
        }
        else return hashMap.keySet().size();
    }
}