package com.marcus.genericsles.wildcards;

import com.marcus.genericsles.model.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author marcus
 */
public class ListUtilsTest {

    @Test
    public void testFindFirst(){

        List<Person> people = Arrays.asList(new Person(52, "Marcus"),
                new Person(20, "Fred"),
                new Person(40, "Mary"));
        Person person = ListUtils.findFirst(people, new Predicate<Person>() {
            @Override
            public boolean evaluate(Person person) {
                if (person.getAge() > 20){
                    return true;
                }
                return false;
            }
        });
        assertEquals(52,person.getAge());

        Person person2 = ListUtils.findFirst(people, new Predicate<Person>() {
            @Override
            public boolean evaluate(Person person) {
                if (person.getAge() > 100){
                    return true;
                }
                return false;
            }
        });

        assertTrue(person2 == null);

        person2 = ListUtils.findFirst(null,null);
        assertTrue(person2 == null);
        person2 = ListUtils.findFirst(people,null);
        assertEquals(people.get(0),person2);

        List<Person> persons3 = new ArrayList<>();
        Person person3 = ListUtils.findFirst(people, new Predicate<Person>() {
            @Override
            public boolean evaluate(Person person) {
                if (person.getAge() > 100){
                    return true;
                }
                return false;
            }
        });

        assertTrue(person3 == null);


    }

    @Test
    public void testShouldSelectOne() throws Exception {

        List<Person> people = Arrays.asList(new Person(52, "Marcus"),
                new Person(20, "Fred"),
                new Person(40, "Mary"));

        List<Person> selected = ListUtils.select(people, new Predicate<Person>() {
            @Override
            public boolean evaluate(Person person) {
                if (person.getName().startsWith("F")){
                    return true;
                }
                return false;
            }
        });

        assertEquals(selected.size(),1);
        assertEquals(selected.get(0).getAge(),20);


    }

    @Test
    public void testShouldSelectAll() throws Exception {

        List<Person> people = Arrays.asList(new Person(52, "Marcus"),
                new Person(20, "Fred"),
                new Person(40, "Mary"));

        List<Person> selected = ListUtils.select(people, new Predicate<Person>() {
            @Override
            public boolean evaluate(Person person) {
                if (person.getAge() > 10){
                    return true;
                }
                return false;
            }
        });

        assertEquals(people.size(),selected.size());
        assertEquals(people,selected);

    }

    @Test
    public void testShouldSelectNone() throws Exception {

        List<Person> people = Arrays.asList(new Person(52, "Marcus"),
                new Person(20, "Fred"),
                new Person(40, "Mary"));

        List<Person> selected = ListUtils.select(people, new Predicate<Person>() {
            @Override
            public boolean evaluate(Person person) {
                if (person.getName().startsWith("Z")){
                    return true;
                }
                return false;
            }
        });

        assertEquals(selected.size(),0);

        List<Person> empty = new ArrayList<>();
        List<Person> emptyList = ListUtils.select(empty, new Predicate<Person>() {
            @Override
            public boolean evaluate(Person person) {
                return false;
            }
        });

        assertTrue(emptyList == null);

    }

    @Test
    public void testShouldReturnNull() throws Exception {

        List<Person> people = new ArrayList<>();

        List<Person> selected = ListUtils.select(people, new Predicate<Person>() {
            @Override
            public boolean evaluate(Person person) {
                if (person.getName().startsWith("F")){
                    return true;
                }
                return false;
            }
        });

        assertEquals(selected,null);

        List<Person> people2 = null;
        List<Person> selected2 = ListUtils.select(people2, new Predicate<Person>() {
            @Override
            public boolean evaluate(Person person) {
                if (person.getName().startsWith("F")){
                    return true;
                }
                return false;
            }
        });

        assertEquals(selected2,null);

    }

    @Test
    public void testConstructorIsPrivate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<ListUtils> constructor = ListUtils.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}