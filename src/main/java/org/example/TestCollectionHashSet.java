package org.example;

import java.util.HashSet;
import java.util.Iterator;

public class TestCollectionHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashset = new HashSet<>();

        for (int i= 0 ;i < 5;i++){
            hashset.add(i);
        }
        System.out.println(hashset);
        for (Iterator<Integer> iterator = hashset.iterator(); iterator.hasNext();){
            Integer i =iterator.next();
            System.out.println(i);
        }
        for ( int i : hashset){
            System.out.println(i);
        }
    }
}
