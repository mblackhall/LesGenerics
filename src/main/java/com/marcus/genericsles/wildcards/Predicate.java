package com.marcus.genericsles.wildcards;

/**
 * T is the Generic parameter type
 * @author marcus
 */
public interface Predicate <T> {

     boolean evaluate (T t);
}
