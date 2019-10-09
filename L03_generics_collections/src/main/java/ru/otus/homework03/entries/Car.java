package ru.otus.homework03.entries;

import ru.otus.homework03.DIYArrayList;

import java.util.Comparator;
import java.util.Objects;

public class Car implements Comparator<Car>, Comparable<Car> {
    private String name;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public int compareTo(Car o) {
        return (this.name).compareTo(o.name);
    }
}
