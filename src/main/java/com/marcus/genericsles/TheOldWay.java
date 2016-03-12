package com.marcus.genericsles;

import java.util.ArrayList;
import java.util.List;

/**
 * @author marcus
 */
public class TheOldWay {

    public static void main(String[] args) {

        List names = new ArrayList();
        names.add("John barclay");
        names.add("Fred Flintsone");
        names.add("Ruud Paardenkoper");

        names.add(new Integer(1)); // can add any object !


        // write the code to display the elements here !!


        String s = (String) names.get(0);

        Integer i = (Integer) names.get(3);



    }

}
