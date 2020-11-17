package TestClasses;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class removeItemByIndex {

    @Test (expected = IndexOutOfBoundsException.class)
    public void removeLastItem() {
        List list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(3, list.remove(2));
        assertEquals(2, list.get(1));
        assertEquals(2, list.size());
        list.get(2);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void removeItemFromEmptyList() {
        List list = new LinkedList();

        assertEquals(true, list.isEmpty());
        list.remove(0);
    }

    @Test
    public void removeEvertything() {
        List list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int originalSize = list.size();

        for (int i = 0; i < originalSize; i++) {
            assertEquals(originalSize-i, list.size());
            list.remove(0);
        }
        assertEquals(true, list.isEmpty());
    }
}
