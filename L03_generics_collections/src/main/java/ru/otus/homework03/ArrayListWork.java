package ru.otus.homework03;

import ru.otus.homework03.entries.Car;
import ru.otus.homework03.entries.Toyota;

import java.util.*;

public class ArrayListWork {

    public static void main(String[] args) {

        Car[] carArr = new Car[]{new Toyota("Camry"), new Toyota("Land Cruiser"), new Toyota("Avon")};
        List<Car> carList = new ArrayList<>(Arrays.asList(carArr));

        //addAll(Collection<? super T> c, T... elements)
        System.out.println("Добавляем новые объекты к текущей коллекции:");
        Collections.addAll(carList, new Toyota("Prado"), new Toyota("Corolla 2010"), new Toyota("Corolla 2019"),
                new Toyota("Corolla 2011"), new Toyota("Corolla 2018"), new Toyota("Corolla 2012"), new Toyota("Corolla 2017"),
                new Toyota("Corolla 2013"), new Toyota("Corolla 2016"), new Toyota("Corolla 2014"), new Toyota("Corolla 2015"));
        for(Car cars22: carList){
            System.out.println(cars22);
        }
        System.out.println("==============");

        //copy(List<? super T> dest, List<? extends T> src)
        System.out.println("Копируем:");
        List<? super Car> carListDest = new ArrayList<>(carList);
        Collections.copy(carListDest, carList);
        System.out.println("toyotaCars:" + carListDest);
        System.out.println("==============");

        //sort(List<T> list, Comparator<? super T> c)
        System.out.println("Сортируем в алфавитном порядке по названию:");
        Collections.sort(carList, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for(Car cars: carList){
            System.out.println(cars);
        }
        System.out.println("==============");

    }
}

