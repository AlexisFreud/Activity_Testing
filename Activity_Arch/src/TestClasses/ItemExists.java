package TestClasses;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ItemExists {

    @Test
    public void itemByIndex() {
        List list = new LinkedList();
        list.add("Item");

        assertEquals("Item", list.get(0));
    }

    @Test
    public void duplicatedItems() {
        List list = new LinkedList();
        list.add("Item");
        list.add("Item");

        assertEquals(true, list.get(0).equals(list.get(1)));
    }

    @Test
    public void nullItems() {
        List list = new LinkedList();
        list.add(0);
        list.add(null);
        list.add(2);

        assertEquals(3, list.size());
        assertNotNull(list.get(0));
        assertNull(list.get(1));
        assertNotNull(list.get(2));
    }
}
