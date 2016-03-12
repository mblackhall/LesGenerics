package com.marcus.genericsles;

import java.util.ArrayList;
import java.util.List;

/**
 * Use ? extends when need to say (I am not going to add anything through this construct)
 * @author marcus
 */

class Animal {
    void makeNoise(){
        System.out.println("nothing");
    }
}
class Dog extends Animal{
    void makeNoise(){
        System.out.print("woof");
    }
}
class Cat extends Animal {
    void makeNoise(){
        System.out.println("miauuw");
    }
}
public class GenericExtends {

    public static void main(String[] args) {

        List<Dog> dogs  = new ArrayList<>();
        dogs.add(new Dog());
        GenericExtends ge = new GenericExtends();
        ge.checkList(dogs);

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

      //  ge.checkList(cats);

        ge.checkAllList(cats);

    }


    private void checkList(List<? extends Animal> animals){

        animals.get(0).makeNoise();
        // but prevents this.... wouldnt want to be putting a cat in a dog
        //  animals.add(new Dog());


    }

    private void addToList(List<? super Dog> list ){

        list.add(new Dog()); // now oke !

    }

    /**
     * ? is the same as ? extends Object !!
     * @param animals
     */
    private void checkAllList (List<?> animals){

        System.out.println(animals.get(0));


    }

}
