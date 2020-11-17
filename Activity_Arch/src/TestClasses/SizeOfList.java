package TestClasses;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SizeOfList {
    @Test
    public void getCorrectSize() {
        List list = new LinkedList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(4, list.size());
        list.add(5);
        assertEquals(5, list.size());
    }

    @Test(expected = NullPointerException.class)
    public void getSizeNullList() {
        List list = null;

        list.size();
    }

    @Test
    public void getSizeEmptyList() {
        List list = new LinkedList();

        assertEquals(0, list.size());
    }
}
