package com.marcus.genericsles;

import java.util.ArrayList;
import java.util.List;

/**
 * @author marcus
 */
abstract class Shape {

    abstract void draw();
}
class Circle extends Shape {

    void draw (){
        System.out.println("drawing circle");
    }


}
class Rectangle extends Shape {

    void draw (){
        System.out.println("drawing rectangle");
    }


}

public class PolyGeneric {



    public static void main(String[] args) {

      // List<Shape> list = new ArrayList<Circle>(); can this ?

        Shape[] shapes = new Shape[]{ new Circle(),new Rectangle()};
        PolyGeneric p = new PolyGeneric();
        p.drawShapes(shapes);

        List<Shape> gshapes =new ArrayList<>();
        gshapes.add(new Circle());
        gshapes.add(new Rectangle());

        // pass array of rectangles to method ...

        Rectangle[] rects =new Rectangle[1];
        p.addShape(rects);

    }

    private void drawShapes(Shape[] shapes){
        for (Shape s: shapes ){
            s.draw();
        }

    }

    void addShape(Shape[] shapes){

       shapes[0] = new Circle();  // jesus compiles allows a circle in a rectangle !!

    }





}
