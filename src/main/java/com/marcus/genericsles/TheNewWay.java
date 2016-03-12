package com.marcus.genericsles;

import java.util.ArrayList;
import java.util.List;

/**
 * @author marcus
 */
public class TheNewWay {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();


        names.add("John barclay");
        names.add("Fred Flintsone");
        names.add("Ruud Paardenkoper");
        // retrives names from list

        String name = names.get(0); // note no cast is required.



    }
}
