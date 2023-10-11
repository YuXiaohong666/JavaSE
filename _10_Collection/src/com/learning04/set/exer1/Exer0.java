package com.learning04.set.exer1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Exer0 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(34);
        arrayList.add(34);
        arrayList.add(34);
        arrayList.add(33);
        arrayList.add(16);
        arrayList.add(16);
        arrayList.add(16);
        arrayList.add(15);
        arrayList.add(22);
        arrayList.add(22);
        arrayList.add(22);

        List list = duplicateList(arrayList);
        System.out.println(list);
    }

    public static List duplicateList(List list) {
        HashSet hashSet = new HashSet();
        for (Object o : list) {
            hashSet.add(o);
        }

        ArrayList arrayList = new ArrayList();
        for (Object o : hashSet) {
            arrayList.add(o);
        }
        return arrayList;
    }
}
