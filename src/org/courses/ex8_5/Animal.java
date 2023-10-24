package org.courses.ex8_5;

public class Animal {

    protected String name;
    protected int age;
    protected Boolean isTale;

    public Animal(String name, int age, Boolean isTale) {
        this.name = name;
        this.age = age;
        this.isTale = isTale;
    }

    @Override
    public String toString() {

        String value = "name='" + name + '\'' +
                ", age=" + age +
                ", isTale=";

        value += isTale ? "yes": "no";

        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        if (isTale != animal.isTale) return false;
        return name != null ? name.equals(animal.name) : animal.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (isTale ? 1 : 0);
        return result;
    }
}
