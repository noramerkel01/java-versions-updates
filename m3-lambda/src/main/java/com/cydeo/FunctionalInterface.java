package com.cydeo;

import java.beans.Customizer;
import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>200;
            }
        };
//***********PREDICATE***********//

        Predicate<Integer> lesserThan=i ->i<18;
        System.out.println(lesserThan.test(20));


        System.out.println("**********Consumer*********");
        Consumer<Integer> display= i-> System.out.println(i);
        display.accept(10);


        System.out.println("***********BiConsumer*********");
        BiConsumer<Integer,Integer> addTwo=(x,y)-> System.out.println(x+y);
        addTwo.accept(1,2);

        System.out.println("*********FUNCTION***********");

        Function<String, String> fun=s->"hello"+s;
        System.out.println(fun.apply("Cydeo"));

        System.out.println("************BiFunction***********");

        BiFunction<Integer,Integer,Integer> func=(x1,x2)->x1+x2;
        System.out.println(func.apply(2,3));

        System.out.println("********Supplier**********");
        Supplier<Double> randomValue=()->Math.random();
        System.out.println(randomValue.get());
    }
}
