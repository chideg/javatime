package laborator11Tema;

import java.util.*;

public class CostinTestMain<K, V> {

    public CostinTestMain() {
    }

    public CostinTestMain(HashMap<K, List<V>> hashMap) {
        this.hashMap = hashMap;
    }

    public void setHashMap(HashMap<K, List<V>> hashMap) {
        this.hashMap = hashMap;
    }

    @Override
    public String toString() {
        return "{" +
                "hashMap=" + hashMap +
                '}';
    }

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
            List<V> newValues = new ArrayList<>(hashMap.get(key));
            newValues.addAll(values);
            hashMap.put(key,newValues);
        }
    }

    public void addAll(CostinTestMain<K, V> map) {
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
        if (hashMap.containsKey(key)) {
            return hashMap.get(key).get(0);
        }
        else return null;
    }

    public List<V> getValues(K key) {
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

    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList<>();
        elements.add("water");
        elements.add("fire");
        elements.add("earth");
        elements.add("wind");

        ArrayList<String> bamboo = new ArrayList<>();
        bamboo.add("bambooWater");
        bamboo.add("bambooFire");
        bamboo.add("bambooEarth");
        bamboo.add("bambooWind");

        HashMap<String, ArrayList<String>> hashMap1 = new HashMap<>();
        hashMap1.put("Globe", elements);

        CostinTestMain costinTestMain = new CostinTestMain(hashMap1);

        System.out.println("\n----------add() Test----------\n");
        System.out.println(costinTestMain);
        System.out.println("----------add new key 'Bamboo' Test----------");
        costinTestMain.add("Bamboo", bamboo);
        System.out.println(costinTestMain);
        System.out.println("----------add list to existing key 'Bamboo' Test----------");
        costinTestMain.add("Bamboo", "Two");
        System.out.println("----------add String to existing key 'Bamboo' Test----------");
        System.out.println(costinTestMain);
        System.out.println("----------add SInteger to existing key 'Bamboo' Test----------");
        costinTestMain.add("Bamboo", 5);
        System.out.println(costinTestMain);

        System.out.println("\n----------addAll() Test----------\n");
        System.out.println("----------add to existing key 'Globe' Test----------");
//        System.out.println(elements);
//        System.out.println(bamboo);
        costinTestMain.addAll("Globe", bamboo);
//        System.out.println(elements);
//        System.out.println(bamboo);
        System.out.println(costinTestMain);
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        System.out.println("----------add new key 'Pluto' Test----------");
        costinTestMain.addAll("Pluto", integerList);
        System.out.println(costinTestMain);

        System.out.println("\n----------new object 1----------\n");
        HashMap<String, ArrayList<String>> hashMap2 = new HashMap<>();
        hashMap2.put("Sun", elements);
        HashMap<String, List<Integer>> hashMap3 = new HashMap<>();
        hashMap3.put("Sun", integerList);
        CostinTestMain costinTestMain1 = new CostinTestMain(hashMap2);
        System.out.println("Object 1:\n" + costinTestMain1);
        costinTestMain.addAll(costinTestMain1);
        System.out.println("Object 1 added to object:\n" + costinTestMain);
        costinTestMain.addAll(costinTestMain1);
        System.out.println("Object 1 added again to object:\n" + costinTestMain);
        CostinTestMain costinTestMain2 = new CostinTestMain(hashMap3);
        costinTestMain.addAll(costinTestMain2);
        System.out.println("Object 2 with key 'Sun' added to object:\n" + costinTestMain);

        System.out.println("\n----------getFirst(K key) Test----------\n");
        System.out.println(costinTestMain.getFirst("PlanetX"));
        System.out.println(costinTestMain.getFirst("Sun"));
        System.out.println(costinTestMain.getFirst("Bamboo"));
        System.out.println(costinTestMain.getFirst("Pluto"));

        System.out.println("\n----------getValues(K key) Test----------\n");
        System.out.println(costinTestMain.getFirst("PlanetX"));
        System.out.println(costinTestMain.getValues("Sun"));
        System.out.println(costinTestMain.getValues("Bamboo"));
        System.out.println(costinTestMain.getValues("Pluto"));

        System.out.println("\n----------containsKey(K key) Test----------\n");
        System.out.println(costinTestMain.containsKey("PlanetX"));
        System.out.println(costinTestMain2.containsKey("Sun"));
        System.out.println(costinTestMain1.containsKey("Bamboo"));
        System.out.println(costinTestMain.containsKey("Pluto"));

        System.out.println("\n----------isEmpty() Test----------\n");
        System.out.println(costinTestMain.isEmpty());
        System.out.println(costinTestMain1.isEmpty());
        System.out.println(costinTestMain2.isEmpty());
        CostinTestMain costinTestMain3 = new CostinTestMain();
        System.out.println(costinTestMain3.isEmpty());

        System.out.println("\n----------remove(K key) Test----------\n");
        System.out.println(costinTestMain);
        costinTestMain.remove("Globe");
        costinTestMain.remove("PlanetX");
        System.out.println(costinTestMain);

        System.out.println("\n----------size() Test----------\n");
        System.out.println(costinTestMain.size());
        System.out.println(costinTestMain1.size());
        System.out.println(costinTestMain2.size());
        System.out.println(costinTestMain3.size());
    }
}
