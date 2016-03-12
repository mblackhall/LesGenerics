package com.marcus.genericsles;

import java.util.ArrayList;
import java.util.List;

/**
 * @author marcus
 */
public class MixOldAndNew {


    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John Barclay");
        names.add("Fred Flintsone");
        names.add("Ruud Paardenkoper");

        MixOldAndNew m = new MixOldAndNew();
        m.useOldMethod(names);

        for (String name : names) {
            System.out.println(name);
        }


    }

    private void useOldMethod(List names) {

        names.add(new Integer(5)); // blimey !! I've put a Integer in A string arraylist


    }


}
