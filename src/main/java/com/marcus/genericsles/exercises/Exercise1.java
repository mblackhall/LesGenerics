package com.marcus.genericsles.exercises;

import java.util.Arrays;
import java.util.List;

/**
 * @author marcus
 */
public class Exercise1 {


    public static void main(String[] args) {

        List items = Arrays.asList(new String("Hello World"),
                new Integer(90));

        for (Object item : items){
            if (item instanceof String){
                System.out.println(((String) item).toString());
            }
            if (item instanceof Integer ){
                System.out.println(((Integer) item).intValue());
            }

        }




    }
}
