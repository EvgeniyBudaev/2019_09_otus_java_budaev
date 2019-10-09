package ru.otus.homework03;

import ru.otus.homework03.entries.Car;
import ru.otus.homework03.entries.Toyota;

import java.util.*;

public class DIYArrayList<T> implements List<T> {

    private T[] elements;


    public DIYArrayList() {
        elements = (T[]) new Object[0]; //создаем объект и приводим его к типу Т
    }

    public DIYArrayList(T[] elements) {
        this.elements = elements;
    }


    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public boolean isEmpty() {
        try{
            return elements.length==0;
        }catch (ClassCastException ex){
            System.out.println("isEmpty is fail");
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        try{

        }catch (ClassCastException ex){
            System.out.println("contains is fail");
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {

       return new ArrayIterator<T>(elements);
    }

    @Override
    public Object[] toArray() {
        try{

        }catch (ClassCastException ex){
            System.out.println("Object[] toArray() is fail");
        }
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        try{

        }catch (ClassCastException ex){
            System.out.println("<T1> T1[] toArray(T1[] a) is fail");
        }
        return null;
    }

    @Override
    public boolean add(T t) {
        try{
            T[] temp = elements;
            elements = (T[]) new Object[temp.length+1];
            System.arraycopy(temp, 0, elements, 0, temp.length);
            elements[elements.length-1] = t;
            return true;
        }catch (ClassCastException ex){
            System.out.println("boolean add(T t) is fail");
        }
        return false;

    }


    @Override
    public boolean remove(Object o) {
        try{

        }catch (ClassCastException ex){
            System.out.println("remove is fail");
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        try{

        }catch (ClassCastException ex){
            System.out.println("containsAll is fail");
        }

        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        try{

        }catch (ClassCastException ex){
            System.out.println("addAll(Collection<? extends T> c) is fail");
        }
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        try{

        }catch (ClassCastException ex){
            System.out.println("addAll(int index, Collection<? extends T> c) is fail");
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        try{

        }catch (ClassCastException ex){
            System.out.println("removeAll(Collection<?> c) is fail");
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        try{

        }catch (ClassCastException ex){
            System.out.println("retainAll(Collection<?> c) is fail");
        }
        return false;
    }

    @Override
    public void clear() {
        try{

        }catch (ClassCastException ex){
            System.out.println("clear() is fail");
        }

    }

    @Override
    public T get(int index) {
        return elements[index];
    }

    @Override
    public T set(int index, T element) {
        try{

        }catch (ClassCastException ex){
            System.out.println("T set(int index, T element) is fail");
        }
        return null;
    }

    @Override
    public void add(int index, T element) {
        try{

        }catch (ClassCastException ex){
            System.out.println("add(int index, T element is fail");
        }
    }

    @Override
    public T remove(int index) {
        try{
            T[] temp = elements;
            elements = (T[]) new Object[temp.length-1];
            System.arraycopy(temp, 0, elements, 0, index);
            int amountElementAfterIndex = temp.length-index-1;
            System.arraycopy(temp, index+1, elements, index, amountElementAfterIndex);
        }catch (ClassCastException ex){
            ex.printStackTrace();
        }

       return null;
    }

    @Override
    public int indexOf(Object o) {
        try{

        }catch (ClassCastException ex){
            System.out.println("int indexOf(Object o) is fail");
        }
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        try{

        }catch (ClassCastException ex){
            System.out.println("int lastIndexOf(Object o) is fail");
        }
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        try{

        }catch (ClassCastException ex){
            System.out.println("ListIterator<T> listIterator() is fail");
        }
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        try{

        }catch (ClassCastException ex){
            System.out.println("ListIterator<T> listIterator(int index) is fail");
        }
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        try{

        }catch (ClassCastException ex){
            System.out.println("List<T> subList(int fromIndex, int toIndex) is fail");
        }
        return null;
    }
}
