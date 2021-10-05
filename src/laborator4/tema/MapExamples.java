package laborator4.tema;

import java.util.*;
import java.util.stream.Collectors;

public class MapExamples {
    public List<String> cloneList(List<String> list) {
        ArrayList<String> clonedList = new ArrayList<>(list);
        return clonedList;
    }

    public static void main(String[] args) {
        HashMap<String, Student> mapStudent = new HashMap<>();
        Student valoareInit = mapStudent.put("student1", new Student("Vali", "Mihai", null));
//        System.out.println(valoareInit);
        valoareInit = mapStudent.put("student2", new Student("Florin", "Ion", null));
//        System.out.println(valoareInit);

        System.out.println("student1".hashCode());
        System.out.println(mapStudent);
        System.out.println("--------------");

        for (HashMap.Entry<String, Student> entry : mapStudent.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("--------------");

        Set<String> keys = mapStudent.keySet();
        for (String key : keys) {
            System.out.println(key + " " + mapStudent.get(key));
        }


        HashMap<String, Student> mapElev = new HashMap<>();
        mapElev.put("student1", new Student("Costin", "Liviu", null));
        mapElev.put("elev2", new Student("Serban", "Bogdan", null));

        mapStudent.putAll(mapElev);
        System.out.println("--------------");
        System.out.println(mapStudent);

        Student student3 = new Student("nume", "prenume", null);

        HashMap<String, Integer> subjectList1 = new HashMap<String, Integer>();
        subjectList1.put("Matematica", 7);
        subjectList1.put("Romana", 8);
        subjectList1.put("Geografie", 9);

        HashMap<String, Integer> subjectList2 = new HashMap<String, Integer>();
        subjectList2.put("Matematica", 5);
        subjectList2.put("Fizica", 10);
        subjectList2.put("Chimie", 7);

        Student s1 = new Student("Ana", "Ioana", subjectList1);

        System.out.println("-----Clone test-----");
        System.out.println(subjectList1);
        System.out.println(s1);
        Object s1Clone = s1.clone();
        System.out.println(s1Clone);
        s1.setNume("Cutitas");
        s1.setPrenume("Kim");
        subjectList1.put("Informatica", 10);
        System.out.println(subjectList1);
        System.out.println(s1);
        System.out.println(s1Clone);

        System.out.println("--------------");
        System.out.println(mapStudent);
        System.out.println("-----int size();-----");
        System.out.println(mapStudent.size());
        System.out.println("-----boolean isEmpty();-----");
        System.out.println(mapStudent.isEmpty());
        System.out.println("-----boolean containsKey(Object key);-----");
        System.out.println(mapStudent.containsKey("elev2"));
        System.out.println("-----boolean containsValue(Object value);-----");
        System.out.println(mapStudent.containsValue(student3));
        System.out.println("-----get(Object key);-----");
        System.out.println(mapStudent.get("elev2"));
        System.out.println("-----put(K key, V value);-----");
        mapStudent.put("elev1", student3);
        System.out.println(mapStudent);
        System.out.println("-----remove(Object key);-----");
        mapStudent.remove("elev1");

        mapStudent.remove("elev2");
        System.out.println(mapStudent);
        mapElev.put("student3", new Student("Paul", "Radu", null));
        System.out.println(mapElev);
        System.out.println("-----void putAll(Map<? extends K, ? extends V> m);-----");
        mapStudent.putAll(mapElev);
        System.out.println(mapStudent);
        System.out.println("-----void clear();-----");
        mapElev.clear();
        System.out.println(mapElev);
        System.out.println("-----Set<K> keySet();-----");
        System.out.println(mapStudent.keySet());
        System.out.println("-----Collection<V> values();-----");
        System.out.println(mapStudent.values());
        System.out.println("-----Set<Map.Entry<K, V>> entrySet();-----");
        System.out.println(mapStudent.entrySet());

        Iterator iterator = mapStudent.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            System.out.println("-----getKey();-----getValue();-----");
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }
        System.out.println(mapStudent);
        System.out.println("-----setValue(V value);-----");
        mapStudent.entrySet().iterator().next().setValue(new Student("Florin", "Copil", null));
        System.out.println(mapStudent);

        HashMap<String, Student>newMapStudent = new HashMap<>(mapStudent);
        System.out.println("-----boolean equals(Object o);-----");
        System.out.println(mapStudent.equals(newMapStudent));
        System.out.println(mapStudent.equals(mapStudent));

        System.out.println("-----int hashCode();-----");
        System.out.println(mapStudent.hashCode());
        System.out.println(newMapStudent.hashCode());

        System.out.println("-----comparingByKey()-----");
        List<Map.Entry<String, Student>> comparingByKey = mapStudent.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toList());
        System.out.println("-----default void forEach(BiConsumer<? super K, ? super V> action)-----");
        comparingByKey.forEach(key -> System.out.println(key));

