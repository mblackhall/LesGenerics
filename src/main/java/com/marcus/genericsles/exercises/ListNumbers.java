package com.marcus.genericsles.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * @author marcus
 */
public class ListNumbers {

    private void listNumbers(List<? extends Number> numbers){

        for(Number number: numbers){
            System.out.println((number.toString()));
        }

    }

    public static void main(String[] args) {

        List<Double> doubles = new ArrayList<>();
        doubles.add(5.6);
        new ListNumbers().listNumbers(doubles);
    }
}
