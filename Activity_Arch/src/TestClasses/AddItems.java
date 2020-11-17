package TestClasses;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AddItems {

    @Test
    public void addItem() {
        List list = new LinkedList();
        assertEquals(true, list.isEmpty());
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(3, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    public void addItemAfterClear() {
        List list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.size());
        list.clear();

        assertEquals(true, list.isEmpty());
        list.add("Hola");

        assertEquals("Hola", list.get(0));
        assertEquals(1, list.size());
    }

    @Test
    public void addNullItem() {
        List list = new LinkedList();
        list.add(null);

        assertNull(list.get(0));
        assertEquals(1, list.size());
    }
}