        System.out.println("-----comparingByValue()-----");
        HashMap<String, Integer> intMap = new HashMap<>();
        intMap.put("one", 1);
        intMap.put("ten", 10);
        intMap.put("seven", 7);
        intMap.put("four", 4);
        List<Map.Entry<String, Integer>> comparingByValue = intMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());
        comparingByValue.forEach(value -> System.out.println(value));

        System.out.println("-----boolean equals(Object o);-----");
        System.out.println(mapStudent.equals(newMapStudent));

        System.out.println("-----default V getOrDefault(Object key, V defaultValue)-----");
        System.out.println(mapStudent.getOrDefault("student2",null));
        System.out.println(mapStudent.getOrDefault("student10",student3));

        System.out.println("-----default void replaceAll(BiFunction<? super K, ? super V, ? extends V> function)-----");
//        System.out.println(intMap);
        intMap.replaceAll((key, oldValue) -> oldValue * oldValue);
        System.out.println(intMap);

        mapStudent.replaceAll((key, value) -> value = new Student("Test", "Replace", null));
        System.out.println(mapStudent);

        System.out.println("-----default V putIfAbsent(K key, V value)-----");
        System.out.println(newMapStudent);
        newMapStudent.putIfAbsent("studentNew", new Student(student3));
        System.out.println(newMapStudent);

        System.out.println("-----default boolean remove(Object key, Object value)-----");
        newMapStudent.remove("studentNew");
        System.out.println(newMapStudent);

        System.out.println("-----default boolean replace(K key, V oldValue, V newValue)-----");
        newMapStudent.replace("elev2", new Student("Elev", "Elevus", null));
        System.out.println(newMapStudent);

        System.out.println("-----default V computeIfAbsent-----");
        System.out.println(intMap);
        intMap.computeIfAbsent("ninetynine", k -> 99);
        System.out.println(intMap);

        System.out.println("-----default V computeIfPresent-----");
        intMap.computeIfPresent("seven", (k,v) -> v + 100);
        System.out.println(intMap);

        System.out.println("-----default V compute-----");
        intMap.compute("four", (k, v) -> v + 15);
        System.out.println(intMap);

        System.out.println("-----default V merge-----");
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("F", 4);


        Map<String, Integer> map2 = new HashMap<>();
        map2.put("A", 3);
        map2.put("B", 4);
        map2.put("D", 5);

        System.out.println(map1);
        System.out.println(map2);
        map2.forEach((key, value) -> map1.merge(key, value, (v1, v2) -> v1 + v2) );
        System.out.println(map1);

        System.out.println("-----static <K, V> Entry<K, V> entry(K k, V v)-----");
        //////////

        System.out.println("-----static <K, V> Map<K, V> copyOf(Map<? extends K, ? extends V> map)-----");
        Map<String, Integer> map3 = Map.copyOf(map1);
        System.out.println(map3);
//        map3.put("H", 10); UnsupportedOperationException

        System.out.println("-----static <K, V> Map<K, V> of(K k1, V v1)-----");
        Map<String, String> map5 = Map.of("Romania", "RO", "Germany", "DE");
        System.out.println(map5);
//        map5.put("United States", "US"); UnsupportedOperationException

        System.out.println("-----static <K, V> Entry<K, V> entry(K k, V v)-----");
        Map<String,String> map6 = Map.ofEntries(Map.entry("color1", "red"), Map.entry("color2", "black"));
        System.out.println(map6);

    }
}
