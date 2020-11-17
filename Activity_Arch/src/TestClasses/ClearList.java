package TestClasses;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClearList {

    @Test
    public void simpleClear() {
        List list = new LinkedList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(4, list.size());
        list.clear();

        assertEquals(0, list.size());
    }

    @Test
    public void clearEmptyList() {
        List list = new LinkedList();
        assertEquals(true, list.isEmpty());
        list.clear();

        assertEquals(0, list.size());
    }

    @Test (expected = NullPointerException.class)
    public void clearNullList() {
        List list = null;

        list.clear();
    }
}
