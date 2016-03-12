package com.marcus.genericsles.wildcards;

import com.marcus.genericsles.model.Person;

import java.util.Arrays;
import java.util.List;

/**
 * @author marcus
 */
public class TestUtils {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person(52, "Marcus"),
                new Person(20, "Fred"),
                new Person(40, "Mary"));

        Person me = ListUtils.findFirst(people, new Predicate<Person>() {
            @Override
            public boolean evaluate(Person person) {
                if (person.getAge() > 40) {
                    return true;
                }
                return false;
            }
        });

        System.out.printf("%12s %5d", me.getName(), me.getAge());

    }


}
