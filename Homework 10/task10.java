package com.company;
import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class task10 {

    public static void main( String[] args ) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(5,1,13));
        Method.printSet(Method.union(set1, set2));
        Method.printSet(Method.intersect(set1, set2));
    }
}





