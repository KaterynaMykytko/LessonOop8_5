package org.courses.ex8_5;

public class Main {

    public static void main(String[] args) {

        Animal cat1 = new Animal("Vas'ka",45,false);
        Animal cat2 = new Animal("Timka", 15, true);

        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
    }
}
