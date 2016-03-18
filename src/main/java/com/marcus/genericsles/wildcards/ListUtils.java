package com.marcus.genericsles.wildcards;

import java.util.ArrayList;
import java.util.List;

/**
 * @author marcus
 */
public final class ListUtils {

    private ListUtils() {

    }

    /**
     * find first item in list satisfying predicate
     * @param items
     * @param predicate
     * @param <T>
     * @return
     */
    public static <T> T findFirst(List<T> items, Predicate<T> predicate) {


        if (items == null || items.isEmpty()) {
            return null;
        }

        if (predicate == null) return items.get(0);

        for (T item : items) {
            if (predicate.evaluate(item)) {
                return item;
            }
        }
        return null;
    }

    /**
     * returns a list of items that satisfy the predicate
     * @param list
     * @param predicate
     * @param <T>
     * @return
     */
    public static <T> List<T> select(List<T> list, Predicate<T> predicate) {

        if (list == null || list.isEmpty()) return null;

        List<T> newList = new ArrayList<T>();
        for (T item : list) {
            if (predicate.evaluate(item)) {
                newList.add(item);
            }
        }
        return newList;

    }


}
