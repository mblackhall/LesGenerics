package com.marcus.genericsles.exercises;

import java.util.*;

/**
 * @author marcus
 */
public class RemoveDuplicates {


    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();

        values.add(20);
        values.add(2);
        values.add(30);
        values.add(10);
        values.add(5);
        values.add(15);
        values.add(10);
        values.add(5);
        values.add(15);
        values.add(2);
        values.add(1);

        Set<Integer> dupsRemoved = new HashSet<>(values);
        for(Integer i: dupsRemoved){
            System.out.println(i);
        }



    }




}
