package TestClasses;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetElementsByIndex {

    @Test
    public void getFirstElement() {
        List list = new LinkedList();
        list.add("Sample String");

        assertEquals("Sample String", list.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getIndexOutOfRange() {
        List list = new LinkedList();
        list.add(1);

        list.get(1);
    }

    @Test
    public void getSomeIndex() {
        List list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals(3, list.get(2));
    }
}
