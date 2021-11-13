package laborator11Tema;

import java.util.*;

public class CommonElementLists {

    public static void main(String[] args) {
        Integer[] list1 = {737790712, 804855584};
        Integer[] list2 = {737790712, 804899847};

        findCommonElement(list1, list2);
        uniqeElements(list1,list2);
    }

    private static void findCommonElement(Integer[] list1, Integer[] list2) {
        for (Integer element_list1 : list1) {
            for (Integer element_list2 : list2) {
                if (element_list2.equals(element_list1)) {
                    System.out.println("Common element: " + element_list2);
                }
            }
        }
    }

    private static void uniqeElements(Integer[] list1, Integer[] list2) {
        Set<Integer> differentList = new HashSet<>();
        List<Integer> listA = Arrays.asList(list1);
        List<Integer> listB = Arrays.asList(list2);
        for (Integer elementA: listA) {
            if (!listB.contains(elementA)) {
                differentList.add(elementA);
            }
        }
        System.out.println("List of different elements: " +  differentList);
    }
}
