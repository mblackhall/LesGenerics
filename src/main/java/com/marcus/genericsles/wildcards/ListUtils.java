package com.marcus.genericsles.wildcards;

import java.util.List;

/**
 * @author marcus
 */
public final class ListUtils {

    private ListUtils(){

    }

    public static <T>  T findFirst(List<T> items,Predicate<T> predicate) {
        if (items == null || items.isEmpty()){
             return null;
        }

        for(T item : items ){
            if (predicate.evaluate(item)){
                return item;
            }
        }
        return null;
    }



}
