package TestClasses;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SearchForIndex {

    @Test
    public void itemNotInList() {
        List list = new LinkedList();
        list.add("Fake string");
        list.add("Example string");
        list.add("Another fake string");

        assertEquals(-1, list.indexOf("not in the list string"));
    }

    @Test
    public void doubleSearch() {
        List list = new LinkedList();
        list.add(3.15645641567468);
        list.add(15456.1256);
        list.add(45.32);

        assertEquals(2, list.indexOf(45.32));
    }

    @Test
    public void objectSearch() {
        List list = new LinkedList();
        Libro mate2 = new Libro("Matematicas 2", 450, "rojo");
        Libro ecuaciones = new Libro("Ecuaciones Diferenciales", 800, "verde");
        Libro algebra = new Libro("Algebra Lineal", 600, "rojo");
        list.add(mate2);
        list.add(ecuaciones);
        list.add(algebra);

        assertEquals(2, list.indexOf(algebra));
    }
}
class Libro {
    private String name;
    private int pages;
    private String color;

    public Libro(String name, int pages, String color) {
        this.name = name;
        this.pages = pages;
        this.color = color;
    }
}
