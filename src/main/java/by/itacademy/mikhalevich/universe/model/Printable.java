package by.itacademy.mikhalevich.universe.model;

public interface Printable {
    default void print(){
        System.out.println(this);
    }
}
